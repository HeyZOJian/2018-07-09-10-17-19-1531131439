package practice11;

/**
 * Created by Vito Zhuang on 7/10/2018.
 */
public abstract class Subject {
	public abstract void addObserver(Observer observer);
	public abstract void deleteObserver(Observer observer);
	public abstract void noticeAllObserver(String message);
}
