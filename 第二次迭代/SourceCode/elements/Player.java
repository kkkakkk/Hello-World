package elements;

import java.util.ArrayList;

public class Player {
	public String name;
	public Attribute attr;
	public int money;
	public Status st;
	public Groud groud;
	public ArrayList<Ability> ab;
	public ArrayList<Asset> as;
	public groud_type type;
	
	public Player (String n,Attribute a,int m,Status s,Groud g){
		name=n;
		attr=a;
		money=m;
		st=s;
		groud=g;
		updateType();
	}
	
	public int getNumOfAbility() {
		return ab.size();
	}
	
	public int getNumOfAsset() {
		return as.size();
	}
	
	public void addAbility(Ability a) {
		ab.add(a);
	}
	
	public void addAsset(Asset a) {
		as.add(a);
		a.owner=name;
	}
	
	public void removeAbility(Ability a) {
		ab.remove(a);
	}
	
	public void removeAsset(Asset a) {
		as.remove(a);
		a.owner="";
	}
	
	private void updateType() {
		if (groud.asset!=null) type=groud_type.ISASSET;
		else if (groud.temple!=null) type=groud_type.ISTEMPLE;
		else type=groud_type.GENERAL;
	}
	
	public void move(int step,Board b) {
		int oldposition=groud.id;
		groud.player_number-=1;
		int newposition=(oldposition+step)%b.getNumber();
		groud=b.groud_list.get(newposition);
		groud.player_number+=1;
		updateType();
	}
	
	public groud_type getType() {
		return type;
	}
}
