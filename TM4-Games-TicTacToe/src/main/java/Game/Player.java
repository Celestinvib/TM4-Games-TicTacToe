package Game;

public class Player {

	// Attributes
	private String token;
	private String name;
	private String type;
	private int numPlacedTokens;
	
	/**
	 * Constructor
	 * 
	 * @param token
	 * @param name
	 * @param type
	 */
	public Player(String token, String name, String type) {
		this.token = token;
		this.name = name;
		this.type = type;
		this.numPlacedTokens = 0;
	}

	// Getter and Setters
	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the numPlacedTokens
	 */
	public int getNumPlacedTokens() {
		return numPlacedTokens;
	}

	/**
	 * @param numPlacedTokens the numPlacedTokens to set
	 */
	public void setNumPlacedTokens(int numPlacedTokens) {
		this.numPlacedTokens = numPlacedTokens;
	}
	
	public void ia() {
		// la pone random buscando cual este vacia, cuando ya haya puesto las 3, cojera una random y la pondra en un sitio vacio random
	}
}
