package Paquete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

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
	private JTextField textIngles;
	private JTextField textFrances;

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

		JTextPane textPaneIngles = new JTextPane();
		textPaneIngles.setEditable(false);
		textPaneIngles.setBounds(42, 156, 192, 85);
		contentPane.add(textPaneIngles);

		JTextPane textPaneFrances = new JTextPane();
		textPaneFrances.setEditable(false);
		textPaneFrances.setBounds(327, 156, 192, 85);
		contentPane.add(textPaneFrances);

		JLabel lblNewLabel_1 = new JLabel("Palabra 1:");
		lblNewLabel_1.setBounds(45, 121, 66, 26);
		contentPane.add(lblNewLabel_1);

		textIngles = new JTextField();
		textIngles.setBounds(112, 121, 122, 22);
		contentPane.add(textIngles);
		textIngles.setColumns(10);

		JLabel lblPalabra = new JLabel("Palabra 2:");
		lblPalabra.setBounds(327, 121, 61, 26);
		contentPane.add(lblPalabra);

		textFrances = new JTextField();
		textFrances.setColumns(10);
		textFrances.setBounds(394, 121, 122, 22);
		contentPane.add(textFrances);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(467, 13, 97, 25);
		contentPane.add(btnSalir);

		JButton btnTraduccir = new JButton("Espa\u00F1ol/Ingles");
		btnTraduccir.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTraduccir.setBounds(42, 79, 192, 37);
		contentPane.add(btnTraduccir);

		JButton btnNewButton = new JButton("Espa\u00F1ol/Frances");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(327, 79, 192, 37);
		contentPane.add(btnNewButton);

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(229, 248, 97, 25);
		contentPane.add(btnLimpiar);

		// Evento para salir
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Login l = new Login();
				l.setVisible(true);
			}
		});

		// Evento para limpiar
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPaneIngles.setText("");
				textPaneFrances.setText("");
			}
		});

		// Evento para boton traduccir.
		btnTraduccir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String palabra = textIngles.getText();
				URL webIngles = null;
				InputStream contenido = null;
				String pagWeb = "";
				String constante = "<td class='ToWrd' >";
				int auxiliar = 0;

				try {
					webIngles = new URL("http://www.wordreference.com/es/en/translation.asp?spen=" + palabra);

				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					contenido = webIngles.openStream();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				// Convertir InputStream en String

				pagWeb = getStringFromInputStream(contenido);

				pagWeb = pagWeb.substring(pagWeb.indexOf(constante) + constante.length());
				while (pagWeb.charAt(auxiliar) != '<')
					auxiliar++;
				pagWeb = pagWeb.substring(0, auxiliar - 1);
				textIngles.setText("");
				// System.out.println(pagWeb);
				textPaneIngles.setText(pagWeb);

			}

			// convert InputStream to String
			private String getStringFromInputStream(InputStream is) {

				BufferedReader br = null;
				StringBuilder sb = new StringBuilder();

				String line;
				try {

					br = new BufferedReader(new InputStreamReader(is));
					while ((line = br.readLine()) != null) {
						sb.append(line);
					}

				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}

				return sb.toString();
			}
		});

		// Evento para traduccir al Frances
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String palabra = textFrances.getText();
				URL webFrances = null;
				InputStream contenido = null;
				String pagWeb = "";
				String constante = "<td class='ToWrd' >";
				int auxiliar = 0;

				try {
					webFrances = new URL("http://www.wordreference.com/esfr/" + palabra);

				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					contenido = webFrances.openStream();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				// Convertir InputStream en String

				pagWeb = getStringFromInputStream(contenido);

				pagWeb = pagWeb.substring(pagWeb.indexOf(constante) + constante.length());
				while (pagWeb.charAt(auxiliar) != '<')
					auxiliar++;
				pagWeb = pagWeb.substring(0, auxiliar - 1);
				textFrances.setText("");
				// System.out.println(pagWeb);
				textPaneFrances.setText(pagWeb);

			}

			// convert InputStream to String
			private String getStringFromInputStream(InputStream is) {

				BufferedReader br = null;
				StringBuilder sb = new StringBuilder();

				String line;
				try {

					br = new BufferedReader(new InputStreamReader(is));
					while ((line = br.readLine()) != null) {
						sb.append(line);
					}

				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}

				return sb.toString();
			}
		});
	}
}
