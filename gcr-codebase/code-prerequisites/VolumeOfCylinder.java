import java.util.Scanner;
 class VolumeOfCylinder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int radius;
        int height;
        System.out.println("Enter radius :");
        radius = sc.nextInt();
        System.out.println("Enter height :");
        height  = sc.nextInt();
        System.out.println("volume of cylinder: " + 3.14*radius*radius*height);
    }
 }