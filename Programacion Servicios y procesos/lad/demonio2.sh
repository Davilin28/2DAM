!/bin/bash

#VARIABLES

ACTIVE=y

#ACTIVO HASTA QUE LO MATEMOS MEDIANTE demonio.sh stop

while [${ACTIVE} == 'y'];
do
        tail -n 100 /var/log/syslog |grep DHCP > /tmp/test.txt
        if [ -s /tmp/test.txt ];
        then
                echo "$(date) DHCP" > /tmp/dhcp.txt
        fi
done

