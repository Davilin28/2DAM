import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazB {

	private JFrame frmInterfazB;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public InterfazB() {
		initialize();
		frmInterfazB.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInterfazB = new JFrame();
		frmInterfazB.setTitle("Interfaz B");
		frmInterfazB.setBounds(100, 100, 649, 486);
		frmInterfazB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInterfazB.getContentPane().setLayout(null);
		
		JButton btnIrAB = new JButton("IR A A");
		btnIrAB.setBounds(63, 118, 97, 25);
		frmInterfazB.getContentPane().add(btnIrAB);
		
		//Evento para ir al padre INTERFAZ A
		btnIrAB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Abrir a
				InterfazA a = new InterfazA();
				a.getFrmInterfazA().setVisible(true);
				//Cerar b
				frmInterfazB.dispose();
				
			}
		});
	}
}
