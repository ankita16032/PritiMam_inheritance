package inheritance;

public class StudentTest {

	public static void main(String[] args) {
		Person person = new Person("Ank", 24, 'F');
		System.out.println(person);
		person.display();
		person.fun1();

		System.out.println("---------------------------");
		Student student = new Student("Ankita", 24, 'F', 1, "CSE", 90);
		System.out.println(student);
		student.display();
		student.fun1();
	}

}
