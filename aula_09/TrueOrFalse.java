package aula_09;

public enum TrueOrFalse {
	
	FALSE(0, "False"), 	TRUE(1, "True");
	
	private int index;
	private String desc;
	
	private TrueOrFalse(int index, String desc) {
	this.index = index;
	this.desc = desc;
	}

	public int getIndex() {
		return index;
	}

	public String getDesc() {
		return desc;
	}
	
	
	
}
