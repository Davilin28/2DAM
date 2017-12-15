namespace Apuestas
{
    partial class Form2
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.imag = new System.Windows.Forms.PictureBox();
            this.acceso = new System.Windows.Forms.Button();
            this.limpiar = new System.Windows.Forms.Button();
            this.label4 = new System.Windows.Forms.Label();
            this.cal = new System.Windows.Forms.DateTimePicker();
            this.label3 = new System.Windows.Forms.Label();
            this.Rpass = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.Remail = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.button1 = new System.Windows.Forms.Button();
            this.muestra = new System.Windows.Forms.TextBox();
            this.mostrar = new System.Windows.Forms.CheckBox();
            this.Lpass = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.Lemail = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.Loteria = new System.Windows.Forms.Button();
            this.openFileDialog1 = new System.Windows.Forms.OpenFileDialog();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.imag)).BeginInit();
            this.groupBox2.SuspendLayout();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.imag);
            this.groupBox1.Controls.Add(this.acceso);
            this.groupBox1.Controls.Add(this.limpiar);
            this.groupBox1.Controls.Add(this.label4);
            this.groupBox1.Controls.Add(this.cal);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Controls.Add(this.Rpass);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.Remail);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Location = new System.Drawing.Point(5, 26);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(521, 448);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "REGISTRO";
            // 
            // imag
            // 
            this.imag.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.imag.Location = new System.Drawing.Point(223, 139);
            this.imag.Name = "imag";
            this.imag.Size = new System.Drawing.Size(268, 245);
            this.imag.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.imag.TabIndex = 13;
            this.imag.TabStop = false;
            this.imag.Click += new System.EventHandler(this.imag_Click);
            // 
            // acceso
            // 
            this.acceso.Location = new System.Drawing.Point(347, 394);
            this.acceso.Name = "acceso";
            this.acceso.Size = new System.Drawing.Size(144, 48);
            this.acceso.TabIndex = 11;
            this.acceso.Text = "Acceso Login >>";
            this.acceso.UseVisualStyleBackColor = true;
            this.acceso.Click += new System.EventHandler(this.acceso_Click);
            // 
            // limpiar
            // 
            this.limpiar.Location = new System.Drawing.Point(222, 394);
            this.limpiar.Name = "limpiar";
            this.limpiar.Size = new System.Drawing.Size(119, 48);
            this.limpiar.TabIndex = 10;
            this.limpiar.Text = "Limpiar";
            this.limpiar.UseVisualStyleBackColor = true;
            this.limpiar.Click += new System.EventHandler(this.limpiar_Click);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(51, 139);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(164, 17);
            this.label4.TabIndex = 8;
            this.label4.Text = "Seleccione foto de perfil:";
            // 
            // cal
            // 
            this.cal.CustomFormat = "dd-MM-yyyy ";
            this.cal.Location = new System.Drawing.Point(223, 99);
            this.cal.Name = "cal";
            this.cal.Size = new System.Drawing.Size(268, 22);
            this.cal.TabIndex = 7;
            this.cal.Value = new System.DateTime(2017, 11, 24, 10, 37, 0, 0);
            this.cal.ValueChanged += new System.EventHandler(this.cal_ValueChanged);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(6, 104);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(209, 17);
            this.label3.TabIndex = 6;
            this.label3.Text = "Introduzca fecha de nacimiento:";
            // 
            // Rpass
            // 
            this.Rpass.Location = new System.Drawing.Point(223, 64);
            this.Rpass.Name = "Rpass";
            this.Rpass.PasswordChar = '*';
            this.Rpass.Size = new System.Drawing.Size(268, 22);
            this.Rpass.TabIndex = 5;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(62, 67);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(153, 17);
            this.label2.TabIndex = 4;
            this.label2.Text = "Introduzca contraseña:";
            // 
            // Remail
            // 
            this.Remail.Location = new System.Drawing.Point(223, 28);
            this.Remail.Name = "Remail";
            this.Remail.Size = new System.Drawing.Size(268, 22);
            this.Remail.TabIndex = 3;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(29, 31);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(186, 17);
            this.label1.TabIndex = 2;
            this.label1.Text = "Introduzca email de usuario:";
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.button1);
            this.groupBox2.Controls.Add(this.muestra);
            this.groupBox2.Controls.Add(this.mostrar);
            this.groupBox2.Controls.Add(this.Lpass);
            this.groupBox2.Controls.Add(this.label6);
            this.groupBox2.Controls.Add(this.Lemail);
            this.groupBox2.Controls.Add(this.label5);
            this.groupBox2.Controls.Add(this.Loteria);
            this.groupBox2.Enabled = false;
            this.groupBox2.Location = new System.Drawing.Point(534, 26);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(486, 448);
            this.groupBox2.TabIndex = 1;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "LOGIN";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(199, 394);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(119, 48);
            this.button1.TabIndex = 20;
            this.button1.Text = "Limpiar";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // muestra
            // 
            this.muestra.Location = new System.Drawing.Point(200, 101);
            this.muestra.Name = "muestra";
            this.muestra.ReadOnly = true;
            this.muestra.Size = new System.Drawing.Size(268, 22);
            this.muestra.TabIndex = 19;
            // 
            // mostrar
            // 
            this.mostrar.AutoSize = true;
            this.mostrar.Location = new System.Drawing.Point(116, 102);
            this.mostrar.Name = "mostrar";
            this.mostrar.Size = new System.Drawing.Size(78, 21);
            this.mostrar.TabIndex = 18;
            this.mostrar.Text = "Mostrar";
            this.mostrar.UseVisualStyleBackColor = true;
            this.mostrar.CheckedChanged += new System.EventHandler(this.mostrar_CheckedChanged);
            // 
            // Lpass
            // 
            this.Lpass.Location = new System.Drawing.Point(200, 62);
            this.Lpass.Name = "Lpass";
            this.Lpass.PasswordChar = '*';
            this.Lpass.Size = new System.Drawing.Size(268, 22);
            this.Lpass.TabIndex = 17;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(39, 65);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(153, 17);
            this.label6.TabIndex = 16;
            this.label6.Text = "Introduzca contraseña:";
            // 
            // Lemail
            // 
            this.Lemail.Location = new System.Drawing.Point(200, 25);
            this.Lemail.Name = "Lemail";
            this.Lemail.Size = new System.Drawing.Size(268, 22);
            this.Lemail.TabIndex = 15;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(8, 28);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(186, 17);
            this.label5.TabIndex = 14;
            this.label5.Text = "Introduzca email de usuario:";
            // 
            // Loteria
            // 
            this.Loteria.Location = new System.Drawing.Point(324, 394);
            this.Loteria.Name = "Loteria";
            this.Loteria.Size = new System.Drawing.Size(144, 48);
            this.Loteria.TabIndex = 13;
            this.Loteria.Text = "Acceso Loteria >>";
            this.Loteria.UseVisualStyleBackColor = true;
            this.Loteria.Click += new System.EventHandler(this.Loteria_Click);
            // 
            // openFileDialog1
            // 
            this.openFileDialog1.FileName = "openFileDialog1";
            // 
            // Form2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1028, 486);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.groupBox1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "Form2";
            this.Text = "Acceso a Loterias";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.imag)).EndInit();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.DateTimePicker cal;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox Rpass;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox Remail;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.Button acceso;
        private System.Windows.Forms.Button limpiar;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox muestra;
        private System.Windows.Forms.CheckBox mostrar;
        private System.Windows.Forms.TextBox Lpass;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox Lemail;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Button Loteria;
        private System.Windows.Forms.PictureBox imag;
        private System.Windows.Forms.OpenFileDialog openFileDialog1;
        private System.Windows.Forms.Button button1;
    }
}