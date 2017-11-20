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
        private int iclick;
        ArrayList point = new ArrayList();
       

        public Form1()
        {
            InitializeComponent();
            iclick = 0;
            point.Add(checkBox1);
            point.Add(checkBox2);
            point.Add(checkBox3);
            point.Add(checkBox4);
            point.Add(checkBox5);
            point.Add(checkBox6);
            point.Add(checkBox7);
            point.Add(checkBox8);
            point.Add(checkBox9);
            point.Add(checkBox10);
            point.Add(checkBox11);
            point.Add(checkBox12);
            point.Add(checkBox13);
            point.Add(checkBox14);
            point.Add(checkBox15);
            point.Add(checkBox16);
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

                for (int iCont = 1; iCont <= 16; iCont++)
                {
                    
                }
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

        private void TMClick(object sender, EventArgs e)
        {
            Nm.Text = random.Next(1, 10).ToString();

        }

        private void TAClick(object sender, EventArgs e)
        {
            Nm.Text = random.Next(1, 10).ToString();      
        }
    }
}
