#include <fcntl.h>
#include <stdlib.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>

#ifdef __cplusplus
extern "C"{
#endif

void * leer_fichero (const char *fichero, size_t length){
	
	char* buffer;
	int fd;
	size_t bytes_read;
	buffer = (char*) malloc (length);
	if(buffer == NULL)
		return NULL;
	
	fd = open (fichero, O_RDONLY);
		if (fd == -1) {
		
	free (buffer);
		return 0;
		}
		
	bytes_read = read (fd, buffer, length);
		if (bytes_read != length) {
		free (buffer);
		close (fd);
		return NULL;
	}
}

#ifdef __cplusplus
}
#endif
