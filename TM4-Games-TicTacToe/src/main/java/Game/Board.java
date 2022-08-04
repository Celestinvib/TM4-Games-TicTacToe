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

	public void  fillEmptyBoard() {
		for (int i = 0; i < field.length; i++) {			
			for (int j = 0; j < field.length; j++) {
				field[i][j] = "";
			}
		}	
	}
	
	public boolean checkWin(String turn) {
		boolean alreadyAWinner = false;
		int winningResult = 0; 
		String rowSum= "";
		
		for (int i = 0; i < field.length; i++) {			
			for (int j = 0; j < field.length; j++) {
				if(field[i][j] != "" && field[i][j].equals(turn)) {			
					rowSum += String.valueOf(i) + String.valueOf(j);
					System.out.println(rowSum);
				}
				System.out.println();
				winningResult += Integer.parseInt(rowSum);
			}		
		}
		
		if(winningResult == 3 || winningResult == 33 || winningResult == 39 || winningResult == 45 || winningResult == 63) {
			return true;
		}
		
		return alreadyAWinner;
	}
	

	
	
	

}
