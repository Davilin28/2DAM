using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// Programa lea una cadena y un numero anada en la posicion del numero "Hola"
// cad = "pepito" y numero = 2
// pepholaito


/*
 * Programa longitud cadena recursiva
 * 
 * Programa interprete exp matematico, leemos una cadena y lo convertirmos para poder realizar el calculo.
 */

namespace Principal
{
    class Program
    {
            static void Main(string[] args)
        {
            string cadena = "Pepito";
            var a = cadena.ToCharArray();
            a[4] += 'd';

            for (int ctr = 0; ctr < a.Length; ctr++) { 
                Console.WriteLine("   {0}: {1}", ctr, a[ctr]);
            }

            Console.ReadKey();
        }
    }
}
