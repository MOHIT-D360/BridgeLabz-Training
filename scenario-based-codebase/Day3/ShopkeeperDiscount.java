import java.util.Scanner;

public class ShopkeeperDiscount {
    public static void displayMenu(String[][] menu){
        int count =1;
        for(int i=0;i<5;i++){
            for(int j=0;j<1;j++){
               System.out.printf("%d.  %s  :     %s",count,menu[i][0],menu[i][1]);
               System.out.println();
            }
            count ++;
        }
        System.out.println("           Enter 0 for exit         ");
        
    }
  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] menu = new String[5][2]; 
        double totalBill =0;
        boolean  shopStatus = true;

        System.out.println("Enter Items and its price ");
        System.out.println("________________________________________");
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                if(j==0){
                    menu[i][0] = sc.nextLine();
                }
                else{
                    menu[i][1] = sc.nextLine();
                }
            }
        }

       
        while(shopStatus){

        System.out.println("_______________________________________________");
        System.out.println("Enter item number which you want to buy");
        displayMenu(menu);


          int itemNo = sc.nextInt();
          if(itemNo ==0){
            shopStatus= false;
          }
          itemNo = itemNo-1;

          
          if(itemNo <0 && itemNo<5){
            System.out.println("Add valid items ");
          }
          else{

              totalBill += Double.parseDouble(menu[itemNo][1]);
          }

        }

        if(totalBill>=2500){
            System.out.println("Hurrah!!!! you got 10% discount");
            totalBill = totalBill*(0.1);
            System.out.println("Your bill after 10% off :"+totalBill);
        }
        else if(totalBill>=7000){
            System.out.println("Hurrah!!!! you got 30% discount");
             totalBill = totalBill*(0.3);
            System.out.println("Your bill after 30% off :"+totalBill);
        }
        else {
            System.out.println("Your bill  :"+totalBill);
        }


    }
}
