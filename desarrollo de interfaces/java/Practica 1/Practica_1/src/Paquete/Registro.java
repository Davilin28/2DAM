package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textDNI;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registro() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblRegistro.setBounds(115, 13, 462, 63);
		contentPane.add(lblRegistro);

		JLabel lblNombre = new JLabel("Nombre:*");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(71, 95, 110, 34);
		contentPane.add(lblNombre);

		textNombre = new JTextField();
		textNombre.setBounds(248, 98, 243, 34);
		contentPane.add(textNombre);
		textNombre.setColumns(10);

		JLabel lblApellidos = new JLabel("Apellidos:*");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblApellidos.setBounds(71, 188, 110, 34);
		contentPane.add(lblApellidos);

		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(248, 188, 243, 34);
		contentPane.add(textApellidos);

		JLabel lblDni = new JLabel("DNI:*");
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDni.setBounds(71, 235, 110, 34);
		contentPane.add(lblDni);

		textDNI = new JTextField();
		textDNI.setColumns(10);
		textDNI.setBounds(248, 235, 243, 34);
		contentPane.add(textDNI);

		JLabel lblSexo = new JLabel("Sexo *:");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSexo.setBounds(71, 306, 110, 34);
		contentPane.add(lblSexo);

		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setSelected(true);
		buttonGroup.add(rdbtnMasculino);
		rdbtnMasculino.setBounds(248, 289, 127, 25);
		contentPane.add(rdbtnMasculino);

		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		buttonGroup.add(rdbtnFemenino);
		rdbtnFemenino.setBounds(248, 325, 127, 25);
		contentPane.add(rdbtnFemenino);

		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(115, 426, 202, 34);
		contentPane.add(btnNewButton);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancelar.setBounds(375, 426, 202, 34);
		contentPane.add(btnCancelar);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Aceptar");
		chckbxNewCheckBox.setBounds(456, 364, 113, 25);
		contentPane.add(chckbxNewCheckBox);

		JLabel lblNewLabel = new JLabel("Aceptar las condiciones de registro.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(71, 359, 377, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:*");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblContrasea.setBounds(71, 141, 110, 34);
		contentPane.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(248, 141, 243, 34);
		contentPane.add(passwordField);

		// Evento boton registrarse
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(textNombre.getText().length()==0 && textApellidos.getText().length()==0 && textDNI.getText().length()==0) {
				JOptionPane.showMessageDialog(null, "Rellene los campos necesarios", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}else {
				dispose();
				JOptionPane.showMessageDialog(null, "Se ha registrado correctamente", "Registro",
						JOptionPane.INFORMATION_MESSAGE);
				Login l = new Login();
				l.setVisible(true);
			}
			}
		});
		
		// Evento boton cancelar

		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Login l = new Login();
				l.setVisible(true);
			}
		});
	}
}
