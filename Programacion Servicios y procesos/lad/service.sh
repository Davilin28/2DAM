#! /bin/sh
 
NAME=daemon
DESC="daemon"
PIDFILE="/var/run/${NAME}.pid"
LOGFILE="/var/log/${NAME}.log"

#indicamos que vamos a ejecutar un archivo PHP
DAEMON="/usr/bin/php"
#Ruta del archivo
DAEMON_OPTS="/var/www/myproject/myscript.php"
 
START_OPTS="--start --background --make-pidfile --pidfile ${PIDFILE} --exec ${DAEMON} ${DAEMON_OPTS}"
STOP_OPTS="--stop --pidfile ${PIDFILE}"
 
test -x $DAEMON || exit 0
 
set -e
 
case "$1" in
    start)
        echo -n "Starting ${DESC}: "
        start-stop-daemon $START_OPTS >> $LOGFILE
        echo "$NAME."
        ;;
    stop)
        echo -n "Stopping $DESC: "
        start-stop-daemon $STOP_OPTS
        echo "$NAME."
        rm -f $PIDFILE
        ;;
    restart|force-reload)
        echo -n "Restarting $DESC: "
        start-stop-daemon $STOP_OPTS
        sleep 1
        start-stop-daemon $START_OPTS >> $LOGFILE
        echo "$NAME."
        ;;
    *)
        N=/etc/init.d/$NAME
        echo "Usage: $N {start|stop|restart|force-reload}" >&2
        exit 1
        ;;
esac
 
exit 0