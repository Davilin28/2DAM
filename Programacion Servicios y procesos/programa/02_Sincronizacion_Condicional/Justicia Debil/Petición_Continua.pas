PROGRAM PeticionContinua;
	PROCESS Servidor(VAR Peticion : BOOLEAN; VAR x : INTEGER);
	BEGIN
		WHILE NOT Peticion DO ; (* ESPERA ACTIVA *)
		WRITELN('Servidor: Peticion atendida, x = ', x);
	END;
	PROCESS Cliente(VAR Peticion : BOOLEAN; VAR x : INTEGER);
	BEGIN
		x := 1;
		WRITELN('Cliente: Solicito peticion, x = ', x);
		Peticion := TRUE;
	END;
	VAR
		x : INTEGER;
		Peticion: BOOLEAN;
	BEGIN
		x := 0;
		Peticion := FALSE;
	COBEGIN
		Servidor(Peticion, x);
		Cliente(Peticion, x);
	COEND
	END.