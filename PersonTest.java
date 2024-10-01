package inheritance;

public class PersonTest {

	public static void main(String[] args) {
		Person person=new Person("Ankita", 24, 'F');
		System.out.println(person);
		person.display();
		person.fun1();
		
		Person person2=new Person("anvi", 20, 'F');
		
		person2=new Student ("Anki",22,'f',33,"IT",77);
		System.out.println(person2);
		
		person2=new Employee ("Ank",24,'M',22,"Robotics",98.2,80,"deloite",98000);
		System.out.println(person2);
		
		}

}
