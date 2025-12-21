import java.util.Scanner;

public class YoungestTallestFriend {
    public static void findYoungest(int[] ages){
        int youngest = ages[0];
        for(int i=1;i<ages.length;i++){
            if(ages[i] < youngest){
                youngest = ages[i];
            }
        }
        System.out.println("The youngest age is: " + youngest);
        
    }

    public static void findTallest(double[] heights){
        double tallest = heights[0];
        for(int i=1;i<heights.length;i++){
            if(heights[i] > tallest){
                tallest = heights[i];
            }
        }
        System.out.println("The tallest height is: " + tallest);
        
    }

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    int[] ages = new int[3];
    double[] heights = new double[3];

    for(int i=0;i<ages.length;i++){
        System.out.print("Enter the age of friend "+i+": ");
        ages[i] = sc.nextInt();
    }
    for(int i=0;i<heights.length;i++){
        System.out.print("Enter the height of friend "+i+": ");
        heights[i] = sc.nextDouble();
    }

    findYoungest(ages);
    findTallest(heights);

    }

}
