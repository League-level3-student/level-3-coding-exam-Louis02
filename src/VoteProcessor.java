import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		int es = 0;
		int pf = 0;
		String ans = "";
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equalsIgnoreCase("Edward Snowden") ) {
				es++;
			}  if (votes.get(i).equalsIgnoreCase("Pope Francis")) {
				pf++;
				
			}

		}
		System.out.println(pf);
		if (pf > es) {
			ans = "pope francis";
		}  if (es > pf) {
			ans = "Edward SnOwden";
		}
		if(es==pf) {
			ans="TIE";
		}
		return ans;
	}

}
