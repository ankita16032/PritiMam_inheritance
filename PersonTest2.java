package inheritance;

public class PersonTest2 {
	public static void main(String[] args) {

		Person arr[] = new Person[5];
		arr[0] = new Person("Ankita", 24, 'F');
		arr[1] = new Person("Shweta", 23, 'F');
		arr[2] = new Person("Purva", 25, 'F');
		arr[3] = new Person("kajal", 22, 'F');
		arr[4] = new Person("Darshan", 21, 'M');

		for (int i = 0; i < arr.length; i++) {
			System.out.println(
					arr[i].getName() + " is " + arr[i].getAge() + " yrs old and gender is " + arr[i].getGender());
		}

	}

}
