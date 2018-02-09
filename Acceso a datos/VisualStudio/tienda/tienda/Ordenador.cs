using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace tienda
{
    class Ordenador : Producto
    {
        private int velocidad;
        private int nPuertos;

        public Ordenador(string m, string n, int mR, double p, int velocidad, int nPuertos) : base(m,n,mR,p)
        {
            this.Velocidad = velocidad;
            this.NPuertos = nPuertos;
        }

        public Ordenador()
        {
            velocidad = 0;
            NPuertos = 0;
        }

        public int Velocidad
        {
            get
            {
                return velocidad;
            }

            set
            {
                velocidad = value;
            }
        }

        public int NPuertos
        {
            get
            {
                return nPuertos;
            }

            set
            {
                nPuertos = value;
            }
        }
    }

}
