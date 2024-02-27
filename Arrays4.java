package arraysPkg;

public class Arrays4 {

	public static void main(String[] args) {
		int rollno []=new int[3];
		String name []=new String[3];
		double salary [] =new double[3];
		
		rollno[0]=1235;
		name[0]="Smita";
		salary[0]=128543.5;
		
		rollno[1]=1236;
		name[1]="Anvi";
		salary[1]=1844443.9;
		
		rollno[2]=1232;
		name[2]="Amol";
		salary[2]=1784444.9;
		
		for(int i=0;i<3;i++) {
			System.out.println(name[i]+rollno[i]+salary[i]);
			//System.out.println(rollno[i]);
			//System.out.println(salary[i]);
		}

	}

}
