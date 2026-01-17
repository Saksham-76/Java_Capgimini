package has_a;

public class Engine {
	private int cc;
	private String type;
	
	public int getCC() {
		return this.cc;
	}
	
	public void setCC(int cc) {
		this.cc = cc;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	Engine () {
		
	}
	
	Engine(int cc, String type) {
		this.cc = cc;
		this.type = type;
	}
	
	
}
