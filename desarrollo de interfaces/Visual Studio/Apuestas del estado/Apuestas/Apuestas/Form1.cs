using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Windows.Forms;


namespace Apuestas
{
    public partial class Form1 : Form
    {
        Random random = new Random();
        ArrayList listchek = new ArrayList();
        int count = 0;
        int total;


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
        private void clickapl(object sender, EventArgs e)
        {
            TM.Enabled = true;
            TA.Enabled = true;
            Num.Enabled = true;
            Val.Enabled = true;
            Nm.Enabled = true;
            date.Enabled = true;

            //Nm.Text = random.Next(1, 11).ToString();

            // Si esta seleccionada sencilla
            if (LApu.SelectedIndex == 0)
            {
                count = 4;
            }

            // Si esta seleccionada multiple
            if (LApu.SelectedIndex == 1)
            {
                count = 6;
            }

            // Si esta seleccionada extrema
            if (LApu.SelectedIndex == 2)
            {
                count = 8;
            }
        }

        private void TMClick(object sender, EventArgs e)
        {
         //   Nm.Text = random.Next(1, 11).ToString();
        }

        private void TAClick(object sender, EventArgs e)
        {
          //  Nm.Text = random.Next(1, 11).ToString();
        }

        private void Val_Click(object sender, EventArgs e)
        {

        }

        private void TM_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void TA_CheckedChanged(object sender, EventArgs e)
        { 

           
        }

        private void check1(object sender, EventArgs e)
        {
            
            int selection = LApu.SelectedIndex;
            if ((selection == 0 && count != 0) || (selection == 1 && count != 0) || (selection == 2 && count != 0))
            {
                if (checkBox1.Checked == true)
                {
                    count--;
                }
                else
                    count++;
            }
        }

        private void check2(object sender, EventArgs e)
        {
            int selection = LApu.SelectedIndex;
            if ((selection == 0 && count != 0) || (selection == 1 && count != 0) || (selection == 2 && count != 0))
            {
                if (checkBox2.Checked == true)
                {
                    count--;
                }
                else
                    count++;
            }
        }

        private void check3(object sender, EventArgs e)
        {
            int selection = LApu.SelectedIndex;
            if ((selection == 0 && count != 0) || (selection == 1 && count != 0) || (selection == 2 && count != 0))
            {
                if (checkBox3.Checked == true)
                {
                    count--;
                }
                else
                    count++;
            }
        }

        private void check4(object sender, EventArgs e)
        {
            int selection = LApu.SelectedIndex;
            if ((selection == 0 && count != 0) || (selection == 1 && count != 0) || (selection == 2 && count != 0))
            {
                if (checkBox4.Checked == true)
                {
                    count--;
                }
                else
                    count++;
            }
        }

        private void check5(object sender, EventArgs e)
        {
            int selection = LApu.SelectedIndex;
            if ((selection == 0 && count != 0) || (selection == 1 && count != 0) || (selection == 2 && count != 0))
            {
                if (checkBox5.Checked == true)
                {
                    count--;
                }
                else
                    count++;
            }
        }


        private void date_ValueChanged(object sender, EventArgs e)
        {
            if (date.Value < DateTime.Today)
            {
                string mensaje = "No se puede participar en un sorteo anterior";
                string titulo = "Error en datos";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Error);
            }
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
