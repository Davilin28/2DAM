#include <getopt.h>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define DEBUG(...) if (verbose) \
    fprintf(stderr, __VA_ARGS__);

#define NUM atoi(argv[argc - 1])

const char *program_name;
int verbose = 0;

void
print_usage(FILE *out, int return_code)
{
    fprintf(out, "Usage: %s\n"
	         "        This program converts from any base to any base.\n"
		 "\n"
		 "Examples:\n"
		 "==========\n"
		 "convert -b2 34 => 10 0010\n"
		 "\n"
	        , program_name);

    exit(return_code);
}

int convertTo(int base, int num, int numElevado){
    if(num/base < 1)
        return num%base*pow(10, numElevado++) + num/base*pow(10, numElevado);
    return num%base*pow(10,numElevado++) + convertTo(base, num/base, numElevado);
}

int convertFrom(int base, int num, int numElevado){

    if(numElevado == -1)
        while(num > pow(10, numElevado))
            numElevado++;
    numElevado --;

    int numUser = num / pow(10, numElevado);

    if(num < 10)
        return numUser * pow(base, numElevado);

    num = num - (numUser * pow(10, numElevado));

    return numUser * pow(base, numElevado) + convertFrom(base, num, numElevado);
}



int
main (int argc, char * const argv[])
{
    int next_option;
    int output_base;
    int input_base;
    int numConvert = 0;


    const char *short_options = "hb:vi:";
    const struct option long_options[] = {
	{ "help", 0, NULL, 'h'},
        { "ibase", 1, NULL, 'i' },
	{ "base", 1, NULL, 'b'},
	{ "verbose", 0, NULL, 'v'}
    };

  program_name = argv[0];

  do { // ANALIZAR LA LINEA DE COMANDOS
      next_option = getopt_long(argc, argv, short_options, long_options, NULL);
      switch (next_option)
      {
	  case 'h':
	      print_usage(stdout, EXIT_SUCCESS);
	      break;

          case 'i':
              input_base = atoi(optarg);
              printf("La I es %i \n ", input_base);
              numConvert = convertFrom(input_base, atoi(argv[argc-1]),-1);
              printf("El numero %i, de base %i, con base 10 es %i \n ",NUM, input_base, numConvert);

              break;


	  case 'v':
	      verbose = 1;
	      break;

	 case 'b':
	      output_base = atoi(optarg);
	      DEBUG("Estableciendo la base de salida a %i\n", output_base);

              numConvert = convertTo(output_base, NUM, 0);
              printf("El numero %i, de base %i, es %i \n ",NUM, output_base, numConvert);

	      break;

	 case '?':
	      print_usage(stderr, EXIT_FAILURE);
	      break;

	 case -1:
	      break;

	default:
	      abort();
      }
  } while (next_option != -1);

  /* Empieza el funcionamiento del programa */
      DEBUG("Funcionando en modo prólijo.\n");

  return EXIT_SUCCESS;
}

