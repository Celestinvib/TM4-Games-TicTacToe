package Controller;

import java.awt.event.*;
import javax.swing.*;

import Game.*;
import GraphicApp.*;

public class ControllerGame {
	/** Attributes */
	private Player ply1;
	private Player ply2;
	private Board board;
	private String turn;
	private boolean gameStarted;
	private GraphicApp app;
	private JButton[][] buttons = new JButton[3][3];
	
    private boolean changeTurn = false;

	
	/** Constructor */
	public ControllerGame() {
		
		this.app = new GraphicApp();
		this.board = new Board();
		
		this.gameStarted = false;
		
		JButton[] row1 = {app.getBtn00(), app.getBtn01(), app.getBtn02()};
		JButton[] row2 = {app.getBtn10(), app.getBtn11(), app.getBtn12()};
		JButton[] row3 = {app.getBtn20(), app.getBtn21(), app.getBtn22()};
		buttons[0] = row1;
		buttons[1] = row2;
		buttons[2] = row3;
		
		app.getBtnNewGame().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newGame();	// Starts a new Game	
			}
		});
		
		buttonBoardActions();
	}
	
	/**
	 * Method that starts a new Game 
	 * 
	 */
	public void newGame() {
		int newMatch = 0;
		
		if(gameStarted) { //Check if a game has started , if it has ask the user if he really want to start a new game 
		    newMatch = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres empezar una nueva partida?");
		}
		
		if(newMatch == 0 ) { //If a game has not started or a user wants to restart a game
			
			//Clear the board object and the buttons of GraphicApp
			board.prepareEmptyBoard();
			for (int i = 0; i < buttons.length; i++) {
				for (int j = 0; j < buttons.length; j++) {
					buttons[i][j].setText("");
				}
			}
			
			if (checkNameFields(app.getTextFieldPlayer1Name(), app.getTextFieldPlayer2Name())) {
				ply1 = new Player("X", app.getTextFieldPlayer1Name().getText().toString(), "Humano"); //<--------- Set the type of that the user have entered in the radiobutton!!!
				ply2 =  new Player("O", app.getTextFieldPlayer2Name().getText().toString(), "CPU");
				gameStarted = true;
				app.getLblMovements().setText("");
				turn = "X";
			}
		}
		
	}
	
	
	public boolean checkNameFields(JTextField textFieldPlayer1Name, JTextField textFieldPlayer2Name) {
		
		if(textFieldPlayer1Name.getText().equals("") || textFieldPlayer2Name.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "No pueden haber campos vacios", null, JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return true;
}
	
	/**
	 * Method that adds listeners to the buttons in the graphic part and the actions that they do
	 * 
	 */
	public void buttonBoardActions() {
		
		app.getBtn00().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				makeMovement(app.getBtn00(), 0, 0);
			}
		});
		
		app.getBtn01().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				makeMovement(app.getBtn01(), 0, 1);
			}
		});
		
		app.getBtn02().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				makeMovement(app.getBtn02(), 0, 2);
			}
		});
		
		app.getBtn10().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				makeMovement(app.getBtn10(), 1, 0);
			}
		});
		
		app.getBtn11().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				makeMovement(app.getBtn11(), 1, 1);
			}
		});
		
		app.getBtn12().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				makeMovement(app.getBtn12(), 1, 2);
			}
		});
		
		app.getBtn20().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				makeMovement(app.getBtn20(), 2, 0);
			}
		});
		
		app.getBtn21().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				makeMovement(app.getBtn21(), 2, 1);
			}
		});		
		
		app.getBtn22().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				makeMovement(app.getBtn22(), 2, 2);
			}
		});	
	}

	
	/**
	 * Method that check if a movement can be made and if it can , makes it , also check if the player have won with the current movement
	 * 
	 * @param btn button that has been triggered 
	 * @param column Column where the button is
	 * @param row Row where the button is 
	 */
	public void  makeMovement(JButton btn, int column , int row) {	
		
		if(gameStarted) {
			
			String tempBoard[][] = board.getField();
					
				if (turn.equals("X")) { 
					
					if(ply1.getNumPlacedTokens() < 3 && tempBoard[column][row].equals("")) { // If the player haven't put 3 tokens in the board and the field selected is null
						
						btn.setText(ply1.getToken()); // The token is put in the board in the eyes of the user
						tempBoard[column][row] = ply1.getToken(); // it's save the position in which it has been put it
						
						app.getLblMovements().setText(ply1.getName()+", coloca ficha ..."); // Update the movement label
						ply1.setNumPlacedTokens(this.ply1.getNumPlacedTokens()+1); // Add a token to the user token counter
						
						changeTurn = true; //Indicates that a token has been put

						
					}else if (ply1.getNumPlacedTokens() >= 3 && tempBoard[column][row] == "X") { // If the player have put 3 tokens in the board and the field selected is one of his tokens
						
						btn.setText(""); // The token is withdrawn in the board in the eyes of the user
						tempBoard[column][row] = ""; // Clear the position in which it had been put it

			 
						ply1.setNumPlacedTokens(this.ply1.getNumPlacedTokens()-1); // Subtract 1 of the token counter
						app.getLblMovements().setText(ply1.getName()+", coge una ficha ..."); //Indicates that a token has been subtracted
					}
					
					
					
				}else {
					
					if(this.ply2.getNumPlacedTokens() < 3 && tempBoard[column][row].equals("")) {
						btn.setText(ply2.getToken());
						tempBoard[column][row] = ply2.getToken();
						
						app.getLblMovements().setText(ply2.getName()+", coloca ficha ...");
						this.ply2.setNumPlacedTokens(this.ply2.getNumPlacedTokens()+1);
						changeTurn = true;
												
					}else if (this.ply2.getNumPlacedTokens() >= 3 && tempBoard[column][row] == "O") {
						 tempBoard[column][row] = "";
						 btn.setText("");

						 app.getLblMovements().setText(ply2.getName()+", coge una ficha ...");
						 this.ply2.setNumPlacedTokens(this.ply2.getNumPlacedTokens()-1);	
					}
				}
				
				board.setField(tempBoard); // Update the real board	
				 
				
				if(ply1.getNumPlacedTokens() == 3 || ply2.getNumPlacedTokens() == 3) { //If some player have 3 tokens place in the board
					
					if(board.checkWin(turn)) { //Check if the current player have won the game 
						
						if(turn.equals("X")) {
							JOptionPane.showMessageDialog(null, ply1.getName() +" ha ganado!");
		
						}else {
							JOptionPane.showMessageDialog(null, ply2.getName() +" ha ganado!");					
						}
						
						gameStarted = false; 
					}
				}
				
				if(changeTurn) {   //Change the turn of the player if a token have been made
					if(turn.equals("X")) {
						turn = "O";
					}else {
						turn = "X";
					}
					changeTurn = false;
				}
		}
	}
	
	public void ia(Player cpu) {
		String[][] fields = board.getField();
		int randomColumn;
		int randomRow;
		
		if(cpu.getNumPlacedTokens() < 3) {
			do {
				randomColumn = (int)(Math.random() * fields.length);
				randomRow = (int)(Math.random() * fields.length);
			} while (!fields[randomColumn][randomRow].equals(""));
			makeMovement(this.buttons[randomColumn][randomRow], randomColumn, randomRow);
			
		}else {
			do {
				randomColumn = (int)(Math.random() * fields.length);
				randomRow = (int)(Math.random() * fields.length);
			} while (!fields[randomColumn][randomRow].equals(cpu.getToken()));
			makeMovement(this.buttons[randomColumn][randomRow], randomColumn, randomRow);
		}
	}
	
}