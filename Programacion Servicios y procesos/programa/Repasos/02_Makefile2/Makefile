C=g++

suma: suma.o funciones.o
	$(CC) suma.o funciones.o -o suma

suma.o: suma.cpp funciones.h
	$(CC) -c suma.cpp

funciones.o: funciones.cpp funciones.h
	$(CC) -c funciones.cpp

.PHONY: clean 

clean:
	$(RM) *.o suma

