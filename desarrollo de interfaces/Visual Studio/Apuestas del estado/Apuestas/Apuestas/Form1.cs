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
        int numMax = 0, numSel = 0;
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
            
            Rein.Text = random.Next(1, 11).ToString();

            if (Lista.SelectedIndex != -1)
            {
                if (rA.Checked)
                {
                    switch (Lista.SelectedIndex)
                    {
                        case 0:
                            for (int i = 0; i < 16; i++)
                                ((CheckBox)listchek[i]).Checked = false;
                            numSel = 0;
                            numMax = 4;
                            automatico();
                            numRein();
                            break;
                        case 1:
                            for (int i = 0; i < 16; i++)
                                ((CheckBox)listchek[i]).Checked = false;
                            numSel = 0;
                            numMax = 6;
                            automatico();
                            numRein();
                            break;
                        case 2:
                            for (int i = 0; i < 16; i++)
                                ((CheckBox)listchek[i]).Checked = false;
                            numSel = 0;
                            numMax = 8;
                            automatico();
                            numRein();
                            break;
                    }
                }
                else
                {
                    switch (Lista.SelectedIndex)
                    {
                        case 0:
                            numMax = 4;
                            act();
                            numRein();
                            break;
                        case 1:
                            numMax = 6;
                            act();
                            numRein();
                            break;
                        case 2:
                            numMax = 8;
                            act();
                            numRein();
                            break;
                    }
                }
                if (rM.Checked)
                    switch (Lista.SelectedIndex)
                    {
                        case 0:
                            for (int i = 0; i < 16; i++)
                                ((CheckBox)listchek[i]).Checked = false;
                            numMax = 4;
                            numRein();
                            break;
                        case 1:
                            for (int i = 0; i < 16; i++)
                                ((CheckBox)listchek[i]).Checked = false;
                            numMax = 6;
                            numRein();
                            break;
                        case 2:
                            for (int i = 0; i < 16; i++)
                                ((CheckBox)listchek[i]).Checked = false;
                            numMax = 8;
                            numRein();
                            break;
                    }
                else
                {
                    switch (Lista.SelectedIndex)
                    {
                        case 0:
                            numMax = 4;
                            act();
                            numRein();
                            break;
                        case 1:
                            numMax = 6;
                            act();
                            numRein();
                            break;
                        case 2:
                            numMax = 8;
                            act();
                            numRein();
                            break;
                    }
                }
            }
        }

        private void rM_CheckedChanged(object sender, EventArgs e)
        {
            numRein();
            if (rM.Checked && Lista.SelectedIndex != -1)
            {
                act();
            }
        }

        private void rA_CheckedChanged(object sender, EventArgs e)
        {
            if (rA.Checked)
                automatico();
        }

        public void act()
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
            for (int i = 0; i < listchek.Count; i++)
            {
                ((CheckBox)listchek[i]).Checked = false;
            }
        }

        private void automatico()
        {
            numSel = 0;
            for (int i = 0; i < listchek.Count; i++)
                ((CheckBox)listchek[i]).Enabled = false;
            while (numSel < numMax)
            {
                int aux = random.Next(0, 16);
                if (((CheckBox)listchek[aux]).Checked == false)
                {
                    ((CheckBox)listchek[aux]).Checked = true;
                    numSel++;
                }
            }
        }

        private void numRein()
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

            string comprobar = "";

            for (int h = 0; h < listchek.Count; h++)
            {
                if (((CheckBox)listchek[h]).Checked == true)
                {
                    if (Lista.SelectedIndex == 0 && rM.Checked)
                    {
                        if (numMax == 0)
                        {
                            comprobar = "true";
                        }
                        else
                        {
                            comprobar = "false";
                        }
                    }
                    if (Lista.SelectedIndex == 1 && rM.Checked)
                    {
                        if (numMax == 0)
                        {
                            comprobar = "true";
                        }
                        else
                        {
                            comprobar = "false";
                        }
                    }
                    if (Lista.SelectedIndex == 2 && rM.Checked)
                    {
                        if (numMax == 0)
                        {
                            comprobar = "true";
                        }
                        else
                        {
                            comprobar = "false";
                        }
                    }
                }
            }

            if (Lista.SelectedIndex.Equals(0) && comprobar.Equals("false"))
            {
                string mensaje = "Debes marcar los numeros maximos 4";
                string titulo = "Seleccionar los numeros SENCILLA";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Error);
            }
            if (Lista.SelectedIndex.Equals(1) && comprobar.Equals("false"))
            {
                string mensaje = "Debes marcar los numeros maximos 6";
                string titulo = "Seleccionar los numeros MULTIPLE";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Error);
            }
            if (Lista.SelectedIndex.Equals(2) && comprobar.Equals("false"))
            {
                string mensaje = "Debes marcar los numeros maximos 8";
                string titulo = "Seleccionar los numeros EXTREMA";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Error);
            }
            
            if (comprobar.Equals("true") || rA.Checked == true) { 

            DateTime hoy = DateTime.Today;
            groupBox2.Enabled = true;
                int x = 0;
                    for (int j = 0; j < listchek.Count; j++)
                    {
                        if (((CheckBox)listchek[j]).Checked == true)
                        {
                        list.Items.Add("Numero " + ( x = x+1 ) + ": "+ ((CheckBox)listchek[j]).Text + "\n");
                        }
                    }
                     list.Items.Add("Reitengro: " + Rein.Text + " ");

            Lista.Enabled = false;
            Lista.SelectedIndex = -1;
            rA.Enabled = false;
            rM.Enabled = false;
            rM.Checked = true;
            Valida.Enabled = false;
            Cal.Enabled = false;
            Cal.Value = hoy;
            Rein.Text = "";
            Rein.Enabled = false;
            

            for (int i = 0; i < listchek.Count; i++)
            {
                if (((CheckBox)listchek[i]).Checked == true)
                {
                    ((CheckBox)listchek[i]).Checked = false;
                }
                ((CheckBox)listchek[i]).Enabled = false;
            }
            }
        }

        private void click1(object sender, EventArgs e)
        {
            if (checkBox1.Checked)
            {
                if (numMax > 0)
                {
                    checkBox1.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox1.Checked = false;
                }
            }
            else
            {
                numMax++;
            }
        }

        private void click2(object sender, EventArgs e)
        {
            if (checkBox2.Checked)
            {
                if (numMax > 0)
                {
                    checkBox2.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox2.Checked = false;

                }
            }
            else
            {
                numMax++;
            }
        }

        private void click3(object sender, EventArgs e)
        {
            if (checkBox3.Checked)
            {
                if (numMax > 0)
                {
                    checkBox3.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox3.Checked = false;

                }
            }
            else
            {
                numMax++;
            }
        }

        private void click4(object sender, EventArgs e)
        {
            if (checkBox4.Checked)
            {
                if (numMax > 0)
                {
                    checkBox4.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox4.Checked = false;

                }
            }
            else
            {
                numMax++;
            }
        }

        private void click5(object sender, EventArgs e)
        {
            if (checkBox5.Checked)
            {
                if (numMax > 0)
                {
                    checkBox5.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox5.Checked = false;

                }
            }
            else
            {
                numMax++;
            }
        }

        private void click6(object sender, EventArgs e)
        {
            if (checkBox6.Checked)
            {
                if (numMax > 0)
                {
                    checkBox6.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox6.Checked = false;

                }
            }
            else
            {
                numMax++;
            }
        }

        private void click7(object sender, EventArgs e)
        {
            if (checkBox7.Checked)
            {
                if (numMax > 0)
                {
                    checkBox7.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox7.Checked = false;

                }
            }
            else
            {
                numMax++;
            }
        }

        private void click8(object sender, EventArgs e)
        {
            if (checkBox8.Checked)
            {
                if (numMax > 0)
                {
                    checkBox8.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox8.Checked = false;

                }
            }
            else
            {
                numMax++;
            }
        }

        private void click9(object sender, EventArgs e)
        {
            if (checkBox9.Checked)
            {
                if (numMax > 0)
                {
                    checkBox9.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox9.Checked = false;

                }
            }
            else
            {
                numMax++;
            }
        }

        private void click10(object sender, EventArgs e)
        {
            if (checkBox10.Checked)
            {
                if (numMax > 0)
                {
                    checkBox10.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox10.Checked = false;

                }
            }
            else
            {
                numMax++;
            }
        }

        private void click11(object sender, EventArgs e)
        {
            if (checkBox11.Checked)
            {
                if (numMax > 0)
                {
                    checkBox11.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox11.Checked = false;

                }
            }
            else
            {
                numMax++;
            }
        }

        private void click12(object sender, EventArgs e)
        {
            if (checkBox12.Checked)
            {
                if (numMax > 0)
                {
                    checkBox12.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox12.Checked = false;

                }
            }
            else
            {
                numMax++;
            }
        }

        private void click13(object sender, EventArgs e)
        {
            if (checkBox13.Checked)
            {
                if (numMax > 0)
                {
                    checkBox13.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox13.Checked = false;

                }
            }
            else
            {
                numMax++;
            }
        }

        private void click14(object sender, EventArgs e)
        {
            if (checkBox14.Checked)
            {
                if (numMax > 0)
                {
                    checkBox14.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox14.Checked = false;

                }
            }
            else
            {
                numMax++;
            }
        }

        private void click15(object sender, EventArgs e)
        {
            if (checkBox15.Checked)
            {
                if (numMax > 0)
                {
                    checkBox15.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox15.Checked = false;
                }
            }
            else
            {
                numMax++;
            }
        }

        private void click16(object sender, EventArgs e)
        {
            if (checkBox16.Checked)
            {
                if (numMax > 0)
                {
                    checkBox16.Checked = true;
                    numMax--;
                }
                else
                {
                    checkBox16.Checked = false;
                }
            }
            else
            {
                numMax++;
            }
        }

        private void Apostar_Click(object sender, EventArgs e)
        {
            list.Items.Clear();
           groupBox2.Enabled = false;
           Lista.Enabled = true;
        }

        private void Salir_Click(object sender, EventArgs e)
        {
            string mensaje = "¿Realmente desea salir?";
            string titulo = "Salir";
            MessageBoxButtons opciones = MessageBoxButtons.YesNo;
            DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Question);

            if (result == System.Windows.Forms.DialogResult.Yes)
            {
               Application.Exit();
            }
        }
    }
}