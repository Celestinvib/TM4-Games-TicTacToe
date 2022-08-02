package Game;

public class Board {
	
	/** Attributes */
	private String field[][];
	
	private int size;

	
	/**
	 * Constructor 
	 */
	public Board() {
		this.field = new String [3][3];
		this.size = 9;
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
	 * @return the size
	 */
	public int getSize() {
		return size;
	}


	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	
	

}
