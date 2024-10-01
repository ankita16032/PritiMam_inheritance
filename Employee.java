package inheritance;

public class Employee extends Student{

	private int empNo;
	private String comName;
	private int sal;

	public Employee(String name, int age, char gender, int rollNo, String stream, double score, int empNo,
			String comName, int sal) {
		super(name, age, gender, rollNo, stream, score);
		this.empNo = empNo;
		this.comName = comName;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", comName=" + comName + ", sal=" + sal + ", rollNo=" + rollNo + ", stream="
				+ stream + ", score=" + score + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
