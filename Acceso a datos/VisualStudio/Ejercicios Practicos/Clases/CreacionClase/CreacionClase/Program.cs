using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CreacionClase
{
    // Devolver numero de dias desde 1 enero hasta anio actual

    // Escribir la mayor de todas las fechas (Metodo burbuja)


    class Program
    {
        public static void Imprimir(Fecha[] fechas)
        {
            for (int i = 0; i < fechas.Length; i++)
            {
                Console.WriteLine("El dia es: " + fechas[i].Dia + " del mes: " + fechas[i].Mes + " del aniso: " + fechas[i].Anio);
            }
        }

        static void Main(string[] args)
        {
            // Crear un Array de Objetos
            Fecha[] fechas = new Fecha[3];
            fechas[0] = new Fecha(23, 2, 2012);
            fechas[1] = new Fecha(12, 2, 2017);
            fechas[2] = new Fecha(20, 3, 2017);

            fechas[0].IsBisiesto();

            Imprimir(fechas); // Sacar por pantalla todas las fechas
            Console.ReadKey();

        }
    }
}
