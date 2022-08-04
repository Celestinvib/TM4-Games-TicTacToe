package GraphicApp;

import java.awt.*;
import javax.swing.*;

public class GraphicApp extends JFrame{
	
	// Attributes
	private JPanel contentPane;
	
//	private JTextField textFieldInput;
//	private JTextField textFieldResult;
//	private JButton btnMakeConversion ;
	private JTextField textFieldPlayer1Name;
	private JTextField textFieldPlayer2Name;
	
	private JLabel lblMovements;
	
	private JButton btnNewGame;
	
	private JButton btn00;
	private JButton btn01;
	private JButton btn02;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn20;
	private JButton btn21;
	private JButton btn22;
	
	// Constructor
	public GraphicApp() {
		
		/* Definition of the window */
		setTitle("Ventana con interaccion"); // PopUp window title
		setBounds(700, 200, 812, 419); // X Y coordinates of the application and its height and length
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Close the window  when the operation is close
		setVisible(true); // It allows the window to be visible
		
		/* Creation and added the panel to the window */
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		/* Creation, definition of dimensions and added to the panel of the buttons */		
		btn00 = new JButton("");
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn00.setBounds(24, 22, 89, 85);
		contentPane.add(btn00);
		
		btn01 = new JButton("");
		btn01.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn01.setBounds(124, 22, 89, 85);
		contentPane.add(btn01);
		
		btn02 = new JButton("");
		btn02.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn02.setBounds(224, 22, 89, 85);
		contentPane.add(btn02);
		
		btn10 = new JButton("");
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn10.setBounds(24, 118, 89, 85);
		contentPane.add(btn10);
		
		btn11 = new JButton("");
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn11.setBounds(124, 118, 89, 85);
		contentPane.add(btn11);
		
		btn12 = new JButton("");
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn12.setBounds(224, 118, 89, 85);
		contentPane.add(btn12);
		
		btn20 = new JButton("");
		btn20.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn20.setBounds(24, 214, 89, 85);
		contentPane.add(btn20);
		
		btn21 = new JButton("");
		btn21.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn21.setBounds(124, 214, 89, 85);
		contentPane.add(btn21);
		
		btn22 = new JButton("");
		btn22.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn22.setBounds(224, 214, 89, 85);
		contentPane.add(btn22);
		
		btnNewGame = new JButton("Nueva Partida");
		btnNewGame.setBounds(498, 30, 117, 23);
		contentPane.add(btnNewGame);
		
		/*Creation, definition of dimensions and added to the panel of the labels*/		
		lblMovements = new JLabel("");
		lblMovements.setBounds(415, 64, 162, 23);
		contentPane.add(lblMovements);
		
		JLabel lbl1 = new JLabel("Jugador1");
		lbl1.setBounds(425, 97, 46, 14);
		contentPane.add(lbl1);
		
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setBounds(425, 122, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setBounds(429, 157, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre: ");
		lblNewLabel_2.setBounds(425, 221, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lbl2 = new JLabel("Jugador2");
		lbl2.setBounds(425, 196, 46, 14);
		contentPane.add(lbl2);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo:");
		lblNewLabel_1_1.setBounds(429, 256, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		

		/* Creation, definition of dimensions and added to the panel of the radio buttons */			
		JRadioButton rdbtnPlayer1HumanType = new JRadioButton("Humano");
		rdbtnPlayer1HumanType.setSelected(true);
		rdbtnPlayer1HumanType.setBounds(491, 154, 89, 23);
		contentPane.add(rdbtnPlayer1HumanType);
		
		JRadioButton rdbtnPlayer1CPUType = new JRadioButton("CPU");
		rdbtnPlayer1CPUType.setBounds(591, 154, 89, 23);
		contentPane.add(rdbtnPlayer1CPUType);
	
		JRadioButton rdbtnPlayer2HumanType = new JRadioButton("Humano");
		rdbtnPlayer2HumanType.setBounds(491, 253, 89, 23);
		contentPane.add(rdbtnPlayer2HumanType);
		
		JRadioButton rdbtnPlayer2CPUType = new JRadioButton("CPU");
		rdbtnPlayer2CPUType.setSelected(true);
		rdbtnPlayer2CPUType.setBounds(591, 253, 89, 23);
		contentPane.add(rdbtnPlayer2CPUType);
		
		/* Creation, definition of dimensions and added to the panel of the radio textfields */		
		textFieldPlayer1Name = new JTextField();
		textFieldPlayer1Name.setBounds(496, 120, 105, 20);
		contentPane.add(textFieldPlayer1Name);
		textFieldPlayer1Name.setColumns(10);
		
		textFieldPlayer2Name = new JTextField();
		textFieldPlayer2Name.setColumns(10);
		textFieldPlayer2Name.setBounds(496, 219, 105, 20);
		contentPane.add(textFieldPlayer2Name);
	}

	// Getters and Setters
	/**
	 * @return the textFieldPlayer1Name
	 */
	public JTextField getTextFieldPlayer1Name() {
		return textFieldPlayer1Name;
	}

	/**
	 * @param textFieldPlayer1Name the textFieldPlayer1Name to set
	 */
	public void setTextFieldPlayer1Name(JTextField textFieldPlayer1Name) {
		this.textFieldPlayer1Name = textFieldPlayer1Name;
	}

	/**
	 * @return the textFieldPlayer2Name
	 */
	public JTextField getTextFieldPlayer2Name() {
		return textFieldPlayer2Name;
	}

	/**
	 * @param textFieldPlayer2Name the textFieldPlayer2Name to set
	 */
	public void setTextFieldPlayer2Name(JTextField textFieldPlayer2Name) {
		this.textFieldPlayer2Name = textFieldPlayer2Name;
	}

	/**
	 * @return the lblMovements
	 */
	public JLabel getLblMovements() {
		return lblMovements;
	}

	/**
	 * @param lblMovements the lblMovements to set
	 */
	public void setLblMovements(JLabel lblMovements) {
		this.lblMovements = lblMovements;
	}

	/**
	 * @return the btnNewGame
	 */
	public JButton getBtnNewGame() {
		return btnNewGame;
	}

	/**
	 * @param btnNewGame the btnNewGame to set
	 */
	public void setBtnNewGame(JButton btnNewGame) {
		this.btnNewGame = btnNewGame;
	}

	/**
	 * @return the btn00
	 */
	public JButton getBtn00() {
		return btn00;
	}

	/**
	 * @param btn00 the btn00 to set
	 */
	public void setBtn00(JButton btn00) {
		this.btn00 = btn00;
	}

	/**
	 * @return the btn01
	 */
	public JButton getBtn01() {
		return btn01;
	}

	/**
	 * @param btn01 the btn01 to set
	 */
	public void setBtn01(JButton btn01) {
		this.btn01 = btn01;
	}

	/**
	 * @return the btn02
	 */
	public JButton getBtn02() {
		return btn02;
	}

	/**
	 * @param btn02 the btn02 to set
	 */
	public void setBtn02(JButton btn02) {
		this.btn02 = btn02;
	}

	/**
	 * @return the btn10
	 */
	public JButton getBtn10() {
		return btn10;
	}

	/**
	 * @param btn10 the btn10 to set
	 */
	public void setBtn10(JButton btn10) {
		this.btn10 = btn10;
	}

	/**
	 * @return the btn11
	 */
	public JButton getBtn11() {
		return btn11;
	}

	/**
	 * @param btn11 the btn11 to set
	 */
	public void setBtn11(JButton btn11) {
		this.btn11 = btn11;
	}

	/**
	 * @return the btn12
	 */
	public JButton getBtn12() {
		return btn12;
	}

	/**
	 * @param btn12 the btn12 to set
	 */
	public void setBtn12(JButton btn12) {
		this.btn12 = btn12;
	}

	/**
	 * @return the btn20
	 */
	public JButton getBtn20() {
		return btn20;
	}

	/**
	 * @param btn20 the btn20 to set
	 */
	public void setBtn20(JButton btn20) {
		this.btn20 = btn20;
	}

	/**
	 * @return the btn21
	 */
	public JButton getBtn21() {
		return btn21;
	}

	/**
	 * @param btn21 the btn21 to set
	 */
	public void setBtn21(JButton btn21) {
		this.btn21 = btn21;
	}

	/**
	 * @return the btn22
	 */
	public JButton getBtn22() {
		return btn22;
	}

	/**
	 * @param btn22 the btn22 to set
	 */
	public void setBtn22(JButton btn22) {
		this.btn22 = btn22;
	}
}