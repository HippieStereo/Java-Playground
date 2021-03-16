package enumeration.one;

public enum Level {

	HIGH(1) {
		@Override
		public String normalize() {
			return HIGH.toString();
		}
	},
	MEDIUM(2) {
		@Override
		public String normalize() {
			return MEDIUM.toString().toUpperCase();
		}
	},
	LOW(3) {
		@Override
		public String normalize() {
			return MEDIUM.toString().toLowerCase();
		}
	};

	private int valueOfEnum;
	
	private Level(int i) {
		this.valueOfEnum = i;
	}
	
	public int getEnumValue() {
		return this.valueOfEnum;
	}
	
	public abstract String normalize();
		
}
