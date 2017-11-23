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

namespace Apuestas
{
    public partial class Form1 : Form
    {
        Random random = new Random();
        ArrayList listchek = new ArrayList();
        int count = 0;
        public Form1()
        {
            InitializeComponent();
            listchek.Add(checkBox1);
            listchek.Add(checkBox2);
            listchek.Add(checkBox3);
            listchek.Add(checkBox4);
            listchek.Add(checkBox5);
            listchek.Add(checkBox6);
            listchek.Add(checkBox7);
            listchek.Add(checkBox8);
            listchek.Add(checkBox9);
            listchek.Add(checkBox10);
            listchek.Add(checkBox11);
            listchek.Add(checkBox12);
            listchek.Add(checkBox13);
            listchek.Add(checkBox14);
            listchek.Add(checkBox15);
            listchek.Add(checkBox16);
        }

        private void Lista_SelectedIndexChanged(object sender, EventArgs e)
        {
            rM.Enabled = true;
            rA.Enabled = true;
            Rein.Enabled = true;
            Valida.Enabled = true;
            Cal.Enabled = true;

            for (int i = 0; i < listchek.Count; i++)
            {
                ((CheckBox)listchek[i]).Enabled = true;
            }

            Rein.Text = random.Next(1, 11).ToString();
        }

        private void rM_CheckedChanged(object sender, EventArgs e)
        {
            Rein.Text = random.Next(1, 11).ToString();
        }

        private void rA_CheckedChanged(object sender, EventArgs e)
        {
            Rein.Text = random.Next(1, 11).ToString();


        }

        private void Cal_ValueChanged(object sender, EventArgs e)
        {
            if (Cal.Value < DateTime.Today)
            {
                string mensaje = "No se puede participar en un sorteo anterior";
                string titulo = "Error en datos";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Error);
            }
        }

        private void Valida_Click(object sender, EventArgs e)
        {
            int count = 0;
            groupBox2.Enabled = true;
            for (int i = 0; i < listchek.Count; i++)
            {
                if (((CheckBox)listchek[i]).Checked == true)
                {
                    count++;
                }
            }
            final.Text = "Los numeros: " + count;
        }


        private void click1(object sender, EventArgs e)
        {

        }

        private void click2(object sender, EventArgs e)
        {

        }

        private void click3(object sender, EventArgs e)
        {

        }

        private void click4(object sender, EventArgs e)
        {

        }

        private void click5(object sender, EventArgs e)
        {

        }

        private void click6(object sender, EventArgs e)
        {

        }

        private void click7(object sender, EventArgs e)
        {

        }

        private void click8(object sender, EventArgs e)
        {

        }

        private void click9(object sender, EventArgs e)
        {

        }

        private void click10(object sender, EventArgs e)
        {

        }

        private void click11(object sender, EventArgs e)
        {

        }

        private void click12(object sender, EventArgs e)
        {

        }

        private void click13(object sender, EventArgs e)
        {

        }

        private void click14(object sender, EventArgs e)
        {

        }

        private void click15(object sender, EventArgs e)
        {

        }

        private void click16(object sender, EventArgs e)
        {

        }

        private void Apostar_Click(object sender, EventArgs e)
        {

        }

        private void Salir_Click(object sender, EventArgs e)
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
    }
}
