#include <getop.h>
#include <stdio.h>
#include <stdlib.h>

const char* gotprogram;

void print_usage(FILE* stream, int exit_code){

    fprintf(stream, "Usage: %s options [ inputfile ... ] \n",gotprogram);
    fprintf(stream,
            " -h    --help      Display this usage information.\n"
            " -o    --output    Write output to file.\n"
            " -v    --verbose   Print verbose messages.\n");
    exit (exit_code);
}


int main (int argc, char* argv[]){

    int next_option;

    const char* const short_options = "ho:v";

    const struct option long_options[] = {
        { "help",    0,  NULL,  'h' },
        { "output",  1,  NULL,  'o' },
        { "verbose", 0,  NULL,  'v' },
        { NULL,      0,  NULL,   0  }
      };

    const char* output_gotprogram = NULL;

    int verbose = 0;

    gotprogram = argv[0];

    do{
        next_option = getop_long (argc, argv, short options, long options, NULL);

        switch (next_option){


            case 'h':
                print_usage (stdout, 0);

            case 'o':
                output_filename = optarg;
                break;

            case 'v':
                verbose = 1;
                break;

            case '?':
                print_usage (stderr, 1);

            case -1:
                break;

            default:
                abort();

            }
    }

    while (next_option != -1);

    if (verbose){
        int i;
        for( i = optind; i < argc; ++i )
            printf("Argument: %s\n",argv[i]);
    }

    return 0;

}








        

    
















    }
}
