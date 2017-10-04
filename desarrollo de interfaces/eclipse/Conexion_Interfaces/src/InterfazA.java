import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazA {

	private JFrame frmInterfazA;

	protected JFrame getFrmInterfazA() {
		return frmInterfazA;
	}

	protected void setFrmInterfazA(JFrame frmInterfazA) {
		this.frmInterfazA = frmInterfazA;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazA window = new InterfazA();
					window.frmInterfazA.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInterfazA = new JFrame();
		frmInterfazA.setTitle("Interfaz A");
		frmInterfazA.setBounds(100, 100, 649, 486);
		frmInterfazA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInterfazA.getContentPane().setLayout(null);
		
		JButton btnIrAB = new JButton("IR A B");
		btnIrAB.setBounds(63, 118, 97, 25);
		frmInterfazA.getContentPane().add(btnIrAB);
		
		//Evento boton ir a b
		btnIrAB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Abrir interfaz B
					InterfazB b = new InterfazB();
				//Cerrar interfaz A
					frmInterfazA.dispose();
			}
		});
	}
}
