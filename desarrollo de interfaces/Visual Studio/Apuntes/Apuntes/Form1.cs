using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Apuntes
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void agregarTexto(object sender, EventArgs e)
        {
            //Crear envento y que te introduzca un hola en el textArea
            Caja.Text += "Soy un TextBox";
            Area.Text += "Probando texto"+"\n";
            H.Checked = true;

            int uno = 1;
            int dos = 2;

            //  Area.Text += "La suma de 1 + 2 = " + (uno + dos).ToString() + "\n"; ;

            // Combertir calendario en String.
            Area.Text += Calendario.TodayDate + "\n"; ;
        
            if (Combolist.SelectedIndex == 0)
            {
              // Area.Text += Combolist.SelectedItem + "\n";
            }
        }

        private void Reset_Click(object sender, EventArgs e)
        {
            Caja.Text = " ";
            Area.Text = " ";
            H.Checked = false;
            items.SelectedIndex = -1;
        }

        private void items_SelectedIndexChanged(object sender, EventArgs e)
        {
            Area.Text += items.SelectedItem + "\n";
        }
    }
}
