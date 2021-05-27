class CricketTeam{
	private static String captain;
	private static class CricketTeamHolder{
		private static CricketTeam instance=new CricketTeam();
	}
	public static CricketTeam getInstance() {
		return CricketTeamHolder.instance;
	}
	public void setCaptain(String captainName) {
		if(captain==null) {
			captain=captainName;
			System.out.println("New captain selected for our team");
		}
		else
			System.out.println("You already have a captain for our team. Send him to toss");
	}
	public String getCaption() {
		return captain;
	}
}
public class BillPug {
	public static void main(String[] args) {
		CricketTeam c1=CricketTeam.getInstance();
		System.out.println("Trying to make a captain for our team");
		c1.setCaptain("Virat");
		System.out.println("Trying to make another captain for our team");
		CricketTeam c2=CricketTeam.getInstance();
		c2.setCaptain("Rohit");
		if(c1.equals(c2)) {
			System.out.println("c1 and c2 are same instance");
		}
	}

} 
