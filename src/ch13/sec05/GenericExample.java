package ch13.sec05;

public class GenericExample {
	public static void main(String[] args) {
		//모든 사람이 신청 가능
		Person p1 = new Person();
		Worker w1 = new Worker();
		Student s1 = new Student();
		HighStudent h1 = new HighStudent();
		MiddleStudent m1 = new MiddleStudent();
		
		Applicant<Person> app1 = new Applicant<Person>(p1);
		Applicant<Worker> app2 = new Applicant<Worker>(w1);
		Applicant<Student> app3 = new Applicant<Student>(s1);
		Applicant<HighStudent> app4 = new Applicant<HighStudent>(h1);
		Applicant<MiddleStudent> app5 = new Applicant<MiddleStudent>(m1);
		System.out.println("----START-------------------------------------");
		Course.registerCourse1(app1);
		Course.registerCourse1(app2);
		Course.registerCourse1(app3);
		Course.registerCourse1(app4);
		Course.registerCourse1(app5);
		System.out.println("-----------------------------------------");

		//Course.registerCourse2(app1);
		//Course.registerCourse2(app2);
		Course.registerCourse2(app3);
		Course.registerCourse2(app4);
		Course.registerCourse2(app5);
		System.out.println("-----------------------------------------");
		Course.registerCourse3(app1);
		Course.registerCourse3(app2);
		//Course.registerCourse3(app3);
		//Course.registerCourse3(app4);
		//Course.registerCourse3(app5);
		System.out.println("----END-------------------------------------");	
		
		
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();

		//학생만 신청 가능
		//Course.registerCourse2(new Applicant<Person>(new Person())); (x)
		//Course.registerCourse2(new Applicant<Worker>(new Worker())); (x)
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
			
		//직장인 및 일반인만 신청 가능
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		//Course.registerCourse3(new Applicant<Student>(new Student())); 		(x)
		//Course.registerCourse3(new Applicant<HighStudent>(new HighStudent())); 	(x)
		//Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent())); 	(x)
	}
}