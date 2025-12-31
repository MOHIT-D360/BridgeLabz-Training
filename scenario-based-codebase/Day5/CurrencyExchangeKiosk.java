public class CurrencyExchangeKiosk {
    public static void main(String[] args) {
//         18. Currency Exchange Kiosk 💱
// Design a currency converter:
// ● Take INR amount and target currency.
// ● Use a switch to apply the correct rate.
// ● Ask if the user wants another conversion (do-while).
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String continueChoice = "";
        do {
            System.out.println("Enter amount in INR:");
            double inrAmount = sc.nextDouble();
            System.out.println("Select target currency (USD, EUR, GBP, JPY):");
            String targetCurrency = sc.next().toUpperCase();
            double convertedAmount = 0.0;

            switch (targetCurrency) {
                case "USD":
                    convertedAmount = inrAmount * 0.013; 
                    break;
                case "EUR":
                    convertedAmount = inrAmount * 0.011; 
                    break;
                case "GBP":
                    convertedAmount = inrAmount * 0.0095; 
                    break;
                case "JPY":
                    convertedAmount = inrAmount * 1.5; 
                    break;
                default:
                    System.out.println("Unsupported currency.");
                    continue;
            }

            System.out.printf("Converted amount: %.2f %s%n", convertedAmount, targetCurrency);
            System.out.println("Do you want another conversion? (yes/no):");
            continueChoice = sc.next().toLowerCase();
        } while (continueChoice.equals("yes"));

        
    }
}
