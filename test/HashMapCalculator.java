import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
		int ans = 0;
		for (String s : hashmap1.keySet()) {
			for (String a : hashmap1.values()) {
				if (hashmap1.keySet().equals(hashmap2.get(s))) {
					if (hashmap1.values().equals(hashmap2.get(a)))
						System.out.println("here");
					ans = 2;

				}
			}
		}
		return ans;
	}

}
