package trhpos;

public class DiscountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiscountStrategy discount = new PercentageOffDiscount(.10);
        double discountAmt = discount.getDiscount(20.00, 3);
        System.out.println("The discount should be 6.00 " + discountAmt);
    }
    
}
