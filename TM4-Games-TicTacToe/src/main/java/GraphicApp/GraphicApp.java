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
	
	private JButton btn00;
	private JButton btn01;
	private JButton btn02;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn20;
	private JButton btn21;
	private JButton btn22;
	
	private JLabel lblMovements;

	private Board board;
	
	private static boolean gameStarted = false;
	
	private String nameP1;
	private String nameP2;

	

	/*Constructor*/
	public GraphicApp() {
		
		/*Definition of the window */
		
		
		setTitle("Ventana con interaccion");//PopUp window title
		
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
					if(gameStarted) {
						btn00.setText("X");
						movementMade(nameP1);
//						board.setField([0][0],"X");						
					}
				}
			});
			
			btn01.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			btn02.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			btn10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			btn10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			btn11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			btn20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			btn21.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});		
			
			btn22.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});	
	
		
		
	}
	
	
	public void newGame() {	
		board = new Board();
		
	    nameP1 = textFieldPlayer1Name.getText();
		
		Player ply1 = new Player("X",nameP1, "Human");
		
		
		gameStarted = true;	
	}
	
	public void movementMade(String name) {
		lblMovements.setText(name+", coloca ficha ...");
	}
	
}
