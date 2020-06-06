package elements;

public class Floor {
	public final int number;
	public final int level;
	public final int value;
	
	public Floor(int n,int l,int v) {
		number=n;
		level=l;
		value=v;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString() {
		return "number:"+number+" level:"+level+" value:"+value;
	}
}
