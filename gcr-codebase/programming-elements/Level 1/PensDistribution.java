public class PensDistribution{
public static void main(String[] args){

	int totalPens = 14;
	int totalStudents = 3;
	
	int penPerStudent = totalPens/totalStudents;
	int nonDistributedPen = totalPens%totalStudents;
	
	System.out.println("The Pen per Student is " + penPerStudent + " and the remaining pen  not  distributed  is " + nonDistributedPen);
}
} 	 	