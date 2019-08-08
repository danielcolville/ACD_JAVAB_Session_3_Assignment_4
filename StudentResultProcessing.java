package sesssion3;

public class StudentResultProcessing extends Student {
	private String name;
	private String phoneNumber;
	private int rollNumber;
	private String classLevel;
	private int gr1;
	private int gr2;
	private int gr3;
	private static int passingGrade=60;
	
	public StudentResultProcessing(Student s,int gr1,int gr2,int gr3) {
		this.gr1=gr1;
		this.gr2=gr2;
		this.gr3=gr3;
		name=s.getName();
		phoneNumber=s.getPhoneNumber();
		rollNumber=s.getRollNumber();
		classLevel=s.getClassLevel();
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

