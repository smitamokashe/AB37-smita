package stringFunctions;

public class Replace_string {

	public static void main(String[] args) {
		System.out.println("WAP 72: Take string s1=Abhishek, i)replace A with blank space. ii)replace A with a iii)Print string twice ");
		String s1="Abhishek";
		System.out.println("Abhishek will print twice." +s1.repeat(2));
		System.out.println("A will be replaced by space: " +s1.replaceAll("A", ""));
		System.out.println("A will be replaced by a: " +s1.replaceAll("A", "a"));
		
		System.out.println("WAP 73: i)Take string s1=I love my country, replace single space with multiple space");
		String s2="I love my country";
		System.out.println(s2.replaceAll("space: " +" ", "    "));
		
		System.out.println("WAP 74: i)Take alphanumeric string s1=smita123, i)Print only numbers. ii)Print only alphabets");
		String s3="smita123";
		System.out.println(s3);
		System.out.println("It will print only numbers:  " +s3.replaceAll("[a-z]", ""));
		System.out.println("It will print only name: "+s3.replaceAll("[0-9]", ""));
		
		System.out.println("WAP 75: i)Take string s1=My Name Is Smita, i)Print only capital letters as M N I S. ii)Remove sapce as MNIS");
		String s4="My Name Is Smita ";
		System.out.println(s4);
		String s5=s4.replaceAll("[a-z]", "");
		System.out.println("Only capital letters will print:  "+s5);
		System.out.println("It will remove in between space :  "+s5.replaceAll(" ", ""));
		
		System.out.println("WAP 76: i)Take combined capital and small letter string s1=SmItAnVi, i)Print only capital letters . ii)Print only small letters iii)Store output string  ");
		String s6="SmItAnVi";
		System.out.println(s6);
		String s7=(s6.replaceAll("[a-z]", ""));
		System.out.println("All capital letter: " +s7);
		String s8=(s6.replaceAll("[A-Z]", ""));
		System.out.println("All small letter: " +s8);
	}
}