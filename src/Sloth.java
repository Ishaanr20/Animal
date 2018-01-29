public class Sloth extends Animal {

	public Sloth(String name) {
		super(name);
	}

	@Override
	public String getSound() {
		return "meehhh";
	}

	@Override
	public boolean hasWings() {
		return false;
	}

	@Override
	public int getNumLegs() {
		return 4;
	}
}