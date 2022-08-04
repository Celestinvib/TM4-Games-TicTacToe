package Controller;

import java.awt.event.*;
import javax.swing.*;

import Game.*;
import GraphicApp.*;

public class ControllerGame {
	
	private Player ply1;
	private Player ply2;
	private Board board;
	private String turn;
	private boolean gameStarted;
	private GraphicApp app = new GraphicApp();
	
	// Construct
	public ControllerGame() {
		
//		this.app = new GraphicApp();
		String[][] arr = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
		this.board = new Board(arr);
		this.turn = "X";
		this.gameStarted = false;
		
		app.getBtnNewGame().addActionListener(new ActionListener() {
			// Starts a new Game	
			public void actionPerformed(ActionEvent e) {
				newGame();
			}
		});
		
		buttonBoardActions();
	}
	
	public void newGame() {
		
		// validador
		this.ply1 = new Player("X", app.getTextFieldPlayer1Name().toString(), "human");
		this.ply2 =  new Player("O", app.getTextFieldPlayer1Name().toString(), "cpu");
		
		this.gameStarted = true;
	}
	
	public void buttonBoardActions() {
		
		app.getBtn00().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				makeMovement(app.getBtn00(), 0, 0);
			}
		});
		
		app.getBtn01().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok");
				makeMovement(app.getBtn01(), 0, 1);
			}
		});
		
		app.getBtn02().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok");
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
	 * Method that updates the movement label with the movement that has been made
	 * 
	 * @param name the name of the player that has made the movement
	 */
	public void movementMade(String name) {
		app.getLblMovements().setText(name+", coloca ficha ...");
	}
	
	/**
	 * Method that check if a movement can be made and if it can , makes it
	 * 
	 * @param btn button that has been triggered 
	 * @param column Column where the button is
	 * @param row Row where the button is 
	 */
	public void  makeMovement(JButton btn, int column , int row) {	
		
		if(gameStarted) {
			
			String tempBoard[][] = board.getField();
					
				if (this.turn == "X") { 
					
					if(this.ply1.getNumPlacedTokens() < 3 && tempBoard[column][row].equals("")) { // If the player haven't put 3 tokens in the board and the field selected is null
						
						btn.setText(ply1.getToken()); // The token is put in the board in the eyes of the user
						tempBoard[column][row] = ply1.getToken(); // it's save the position in which it have been put it
						
						movementMade(this.ply1.getName()); // Update the movement label
						this.ply1.setNumPlacedTokens(this.ply1.getNumPlacedTokens()+1); // Add a token to the user token counter
						
						turn = "O"; //Change the turn
					
					}else if (this.ply1.getNumPlacedTokens() >= 3 && tempBoard[column][row] == "X") { // If the player have put 3 tokens in the board and the field selected is one of his tokens
						
						btn.setText(""); // The token is withdrawn in the board in the eyes of the user
						tempBoard[column][row] = ""; // Clear the position in which it had been put it

						 
						movementMade(this.ply1.getName()); // Update the movement label
						this.ply1.setNumPlacedTokens(this.ply1.getNumPlacedTokens()-1); // Subtract 1 of the token counter
						 
						turn = "O";
					}
					
					
					
				}else {
					
					if(this.ply2.getNumPlacedTokens() < 3 && tempBoard[column][row].equals("")) {
						btn.setText(ply2.getToken());
						tempBoard[column][row] = ply2.getToken();
						
						movementMade(this.ply2.getName());
						this.ply2.setNumPlacedTokens(this.ply2.getNumPlacedTokens()+1);
						
						turn = "X";
						
					}else if (this.ply2.getNumPlacedTokens() >= 3 && tempBoard[column][row] == "O") {
						 tempBoard[column][row] = "";
						 btn.setText("");

						 movementMade(this.ply2.getName());
						 this.ply2.setNumPlacedTokens(this.ply2.getNumPlacedTokens()-1);	

						turn = "X";
					}
				}
				
				this.board.setField(tempBoard); // Update the real board		
		}
	}
	
}