using System;
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
    public partial class Form2 : Form
    {
        string login = "";
        string password = "";
        string correcto = "";
        string acierto = "";
        Form1 abrirLO = new Form1();
        DateTime hoy = DateTime.Today; //hoy

        public Form2()
        {
            InitializeComponent();
        }

        private void acceso_Click(object sender, EventArgs e)
        {
            login = Remail.Text;
            password = Rpass.Text;

            for (int j = 0; j < password.Length; j++)
            {
                if(password[j] == '+' || password[j] == '/' || password[j] == '-' || password[j] == '*')
                {
                    acierto = "c";
                }
            }

            if (login.ToString().Equals("") || password.ToString().Equals("") || imag.Image == null)
            {
                string mensage = "Alguno campo esta vacio o fecha incorrecta";
                string titulo = "Error en datos";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensage, titulo, opciones, MessageBoxIcon.Error);
            }
            else
            {
                for (int i = 0; i < login.Length; i++)
                {
                    if (login[i] == '@')
                    {
                        correcto = "bien";
                    }
                }
                if (correcto.Equals("bien")) {
                    if (acierto.Equals("c")) { 
    
                    string mensage = "Registro correcto, te has logeado";
                    string titulo = "Registro Correcto";
                    MessageBoxButtons opciones = MessageBoxButtons.OK;
                    DialogResult result = MessageBox.Show(mensage, titulo, opciones, MessageBoxIcon.Information);
                    Remail.Text = "";
                    Rpass.Text = "";
                    cal.Value = hoy;
                    imag.Image = null;
                    groupBox1.Enabled = false;
                    groupBox2.Enabled = true;
                    }
                    else
                    {
                        string mensage = "Contrasena Incorrecta(Utiliza algun caracter en su contrasena)";
                        string titulo = "Error";
                        MessageBoxButtons opciones = MessageBoxButtons.OK;
                        DialogResult result = MessageBox.Show(mensage, titulo, opciones, MessageBoxIcon.Error);
                    }
                }
                else
                {
                    string mensage = "email incorrecto";
                    string titulo = "Error en email";
                    MessageBoxButtons opciones = MessageBoxButtons.OK;
                    DialogResult result = MessageBox.Show(mensage, titulo, opciones, MessageBoxIcon.Error);
                }
            }
        }

        private void Loteria_Click(object sender, EventArgs e)
        {
            if (Lemail.Text == login && Lpass.Text == password)
            {
                string mensage = "Has entrado a loterias";
                string titulo = "Entrado a loterias";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensage, titulo, opciones, MessageBoxIcon.Information);

                abrirLO.Show();
                this.Visible = false;

            }
            else
            {
                string mensage = "Email o contraseña incorrectos";
                string titulo = "Error en datos";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensage, titulo, opciones, MessageBoxIcon.Error);

                Lemail.Text = "";
                Lpass.Text = "";
            }
        }

        private void imag_Click(object sender, EventArgs e)
        {
            string textImage = "";
            System.IO.Stream myStream = null;
            openFileDialog1.InitialDirectory = "C:\\";
            openFileDialog1.Filter = "Archivos de imagen|*.jpg*;.png.;*bmp";
            openFileDialog1.FilterIndex = 3;
            openFileDialog1.FileName = "";

            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                if ((myStream = openFileDialog1.OpenFile()) != null)
                {

                    textImage = openFileDialog1.FileName;
                    imag.Image = Image.FromFile(textImage);
                }
            }
        }

        private void limpiar_Click(object sender, EventArgs e)
        {
            Remail.Text = "";
            Rpass.Text = "";
            Lemail.Text = "";
            Lpass.Text = "";
            muestra.Text = "";
            mostrar.Checked = false;
            imag.Image = null;
            cal.Value = hoy;
        }

        private void mostrar_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void cal_ValueChanged(object sender, EventArgs e)
        {

        }
    }
}
