package elements;

public class Groud {
	public int id;
	public Asset asset;
	public Temple temple;
	public int player_number;
	
	public Groud(int n) {
		id=n;
		asset=null;
		temple=null;
		player_number=0;
	}
	
	public String toString() {
		return "id:"+id+" asset:"+asset==null?"null":(" {name:"+asset.name+" owner:"+asset.owner+"}")+" temple:"+temple==null?"null":(" {name:"+temple.name+" floor:"+temple.floor.toString()+"}")+" player_number"+player_number;
	}
}
