package trhpos;

/**
 *
 * @author Tammie
 */
public class DollarOffDiscount implements DiscountStrategy {
    private double dollarsOff;
    private double prodPrice;
    private double qty;
    
    public DollarOffDiscount(double dollarsOff){
        setDollarsOff(dollarsOff);       
        
    }

    @Override
    public double getProdPrice() {
        return prodPrice;
    }

    @Override
    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    @Override
    public double getQty() {
        return qty;
    }

    @Override
    public void setQty(double qty) {
        this.qty = qty;
    }
      
    
    @Override
    public double getDiscount(double prodPrice, double qty){
        return (prodPrice * qty) - dollarsOff;
    }


    private void setDollarsOff(double dollarsOff) {
        if(dollarsOff < 0){
            System.out.println("Need valid discount");
        }
            this.dollarsOff = dollarsOff;
    }
    
    
    
}
