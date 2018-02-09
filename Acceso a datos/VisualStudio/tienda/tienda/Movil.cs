using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace tienda
{
    class Movil : Producto
    {
        private string SO;
        private int duracionBateria;
        private int almacenamiento;

        public Movil(string m, string n, int mR, double p, string sO, int duracionBateria, int almacenamiento) : base(m,n,mR,p)
        {
            this.SOO = sO;
            this.DuracionBateria = duracionBateria;
            this.Almacenamiento = almacenamiento;
        }

        public Movil()
        {
            SO = "";
            duracionBateria = 0;
            almacenamiento = 0;
        }

        public string SOO
        {
            get
            {
                return SO;
            }

            set
            {
                SO = value;
            }
        }

        public int DuracionBateria
        {
            get
            {
                return duracionBateria;
            }

            set
            {
                duracionBateria = value;
            }
        }

        public int Almacenamiento
        {
            get
            {
                return almacenamiento;
            }

            set
            {
                almacenamiento = value;
            }
        }
    }
}
