package it.formarete.designpatterns.composition;

import java.util.List;

public class Teacher {
	private List<Student>students;

	public Teacher(List<Student> students) {
		super();
		this.students = students;
	}
	
	public void work() {
		for (Student student : students) {
			student.doHomework();
		}
	}

}
