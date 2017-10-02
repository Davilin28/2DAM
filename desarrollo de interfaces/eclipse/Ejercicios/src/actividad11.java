import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class actividad11 {

	private JFrame frmListaDeLa;
	private JTextField txtDavidRomn;
	private JTextField textField_1;
	private JLabel lblProducto;
	private JTextField textField_2;
	private JLabel lblCantidadYPreciounidad;
	private JTextField textField;
	private double totalCompra = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					actividad11 window = new actividad11();
					window.frmListaDeLa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public actividad11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListaDeLa = new JFrame();

		frmListaDeLa.setTitle("Lista de la compra");
		frmListaDeLa.setResizable(false);
		frmListaDeLa.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmListaDeLa.setBounds(100, 100, 611, 255);
		frmListaDeLa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListaDeLa.getContentPane().setLayout(null);

		JLabel lblIdentificacionDelUsuario = new JLabel("Identificacion del usuario");
		lblIdentificacionDelUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdentificacionDelUsuario.setBounds(24, 13, 148, 30);
		frmListaDeLa.getContentPane().add(lblIdentificacionDelUsuario);

		txtDavidRomn = new JTextField();
		txtDavidRomn.setText("David Rom\u00E1n");
		txtDavidRomn.setEditable(false);
		txtDavidRomn.setBounds(180, 18, 116, 22);
		frmListaDeLa.getContentPane().add(txtDavidRomn);
		txtDavidRomn.setColumns(10);

		JLabel lblTotalAPagar = new JLabel("Total a pagar (\u20AC):");
		lblTotalAPagar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTotalAPagar.setBounds(339, 16, 116, 24);
		frmListaDeLa.getContentPane().add(lblTotalAPagar);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setText("0.0");
		textField_1.setEditable(false);
		textField_1.setBounds(481, 17, 116, 22);
		frmListaDeLa.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		lblProducto = new JLabel("Producto:");
		lblProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblProducto.setBounds(24, 56, 72, 30);
		frmListaDeLa.getContentPane().add(lblProducto);

		textField_2 = new JTextField();
		textField_2.setBounds(107, 61, 116, 22);
		frmListaDeLa.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		lblCantidadYPreciounidad = new JLabel("Cantidad y precio/Unidad");
		lblCantidadYPreciounidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCantidadYPreciounidad.setBounds(239, 61, 161, 22);
		frmListaDeLa.getContentPane().add(lblCantidadYPreciounidad);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox.setBounds(412, 60, 43, 22);
		frmListaDeLa.getContentPane().add(comboBox);

		textField = new JTextField();
		textField.setBounds(481, 61, 116, 22);
		frmListaDeLa.getContentPane().add(textField);
		textField.setColumns(10);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setEditable(false);
		textArea.setBounds(24, 99, 376, 106);
		frmListaDeLa.getContentPane().add(textArea);

		JButton btnAadir = new JButton("A\u00F1adir producto creado");
		btnAadir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAadir.setBounds(410, 119, 187, 25);
		frmListaDeLa.getContentPane().add(btnAadir);

		JButton btnFinalizarCompra = new JButton("Finalizar compra");
		btnFinalizarCompra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnFinalizarCompra.setBounds(410, 157, 187, 25);
		frmListaDeLa.getContentPane().add(btnFinalizarCompra);

		/*
		 * // EVENTOS PARA JBUTTON actionPerformed
		 * btnFinalizarCompra.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent arg0) { Color azul = new Color(132, 195, 190);
		 * textArea.setBackground(azul); } });
		 */

		// EVENTO PARA JFRAME windowOpened
		frmListaDeLa.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				// CUANDO SE ABRA EL JFRAME QUE LA SELECCION QUE TENGA EL COMBOBOX SEA NULL.
				comboBox.setSelectedItem(null);
			}
		});

		// Evento De varios botones.
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String producto = textField_2.getText().toString(); // "Patatas"
				String cantidad = comboBox.getSelectedItem().toString(); // "2"
				String precio = textField.getText().toString(); // "0.5" //.gettext te devuelve lo que hay dentro de un
																// JtextField

				double cantidadD = Double.parseDouble(cantidad);
				double precioD = Double.parseDouble(precio);
				double calculo = cantidadD * precioD;
				totalCompra = totalCompra + calculo;

				textArea.setText(textArea.getText() + producto + "(" + cantidad + ") " + "-->" + calculo + "\n");
				textField_1.setText(String.valueOf(totalCompra)); // .setText lo que hace es cambiar lo que haya dentro
																	// del contenedor

				textField.setText("");
				textField_2.setText("");
				comboBox.setSelectedItem(null);
			}
		});

		// Evento Boton Finalizar Compra
		btnFinalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Crear un alerta para que a la hora de pulsar en el boton finalizar aparezca.
				JOptionPane.showMessageDialog(null, "Tiene que pagar" + totalCompra, "Gracias por su compra", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		/*
		 * // EVENTO PARA JTEXTFIELD textField_2.addKeyListener(new KeyAdapter() {
		 * 
		 * @Override public void keyTyped(KeyEvent arg0) { if
		 * (textField_2.getText().length() >= 6) { System.out.println("Mayor que 6"); //
		 * Añadir un Alert } } });
		 * 
		 * // EVENTO PARA COMBOBOX comboBox.addItemListener(new ItemListener() { public
		 * void itemStateChanged(ItemEvent arg0) { // Si comboBox es distinto de null,
		 * coge el numero del comboBox y añadelo en el // textField. if
		 * (comboBox.getSelectedItem() != null) { String seleccionado =
		 * comboBox.getSelectedItem().toString(); textField.setText(seleccionado); } }
		 * });
		 */
	}
}
