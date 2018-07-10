package practice11;

import java.util.LinkedList;

/**
 * Created by Vito Zhuang on 7/10/2018.
 */
public class main {
	public static void main(String[] args) {
		Klass klass2 = new Klass(2);
		LinkedList<Klass> linkedList = new LinkedList<Klass>();
		linkedList.add(klass2);
		Teacher tom = new Teacher(1, "Tom", 21, linkedList);
		Student jerry = new Student(1, "Jerry", 8, new Klass(3));

		klass2.appendMember(jerry);
	}
}
