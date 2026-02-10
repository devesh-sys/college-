import java.util.Scanner;
public class InsurancePremiumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String buildingType = sc.nextLine().trim();
        double amountInsured = sc.nextDouble();
        int claims = sc.nextInt();
        double premiumRate = 0.0;
        double processingCharge = 0.0;
        double discountRate = 0.0;
        if (buildingType.equalsIgnoreCase("Domestic")) {
            processingCharge = 50;
            if (amountInsured < 100000) {
                premiumRate = 0.003; 
            } else {
                premiumRate = 0.0025;
            }
            if (claims == 0) {
                discountRate = 0.10; 
            }
        } else if (buildingType.equalsIgnoreCase("Commercial")) {
            processingCharge = 80;
            if (amountInsured < 250000) {
                premiumRate = 0.005;   
            } else {
                premiumRate = 0.0075;  
            }
            if (claims == 0) {
                discountRate = 0.15;  
            }
        }
        double basePremium = amountInsured * premiumRate;
        double totalBeforeDiscount = basePremium + processingCharge;
        double discount = totalBeforeDiscount * discountRate;
        double finalPremium = totalBeforeDiscount - discount;
        System.out.printf("%.2f", finalPremium);
        sc.close();
    }
}

