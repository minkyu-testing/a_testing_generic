import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		EmployeeInfo e = new EmployeeInfo(199);
		Integer i = new Integer(10);
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
		p1.<Integer> printInfo(i);
		p1.printInfo(e);
		p1.printInfo(i);
	}

}

class EmployeeInfo {
	public int rank;

	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

class Person<T, S> {
	public T info;
	public S id;

	Person(T info, S id) {
		this.info = info;
		this.id = id;
	}

	public <T> void printInfo(T uu) {
		System.out.println(uu);
	}
}
