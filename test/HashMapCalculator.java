import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
		int ans  = 0;
		for(String s : hashmap1.keySet()) {
			if(hashmap1.get(s).contains((CharSequence) hashmap2.keySet())) {
				ans = 2;
			}
		}
		return ans;
	}

}
