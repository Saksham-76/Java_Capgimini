package polymorphism;

public class MapV1 {
	public void route() {
		System.out.println("direction");
	}
	
	public static void main(String[] args) {
		MapV1 m1 = new MapV1();
		MapV2 m2 = new MapV2();
		MapV3 m3 = new MapV3();
		
		m1.route();
		System.out.println("------------");
		m2.route();
		System.out.println("------------");
		m3.route();
		m3.booCab();
		
		MapV1 m4 = new MapV3();
		System.out.println("------------");
		m4.route();
		
		MapV3 m5 = (MapV3)m4;
		System.out.println("------------");
		m5.route();
		m5.booCab();
		
	}
}

class MapV2 extends MapV1 {
	@Override
	public void route() {
		System.out.println("Direction");
		System.out.println("Duration");
	}
}

class MapV3 extends MapV2 {
	public void booCab() {
		System.out.println("Rapido");
	}
}
