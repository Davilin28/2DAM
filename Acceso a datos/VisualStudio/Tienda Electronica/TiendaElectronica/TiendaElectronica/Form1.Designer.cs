namespace TiendaElectronica
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
            this.Elementos = new System.Windows.Forms.ComboBox();
            this.lista = new System.Windows.Forms.ListBox();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.button4 = new System.Windows.Forms.Button();
            this.marca = new System.Windows.Forms.Label();
            this.nombre = new System.Windows.Forms.Label();
            this.resolucion = new System.Windows.Forms.Label();
            this.velocidad = new System.Windows.Forms.Label();
            this.mr = new System.Windows.Forms.Label();
            this.db = new System.Windows.Forms.Label();
            this.almacenamiento = new System.Windows.Forms.Label();
            this.so = new System.Windows.Forms.Label();
            this.np = new System.Windows.Forms.Label();
            this.precio = new System.Windows.Forms.Label();
            this.textMarca = new System.Windows.Forms.TextBox();
            this.textNombre = new System.Windows.Forms.TextBox();
            this.textMr = new System.Windows.Forms.TextBox();
            this.textResolucion = new System.Windows.Forms.TextBox();
            this.textVelocidad = new System.Windows.Forms.TextBox();
            this.textDb = new System.Windows.Forms.TextBox();
            this.textAlmacenamiento = new System.Windows.Forms.TextBox();
            this.textSO = new System.Windows.Forms.TextBox();
            this.textNP = new System.Windows.Forms.TextBox();
            this.textPrecio = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // Elementos
            // 
            this.Elementos.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.Elementos.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.Elementos.FormattingEnabled = true;
            this.Elementos.Items.AddRange(new object[] {
            "Ordenador",
            "Tablet",
            "Movil"});
            this.Elementos.Location = new System.Drawing.Point(832, 23);
            this.Elementos.Name = "Elementos";
            this.Elementos.Size = new System.Drawing.Size(326, 24);
            this.Elementos.TabIndex = 1;
            this.Elementos.SelectedIndexChanged += new System.EventHandler(this.comboBox1_SelectedIndexChanged);
            // 
            // lista
            // 
            this.lista.FormattingEnabled = true;
            this.lista.ItemHeight = 16;
            this.lista.Location = new System.Drawing.Point(12, 24);
            this.lista.Name = "lista";
            this.lista.Size = new System.Drawing.Size(785, 356);
            this.lista.TabIndex = 2;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(49, 401);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(107, 63);
            this.button1.TabIndex = 86;
            this.button1.Text = "Anotar Venta";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(236, 401);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(107, 63);
            this.button2.TabIndex = 87;
            this.button2.Text = "Eliminar Venta";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(442, 401);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(107, 63);
            this.button3.TabIndex = 88;
            this.button3.Text = "Mostrar Venta";
            this.button3.UseVisualStyleBackColor = true;
            // 
            // button4
            // 
            this.button4.Location = new System.Drawing.Point(639, 401);
            this.button4.Name = "button4";
            this.button4.Size = new System.Drawing.Size(158, 63);
            this.button4.TabIndex = 89;
            this.button4.Text = "Mostrar venta por tipo";
            this.button4.UseVisualStyleBackColor = true;
            // 
            // marca
            // 
            this.marca.AutoSize = true;
            this.marca.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.marca.Location = new System.Drawing.Point(828, 62);
            this.marca.Name = "marca";
            this.marca.Size = new System.Drawing.Size(62, 24);
            this.marca.TabIndex = 90;
            this.marca.Text = "Marca";
            // 
            // nombre
            // 
            this.nombre.AutoSize = true;
            this.nombre.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.nombre.Location = new System.Drawing.Point(828, 102);
            this.nombre.Name = "nombre";
            this.nombre.Size = new System.Drawing.Size(79, 24);
            this.nombre.TabIndex = 91;
            this.nombre.Text = "Nombre";
            // 
            // resolucion
            // 
            this.resolucion.AutoSize = true;
            this.resolucion.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.resolucion.Location = new System.Drawing.Point(828, 146);
            this.resolucion.Name = "resolucion";
            this.resolucion.Size = new System.Drawing.Size(105, 24);
            this.resolucion.TabIndex = 92;
            this.resolucion.Text = "Resolucion";
            // 
            // velocidad
            // 
            this.velocidad.AutoSize = true;
            this.velocidad.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.velocidad.Location = new System.Drawing.Point(828, 184);
            this.velocidad.Name = "velocidad";
            this.velocidad.Size = new System.Drawing.Size(95, 24);
            this.velocidad.TabIndex = 93;
            this.velocidad.Text = "Velocidad";
            // 
            // mr
            // 
            this.mr.AutoSize = true;
            this.mr.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.mr.Location = new System.Drawing.Point(828, 227);
            this.mr.Name = "mr";
            this.mr.Size = new System.Drawing.Size(128, 24);
            this.mr.TabIndex = 94;
            this.mr.Text = "Memoria Ram";
            // 
            // db
            // 
            this.db.AutoSize = true;
            this.db.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.db.Location = new System.Drawing.Point(828, 262);
            this.db.Name = "db";
            this.db.Size = new System.Drawing.Size(148, 24);
            this.db.TabIndex = 95;
            this.db.Text = "Duracion Bateria";
            // 
            // almacenamiento
            // 
            this.almacenamiento.AutoSize = true;
            this.almacenamiento.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.almacenamiento.Location = new System.Drawing.Point(821, 299);
            this.almacenamiento.Name = "almacenamiento";
            this.almacenamiento.Size = new System.Drawing.Size(152, 24);
            this.almacenamiento.TabIndex = 96;
            this.almacenamiento.Text = "Almacenamiento";
            // 
            // so
            // 
            this.so.AutoSize = true;
            this.so.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.so.Location = new System.Drawing.Point(819, 336);
            this.so.Name = "so";
            this.so.Size = new System.Drawing.Size(162, 24);
            this.so.TabIndex = 97;
            this.so.Text = "Sistema Operativo";
            // 
            // np
            // 
            this.np.AutoSize = true;
            this.np.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.np.Location = new System.Drawing.Point(828, 373);
            this.np.Name = "np";
            this.np.Size = new System.Drawing.Size(93, 24);
            this.np.TabIndex = 98;
            this.np.Text = "N Puertos";
            // 
            // precio
            // 
            this.precio.AutoSize = true;
            this.precio.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.precio.Location = new System.Drawing.Point(828, 415);
            this.precio.Name = "precio";
            this.precio.Size = new System.Drawing.Size(64, 24);
            this.precio.TabIndex = 99;
            this.precio.Text = "Precio";
            // 
            // textMarca
            // 
            this.textMarca.Location = new System.Drawing.Point(992, 64);
            this.textMarca.Name = "textMarca";
            this.textMarca.Size = new System.Drawing.Size(166, 22);
            this.textMarca.TabIndex = 100;
            // 
            // textNombre
            // 
            this.textNombre.Location = new System.Drawing.Point(992, 104);
            this.textNombre.Name = "textNombre";
            this.textNombre.Size = new System.Drawing.Size(166, 22);
            this.textNombre.TabIndex = 101;
            // 
            // textMr
            // 
            this.textMr.Location = new System.Drawing.Point(992, 229);
            this.textMr.Name = "textMr";
            this.textMr.Size = new System.Drawing.Size(166, 22);
            this.textMr.TabIndex = 102;
            // 
            // textResolucion
            // 
            this.textResolucion.Location = new System.Drawing.Point(992, 148);
            this.textResolucion.Name = "textResolucion";
            this.textResolucion.Size = new System.Drawing.Size(166, 22);
            this.textResolucion.TabIndex = 102;
            // 
            // textVelocidad
            // 
            this.textVelocidad.Location = new System.Drawing.Point(992, 186);
            this.textVelocidad.Name = "textVelocidad";
            this.textVelocidad.Size = new System.Drawing.Size(166, 22);
            this.textVelocidad.TabIndex = 103;
            // 
            // textDb
            // 
            this.textDb.Location = new System.Drawing.Point(992, 264);
            this.textDb.Name = "textDb";
            this.textDb.Size = new System.Drawing.Size(166, 22);
            this.textDb.TabIndex = 104;
            // 
            // textAlmacenamiento
            // 
            this.textAlmacenamiento.Location = new System.Drawing.Point(992, 301);
            this.textAlmacenamiento.Name = "textAlmacenamiento";
            this.textAlmacenamiento.Size = new System.Drawing.Size(166, 22);
            this.textAlmacenamiento.TabIndex = 105;
            // 
            // textSO
            // 
            this.textSO.Location = new System.Drawing.Point(992, 336);
            this.textSO.Name = "textSO";
            this.textSO.Size = new System.Drawing.Size(166, 22);
            this.textSO.TabIndex = 106;
            // 
            // textNP
            // 
            this.textNP.Location = new System.Drawing.Point(992, 375);
            this.textNP.Name = "textNP";
            this.textNP.Size = new System.Drawing.Size(166, 22);
            this.textNP.TabIndex = 107;
            // 
            // textPrecio
            // 
            this.textPrecio.Location = new System.Drawing.Point(992, 417);
            this.textPrecio.Name = "textPrecio";
            this.textPrecio.Size = new System.Drawing.Size(166, 22);
            this.textPrecio.TabIndex = 108;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1167, 476);
            this.Controls.Add(this.textPrecio);
            this.Controls.Add(this.textNP);
            this.Controls.Add(this.textSO);
            this.Controls.Add(this.textAlmacenamiento);
            this.Controls.Add(this.textDb);
            this.Controls.Add(this.textVelocidad);
            this.Controls.Add(this.textResolucion);
            this.Controls.Add(this.textMr);
            this.Controls.Add(this.textNombre);
            this.Controls.Add(this.textMarca);
            this.Controls.Add(this.precio);
            this.Controls.Add(this.np);
            this.Controls.Add(this.so);
            this.Controls.Add(this.almacenamiento);
            this.Controls.Add(this.db);
            this.Controls.Add(this.mr);
            this.Controls.Add(this.velocidad);
            this.Controls.Add(this.resolucion);
            this.Controls.Add(this.nombre);
            this.Controls.Add(this.marca);
            this.Controls.Add(this.button4);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.lista);
            this.Controls.Add(this.Elementos);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "Form1";
            this.Text = "Tienda Informatica";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.ComboBox Elementos;
        private System.Windows.Forms.ListBox lista;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button button4;
        private System.Windows.Forms.Label marca;
        private System.Windows.Forms.Label nombre;
        private System.Windows.Forms.Label resolucion;
        private System.Windows.Forms.Label velocidad;
        private System.Windows.Forms.Label mr;
        private System.Windows.Forms.Label db;
        private System.Windows.Forms.Label almacenamiento;
        private System.Windows.Forms.Label so;
        private System.Windows.Forms.Label np;
        private System.Windows.Forms.Label precio;
        private System.Windows.Forms.TextBox textMarca;
        private System.Windows.Forms.TextBox textNombre;
        private System.Windows.Forms.TextBox textMr;
        private System.Windows.Forms.TextBox textResolucion;
        private System.Windows.Forms.TextBox textVelocidad;
        private System.Windows.Forms.TextBox textDb;
        private System.Windows.Forms.TextBox textAlmacenamiento;
        private System.Windows.Forms.TextBox textSO;
        private System.Windows.Forms.TextBox textNP;
        private System.Windows.Forms.TextBox textPrecio;
    }
}

