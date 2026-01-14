package inheritance;

public class App {
	String name;
	float size;
	
	public static void main(String[] args) {
		Whatsapp w = new Whatsapp("Whatsapp", 70.6f, 8.2f, "Messaging App");
		w.printAll();
	}
	
}

class Whatsapp extends App{
	float version;
	String type;
	
	Whatsapp (){
		
	}
	
	Whatsapp(String name, float size, float version, String type) {
		this.name = name;
		this.size = size;
		this.type = type;
		this.version = version;
	}
	
	public void printAll() {
		System.out.println(name);
		System.out.println(size);
		System.out.println(type);
		System.out.println(version);
	}
}
