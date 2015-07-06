import java.util.Scanner;

public class GradeBook {
	
	Scanner scan = new Scanner(System.in);

	private String courseName;
	private String instructorName;
	private int total;
	private int gradeCounter;
	private int aCount;
	private int bCount;
	private int cCount;
	private int dCount;
	private int fCount;

	public GradeBook(String courseName) {
		this.courseName = courseName;
	}

	public GradeBook(String courseName, String instructorName) {
		this.courseName = courseName;
		this.instructorName = instructorName;
	}

	public void dispalyMessage() {
		System.out.printf("Welcome to the Grade Book for %s!\n", getCourseName());
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	public void inputGrades(){
	
		int grade=0;
		double average;
		
		System.out.printf("%s\n%s\n	%s\n	%s\n",
				"Enter the integer grades in the range 0-100",
				"Type the end-of-file indicater to terminate input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
				"On Windows type <Ctr> z then press Enter");
		
		while (scan.hasNext() ){
			grade=scan.nextInt();
			total += grade;
			++gradeCounter;
//			System.out.println("Please, enter grade or -1 to quit");
			
			incrementLetterGradeCounter(grade);
			
			}
		}
	
	private void incrementLetterGradeCounter(int grade){
		
		switch(grade/10){
		
		case 9: 
		case 10:
			++aCount;
			break;
			
		case 8:
			++bCount;
			break;
			
		case 7:
			++cCount;
			break;
			
		case 6:
			++dCount;
			break;
			
		default:
			++fCount;
			break;

		}
	}
	
	public void displayGradeReport(){
		System.out.println("\nGrade Report: ");
		
		if(gradeCounter !=0){
			double average = (double) total/gradeCounter;
			
			System.out.printf("Total of the %d grades entered is %d\n",
					gradeCounter, total);
			System.out.printf("Class average is %.2f\n",average);
			System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
					"Number of students who received each grade:",
					"A: ",aCount,
					"B: ",bCount,
					"C: ",cCount,
					"D: ",dCount,
					"F: ",fCount);
		}
	}

}
