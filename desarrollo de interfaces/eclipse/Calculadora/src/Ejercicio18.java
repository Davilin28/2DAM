import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTree;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Ejercicio18 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio18 window = new Ejercicio18();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio18() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCompraDeTickests = new JLabel("COMPRAR DE ENTRADAS");
		lblCompraDeTickests.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCompraDeTickests.setBounds(153, 13, 231, 32);
		frame.getContentPane().add(lblCompraDeTickests);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(35, 59, 56, 16);
		frame.getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(102, 58, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Password");
		lblApellidos.setBounds(35, 88, 56, 16);
		frame.getContentPane().add(lblApellidos);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(35, 117, 56, 16);
		frame.getContentPane().add(lblDni);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(102, 114, 116, 22);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNEntradas = new JLabel("N Entradas");
		lblNEntradas.setBounds(35, 144, 83, 22);
		frame.getContentPane().add(lblNEntradas);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBounds(130, 144, 40, 22);
		frame.getContentPane().add(comboBox);
		
		JRadioButton rdbtnPaseNormal = new JRadioButton("Pase Normal");
		buttonGroup.add(rdbtnPaseNormal);
		rdbtnPaseNormal.setBounds(257, 54, 127, 25);
		frame.getContentPane().add(rdbtnPaseNormal);
		
		JRadioButton rdbtnPaseVip = new JRadioButton("Pase Vip");
		buttonGroup.add(rdbtnPaseVip);
		rdbtnPaseVip.setBounds(257, 84, 127, 25);
		frame.getContentPane().add(rdbtnPaseVip);
		
		JRadioButton rdbtnPaseVip_1 = new JRadioButton("Pase vip + merchan");
		buttonGroup.add(rdbtnPaseVip_1);
		rdbtnPaseVip_1.setSelected(true);
		rdbtnPaseVip_1.setBounds(257, 113, 167, 25);
		frame.getContentPane().add(rdbtnPaseVip_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(257, 161, 105, 22);
		frame.getContentPane().add(dateChooser);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 179, 93, 61);
		frame.getContentPane().add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Bebidas", "Camisetas", "Musica", "Fuegos artificiales", "Dj", "Confetis", "Hielos"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBounds(177, 196, 97, 25);
		frame.getContentPane().add(btnComprar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(102, 85, 116, 22);
		frame.getContentPane().add(passwordField);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(288, 196, 119, 26);
		frame.getContentPane().add(menuBar);
		
		JMenu mnTipoDePago = new JMenu("Tipo de pago");
		menuBar.add(mnTipoDePago);
		
		JMenuItem mntmTarjeta = new JMenuItem("Tarjeta");
		mnTipoDePago.add(mntmTarjeta);
		
		JMenuItem mntmPaypal = new JMenuItem("PayPal");
		mnTipoDePago.add(mntmPaypal);
	}
}
