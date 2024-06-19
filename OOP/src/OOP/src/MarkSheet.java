
public class MarkSheet {
	private String name;
	private int english;
	private int math;
	private int science;
	private int marathi;
	private int history;
	public MarkSheet(String name,int english, int math, int science, int marathi, int history) {
		super();
		this.name=name;
		this.english = english;
		this.math = math;
		this.science = science;
		this.marathi = marathi;
		this.history = history;
	}
	
	int totalMarks() {
		return this.english+this.math+this.science+this.marathi+this.history;
	}
	
	double average() {
		return totalMarks()/5.0;
	}
	public String getName() {
		return this.name;
	}
	

}
