 #!/bin/bash
 
PIDFILE=/tmp/demonio.pid
SRV="demonio"

function status()

if [ -f ${PIDFILE} ];
then
        echo "El demonio  esta en marcha"
else
        echo "El demonio esta parado"
fi

function start(){
 echo -n $"Iniciando servicio ${SRV}: "
 /usr/bin/demon >/dev/null 2>&1 &
 RETVAL=$?
 echo $! > $PIDFILE
 
 if [ ${RETVAL} -eq 0 ];
 then
        echo "Se ha iniciado ${SRV}"
 else
        echo "No se ha podido iniciar ${SRV}"
 fi
 echo
}

function stop(){
 echo -n $"Parando servicio ${SRV}: "
 SERV=$(ps -e |grep ${SRV} |awk '{print $1}')
 kill -9 ${SERV}
 echo
}

function restart(){
 stop
 sleep 10
 start
}

# Dependiento del parametro que se le pase
#start - stop - restart ejecuta la funcion correspondiente.

case "$1" in
start)
 start
 ;;
stop)
 stop
 ;;
restart)
 restart
 ;;
status)
 status
;;
*)
 echo $"Usar: $0 {status|start|stop|restart}"
 exit 1
esac
exit 0

