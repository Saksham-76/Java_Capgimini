package encapsulation;

public class Driver {
	public static void main(String[] args) {
		Trainer t = new Trainer();
		
		t.setId(101);
		t.setName("Rahul");
		t.setPass(1234);
		
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPass());
	}
}
