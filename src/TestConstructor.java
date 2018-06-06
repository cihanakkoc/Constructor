
public class TestConstructor {
	
	
	public static void main(String[] args) {
		Kangal kangal = new Kangal();
		System.out.println("It's Main :)");
	}
}

class Animal {
	public Animal()
	{
		System.out.println("Animal inline !");
	}
}

class Dog extends Animal {
	public Dog() 
	{
		System.out.println("Dog inline !");
	}
}

class Kangal extends Dog {
	public Kangal()
	{
		
	}
}

