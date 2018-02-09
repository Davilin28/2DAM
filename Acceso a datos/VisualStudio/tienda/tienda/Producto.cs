using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace tienda
{
    class Producto
    {
       private string marca;
       private string nombre;
       private int memoriaRam;
       private double precio;

        public Producto(string marca, string nombre, int memoriaRam, double precio)
        {
            this.Marca = marca;
            this.Nombre = nombre;
            this.MemoriaRam = memoriaRam;
            this.Precio = precio;
        }

        public Producto()
        {
            marca = "";
            nombre = "";
            memoriaRam = 0;
            precio = 0;
        }

        public string Marca
        {
            get
            {
                return marca;
            }

            set
            {
                marca = value;
            }
        }

        public string Nombre
        {
            get
            {
                return nombre;
            }

            set
            {
                nombre = value;
            }
        }

        public int MemoriaRam
        {
            get
            {
                return memoriaRam;
            }

            set
            {
                memoriaRam = value;
            }
        }

        public double Precio
        {
            get
            {
                return precio;
            }

            set
            {
                precio = value;
            }
        }
    }
}
