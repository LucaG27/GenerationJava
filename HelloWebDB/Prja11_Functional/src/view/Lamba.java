package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Canzone;


public class Lamba {

	public static void main(String[] args) {
		
		Canzone c1 = new Canzone(1, "brividi", "mahmood");
		Canzone c2 = new Canzone(1, "per elisa", "elisa");
		Canzone c3 = new Canzone(1, "fatti mandare", "morandi");
		
		List<Canzone> canzoni = new ArrayList<>();
	    canzoni.add(c1);
		canzoni.add(c2);
		canzoni.add(c3);
		
		Collections.sort(canzoni, (ca1, ca2) -> ca1.getCantane().compareTo(ca2.getCantane()));
		System.out.println(canzoni);

	}

}
