package encapsulation;

public class Trainer {
	private int id;
	private String name;
	private int password;
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPass() {
		return this.password;
	}
	public void setPass(int password) {
		this.password = password;
	}
	
}
