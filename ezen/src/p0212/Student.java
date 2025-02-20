package p0212;

public class Student {
	String name;
	int grade;
	String schoolName;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public String toString() {
		return"[name="+name+"grade="+grade+"schoolName"+schoolName+"]";
	}
}
