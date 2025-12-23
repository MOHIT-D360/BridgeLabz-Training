import java.util.Scanner;

public class Calender {
    public static String monthNameFinder(int monthNum){
        String[] monthNames = {"Jan","Feb","Mar","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        return monthNames[monthNum-1];
    }
    public static int getDaysInMonth(int month,int year){
        int days =0;
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days =31;
                break;
            case 4: case 6: case 9: case 11:
                days =30;
                break;
            case 2:
                if((year %4 ==0 && year %100 !=0) || (year %400 ==0)){
                    days =29;
                }else{
                    days =28;
                }
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
        System.out.println("Days in month: "+days);
        return days;
    }
    public static int getFirstDayOfMonth(int month,int year){
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number:");
        int month = sc.nextInt();   
        System.out.println("Enter year:");
        int year = sc.nextInt();

        String monthName =  monthNameFinder(month);
        // System.out.println(monthName);
        int daysInMonth = getDaysInMonth(month,year);
        // System.out.println(daysInMonth);
        int firstDayOfMonth = getFirstDayOfMonth(month,year);
        // System.out.println("First day of month (0=Sun,1=Mon,...6=Sat): "+firstDayOfMonth);
        System.out.println("   "+monthName+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i=0;i<firstDayOfMonth;i++){
            System.out.print("   ");
        }
        for(int day=1;day<=daysInMonth;day++){
            System.out.printf("%3d ",day);
            if((day + firstDayOfMonth) %7 ==0){
                System.out.println();
            }
        }
    }
}
