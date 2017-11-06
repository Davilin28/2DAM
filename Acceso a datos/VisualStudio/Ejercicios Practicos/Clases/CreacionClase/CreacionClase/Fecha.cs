using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CreacionClase
{
    class Fecha
    {
        // atributos
        private int dia, mes, anio;

        // Constructores Sin parametros
        public Fecha()
        {
            dia = 1;
            mes = 1;
            anio = 1970;
        }

        //Con parametros y sobrecargado
        public Fecha(int d, int m, int a)
        {
            dia = d;
            mes = m;
            anio = a;
        }

        public int Anio
        {
            get
            {
                return anio;
            }

            set
            {
                anio = value;
            }
        }

        public int Dia
        {
            get
            {
                return dia;
            }

            set
            {
                dia = value;
            }
        }

        public int Mes
        {
            get
            {
                return mes;
            }

            set
            {
                if(value>1 && value <12)
                mes = value;
            }
        }

        public void SumesMes()
        {
            if (mes < 12)
                mes++;
            else
            {
                mes = 1;
                anio++;
            }
        }

        public bool IsBisiesto()
        {
            return (Anio % 4 == 0);
        }

        public void ContarDias()
        {

        }
    }
}

