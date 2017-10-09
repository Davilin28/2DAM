package miniSudoku;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sudoki {

	private JFrame frmMinisudoku;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JButton Resolver;
	private Principal resolver;
	private JButton Comprobar;
	private JButton Reiniciar;
	private JButton Salir;
	private JCheckBox Sombreado;
	private JRadioButton Redimensionar;
	private JRadioButton NoRedimensionar;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel panel_1;
	private JPanel panel_2;

	// dimension of input
	static int N = 4;

	public static int getN() {
		return N;
	}

	public static void setN(int n) {
		N = n;
	}

	// sample input
	static int grid[][] = { { 2, 0, 0, 0 }, //
			{ 0, 3, 0, 4 }, //
			{ 3, 0, 0, 1 }, //
			{ 4, 0, 3, 0 } };

	static int solutions[][] = { { 2, 4, 1, 3 }, //
			{ 1, 3, 2, 4 }, //
			{ 3, 2, 4, 1 }, //
			{ 4, 1, 3, 2 } };

	public static int[][] getGrid() {
		return grid;
	}

	public static void setGrid(int[][] grid) {
		Sudoku.grid = grid;
	}

	/**
	 * Utility function to check whether @param value is valid for @param cell
	 */

	static boolean isValid(Cell cell, int value) {

		if (grid[cell.row][cell.col] != 0) {
			throw new RuntimeException("Cannot call for cell which already has a value");
		}

		// if v present row, return false
		for (int c = 0; c < 4; c++) {
			if (grid[cell.row][c] == value)
				return false;
		}

		// if v present in col, return false
		for (int r = 0; r < 4; r++) {
			if (grid[r][cell.col] == value)
				return false;
		}

		// if v present in grid, return false

		// to get the grid we should calculate (x1,y1) (x2,y2)
		int x1 = 2 * (cell.row / 2);
		int y1 = 2 * (cell.col / 2);
		int x2 = x1 + 1;
		int y2 = y1 + 1;

		for (int x = x1; x <= x2; x++)
			for (int y = y1; y <= y2; y++)
				if (grid[x][y] == value)
					return false;

		// if value not present in row, col and bounding box, return true
		return true;
	}

	// simple function to get the next cell
	// read for yourself, very simple and straight forward
	static Cell getNextCell(Cell cur) {

		int row = cur.row;
		int col = cur.col;

		// next cell => col++
		col++;

		// if col > 8, then col = 0, row++
		// reached end of row, got to next row
		if (col > 3) {
			// goto next line
			col = 0;
			row++;
		}

		// reached end of matrix, return null
		if (row > 3)
			return null; // reached end

		Cell next = new Cell(row, col);
		return next;
	}

	// everything is put together here
	// very simple solution
	// must return true, if the soduku is solved, return false otherwise
	public boolean solve(Cell cur) {

		// if the cell is null, we have reached the end
		if (cur == null)
			return true;

		// if grid[cur] already has a value, there is nothing to solve here,
		// continue on to next cell
		if (grid[cur.row][cur.col] != 0) {
			// return whatever is being returned by solve(next)
			// i.e the state of soduku's solution is not being determined by
			// this cell, but by other cells
			return solve(getNextCell(cur));
		}

		// this is where each possible value is being assigned to the cell, and
		// checked if a solutions could be arrived at.

		// if grid[cur] doesn't have a value
		// try each possible value
		for (int i = 1; i <= 4; i++) {
			// check if valid, if valid, then update
			boolean valid = isValid(cur, i);

			if (!valid) // i not valid for this cell, try other values
				continue;

			// assign here
			grid[cur.row][cur.col] = i;

			// continue with next cell
			boolean solved = solve(getNextCell(cur));
			// if solved, return, else try other values
			if (solved)
				return true;
			else
				grid[cur.row][cur.col] = 0; // reset
			// continue with other possible values
		}

		// if you reach here, then no value from 1 - 9 for this cell can solve
		// return false
		return false;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sudoki window = new Sudoki();
					window.frmMinisudoku.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sudoki() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Principal resuelto = new Principal();
		frmMinisudoku = new JFrame();
		frmMinisudoku.setTitle("Mini_Sudoku");
		frmMinisudoku.setBounds(100, 100, 703, 364);
		frmMinisudoku.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMinisudoku.getContentPane().setLayout(new BorderLayout(0, 0));

		panel_1 = new JPanel();
		frmMinisudoku.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(4, 1, 0, 0));

		Reiniciar = new JButton("Reiniciar");
		panel_1.add(Reiniciar);

		Resolver = new JButton("Resolver");
		panel_1.add(Resolver);

		Comprobar = new JButton("Comprobar");
		panel_1.add(Comprobar);

		panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(4, 1, 0, 0));

		Sombreado = new JCheckBox("Sombrear");
		Sombreado.setSelected(true);
		panel_2.add(Sombreado);

		Redimensionar = new JRadioButton("Redimensionar");
		panel_2.add(Redimensionar);
		Redimensionar.setSelected(true);
		buttonGroup.add(Redimensionar);

		NoRedimensionar = new JRadioButton("No redimensionar");
		panel_2.add(NoRedimensionar);
		buttonGroup.add(NoRedimensionar);

		Salir = new JButton("Salir");
		panel_2.add(Salir);

		JPanel panel_3 = new JPanel();
		frmMinisudoku.getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(4, 4, 0, 0));

		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField);
		textField.setColumns(10);
		textField.setText("2");

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setText("3");
		textField_5.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setText("4");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setText("3");
		textField_8.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_10);
		textField_10.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setText("1");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_11);
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setText("4");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_12);
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_13);
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setText("3");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_14);
		textField_14.setColumns(10);

		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Dialog", Font.BOLD, 23));
		panel_3.add(textField_15);
		textField_15.setColumns(10);

		// Boton reiniciar.
		Reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_6.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_13.setText("");
				textField_15.setText("");
			}
		});

		// Boton comprobar
		Comprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String bloquear;
				int text1 = solutions[0][1];
				int text2 = solutions[0][2];
				int text3 = solutions[0][3];
				int text4 = solutions[1][0];
				int text5 = solutions[1][2];
				int text6 = solutions[2][1];
				int text7 = solutions[2][2];
				int text8 = solutions[3][1];
				int text9 = solutions[3][3];
				
				if(textField_1.getText().equals(String.valueOf(text1))&&
				textField_2.getText().equals(String.valueOf(text2))&&
				textField_3.getText().equals(String.valueOf(text3))&&
				textField_4.getText().equals(String.valueOf(text4))&&
				textField_6.getText().equals(String.valueOf(text5))&&
				textField_9.getText().equals(String.valueOf(text6))&&
				textField_10.getText().equals(String.valueOf(text7))&&
				textField_13.getText().equals(String.valueOf(text8))&&
				textField_15.getText().equals(String.valueOf(text9))){
					
					JOptionPane.showMessageDialog(null, "Resuelto Correctamente", "Resuelto",
							JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					JOptionPane.showMessageDialog(null, "Compruebe el sudoku", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		// Boton resolver.
		Resolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Sudoku prueba = new Sudoku();

				boolean solved = prueba.solve(new Cell(0, 0));
				if (!solved) {
					System.out.println("SUDOKU cannot be solved.");
					return;
				}
				
				Principal.printGrid(Sudoku.getGrid());
				
				int text1 = solutions[0][1];
				int text2 = solutions[0][2];
				int text3 = solutions[0][3];
				int text4 = solutions[1][0];
				int text5 = solutions[1][2];
				int text6 = solutions[2][1];
				int text7 = solutions[2][2];
				int text8 = solutions[3][1];
				int text9 = solutions[3][3];
				
				textField_1.setText(String.valueOf(text1));
				textField_2.setText(String.valueOf(text2));
				textField_3.setText(String.valueOf(text3));
				textField_4.setText(String.valueOf(text4));
				textField_6.setText(String.valueOf(text5));
				textField_9.setText(String.valueOf(text6));
				textField_10.setText(String.valueOf(text7));
				textField_13.setText(String.valueOf(text8));
				textField_15.setText(String.valueOf(text9));
			}
		});

		// Boton sombrear
		Sombreado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (Sombreado.isSelected()) {
					textField.setBackground(SystemColor.GRAY);
					textField_5.setBackground(SystemColor.GRAY);
					textField_7.setBackground(SystemColor.GRAY);
					textField_8.setBackground(SystemColor.GRAY);
					textField_11.setBackground(SystemColor.GRAY);
					textField_12.setBackground(SystemColor.GRAY);
					textField_14.setBackground(SystemColor.GRAY);
				} else {
					textField.setBackground(SystemColor.white);
					textField_5.setBackground(SystemColor.white);
					textField_7.setBackground(SystemColor.white);
					textField_8.setBackground(SystemColor.white);
					textField_11.setBackground(SystemColor.white);
					textField_12.setBackground(SystemColor.white);
					textField_14.setBackground(SystemColor.white);
				}
			}
		});

		// boton redimensionar
		Redimensionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NoRedimensionar.setSelected(false);
				frmMinisudoku.setResizable(true);
			}
		});

		// boton no redimensionar
		NoRedimensionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Redimensionar.setSelected(false);
				frmMinisudoku.setResizable(false);
			}
		});

		// Boton salir
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected = JOptionPane.showConfirmDialog(null, "¿Desea salir del sudoku?", "Confirmar salida",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (selected != 1) {
					System.exit(0);
				}
			}
		});
	}
}
