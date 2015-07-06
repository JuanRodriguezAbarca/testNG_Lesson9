import java.io.ObjectInputStream.GetField;
import java.util.Scanner;


public class GradeBookTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		GradeBook gradeBook1 = new GradeBook(
				"CS101 Introduction to Java Programming");
//		GradeBook gradeBook2 = new GradeBook("Second course", "Juanito Chaparron");
		System.out.println("gradeBook1 name is:"+gradeBook1.getCourseName());
		
		
//		System.out.println("gradeBook2 name is:"+gradeBook2.getCourseName()+
//				". And insturctor is: "+gradeBook2.getInstructorName());
//
//		
//		System.out.println("Please, enter the course name");
//		gradeBook1.setCourseName(scan.nextLine());
//		gradeBook1.dispalyMessage();
		
		gradeBook1.dispalyMessage();
		gradeBook1.inputGrades();
		gradeBook1.displayGradeReport();
		
//TODO page 130!!!
		
	}
	
	

}
