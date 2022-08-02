package GraphicApp;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Game.Board;
import Game.Player;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GraphicApp extends JFrame{
	
	/*Attributes*/
	private JPanel contentPane;
	
	private JTextArea textArea;
	private JTextField textFieldInput;
	private JTextField textFieldResult;
	private JButton btnMakeConversion ;
	private JTextField textFieldPlayer1Name;
	private JTextField textFieldPlayer2Name;
	
	public JButton btn00;
	public JButton btn01;
	public JButton btn02;
	public JButton btn10;
	public JButton btn11;
	public JButton btn12;
	public JButton btn20;
	public JButton btn21;
	public JButton btn22;
	
	private JLabel lblMovements;

	public static Board board;
	
	private  boolean gameStarted = false;
	
	private Player ply1;
	private Player ply2;
	
	private String nameP1;
	private String nameP2;
	
	private int maxTurns = 3;
	
	private int P1Tokens = 0;
	private int P2Tokens = 0;

	
	public static String turn = "X";
	

	/*Constructor*/
	public GraphicApp() {
		
		/*Definition of the window */
		
		
		setTitle("Tres en Raya");//PopUp window title
		
		/* X Y coordinates of the application and its height and length */
		setBounds(700, 200, 812, 419);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Close the window  when the operation is close
		
		setVisible(true);//It allows the window to be visible
		
		/*Creation and added the panel to the window*/
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		/*Creation, definition of dimensions and added to the panel of the buttons*/		
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
		
		btn11 = new JButton("");
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn11.setBounds(124, 118, 89, 85);
		contentPane.add(btn11);
		
		btn10 = new JButton("");
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn10.setBounds(24, 118, 89, 85);
		contentPane.add(btn10);
		
		btn12 = new JButton("");
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn12.setBounds(224, 118, 89, 85);
		contentPane.add(btn12);
		
		btn21 = new JButton("");
		btn21.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn21.setBounds(124, 214, 89, 85);
		contentPane.add(btn21);
		
		btn20 = new JButton("");
		btn20.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn20.setBounds(24, 214, 89, 85);
		contentPane.add(btn20);
		
		btn22 = new JButton("");
		btn22.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btn22.setBounds(224, 214, 89, 85);
		contentPane.add(btn22);
		
		JButton btnNewGame = new JButton("Nueva Partida");
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
		

		/*Creation, definition of dimensions and added to the panel of the radio buttons*/		
		
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
		
		/*Creation, definition of dimensions and added to the panel of the radio textfields*/		
	
		textFieldPlayer1Name = new JTextField();
		textFieldPlayer1Name.setBounds(496, 120, 105, 20);
		contentPane.add(textFieldPlayer1Name);
		textFieldPlayer1Name.setColumns(10);
		
		textFieldPlayer2Name = new JTextField();
		textFieldPlayer2Name.setColumns(10);
		textFieldPlayer2Name.setBounds(496, 219, 105, 20);
		contentPane.add(textFieldPlayer2Name);
		
		
		
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //Starts a new Game			
				newGame();
			}
		});
		
			btn00.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					makeMovement(btn00,0,0);
					
				}
			});
			
			btn01.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					makeMovement(btn01,0,1);
				}
			});
			
			btn02.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					makeMovement(btn02,0,2);
				}
			});
			
			btn10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					makeMovement(btn10,1,0);
				}
			});
			
			btn11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					makeMovement(btn11,1,1);
				}
			});
			
			btn12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					makeMovement(btn12,1,2);
				}
			});
			
			btn20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					makeMovement(btn20,2,0);
				}
			});
			
			btn21.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					makeMovement(btn21,2,1);
				}
			});		
			
			btn22.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					makeMovement(btn22,2,2);
				}
			});	
	
			
	}
	
	
	public void newGame() {	
		board = new Board();
		
	
		ply1 = new Player("X",nameP1, "Human");
		ply2 = new Player("0",nameP2, "Human");
		
	    nameP1 = textFieldPlayer1Name.getText();
	    nameP2 = textFieldPlayer1Name.getText();
		
		
		gameStarted = true;	
	}
	
	/**
	 * Method that updates the movement label with the movement that has been made
	 * @param name the name of the player that has made the movement
	 */
	public void movementMade(String name) {
		lblMovements.setText(name+", coloca ficha ...");
	}
	
	/**
	 * Method that check if a movement can be made and if it can , makes it
	 * @param btn button that has been triggered 
	 * @param column Column where the button is
	 * @param row Row where the button is 
	 */
	public void  makeMovement(JButton btn, int column , int row) {	
		
		if(gameStarted) {
			
			String tempBoard[][] = board.getField();
					
				if (turn == "X") { 
					
					if(P1Tokens < 3 && tempBoard[column][row] == null ) { //If the player haven't put 3 tokens in the board and the field selected is null
						
						btn.setText(ply1.getToken()); //The token is put in the board in the eyes of the user
						tempBoard[column][row] = ply1.getToken();//it's save the position in which it have been put it
						
						movementMade(nameP1); //Update the movement label
						P1Tokens++;//Add a token to the user token counter
						
						turn = "Y"; //Change the turn
					
					}else if (P1Tokens >= 3 && tempBoard[column][row] == "X") {  //If the player have put 3 tokens in the board and the field selected is one of his tokens
						
						btn.setText("");//The token is withdrawn in the board in the eyes of the user
						tempBoard[column][row] = "";//Clear the position in which it had been put it

						 
						 movementMade(nameP1); 
						 P1Tokens--;//Subtract 1 of the token counter
						 
						turn = "Y";
					}
					
					
					
				}else {
					
					if(P2Tokens < 3 && tempBoard[column][row] == null) {
						btn.setText(ply2.getToken());
						tempBoard[column][row] = ply2.getToken();
						
						movementMade(nameP2);
						P2Tokens++;
						
						turn = "X";
						
					}else if (P2Tokens >= 3 && tempBoard[column][row] == "O") {
						 tempBoard[column][row] = "";
						 btn.setText("");

						 movementMade(nameP2);
						 P2Tokens--;	

						turn = "X";
					}
				}
				
				board.setField(tempBoard);	//Update the real board		
		}
	}
	
}
