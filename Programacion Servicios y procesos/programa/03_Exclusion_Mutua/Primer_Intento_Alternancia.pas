PROGRAM PrimerIntento;
TYPE
	TAcceso = RECORD
		Turno : 1..2
		END;
PROCESS P1 (VAR Acceso : TAcceso);
BEGIN
	REPEAT
		(* Preprotocolo*)
		WHILE Acceso.Turno <> 1 DO;
		SeccionCritica1;
		Acceso.Turno := 2; (* Postprotocolo *)
		SeccionNoCritica1;
	FOREVER
END;

PROCESS P2 (VAR Acceso : TAcceso);
BEGIN
	REPEAT
		WHILE Acceso.Turno <> 2 DO; (* Preprotocolo*)
		SeccionCritica2;
		Acceso.Turno := 1; (* Postprotocolo *)
		SeccionNoCritica2;
	FOREVER
END;

VAR
	Acceso : TAcceso;
BEGIN
	Acceso.Turno := 1;
	COBEGIN
		P1(Acceso);
		P2(Acceso);
	COEND
END.