namespace Apuntes
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.button1 = new System.Windows.Forms.Button();
            this.Caja = new System.Windows.Forms.TextBox();
            this.H = new System.Windows.Forms.CheckBox();
            this.M = new System.Windows.Forms.CheckBox();
            this.checkedListBox1 = new System.Windows.Forms.CheckedListBox();
            this.Combolist = new System.Windows.Forms.ComboBox();
            this.simple = new System.Windows.Forms.DateTimePicker();
            this.label1 = new System.Windows.Forms.Label();
            this.items = new System.Windows.Forms.ListBox();
            this.Calendario = new System.Windows.Forms.MonthCalendar();
            this.Persona = new System.Windows.Forms.RadioButton();
            this.Area = new System.Windows.Forms.RichTextBox();
            this.Reset = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(12, 55);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(129, 32);
            this.button1.TabIndex = 0;
            this.button1.Text = "BotonAddTexto";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.agregarTexto);
            // 
            // Caja
            // 
            this.Caja.AccessibleDescription = "";
            this.Caja.Enabled = false;
            this.Caja.Location = new System.Drawing.Point(147, 55);
            this.Caja.Multiline = true;
            this.Caja.Name = "Caja";
            this.Caja.Size = new System.Drawing.Size(156, 32);
            this.Caja.TabIndex = 1;
            // 
            // H
            // 
            this.H.AutoSize = true;
            this.H.Location = new System.Drawing.Point(325, 60);
            this.H.Name = "H";
            this.H.Size = new System.Drawing.Size(80, 21);
            this.H.TabIndex = 2;
            this.H.Text = "Hombre";
            this.H.UseVisualStyleBackColor = true;
            // 
            // M
            // 
            this.M.AutoSize = true;
            this.M.Location = new System.Drawing.Point(411, 60);
            this.M.Name = "M";
            this.M.Size = new System.Drawing.Size(65, 21);
            this.M.TabIndex = 3;
            this.M.Text = "Mujer";
            this.M.UseVisualStyleBackColor = true;
            // 
            // checkedListBox1
            // 
            this.checkedListBox1.FormattingEnabled = true;
            this.checkedListBox1.Items.AddRange(new object[] {
            "Hola",
            "Adios"});
            this.checkedListBox1.Location = new System.Drawing.Point(12, 109);
            this.checkedListBox1.Name = "checkedListBox1";
            this.checkedListBox1.Size = new System.Drawing.Size(228, 259);
            this.checkedListBox1.TabIndex = 4;
            // 
            // Combolist
            // 
            this.Combolist.FormattingEnabled = true;
            this.Combolist.Items.AddRange(new object[] {
            "Ayer",
            "Hoy",
            "Manana"});
            this.Combolist.Location = new System.Drawing.Point(247, 109);
            this.Combolist.Name = "Combolist";
            this.Combolist.Size = new System.Drawing.Size(251, 24);
            this.Combolist.TabIndex = 5;
            // 
            // simple
            // 
            this.simple.Location = new System.Drawing.Point(247, 139);
            this.simple.Name = "simple";
            this.simple.Size = new System.Drawing.Size(251, 22);
            this.simple.TabIndex = 6;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(498, 60);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(46, 17);
            this.label1.TabIndex = 7;
            this.label1.Text = "label1";
            // 
            // items
            // 
            this.items.FormattingEnabled = true;
            this.items.ItemHeight = 16;
            this.items.Items.AddRange(new object[] {
            "Uno",
            "Dos",
            "Tres"});
            this.items.Location = new System.Drawing.Point(247, 167);
            this.items.Name = "items";
            this.items.Size = new System.Drawing.Size(251, 84);
            this.items.TabIndex = 8;
            this.items.SelectedIndexChanged += new System.EventHandler(this.items_SelectedIndexChanged);
            // 
            // Calendario
            // 
            this.Calendario.Location = new System.Drawing.Point(510, 109);
            this.Calendario.Name = "Calendario";
            this.Calendario.TabIndex = 9;
            // 
            // Persona
            // 
            this.Persona.AutoSize = true;
            this.Persona.Location = new System.Drawing.Point(550, 59);
            this.Persona.Name = "Persona";
            this.Persona.Size = new System.Drawing.Size(76, 21);
            this.Persona.TabIndex = 11;
            this.Persona.TabStop = true;
            this.Persona.Text = "Apretar";
            this.Persona.UseVisualStyleBackColor = true;
            // 
            // Area
            // 
            this.Area.Enabled = false;
            this.Area.Location = new System.Drawing.Point(246, 257);
            this.Area.Name = "Area";
            this.Area.Size = new System.Drawing.Size(252, 111);
            this.Area.TabIndex = 12;
            this.Area.Text = "";
            // 
            // Reset
            // 
            this.Reset.Location = new System.Drawing.Point(583, 4);
            this.Reset.Name = "Reset";
            this.Reset.Size = new System.Drawing.Size(133, 32);
            this.Reset.TabIndex = 13;
            this.Reset.Text = "Reiniciar";
            this.Reset.UseVisualStyleBackColor = true;
            this.Reset.Click += new System.EventHandler(this.Reset_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.AppWorkspace;
            this.ClientSize = new System.Drawing.Size(890, 453);
            this.Controls.Add(this.Reset);
            this.Controls.Add(this.Area);
            this.Controls.Add(this.Persona);
            this.Controls.Add(this.Calendario);
            this.Controls.Add(this.items);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.simple);
            this.Controls.Add(this.Combolist);
            this.Controls.Add(this.checkedListBox1);
            this.Controls.Add(this.M);
            this.Controls.Add(this.H);
            this.Controls.Add(this.Caja);
            this.Controls.Add(this.button1);
            this.Name = "Form1";
            this.Text = "Titulo";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.TextBox Caja;
        private System.Windows.Forms.CheckBox H;
        private System.Windows.Forms.CheckBox M;
        private System.Windows.Forms.CheckedListBox checkedListBox1;
        private System.Windows.Forms.ComboBox Combolist;
        private System.Windows.Forms.DateTimePicker simple;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ListBox items;
        private System.Windows.Forms.MonthCalendar Calendario;
        private System.Windows.Forms.RadioButton Persona;
        private System.Windows.Forms.RichTextBox Area;
        private System.Windows.Forms.Button Reset;
    }
}

