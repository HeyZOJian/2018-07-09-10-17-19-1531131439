package practice08;

public class Klass {
	private int number;
	private Student leader;

	public Klass(int number) {
		this.number = number;
	}

	public String getDisplayName() {
		return "Class " + number;
	}

	public void assignLeader(Student student){
		this.leader = student;
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

	public String getLeaderName(){
		return leader.getName();
	}

	public int getLeaderId(){
		if(leader!=null)
		return leader.getId();
		return -1;
	}
}
