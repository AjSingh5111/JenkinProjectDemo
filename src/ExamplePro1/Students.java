package ExamplePro1;

class HelloAj {
	private String name;
	private int roll;
	
	public HelloAj(String name, int roll) {
		this.name=name;
		this.roll=roll;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "HelloAj [name=" + name + ", roll=" + roll + "]";
	}
	
}

public class Students {

	public static void main(String[] args) {
		
		HelloAj ht=new HelloAj("Ajay", 101);
		System.out.println(ht.getRoll()+" "+ht.getName());
	}

}
