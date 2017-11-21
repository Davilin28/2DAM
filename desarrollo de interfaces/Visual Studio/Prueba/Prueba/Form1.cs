using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Prueba
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            //tabControl1.SelectedIndex = 3;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //EXAMINAR - CLICK
            Stream myStream = null;
            openFileDialog1.InitialDirectory = "C:\\";
            openFileDialog1.Filter = "Texto|*.txt|Todos|*.*";
            openFileDialog1.FilterIndex = 3;
            openFileDialog1.FileName = "";

            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                if ((myStream = openFileDialog1.OpenFile()) != null)
                {
                    textBox1.Text = openFileDialog1.FileName;
                }
            }
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {

        }

        

        private void cambiarValor(object sender, EventArgs e)
        {
            
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            if (textBox2.Text.Length==0)
                checkBox1.Checked = false;
            else
                checkBox1.Checked = true;
            
        }

        private void dateTimePicker1_ValueChanged(object sender, EventArgs e)
        {
            DateTime elegido = dateTimePicker1.Value; // ayer
            DateTime hoy = DateTime.Today; //hoy

            if (elegido.Date > hoy.Date)
                textBox2.Text = "Mayor a hoy";
            if (elegido.Date == hoy.Date)
                textBox2.Text = "Son iguales";
            if (elegido.Date < hoy.Date)
                textBox2.Text = "Menor a hoy";

        }

        /*private void victor(object sender, EventArgs e)
        {
            textBox2.Text = "Victor";
        }*/

        private void victor(object sender, MouseEventArgs e)
        {
            textBox2.Text = "Victor";
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            textBox2.Text = listBox1.SelectedItem.ToString();
        }

        private void valueChanged(object sender, EventArgs e)
        {
            textBox2.Text = listBox1.SelectedItem.ToString();
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void salirfuera(object sender, EventArgs e)
        {
            textBox2.Text = "Fuera de imagen";
        }

        private void entrardentro(object sender, MouseEventArgs e)
        {
            textBox2.Text = "Dentro de imagen";
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            textBox2.Text = "Hombre";
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            textBox2.Text = "Mujer";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            string mensaje = "¿Realmente desea salir?";
            string titulo = "Salir";
            MessageBoxButtons opciones = MessageBoxButtons.YesNo;
            DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Question);

            if (result == System.Windows.Forms.DialogResult.Yes)
            {
                this.Close();
            }

        }

        private void button3_Click(object sender, EventArgs e)
        {
            string mensage = "Debe rellenar todos los campos";
            string titulo = "Error en datos";
            MessageBoxButtons opciones = MessageBoxButtons.OK;
            DialogResult result = MessageBox.Show(mensage, titulo, opciones, MessageBoxIcon.Information);

        }
    }
}
