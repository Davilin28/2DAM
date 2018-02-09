using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TiendaElectronica
{
    public partial class Form1 : Form
    {
        
        public Form1()
        {
            InitializeComponent();
            marca.Visible = false;
            textMarca.Visible = false;
            nombre.Visible = false;
            textNombre.Visible = false;
            resolucion.Visible = false;
            textResolucion.Visible = false;
            velocidad.Visible = false;
            textVelocidad.Visible = false;
            mr.Visible = false;
            textMr.Visible = false;
            db.Visible = false;
            textDb.Visible = false;
            almacenamiento.Visible = false;
            textAlmacenamiento.Visible = false;
            so.Visible = false;
            textSO.Visible = false;
            np.Visible = false;
            textNP.Visible = false;
            precio.Visible = false;
            textPrecio.Visible = false;
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            // Ordenador
            if (Elementos.SelectedIndex == 0)
            {
                //Activo
                //Marca
                marca.Visible = true;
                textMarca.Visible = true;
                //Nombre
                nombre.Visible = true;
                textNombre.Visible = true;
                //Velocidad
                velocidad.Visible = true;
                textVelocidad.Visible = true;
                //Memoria Ram
                mr.Visible = true;
                textMr.Visible = true;
                //Numero de puertos
                np.Visible = true;
                textNP.Visible = true;
                //Precio
                precio.Visible = true;
                textPrecio.Visible = true;

                //Desactivar: resolucion, sistema operativo, db, almacenamiento.
                //Resolucion
                resolucion.Visible = false;
                textResolucion.Visible = false;
                //SO
                so.Visible = false;
                textSO.Visible = false;
                //DB
                db.Visible = false;
                textDb.Visible = false;
                //Almacenamiento
                almacenamiento.Visible = false;
                textAlmacenamiento.Visible = false;
            }

            // Tablet.
            if (Elementos.SelectedIndex == 1)
            {
                //Activo
                //Marca
                marca.Visible = true;
                textMarca.Visible = true;
                //Nombre
                nombre.Visible = true;
                textNombre.Visible = true;
                //Resolucion
                resolucion.Visible = true;
                textResolucion.Visible = true;
                //Memoria Ram
                mr.Visible = true;
                textMr.Visible = true;
                //DB
                db.Visible = true;
                textDb.Visible = true;
                //Precio
                precio.Visible = true;
                textPrecio.Visible = true;

                //Desactivar: Velocidad, SO, Almacenamiento, Puerto,
                //Velocidad
                velocidad.Visible = false;
                textVelocidad.Visible = false;
                //SO
                so.Visible = false;
                textSO.Visible = false;
                //Almacenamiento
                almacenamiento.Visible = false;
                textAlmacenamiento.Visible = false;
                //Puerto
                np.Visible = false;
                textNP.Visible = false;
            }

            // Movil
            if (Elementos.SelectedIndex == 2)
            {
                //Activo
                //Marca
                marca.Visible = true;
                textMarca.Visible = true;
                //Nombre
                nombre.Visible = true;
                textNombre.Visible = true;
                //SO
                so.Visible = true;
                textSO.Visible = true;
                //DB
                db.Visible = true;
                textDb.Visible = true;
                //Almacenamiento
                almacenamiento.Visible = true;
                textAlmacenamiento.Visible = true;
                //Memoria Ram
                mr.Visible = true;
                textMr.Visible = true;
                //Precio
                precio.Visible = true;
                textPrecio.Visible = true;

                //Desactivar: velocidad,resolucion, np
                //Velocidad
                velocidad.Visible = false;
                textVelocidad.Visible = false;
                //Resolucion
                resolucion.Visible = false;
                textResolucion.Visible = false;
                //Puerto
                np.Visible = false;
                textNP.Visible = false;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
        //Ordenador: Marca, Nombre, Velocidad, Memoria RAM, Nº Puertos, Precio, Resolución, DuraciónBateria, , 
        // Sistema operativo,  Almacenamiento,
            lista.Items.Add(
                Elementos.SelectedItem + " " +
                //Marca
                marca.Text + ":" + textMarca.Text + " "+ 
                //Nombre
                nombre.Text+ ":" + textNombre.Text + " " + 
                //Velocidad
                velocidad.Text + ":" + textVelocidad.Text + " " +
                //Memoria RAM
                mr.Text+":" + textMr.Text + " " + np.Text + ":" + textNP.Text + " " +
                //Precio
                precio.Text + ":" + textPrecio.Text + " " +
                //Resolucion
                resolucion.Text + ":" + textResolucion.Text + " " +
                //DB
                db.Text + ":" + textDb.Text + " " +
                //SO
                so.Text + ":" + textSO.Text + " " +
                //Almacenamiento
                almacenamiento.Text + ":" + textAlmacenamiento.Text + " ");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (lista.SelectedIndex > -1)
            {
                lista.Items.RemoveAt(lista.SelectedIndex);
            }
        }
    }
}
