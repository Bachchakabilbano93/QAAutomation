
public class Static_Class_Program {

	public static void main(String[] args) {
		Student.change();
		
		Student s1 = new Student(111,"Paul");
		Student s2 = new Student(222,"Bob");
		s1.display();
		Student.college="VJIT";
		s2.display();
		s1.display();

	}

}
