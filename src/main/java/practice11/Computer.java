package practice11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vito Zhuang on 7/10/2018.
 */
public class Computer implements Observer {

	private String name;
	private List<Klass> klasses = new ArrayList<>();

	public Computer(String name, List<Klass>klasses) {
		this.name = name;
		this.klasses = klasses;
		for(Klass klass : klasses){
			klass.addObserver(this);
		}
	}

	@Override
	public void update(String message) {
		System.out.print(String.format("I am the Machine. %s.\n",message));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Klass> getKlasses() {
		return klasses;
	}

	public void setKlasses(List<Klass> klasses) {
		this.klasses = klasses;
	}
}
