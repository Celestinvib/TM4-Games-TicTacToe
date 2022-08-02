package Game;

public class Player {
	
	/** Attributes */
	private String token;
	
	private String name;
	
	private String type;


	/**Constructor */
	/**
	 * @param token
	 * @param name
	 * @param type
	 */
	public Player(String token, String name, String type) {
		this.token = token;
		this.name = name;
		this.type = type;
	}

	

	/**
	 * Getters y Setters
	 */
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
	
	
	


}
