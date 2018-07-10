package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Klass extends Subject {
	private int number;
	private Student leader;
	private List<Student> students = new ArrayList<>();
	private List<Observer> observers = new ArrayList<>();

	public Klass(int number) {
		this.number = number;
	}

	public String getDisplayName() {
		return "Class " + number;
	}

	public void assignLeader(Student student) {
		if (isMember(student)) {
			this.leader = student;
			noticeAllObserver(String.format("I know %s become Leader of Class %s", student.getName(),this.number));
		}
		else
			System.out.print("It is not one of us.\n");
	}

	public void appendMember(Student student) {
		this.students.add(student);
		noticeAllObserver(String.format("I know %s has joined Class %s",student.getName(),this.number));
	}

	public boolean isMember(Student student) {
		return students
				.stream()
				.filter(student1 -> student1.getId() == student.getId())
				.collect(Collectors.toList())
				.size() > 0;
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

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {

	}

	@Override
	public void noticeAllObserver(String message) {
		for(Observer observer : observers){
			observer.update(message);
		}
	}
}
