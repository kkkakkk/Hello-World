package elements;

public class Temple {
	public final String name;
	public Floor floor;
	public final Groud groud;
	
	public Temple(String n,Floor f,Groud g) {
		name=n;
		floor=f;
		groud=g;
		groud.temple=this;
	}
	
	public String getName() {
		return name;
	}
	
	public Floor getFloor() {
		return floor;
	}
	
	public Groud getGroud() {
		return groud;
	}
	
	public void setFloor(Floor f) {
		floor=f;
	}
	
	public String toString() {
		return "name:"+name+" floor:{"+floor.toString()+"} groud:{"+groud.id+"}";
	}
}
