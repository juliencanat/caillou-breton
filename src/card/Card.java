package card;

public abstract class Card {
	private String name;
	private boolean isDistributed;
	
	
	
	
	public Card(String name, boolean isDistributed) {
		super();
		this.name = name;
		this.isDistributed = isDistributed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isDistributed() {
		return isDistributed;
	}
	public void setDistributed(boolean isDistributed) {
		this.isDistributed = isDistributed;
	}
	
	

}
