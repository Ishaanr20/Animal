public class Bear extends Animal {

	public Bear(String name) {
		super(name);
	}
	
	public String getSound() {
		return "raargh";
	}
	
	public boolean hasWings() {
		return false;
	}
	
	public int getNumLegs() {
		return 4;
	}
}
