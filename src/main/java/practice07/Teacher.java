package practice06;

/**
 * Created by Vito Zhuang on 7/10/2018.
 */
public class Teacher extends Person {

	private int klass;

	public Teacher(String name, int age) {
		super(name, age);
		this.klass = -1;
	}

	public Teacher(String name, int age, int klass) {
		super(name, age);
		this.klass = klass;
	}

	@Override
	public String introduce() {
		String klassStr = getKlassDisplayName();
		return super.introduce() + " I am a Teacher. I teach " + klassStr;
	}

	public String getKlassDisplayName() {
		if (this.klass != -1) {
			return "Class " + this.klass + ".";
		}
		return "No Class.";
	}

	public int getKlass() {
		return klass;
	}

	public void setKlass(int klass) {
		this.klass = klass;
	}
}
