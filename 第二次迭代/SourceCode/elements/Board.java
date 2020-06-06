package elements;

import java.util.ArrayList;

public class Board {
	public ArrayList<Groud> groud_list;
	
	public Board() {
		
	}
	
	public int getNumber() {
		return groud_list.size();
	}
	
	public void AddGroud(Groud g) {
		groud_list.add(g);
	}
}
