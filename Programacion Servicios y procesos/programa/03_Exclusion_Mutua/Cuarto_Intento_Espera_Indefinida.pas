PROCESS P1 (VAR Accesso : TAcceso);
BEGIN
	REPEAT
		Acceso.Peticion1 := TRUE;
		WHILE Acceso.Peticion2 DO
			BEGIN
				Acceso.Peticion1 := FALSE;
				Acceso.Peticion1 := TRUE;
			END;
		SeccionCritica1;
		Acceso.Peticion1 := FALSE;
		SeccionNoCritica1;
	FOREVER
END;