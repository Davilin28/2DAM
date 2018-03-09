#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int
main(int argc, char *argv[])
{
    pid_t sid;
    FILE * fp;
 	 fp = fopen ("pc.txt","w+");

  	if (fp!=NULL)
  	{
   	 fputs ("fopen pc",fp);
    	 fclose (fp);
   	}
   
    fclose(fp)

	sid = setsid();
	if (sid < 0) {
		syslog(LOG_ERR, "No fue posible crear una nueva sesión\n");
		exit(1);
	}
	if ((chdir("/")) < 0) {
    		syslog(LOG_ERR, "No fue posible cambiar el directorio de "
                    "trabajo a /\n");
    		exit(1);
	}
	
    return EXIT_SUCCESS;
}