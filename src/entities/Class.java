package entities;

import java.util.ArrayList;

public class Class {
	
	private Teacher teacher;
	private Student representant;
	private ArrayList<Student> students;
	private ArrayList<Subject> subjects;
	
	public Class(Teacher teacher) {
		this(teacher, new ArrayList<Student>(), new ArrayList<Subject>());
	}
	
	public Class(Teacher teacher, ArrayList<Subject> subjects) {
		this(teacher, subjects, new ArrayList<Student>());
	}
	
	public Class(Teacher teacher, ArrayList<Subject> subjects, ArrayList<Student> students) {
		this.teacher = teacher;
		this.subjects = subjects;
		this.students = students;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public void addSubject(Subject subject) {
		this.subjects.add(subject);
	}
	
	public Teacher getTeacher() {
		return this.teacher;
	}
	
	public Vector<Student> getStudents() {
		return this.students;
	}
	
	public Subject getSubject() {
		return this.subject;
	}
}