package ExamplePro1;


public class Students extends HelloAj{

	public Students(String name, int roll) {
		super(name, roll);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		HelloAj ht=new Students("Ajay", 110);
		System.out.println(ht.getRoll()+" "+ht.getName());
	}

}
