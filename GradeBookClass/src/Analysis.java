import java.util.Scanner;


public class Analysis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int passed = 0;
		int failed = 0;
		int i = 1;
		
		while(i<11){
		System.out.printf("Give me %d student's result\n",i);
		int studentStatus = scan.nextInt();
		if(studentStatus==1){
			failed++;
		} else if (studentStatus==2){
			passed++;
		} else
			System.out.println("Wrong code provided");
		
		i++;
		}
		
		System.out.printf("Number of studetns pass: %d\n",passed);
		System.out.printf("Number of students failed: %d\n", failed);
		System.out.println(passed>=8?"Bonus for the teacher!":"No bonus for the teacher");
	}

}
