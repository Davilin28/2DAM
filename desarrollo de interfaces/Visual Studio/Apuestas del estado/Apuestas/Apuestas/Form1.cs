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
        int count = 0;

        public Form1()
        {
            InitializeComponent();
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
