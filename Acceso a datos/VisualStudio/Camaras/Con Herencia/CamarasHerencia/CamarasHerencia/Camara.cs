using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CamarasHerencia
{
    class Camara
    {
        private string marca;
        private string objetivo;
        private double peso;

        public Camara(string marca, string objetivo, double peso)
        {
            this.marca = marca;
            this.objetivo = objetivo;
            this.peso = peso;
        }

        public Camara()
        {
            marca = "";
            objetivo = "";
            peso = 0;
        }

        virtual public string Escribe()
        {
            return "Marca:" + marca + " Modelo:" + objetivo + " Peso:" + peso;
        }

        virtual public void Vacia()
        {
            marca = "";
            objetivo = "";
            peso = 0;
        }
    }
}
