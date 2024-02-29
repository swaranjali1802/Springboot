package dp;

public  class Player {
	public Player()
	{
		System.out.println("Player class called");
	}
	private Team team;
	public void setTeam(Team team) {
		this.team=team;
		
	}
	public void getMyTeam()
	{
		System.out.println("employee.getMyTeam() called");
		team.showTeam();
	}
}
