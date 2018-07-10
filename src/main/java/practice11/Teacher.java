package practice11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vito Zhuang on 7/10/2018.
 */
public class Teacher extends Person implements Observer {

	private List<Klass> klasses;
	private boolean haveKlass;

	public Teacher(int id, String name, int age) {
		super(id, name, age);
		this.haveKlass = false;
	}

	public Teacher(int id, String name, int age, List<Klass> klasses) {
		super(id, name, age);
		this.klasses = klasses;
		this.haveKlass = true;
		for(Klass klass : klasses){
			klass.addObserver(this);
		}
	}

	@Override
	public String introduce() {
		return String.format(super.introduce() + " I am a Teacher. I teach %s.", getKlassesDisplayName());
	}

	public String introduceWith(Student student) {
		String isTeachStudentStr = isTeaching(student) ?
				" I teach " + student.getName() + "." :
				" I don't teach " + student.getName() + ".";
		return String.format(super.introduce() + " I am a Teacher.%s",
				isTeachStudentStr);
	}

	public String getKlassesDisplayName() {
		List<String> klassesName = new ArrayList<>();
		if (this.haveKlass) {
			for (Klass klass : klasses) {
				klassesName.add(String.valueOf(klass.getNumber()));
			}
			return "Class " + String.join(", ", klassesName);
		}
		return "No Class";
	}

	public boolean isTeaching(Student student) {
		for (Klass klass : klasses) {
			if (klass.getDisplayName().equals(student.getKlassName()))
				return true;
		}
		return false;
	}

	public List<Klass> getClasses() {
		return klasses;
	}

	public void setKlasses(List<Klass> klass) {
		this.klasses = klass;
	}

	public boolean isHaveKlass() {
		return haveKlass;
	}

	public void setHaveKlass(boolean haveKlass) {
		this.haveKlass = haveKlass;
	}

	@Override
	public void update(String message) {
		System.out.print(String.format("I am %s. %s.\n",this.getName(), message));
	}
}
