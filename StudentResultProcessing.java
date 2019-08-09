package session3;

public class StudentResultProcessing extends Student {
	private int gr1;
	private int gr2;
	private int gr3;
	private static int passingGrade=60;
	
	public StudentResultProcessing(Student s,int gr1,int gr2,int gr3) {
		super(s.getName(),s.getPhoneNumber(),s.getRollNumber(),s.getClassLevel());
		this.gr1=gr1;
		this.gr2=gr2;
		this.gr3=gr3;

	}
	


	public String result() {
		if(gr1>=passingGrade && gr2>=passingGrade && gr3>=passingGrade) {
			return "Pass";
		}
		else {
			return "Fail";
		}
	}
}

