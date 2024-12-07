package ConstructorDi;

public class ClientController1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		System.out.println("*****dependency injection using constructor  methods*****");
		
		Employee f= (Employee) context.getBean("Employeebean");// at this line object will be created at run time 
		System.out.println(f.toString());

		// you can also use the getter setter to get that individually
		context.close();

}
}