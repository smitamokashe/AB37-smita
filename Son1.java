package inheritanceAssignment;

public class Son1 extends Parent1 {
	
	void multiply() {
		System.out.println("Son class multiply method");
	}

	public static void main(String[] args) {
		System.out.println("Assignment 47: write a program for hierarchical inheritance and create three separate "
				+ "classes(son, daughter, parent) ");
		Son s1=new Son();
		s1.multiply(); 				//Son1 class multiply method
		s1.add(); 						//Parent1 class add method
		
		//just for output refernce
		Daughter1 d1=  new Daughter1();				//daughter1 class object
		d1.subtract();														//daughter1 class subtract method
		d1.add(); 																	//Parent1 class add method with daughter1 class

	}

}
