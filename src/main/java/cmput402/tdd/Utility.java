package cmput402.tdd;

import java.util.ArrayList;
import java.util.HashMap;

import cmput402.tdd.service.Search;

public class Utility {

	public HashMap<String, Float>  countAverageScore(Search search){
		HashMap<String,ArrayList<Integer>> results = search.returnAll();
		HashMap<String, Float> map = new HashMap<String, Float>();
		for(String player: results.keySet()){
			float avg = (float)(results.get(player).get(1)/results.get(player).get(0));
			map.put(player, avg);//hello
		
		}
		return map;
	}
	
public HashMap<String, Integer>  findTopScorer(Search search){
		// findTopScorer(Search search);
		return null;
	}
	
}
