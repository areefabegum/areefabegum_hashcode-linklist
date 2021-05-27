interface Animal{
	void speak();
}
class Tiger implements Animal{
	private static String name="Tiger";
	public void speak() {
		System.out.println(name+" says Halum-Halum");
	}
}
class Duck implements Animal{
	private static String name="Duck";
	public void speak() {
		System.out.println(name+" says Pack-pack");
	}
}
public class FactoryMethod {
	public Animal animalFactory(String animal) {
		Animal ob=null;
		if(animal=="Duck")
			ob=new Duck();
		else if(animal=="Tiger")
			ob=new Tiger();
		return ob;
	}
	public static void main(String[] args) {
		FactoryMethod f=new FactoryMethod();
		Animal duck=f.animalFactory("Duck");
		duck.speak();
		Animal tiger=f.animalFactory("Tiger");
		tiger.speak();
	}

} 
