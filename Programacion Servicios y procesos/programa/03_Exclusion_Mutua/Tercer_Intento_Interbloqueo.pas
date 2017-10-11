PROGRAM TercerIntento;
TYPE
	TAcceso = RECORD
		Peticion1, Peticion2 : BOOLEAN
		END;
		
PROCESS P1 (VAR Acceso : TAcceso);
BEGIN
	REPEAT
	Acceso.Peticion1 := TRUE;
	WHILE Acceso.Peticion2 DO;
	SeccionCritica1;
	Acceso.Peticion1 := FALSE;
	SeccionNoCritica1;
	FOREVER
END;

PROCESS P2 (VAR Acceso : TAcceso);
BEGIN
	REPEAT
		Acceso.Peticion2 := TRUE;
		WHILE Acceso.Peticion1 DO;
		SeccionCritica2;
		Acceso.Peticion2 := FALSE;
		SeccionNoCritica2;
	FOREVER
END;

VAR Acceso : TAcceso;
BEGIN
	Acceso.Peticion1 := FALSE;
	Acceso.Peticion2 := FALSE;
	COBEGIN
		P1(Acceso);
		P2(Acceso);
	COEND
END.