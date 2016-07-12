import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person(new EmployeeInfo(10));
		System.out.println(p1.info.getLevel());
		//Person<String> p2 = new Person<String>("부장");
	}

}

interface Info{
    int getLevel();
}

class EmployeeInfo implements Info {
	public int rank;

	EmployeeInfo(int rank) {
		this.rank = rank;
	}

	public int getLevel() {
		return this.rank;
	}
}

class Person<T extends Info> {
	public T info;

	Person(T info) {
		this.info = info;
	}
}
	
/*
public class Main {
	
	public static void main(String[] args) {
		Person p1 = new Person(new EmployeeInfo(1));
		System.out.println(p1.info.getLevel());
		//Person<String> p2 = new Person<String>("부장");
	}
	
}

abstract class Info {
	public abstract int getLevel();
}

class EmployeeInfo extends Info {
	public int rank;
	
	EmployeeInfo(int rank) {
		this.rank = rank;
	}
	
	public int getLevel() {
		return this.rank;
	}
}

class Person<T extends Info> {
	public T info;
	
	Person(T info) {
		this.info = info;
	}
}
*/
	/*
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
	*/
