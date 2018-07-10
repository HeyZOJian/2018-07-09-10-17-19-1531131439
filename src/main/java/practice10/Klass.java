package practice09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Klass {
	private int number;
	private Student leader;
	private List<Student> students = new ArrayList<>();

	public Klass(int number) {
		this.number = number;
	}

	public String getDisplayName() {
		return "Class " + number;
	}

	public void assignLeader(Student student) {
		if (isMember(student))
			this.leader = student;
		else
			System.out.print("It is not one of us.\n");
	}

	public void appendMember(Student student) {
		this.students.add(student);
	}

	public boolean isMember(Student student) {
		return students
				.stream()
				.filter(student1 -> student1.getId() == student.getId())
				.collect(Collectors.toList())
				.size() > 0;
//		for(Student x: students){
//			if(x.getId() == student.getId()){
//				return true;
//			}
//		}
//		return false;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Student getLeader() {
		return leader;
	}

	public String getLeaderName() {
		return leader.getName();
	}

	public int getLeaderId() {
		if (leader != null)
			return leader.getId();
		return -1;
	}
}
