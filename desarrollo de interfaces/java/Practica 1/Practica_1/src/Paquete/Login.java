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
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField jpassClave;
	private JButton btnAcceder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(41, 13, 339, 41);
		contentPane.add(lblNewLabel);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsuario.setBounds(41, 67, 103, 26);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContrasea.setBounds(41, 95, 103, 26);
		contentPane.add(lblContrasea);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(156, 69, 116, 22);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		jpassClave = new JPasswordField();
		jpassClave.setBounds(156, 97, 116, 22);
		contentPane.add(jpassClave);

		btnAcceder = new JButton("Acceder");
		btnAcceder.setBounds(306, 67, 103, 26);
		contentPane.add(btnAcceder);

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(306, 96, 103, 25);
		contentPane.add(btnRegistrarse);

		// Evento para el boton acceder

		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String usuario = txtUsuario.getText();
				char[] clave = jpassClave.getPassword();
				String claveFinal = new String(clave);

				if (!txtUsuario.getText().toString().isEmpty() && !claveFinal.toString().isEmpty()) {
					if(usuario.equals(claveFinal)) {
						JOptionPane.showMessageDialog(null, "Bienvenido al Traductor", "Accediste correctamente",
								JOptionPane.INFORMATION_MESSAGE);
						dispose();
						Traductor t = new Traductor();
						t.setVisible(true);
				}
					if(!usuario.equals(claveFinal)){
							if(!usuario.equals("")&!claveFinal.equals("")) 
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "ERROR",
						JOptionPane.ERROR_MESSAGE);
					txtUsuario.setText("");
					jpassClave.setText("");
					txtUsuario.requestFocus(); // El cursor se pone en txtUsuario nada mas borrar los datos.dispose();
				
				}
			}
			}
		});

		// Evento para el boton registrarse
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose(); // Sirve para cerrar la ventana anterior.
				Registro r = new Registro();
				r.setVisible(true);
			}
		});
	}
}