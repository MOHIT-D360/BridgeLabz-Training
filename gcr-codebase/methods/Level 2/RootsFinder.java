import java.util.Scanner;

public class RootsFinder {

    public static double delta(int a , int b ,int c){

        double D = (b*b) + (4*a*c);
        return D;
    }
    public static double[]  quadraticFinder(int a,int b ,int c){
        double tempRoots[] = new double[2];
        double D = delta(a,b,c);
        if(D>0){
            tempRoots[0] = (-b + Math.sqrt(D))/(2*a);
            tempRoots[1] = (-b - Math.sqrt(D))/(2*a);
        }
        else if(D==0){
            tempRoots[0] = -b/(2*a);
            
        }
        else{
            
            return tempRoots;
        }
        return tempRoots;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficients a, b and c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double[] roots = new double[2];
        roots = quadraticFinder(a,b,c);
        System.out.println("Roots are : " + roots[0] + " and " + roots[1]);

    }
}
