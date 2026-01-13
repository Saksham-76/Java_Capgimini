package method;

public class VarargsExample {
	public static void main(String[] args) {
		add();
		add(2,3,4);
		add(3,7,8,10);
	}
	
	public static void add(int... n) {
		int sum = 0;
		for(int i:n) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
	
}
