using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CamarasHerencia
{
    class Program
    {
        static void Main(string[] args)
        {
            Camara cam = new Camara();
            CamaraWeb cw = new CamaraWeb();

            Camara unaCamara = cw;

            cam.Escribe(); // Coge el escribe del padre
            unaCamara.Escribe(); // Coge el escribe del padre y pierde zoom y resolucion.
            cw.Escribe(); // Coge el escribe del hijo.
        }
    }
}
