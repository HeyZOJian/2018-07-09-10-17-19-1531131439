package practice07;

/**
 * Created by Vito Zhuang on 7/10/2018.
 */
public class Teacher extends Person {

	private Klass klass;
	private boolean haveKlass;

	public Teacher(String name, int age) {
		super(name, age);
		this.haveKlass = false;
	}

	public Teacher(String name, int age, Klass klass) {
		super(name, age);
		this.klass = klass;
		this.haveKlass = true;
	}

	@Override
	public String introduce() {
		return String.format(super.introduce() + " I am a Teacher. I teach %s.", getKlassDisplayName());
	}

	public String introduceWith(Student student) {
		String isTeachStudentStr = isTeachStudent(student.getKlass()) ?
				" I teach " + student.getName() + "." :
				" I don't teach " + student.getName() + ".";
		return String.format(super.introduce() + " I am a Teacher.%s",
				isTeachStudentStr);
	}

	public String getKlassDisplayName() {
		if (this.haveKlass) {
			return this.klass.getDisplayName();
		}
		return "No Class";
	}

	public boolean isTeachStudent(Klass studentKlass) {
		if (this.klass.getNumber() == studentKlass.getNumber()) {
			return true;
		}
		return false;
	}

	public Klass getKlass() {
		return klass;
	}

	public void setKlass(Klass klass) {
		this.klass = klass;
	}

	public boolean isHaveKlass() {
		return haveKlass;
	}

	public void setHaveKlass(boolean haveKlass) {
		this.haveKlass = haveKlass;
	}
}
