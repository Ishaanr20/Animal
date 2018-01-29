public class ZeroLeggedDog extends Dog {

		public ZeroLeggedDog(String name) {
			super("cucumber");
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public int getNumLegs() {
			return 0;
		}
		
		@Override
		public String getSound() {
		return super.getSound()+", berf!";
		}
}