package elements;

public class Asset {
	public final String name;
	public String owner;
	public Groud groud;
	
	public Asset(String n,Groud g) {
		name=n;
		owner="";
		groud=g;
		groud.asset=this;
	}
	
	public void setOwner(String s) {
		owner=s;
	}
	
	public String toString() {
		return "name:"+name+" owner:"+owner+" groud:{"+groud.id+"}";
	}
}
