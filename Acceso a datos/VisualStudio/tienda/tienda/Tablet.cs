using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace tienda
{
    class Tablet : Producto
    {
        private int resolucion;
        private int duracionBateria;


        public Tablet(string m, string n, int mR, double p ,int r, int dB) : base(m,n,mR,p)
        {
            this.Resolucion = r;
            this.DuracionBateria = dB;
        }

        public Tablet()
        {
            resolucion = 0;
            duracionBateria = 0;
        }

        public int Resolucion
        {
            get
            {
                return resolucion;
            }

            set
            {
                resolucion = value;
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
    }
}
