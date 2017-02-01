package beans;

public class CricketGame implements Game{
	
	private Team first;
	private Team second;
	private Team third;
	
	
	
	public CricketGame() {
	}


	public CricketGame(Team first, Team second, Team third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	
	public Team getFirst() {
		return first;
	}


	public void setFirst(Team first) {
		this.first = first;
	}


	public Team getSecond() {
		return second;
	}


	public void setSecond(Team second) {
		this.second = second;
	}


	public Team getThird() {
		return third;
	}


	public void setThird(Team third) {
		this.third = third;
	}


	public String playGame() {
		double seed = Math.random();
	   if(seed < 0.33) return first.getName();
	   if(seed >= 0.33 && seed < 0.66) return second.getName();
	   else return third.getName();	
	}
	

}
