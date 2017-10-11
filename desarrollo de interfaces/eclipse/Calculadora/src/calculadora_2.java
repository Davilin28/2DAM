import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextArea;

public class calculadora_2 {

	private JFrame frmCalculadora;
	private JTextField num1;
	private JTextField num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora_2 window = new calculadora_2();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculadora_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 450, 300);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		frmCalculadora.getContentPane().add(panel, BorderLayout.NORTH);

		JLabel lblNumero = new JLabel("Numero 1");
		panel.add(lblNumero);

		num1 = new JTextField();
		panel.add(num1);
		num1.setColumns(10);

		JLabel lblNumero_1 = new JLabel("Numero 2");
		panel.add(lblNumero_1);

		num2 = new JTextField();
		panel.add(num2);
		num2.setColumns(10);

		JPanel panel_2 = new JPanel();
		frmCalculadora.getContentPane().add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));

		JButton Sumar = new JButton("+");
		panel_2.add(Sumar);

		JButton Restar = new JButton("-");
		panel_2.add(Restar);

		JPanel panel_3 = new JPanel();
		frmCalculadora.getContentPane().add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new GridLayout(2, 1, 0, 0));

		JButton Multiplicar = new JButton("*");
		panel_3.add(Multiplicar);

		JButton Dividir = new JButton("/");
		panel_3.add(Dividir);

		JPanel panel_1 = new JPanel();
		frmCalculadora.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		JLabel lblResultado = new JLabel("RESULTADO");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(59, 30, 216, 40);
		panel_1.add(lblResultado);

		JTextArea resultado = new JTextArea();
		resultado.setFont(new Font("Monospaced", Font.PLAIN, 18));
		resultado.setEditable(false);
		resultado.setBounds(59, 99, 216, 75);
		panel_1.add(resultado);

		// Boton de sumar
		Sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double val1 = Double.parseDouble(num1.getText());
				double val2 = Double.parseDouble(num2.getText());
				double suma = val1 + val2;
				resultado.setText(String.valueOf(suma));

				num1.setText("");
				num2.setText("");
			}
		});

		// Boton de restar
		Restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double val1 = Double.parseDouble(num1.getText());
				double val2 = Double.parseDouble(num2.getText());
				double suma = val1 - val2;
				resultado.setText(String.valueOf(suma));

				num1.setText("");
				num2.setText("");
			}
		});

		// Boton de multiplicar
		Multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double val1 = Double.parseDouble(num1.getText());
				double val2 = Double.parseDouble(num2.getText());
				double suma = val1 * val2;
				resultado.setText(String.valueOf(suma));

				num1.setText("");
				num2.setText("");
			}
		});

		// Boton dividir
		Dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double val1 = Double.parseDouble(num1.getText());
				double val2 = Double.parseDouble(num2.getText());
				double suma = val1 / val2;
				resultado.setText(String.valueOf(suma));

				num1.setText("");
				num2.setText("");
			}
		});
	}
}
