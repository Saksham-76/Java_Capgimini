package encapsulation;

public class Example {
	public static void main(String[] args) {
//		Student s = new Student();
//		s.name = "Raju";
//		System.out.println(s.getPass());
//		s.setPass(1234);
//		System.out.println(s.getPass());
		
		
		Account a1 = new Account();
		a1.setId(101);
		a1.setBalance(10000);
		a1.setPassword(1234);
		System.out.println(a1.getId());
		System.out.println(a1.getBalance());
		System.out.println(a1.getPassword());
	}
	
	
}
