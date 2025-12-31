import java.util.Scanner;
public class ParkingSystem {
    public static void parkingLot(int parkingCapacity){
        Scanner sc = new Scanner(System.in);
        //park exit show
       
        boolean exit = true;

        while(parkingCapacity!=0 && exit){
        System.out.println("Enter 1 :    parking");
        System.out.println("Enter 2 :    exit");
        System.out.println("Enter 3 :    showing vacant space");
            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    parkingCapacity= parkingCapacity-1;
                    System.out.println("Successfully parked");
                    break;
                }
                    
                case 2:{
                    exit = false;
                    break;
                }
                case 3:{
                    System.out.println("Number of vacant seat is :"+parkingCapacity);
                    break;
                }
            
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to parking lots !");
        int parkingCapacity =10;
        parkingLot(parkingCapacity);


    }
}
