import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JScrollBar;

public class viajesdam {

	private JFrame frmViajesDam;
	private JTextField Pagar_text;
	private JTextField Titular_1;
	private JTextField NumTarjeta;
	private JTextField CVV_3;
	private JTextField Iban_text;
	private JTextField Banco_text;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viajesdam window = new viajesdam();
					window.frmViajesDam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public viajesdam() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmViajesDam = new JFrame();
		frmViajesDam.setTitle("VIAJES DAM");
		frmViajesDam.setBounds(100, 100, 898, 551);
		frmViajesDam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmViajesDam.getContentPane().setLayout(null);

		JLabel CaracteristicasDeSu = new JLabel("Caracteristicas de su billete de viaje:");
		CaracteristicasDeSu.setFont(new Font("Tahoma", Font.BOLD, 15));
		CaracteristicasDeSu.setBounds(33, 29, 281, 34);
		frmViajesDam.getContentPane().add(CaracteristicasDeSu);

		JLabel MetodosDePago = new JLabel("Metodos de Pago:");
		MetodosDePago.setFont(new Font("Tahoma", Font.BOLD, 15));
		MetodosDePago.setBounds(421, 29, 281, 34);
		frmViajesDam.getContentPane().add(MetodosDePago);

		JLabel Origen = new JLabel("Origen:*");
		Origen.setFont(new Font("Tahoma", Font.BOLD, 15));
		Origen.setBounds(69, 79, 66, 27);
		frmViajesDam.getContentPane().add(Origen);

		JComboBox ComboOrigen = new JComboBox();
		ComboOrigen.setModel(new DefaultComboBoxModel(new String[] { "MADRID", "BARCELONA" }));
		ComboOrigen.setBounds(163, 80, 193, 27);
		frmViajesDam.getContentPane().add(ComboOrigen);

		JLabel Destino = new JLabel("Destino:*");
		Destino.setFont(new Font("Tahoma", Font.BOLD, 15));
		Destino.setBounds(58, 119, 77, 27);
		frmViajesDam.getContentPane().add(Destino);

		JComboBox ComboDestino = new JComboBox();
		ComboDestino.setModel(new DefaultComboBoxModel(new String[] { "BILBAO", "ZARAGOZA" }));
		ComboDestino.setBounds(163, 121, 193, 27);
		frmViajesDam.getContentPane().add(ComboDestino);

		JLabel NDeBilletes = new JLabel("N\u00BA de billetes:");
		NDeBilletes.setFont(new Font("Tahoma", Font.BOLD, 15));
		NDeBilletes.setBounds(33, 161, 108, 27);
		frmViajesDam.getContentPane().add(NDeBilletes);

		JComboBox comboNBilletes = new JComboBox();
		comboNBilletes.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
		comboNBilletes.setBounds(163, 161, 52, 27);
		frmViajesDam.getContentPane().add(comboNBilletes);

		JLabel TipoDeViaje = new JLabel("Tipo de viaje:");
		TipoDeViaje.setFont(new Font("Tahoma", Font.BOLD, 15));
		TipoDeViaje.setBounds(33, 198, 108, 27);
		frmViajesDam.getContentPane().add(TipoDeViaje);

		JRadioButton Idavta = new JRadioButton("Ida/Vta");
		buttonGroup.add(Idavta);
		Idavta.setSelected(true);
		Idavta.setBounds(163, 197, 77, 25);
		frmViajesDam.getContentPane().add(Idavta);

		JRadioButton SoloIda = new JRadioButton("Solo ida");
		buttonGroup.add(SoloIda);
		SoloIda.setBounds(254, 198, 77, 25);
		frmViajesDam.getContentPane().add(SoloIda);

		JLabel FormaDePago = new JLabel("Forma de pago:");
		FormaDePago.setFont(new Font("Tahoma", Font.BOLD, 15));
		FormaDePago.setBounds(22, 231, 129, 27);
		frmViajesDam.getContentPane().add(FormaDePago);

		JRadioButton Tarjeta = new JRadioButton("Tarjeta");
		buttonGroup_1.add(Tarjeta);
		Tarjeta.setSelected(true);
		Tarjeta.setBounds(163, 233, 77, 25);
		frmViajesDam.getContentPane().add(Tarjeta);

		JRadioButton Iban = new JRadioButton("IBAN (+5%)");
		buttonGroup_1.add(Iban);
		Iban.setBounds(254, 233, 102, 25);
		frmViajesDam.getContentPane().add(Iban);

		JLabel Descuentos = new JLabel("Descuentos:");
		Descuentos.setFont(new Font("Tahoma", Font.BOLD, 15));
		Descuentos.setBounds(39, 271, 102, 27);
		frmViajesDam.getContentPane().add(Descuentos);

		JCheckBox FamiliaNumerosa = new JCheckBox("Familia numerosa (-10%)");
		FamiliaNumerosa.setBounds(163, 273, 193, 25);
		frmViajesDam.getContentPane().add(FamiliaNumerosa);

		JCheckBox CarnetJoven = new JCheckBox("Carnet joven (-8%)");
		CarnetJoven.setBounds(163, 303, 193, 25);
		frmViajesDam.getContentPane().add(CarnetJoven);

		JCheckBox Desempleado = new JCheckBox("Desempleado (-6%)");
		Desempleado.setBounds(163, 333, 193, 25);
		frmViajesDam.getContentPane().add(Desempleado);

		JLabel TotalAPagar = new JLabel("Total a PAGAR:");
		TotalAPagar.setFont(new Font("Tahoma", Font.BOLD, 15));
		TotalAPagar.setBounds(23, 406, 118, 27);
		frmViajesDam.getContentPane().add(TotalAPagar);

		Pagar_text = new JTextField();
		Pagar_text.setEditable(false);
		Pagar_text.setBounds(166, 406, 118, 27);
		frmViajesDam.getContentPane().add(Pagar_text);
		Pagar_text.setColumns(10);

		JLabel Euros = new JLabel("\u20ACuros");
		Euros.setFont(new Font("Tahoma", Font.BOLD, 15));
		Euros.setBounds(292, 406, 72, 27);
		frmViajesDam.getContentPane().add(Euros);

		JButton ProcederAlPago = new JButton("Proceder al pago");
		ProcederAlPago.setFont(new Font("Tahoma", Font.BOLD, 16));
		ProcederAlPago.setBounds(22, 459, 193, 34);
		frmViajesDam.getContentPane().add(ProcederAlPago);

		JButton Salir = new JButton("Salir");
		Salir.setFont(new Font("Tahoma", Font.BOLD, 16));
		Salir.setBounds(243, 459, 129, 34);
		frmViajesDam.getContentPane().add(Salir);

		JPanel JPDatosTarjeta = new JPanel();
		JPDatosTarjeta.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JPDatosTarjeta.setBounds(421, 76, 447, 161);
		frmViajesDam.getContentPane().add(JPDatosTarjeta);
		JPDatosTarjeta.setLayout(null);

		JLabel DatosTarjeta = new JLabel("Datos Tarjeta:");
		DatosTarjeta.setBounds(12, 13, 143, 27);
		DatosTarjeta.setFont(new Font("Tahoma", Font.BOLD, 15));
		JPDatosTarjeta.add(DatosTarjeta);

		JLabel Titular = new JLabel("Titular:*");
		Titular.setFont(new Font("Tahoma", Font.BOLD, 14));
		Titular.setBounds(41, 45, 58, 27);
		JPDatosTarjeta.add(Titular);

		Titular_1 = new JTextField();
		Titular_1.setColumns(10);
		Titular_1.setBounds(114, 46, 321, 27);
		JPDatosTarjeta.add(Titular_1);

		JLabel NTarjeta = new JLabel("N\u00BA Tarjeta:*");
		NTarjeta.setFont(new Font("Tahoma", Font.BOLD, 14));
		NTarjeta.setBounds(12, 81, 94, 27);
		JPDatosTarjeta.add(NTarjeta);

		NumTarjeta = new JTextField();
		NumTarjeta.setColumns(10);
		NumTarjeta.setBounds(114, 82, 205, 27);
		JPDatosTarjeta.add(NumTarjeta);

		JLabel Digit_16 = new JLabel("16 DIGIT");
		Digit_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		Digit_16.setBounds(329, 81, 94, 27);
		JPDatosTarjeta.add(Digit_16);

		JLabel Cvv = new JLabel("CVV:*");
		Cvv.setFont(new Font("Tahoma", Font.BOLD, 14));
		Cvv.setBounds(55, 121, 44, 27);
		JPDatosTarjeta.add(Cvv);

		CVV_3 = new JTextField();
		CVV_3.setColumns(10);
		CVV_3.setBounds(114, 122, 58, 27);
		JPDatosTarjeta.add(CVV_3);

		JLabel Digit_3 = new JLabel("3 DIGIT");
		Digit_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		Digit_3.setBounds(178, 122, 58, 27);
		JPDatosTarjeta.add(Digit_3);

		JLabel Tipo = new JLabel("Tipo:");
		Tipo.setFont(new Font("Tahoma", Font.BOLD, 14));
		Tipo.setBounds(248, 122, 44, 27);
		JPDatosTarjeta.add(Tipo);

		JComboBox comboTipoTarjeta = new JComboBox();
		comboTipoTarjeta.setModel(new DefaultComboBoxModel(new String[] { "VISA", "MASTERCARD" }));
		comboTipoTarjeta.setBounds(303, 122, 132, 27);
		JPDatosTarjeta.add(comboTipoTarjeta);

		JPanel JPDatosCuenta = new JPanel();
		JPDatosCuenta.setVisible(false);
		JPDatosCuenta.setLayout(null);
		JPDatosCuenta.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JPDatosCuenta.setBounds(421, 254, 447, 133);
		frmViajesDam.getContentPane().add(JPDatosCuenta);

		JLabel DatosCuentaIban = new JLabel("Datos cuenta IBAN:");
		DatosCuentaIban.setFont(new Font("Tahoma", Font.BOLD, 15));
		DatosCuentaIban.setBounds(12, 13, 168, 27);
		JPDatosCuenta.add(DatosCuentaIban);

		JLabel IbanEs = new JLabel("IBAN - ES:*");
		IbanEs.setFont(new Font("Tahoma", Font.BOLD, 14));
		IbanEs.setBounds(12, 45, 87, 27);
		JPDatosCuenta.add(IbanEs);

		Iban_text = new JTextField();
		Iban_text.setColumns(10);
		Iban_text.setBounds(114, 46, 251, 27);
		JPDatosCuenta.add(Iban_text);

		JLabel Banco = new JLabel("Banco:*");
		Banco.setFont(new Font("Tahoma", Font.BOLD, 14));
		Banco.setBounds(12, 81, 94, 27);
		JPDatosCuenta.add(Banco);

		Banco_text = new JTextField();
		Banco_text.setColumns(10);
		Banco_text.setBounds(114, 82, 321, 27);
		JPDatosCuenta.add(Banco_text);

		JLabel Digit_22 = new JLabel("22 DIGIT");
		Digit_22.setFont(new Font("Tahoma", Font.BOLD, 14));
		Digit_22.setBounds(374, 45, 73, 27);
		JPDatosCuenta.add(Digit_22);

		JTextArea ResultadoTotal = new JTextArea();
		ResultadoTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		ResultadoTotal.setEditable(false);
		ResultadoTotal.setBounds(421, 406, 447, 89);
		frmViajesDam.getContentPane().add(ResultadoTotal);

		// JComboBox ComboOrigen Para dejarlo vacio.
		ComboOrigen.setSelectedItem(null);

		// JComboBox comboDestino Para dejarlo vacio.
		ComboDestino.setSelectedItem(null);

		// Click ComboOrigen
		ComboOrigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String origen = ComboOrigen.getSelectedItem().toString();
				int cantidad = 30;
				Pagar_text.setText(Pagar_text.getText()+cantidad);
			}
		});

		// Click ComboDestino
		ComboDestino.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});

		// Click ComboNBilletes
		comboNBilletes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});

		// Click Ida y vuelta
		Idavta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});

		// Click Solo ida
		SoloIda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});

		// JPDatosTarjeta seleccionar y quitar JPDatosCuenta
		Tarjeta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JPDatosCuenta.setVisible(false);
				JPDatosTarjeta.setVisible(true);
			}
		});

		// JPDatosCuenta seleccionar y quitar JPDatosTarjeta
		Iban.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JPDatosCuenta.setVisible(true);
				JPDatosTarjeta.setVisible(false);
			}
		});

		// Click Familia numerosa
		FamiliaNumerosa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});

		// Click Carnet Joven
		CarnetJoven.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});

		// Click Desempleado
		Desempleado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});

		// Boton Proceder el pago
		ProcederAlPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if (ComboDestino.getSelectedIndex() != 0 && ComboOrigen.getSelectedIndex() != 0) {
					JOptionPane.showMessageDialog(null, "Datos de viaje incompletos", "Error de datos",
							JOptionPane.ERROR_MESSAGE);
				}

			// Pendiente para poder borrar todos los campos.
			/*ComboOrigen.setSelectedItem(null);
			ComboDestino.setSelectedItem(null);
			Titular_1.setText("");
			NumTarjeta.setText("");
			CVV_3.setText("");
			Iban_text.setText("");
			Banco_text.setText("");*/
			}
		});

		// Boton Salir
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int selected = JOptionPane.showConfirmDialog(null, "�Realmente desea salir?", "Salir",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (selected != 1) {
					System.exit(0);
				}
			}
		});
	}
}
