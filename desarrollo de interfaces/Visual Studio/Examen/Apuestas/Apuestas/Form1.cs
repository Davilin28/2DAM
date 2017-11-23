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
                            numSel = 0;
                            numMax = 4;
                            manual();
                            numRein();
                            break;
                        case 1:
                            for (int i = 0; i < 16; i++)
                                ((CheckBox)listchek[i]).Checked = false;
                            numSel = 0;
                            numMax = 6;
                            manual();
                            numRein();
                            break;
                        case 2:
                            for (int i = 0; i < 16; i++)
                                ((CheckBox)listchek[i]).Checked = false;
                            numSel = 0;
                            numMax = 8;
                            manual();
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
            Rein.Text = random.Next(1, 11).ToString();
            if (rM.Checked && Lista.SelectedIndex != -1)
            {
                act();
            }
            manual();
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

        private void manual()
        {
               
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
            groupBox2.Enabled = true;
            final.Text += "Sorteo del dia: " + Cal.Text + "\t" +"\t";
            for (int i = 0; i < listchek.Count; i++)
            {
                if (((CheckBox)listchek[i]).Checked == true)
                {
                    final.Text += "Tus Numeros son: " + ((CheckBox)listchek[i]).Text + "\n";
                }
            }
            final.Text += "Tu Reitengro es: " + Rein.Text + " ";

            if (rM.Checked)
            {
                for (int i = 0; i < listchek.Count; i++)
                {
                    ((CheckBox)listchek[i]).Checked = false;
                }
            }
        }

        private void click1(object sender, EventArgs e)
        {
            if (checkBox1.Checked)
                numSel++;
            else
                numSel--;
        }

        private void click2(object sender, EventArgs e)
        {
            if (checkBox2.Checked)
                numSel++;
            else
                numSel--;
        }

        private void click3(object sender, EventArgs e)
        {
            if (checkBox3.Checked)
                numSel++;
            else
                numSel--;
        }

        private void click4(object sender, EventArgs e)
        {
            if (checkBox4.Checked)
                numSel++;
            else
                numSel--;
        }

        private void click5(object sender, EventArgs e)
        {
            if (checkBox5.Checked)
                numSel++;
            else
                numSel--;

        }

        private void click6(object sender, EventArgs e)
        {
            if (checkBox6.Checked)
                numSel++;
            else
                numSel--;
        }

        private void click7(object sender, EventArgs e)
        {
            if (checkBox7.Checked)
                numSel++;
            else
                numSel--;
        }

        private void click8(object sender, EventArgs e)
        {
            if (checkBox8.Checked)
                numSel++;
            else
                numSel--;
        }

        private void click9(object sender, EventArgs e)
        {
            if (checkBox9.Checked)
                numSel++;
            else
                numSel--;
        }

        private void click10(object sender, EventArgs e)
        {
            if (checkBox10.Checked)
                numSel++;
            else
                numSel--;
        }

        private void click11(object sender, EventArgs e)
        {
            if (checkBox11.Checked)
                numSel++;
            else
                numSel--;
        }

        private void click12(object sender, EventArgs e)
        {
            if (checkBox12.Checked)
                numSel++;
            else
                numSel--;
        }

        private void click13(object sender, EventArgs e)
        {
            if (checkBox13.Checked)
                numSel++;
            else
                numSel--;
        }

        private void click14(object sender, EventArgs e)
        {
            if (checkBox14.Checked)
                numSel++;
            else
                numSel--;
        }

        private void click15(object sender, EventArgs e)
        {
            if (checkBox15.Checked)
                numSel++;
            else
            numSel--;
        }

        private void click16(object sender, EventArgs e)
        {
            if (checkBox16.Checked)
                numSel++;
            else
                numSel--;
        }

        private void Apostar_Click(object sender, EventArgs e)
        {
            final.Text = "";
            groupBox2.Enabled = false;
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
