package inheritance;

public class Faculty extends Person{
	private int yearsOfExperience;
	private String skills;
	public Faculty(String fn, String ln, int yearsOfExperience, String skills) {
		super(fn ,ln);
		System.out.println("in faculty class constructor...");
		this.yearsOfExperience = yearsOfExperience;
		this.skills = skills;
	}
	@Override
	public String toString() {
		return super.toString()+" "+ this.yearsOfExperience+" "+this.skills;
	}
	
	public String teach() {
		return getlastName()+" "+"teaching in " +" "+ skills;
	}

}
