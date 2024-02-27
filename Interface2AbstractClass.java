package interfacePkg;

interface Bird{
	void fly();
}

interface Animal extends Bird{
	void eat();
}
abstract class Habit implements Animal{
	abstract void animalHabit();
	abstract void birdHabit();
}

public class Interface2AbstractClass extends Habit{

	public static void main(String[] args) {
		System.out.println("Assignment 51: create class andabstract class and 2 interfaces. Class extends abstract class"
				+ "abstract class implements interface2 and interface2 extends interface1");
		
		Interface2AbstractClass is=new Interface2AbstractClass();
		is.animalHabit();
		is.birdHabit();
		is.eat();
		is.fly();
	}

	public void eat() {
		System.out.println("Animal interface method");
	}

	public void fly() {
		System.out.println("Bird interface method");
	}
	
	void animalHabit() {
		System.out.println("abstract class habit: animalHabit method");
	}

	void birdHabit() {
		System.out.println("abstract class habit: birdHabit method");
	}

}
