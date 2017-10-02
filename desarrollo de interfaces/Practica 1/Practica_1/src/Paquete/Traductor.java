package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Traductor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traductor frame = new Traductor();
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
	public Traductor() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRADUCTOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(64, 26, 431, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblEspaolingles = new JLabel("Espa\u00F1ol/Ingles");
		lblEspaolingles.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEspaolingles.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspaolingles.setBounds(45, 82, 189, 40);
		contentPane.add(lblEspaolingles);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(42, 156, 192, 85);
		contentPane.add(textPane);
		
		JLabel lblEspaolfrances = new JLabel("Espa\u00F1ol/Frances");
		lblEspaolfrances.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEspaolfrances.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspaolfrances.setBounds(330, 82, 189, 40);
		contentPane.add(lblEspaolfrances);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBounds(327, 156, 192, 85);
		contentPane.add(textPane_1);
		
		JLabel lblNewLabel_1 = new JLabel("Palabra 1:");
		lblNewLabel_1.setBounds(45, 121, 66, 26);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(112, 121, 122, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPalabra = new JLabel("Palabra 2:");
		lblPalabra.setBounds(327, 121, 61, 26);
		contentPane.add(lblPalabra);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(394, 121, 122, 22);
		contentPane.add(textField_1);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Login l = new Login();
				l.setVisible(true);
			}
		});
		btnSalir.setBounds(467, 13, 97, 25);
		contentPane.add(btnSalir);
	}
}
