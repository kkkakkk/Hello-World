package elements;

import java.util.Random;

public class Die {
	private static Die instance=null;
	
	private Die() {
		
	}
	
	public static Die getInstance() {
		if (instance==null) {
			instance=new Die();
		}
		return instance;
	}
	
	public int throwdie() {
		return new Random().nextInt(6)+1;
	}
	
	public int[] throwdie(int n) {
		int[] pips=new int[n];
		for (int i=0;i<n;++i) {
			pips[i]=new Random().nextInt(6)+1;
		}
		return pips;
	}
}
