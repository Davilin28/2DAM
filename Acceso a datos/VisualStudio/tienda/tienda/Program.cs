using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace tienda
{

    class Program
    {
        static public void mostrar(ArrayList l1, ArrayList l2, ArrayList l3)
        {
            foreach (Ordenador o in l1)
            {
                Console.WriteLine("Ordenador->"+"Marca: " + o.Marca + " Nombre: " + o.Nombre + " Velocidad: " + o.Velocidad + " Memoria Ram: " +
                 o.MemoriaRam + " Numero de puertos " + o.NPuertos + " Precio " + o.Precio);
            }

            foreach (Tablet t in l2)
            {
                Console.WriteLine("Tablet->"+"Marca: " + t.Marca + " Nombre: " + t.Nombre + " Resolucion: " + t.Resolucion + " Memoria Ram: " +
                    t.MemoriaRam + " Duracion de bateria: " + t.DuracionBateria + " Precio " + t.Precio);
            }

            foreach (Movil m in l3)
            {
                Console.WriteLine("Movil->"+"Marca: " + m.Marca + " Nombre: " + m.Nombre + " Sistema Operativo: " + m.SOO+ " Almaceniamiento: " + m.Almacenamiento + " Memoria Ram: " +
                    m.MemoriaRam + " Duracion de bateria: " + m.DuracionBateria + " Precio " + m.Precio);
            }
        }

        static public int MostrarOpciones()
        {
            Console.WriteLine("OPCIONES");
            Console.WriteLine("1. Ordenador");
            Console.WriteLine("2. Tablet");
            Console.WriteLine("3. Movil");
            Console.WriteLine("4. Mostrar");
            Console.WriteLine("5. Eliminar");
            Console.WriteLine("7. Salir");
            return Int32.Parse(Console.ReadLine());
        }

        static void Main(string[] args)
        {
            ArrayList l1 = new ArrayList();
            ArrayList l2 = new ArrayList();
            ArrayList l3 = new ArrayList();

            int opcion;
            do
            {
                opcion = MostrarOpciones();
                switch (opcion)
                {
                    case 1:
                        Ordenador o1 = new Ordenador();
                        Console.WriteLine("Introduce marca de ordenador: ");
                        o1.Marca = Console.ReadLine();
                        Console.WriteLine("Introduce nombre de ordenador: ");
                        o1.Nombre = Console.ReadLine();
                        Console.WriteLine("Introduce velocidad de ordenador: ");
                        o1.Velocidad = Int32.Parse(Console.ReadLine());
                        Console.WriteLine("Introduce Memoria RAM de ordenador: ");
                        o1.MemoriaRam = Int32.Parse(Console.ReadLine());
                        Console.WriteLine("Introduce Numero de puertos de ordenador: ");
                        o1.NPuertos = Int32.Parse(Console.ReadLine());
                        Console.WriteLine("Introduce precio de ordenador: ");
                        o1.Precio = double.Parse(Console.ReadLine());
                        l1.Add(o1); 
                        break;

                    case 2:
                       Tablet t1 = new Tablet();
                        Console.WriteLine("Introduce marca de tablet: ");
                        t1.Marca = Console.ReadLine();
                        Console.WriteLine("Introduce nombre de tablet: ");
                        t1.Nombre = Console.ReadLine();
                        Console.WriteLine("Introduce resolucion de tablet: ");
                        t1.Resolucion = Int32.Parse(Console.ReadLine());
                        Console.WriteLine("Introduce Memoria RAM de tablet: ");
                        t1.MemoriaRam = Int32.Parse(Console.ReadLine());
                        Console.WriteLine("Introduce duracion de bateria de tablet: ");
                        t1.DuracionBateria = Int32.Parse(Console.ReadLine());
                        Console.WriteLine("Introduce precio de tablet: ");
                        t1.Precio = Int32.Parse(Console.ReadLine());
                        l2.Add(t1);
                        break;

                    case 3:
                        Movil m1 = new Movil();
                        Console.WriteLine("Introduce marca de movil: ");
                        m1.Marca = Console.ReadLine();
                        Console.WriteLine("Introduce nombre de movil: ");
                        m1.Nombre = Console.ReadLine();
                        Console.WriteLine("Introduce Sistema operativo de movil: ");
                        m1.SOO = Console.ReadLine();
                        Console.WriteLine("Introduce Memoria RAM de movil: ");
                        m1.MemoriaRam = Int32.Parse(Console.ReadLine());
                        Console.WriteLine("Introduce duracion de bateria de movil: ");
                        m1.DuracionBateria = Int32.Parse(Console.ReadLine());
                        Console.WriteLine("Introduce precio de ordenador: ");
                        m1.Precio = Int32.Parse(Console.ReadLine());
                        Console.WriteLine("Introduce Almacenamiento de movil: ");
                        m1.Almacenamiento = Int32.Parse(Console.ReadLine());
                        l3.Add(m1);
                        break;

                    case 4:
                        mostrar(l1, l2 ,l3);
                        break;
                }
            } while (opcion != 7);
        }
    }
}
