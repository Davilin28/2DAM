using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CamarasHerencia
{
    class CamaraWeb : Camara
    {
        private string resolucion;
        private int zoom;

        public CamaraWeb() : base()
        {
            resolucion = "";
            zoom = 0;
        }

        public CamaraWeb(string m, string o, double p, string r, int z) : base(m,o,p)
        {
            this.resolucion = r;
            this.zoom = z;
        }

        public override string Escribe()
        {
            return base.Escribe() + "Resolucion: " + resolucion + " Zoom: " + zoom;
        }

        public override void Vacia()
        {
            base.Vacia();
            resolucion = "";
            zoom = 0;
        }
    }
}
