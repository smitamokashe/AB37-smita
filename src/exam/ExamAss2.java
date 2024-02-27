package exam;

public class ExamAss2 {

	public static void main(String[] args) {
		int marks=60;
		char grade='B';
		if(marks>65) {
			if(grade=='c') {
				System.out.println("Eligible for admission");
			}
			else {
				System.out.println("Try next year");
				if(marks>=65) {
					System.out.println("Please come for admission");
				}
				else {
					System.out.println("Do not come for admission");
				}
			}
		}
		else {
			System.out.println("you are not eligible for admission");
		}
	}

}
