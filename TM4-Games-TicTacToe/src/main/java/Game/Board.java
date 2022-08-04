package Game;

public class Board {
	
	/** Attributes */
	private String field[][];
	
	
	/**
	 * Constructor 
	 */
	public Board() {
		this.field = new String [3][3];
	}


	/**
	 * Getters y Setters
	 */
	
	/**
	 * @return the field
	 */
	public String[][] getField() {
		return field;
	}


	/**
	 * @param field the field to set
	 */
	public void setField(String[][] field) {
		this.field = field;
	}

	/**
	 * Method that cleans the fields values and sets it to ""
	 * 
	 */
	public void  fillEmptyBoard() {
		for (int i = 0; i < field.length; i++) {			
			for (int j = 0; j < field.length; j++) {
				field[i][j] = "";
			}
		}	
	}

	/**
	 * Method that check if a the current player  have win
	 * 
	 * @param turn token associated to a player
	 */
	public boolean checkWin(String turn) {
		int winningResult = 0; 
		String rowSum= "";
		
	    if(field[0][0].equals(turn) && field[0][1].equals(turn) && field[0][2].equals(turn) ) {
	    	return true;
	    }else if (field[0][0].equals(turn) && field[1][0].equals(turn) && field[2][0].equals(turn)) {
	    	return true;
	
	    }else if (field[0][1].equals(turn) && field[1][1].equals(turn) && field[2][1].equals(turn)) {
	    	return true;
	
	    }else if (field[0][2].equals(turn) && field[1][2].equals(turn) && field[2][2].equals(turn)) {
	    	return true;

	    }else if (field[1][0].equals(turn) && field[1][1].equals(turn) && field[1][2].equals(turn)) {
	    	return true;

	    }else if (field[2][0].equals(turn) && field[2][1].equals(turn) && field[2][2].equals(turn)) {
	    	return true;
	    }
	    else if (field[0][0].equals(turn) && field[1][1].equals(turn) && field[2][2].equals(turn)) {
	    	return true;

	    }else if (field[0][2].equals(turn) && field[1][1].equals(turn) && field[2][0].equals(turn)) {
	    	return true;

	    }
		

		
		return false;
	}
	

	
	
	

}