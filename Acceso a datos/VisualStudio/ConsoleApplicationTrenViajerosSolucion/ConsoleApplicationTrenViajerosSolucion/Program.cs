using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/*
3.  Un tren de viajeros esta formado por 4 vagones de 50 pasajeros cada uno. Los viajeros compran un billete 
    en el que indican la clase (turista o preferente),el destino y cantidad de maletas que transporta. 
    Durante el viaje, los revisores comprueban los billetes de los viajeros y marcan los billetes revisados.
    Crear un sistema de calses (una o varias) ademas de la clase que contiene el programa principal que 
    contenga los comportamientos descritos.

    Completar con un programa principal que cree billetes de manera sucesiva indicando vagon y asiento y el resto de datos. 
    Deajra de crear billetes al introducirnumero de vagon -100. 
    A continuacion, cambiara a preferente los 5 primeros asientos del primer vagon, se revisaran los asientos de los 2 ultimos vagones
    y escribira por pantalla la cantidad de maletas que contiene cada vagon.
     */

namespace ConsoleApplicationTrenViajerosSolucion
{
    class Program
    {
        static void Main(string[] args)
        {
            Tren miTren = new Tren();
            int nVagon, nAsiento, nMaletas;
            string clase, destino;

            do
            {
                Billete b = new Billete();

                Console.WriteLine("Introduce vagon:");
                nVagon = Int32.Parse(Console.ReadLine());
                Console.WriteLine("Introduce asiento:");
                nAsiento = Int32.Parse(Console.ReadLine());
                Console.WriteLine("Introduce clase:");
                clase = Console.ReadLine();
                Console.WriteLine("Introduce destino:");
                destino = Console.ReadLine();
                Console.WriteLine("Introduce nº maletas:");
                nMaletas = Int32.Parse(Console.ReadLine());
                if (nVagon != -100)
                {
                    miTren.GetVagon(nVagon).
                           GetBillete(nAsiento).
                           Modificar(clase, destino, nMaletas);
                }
            } while (nVagon != -100);

            // 1. Cambiar a preferente los 5 primeros asientos 
            //    vagon 0
            miTren.GetVagon(0).GetBillete(0).SetClase("preferente");
            miTren.GetVagon(0).GetBillete(1).SetClase("preferente");
            miTren.GetVagon(0).GetBillete(2).SetClase("preferente");
            miTren.GetVagon(0).GetBillete(3).SetClase("preferente");

            // 2. Revisar asientos de los dos último vagones
            miTren.Revisar(2);
            miTren.Revisar(3);

            // 3. Escribir cantidad de maletas de cada vagón
            for (int i = 0; i < 4; i++)
                Console.WriteLine("Vagon {0} - Maletas {1}", i + 1,
                                  miTren.NMaletas(i));

            Console.ReadKey();
        }
    }
}
