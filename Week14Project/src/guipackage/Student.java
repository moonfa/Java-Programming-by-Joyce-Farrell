package guipackage;

public class Student {
	private String name;
	private double score;
	private String status;
	private String StudStat;
	
	public String getStudStat() {
		return StudStat;
	}

	public void setStudStat(String studStat) {
		StudStat = studStat;
	}

	public Student(String n,double s,String st) {
		name = n;
		score =s ;
		status = st;
	}
	
	public double calculateFee() {
		if(status.equals("grad") && StudStat.equals("International"))
			return 900;
		else
			return 700;
	}
	
	public String calculateLetterGrade() {
		if(score > 90)
			return "A+";
		else
			return "B";
	}
}
