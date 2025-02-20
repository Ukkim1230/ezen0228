package p0212;

import java.util.ArrayList;

public class ListTest4 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("병철이");
		student1.setGrade(3);
		student1.setSchoolName("고려대학교");
		Student student2 = new Student();
		student2.setName("영희");
		student2.setGrade(1);
		student2.setSchoolName("연세대학교");
		Student student3 = new Student();
		student3.setName("마이클");
		student3.setGrade(2);
		student3.setSchoolName("하버드 대학교");
		Student student4 = new Student();
		student4.setName("최영자");
		student4.setGrade(4);
		student4.setSchoolName("이젠");
		Student student5 = new Student();
		student5.setName("윤석열");
		student5.setGrade(3);
		student5.setSchoolName("서울대학교");
		ArrayList<Student> studentList = new ArrayList<>();

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);

		for (Student student : studentList) {
			String name = student.getName();
			String school = student.getSchoolName();
			if (name.startsWith("최") && school.equals("이젠")) {
				System.out.print(student);
			}
		}
	}
}
