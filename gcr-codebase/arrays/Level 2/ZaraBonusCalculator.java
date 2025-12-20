import java.util.Scanner;

public class ZaraBonusCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int EMPLOYEES = 10;


        double[] salary = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;


        for (int i = 0; i < EMPLOYEES; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            double years = sc.nextDouble();

            
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input Please enter again.");
                i--; 
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        for (int i = 0; i < EMPLOYEES; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
		
        System.out.println("Total Old Salary  : " + totalOldSalary);
        System.out.println("Total Bonus Paid  : " + totalBonus);
        System.out.println("Total New Salary  : " + totalNewSalary);

       
    }
}
