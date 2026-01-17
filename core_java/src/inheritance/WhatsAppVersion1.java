package inheritance;

public class WhatsAppVersion1 {
	public void chat(){
		System.out.println("You can Chat in the version 1");
	}
	
	public static void main(String[] args) {
		WhatsAppVersion1 wp1 = new WhatsAppVersion1();
		WhatsAppVersion2 wp2 = new WhatsAppVersion2();
		WhatsAppVersion3 wp3 = new WhatsAppVersion3();
		wp1.chat();
		wp2.status();
		wp2.chat();
		wp3.metaAi();
		wp3.status();
		wp3.chat();
	}
}

class WhatsAppVersion2 extends WhatsAppVersion1{
	public void status() {
		System.out.println("You can add status in the version 2");
	}
	
}

class WhatsAppVersion3 extends WhatsAppVersion2{
	public void metaAi() {
		System.out.println("You can use meta AI in the version 3");
	}
}
