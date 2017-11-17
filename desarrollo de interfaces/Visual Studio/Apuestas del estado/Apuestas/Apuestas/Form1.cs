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
        ArrayList check = new ArrayList();
        public Form1()
        {
            InitializeComponent();

            // Crear el arraylist de checkbox
            check.Add(checkBox1);
            check.Add(checkBox2);
            check.Add(checkBox3);
            check.Add(checkBox4);
            check.Add(checkBox5);
            check.Add(checkBox6);
            check.Add(checkBox7);
            check.Add(checkBox8);
            check.Add(checkBox9);
            check.Add(checkBox10);
            check.Add(checkBox11);
            check.Add(checkBox12);
            check.Add(checkBox13);
            check.Add(checkBox14);
            check.Add(checkBox15);
            check.Add(checkBox16);
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            // Si esta seleccionada sencilla
            if (LApu.SelectedIndex == 0)
            {
                TM.Enabled = true;
                TA.Enabled = true;
                Num.Enabled = true;
                Val.Enabled = true;
                Nm.Enabled = true;
                date.Enabled = true;
            }

            // Si esta seleccionada multiple
            if (LApu.SelectedIndex == 1)
            {
                TM.Enabled = true;
                TA.Enabled = true;
                Num.Enabled = true;
                Val.Enabled = true;
                Nm.Enabled = true;
                date.Enabled = true;
            }

            // Si esta seleccionada extrema
            if (LApu.SelectedIndex == 2)
            {
                TM.Enabled = true;
                TA.Enabled = true;
                Num.Enabled = true;
                Val.Enabled = true;
                Nm.Enabled = true;
                date.Enabled = true;
            }
        }

        private void click(object sender, EventArgs e)
        {
          //Random aleatorio = new Random();
        }
    }
}
