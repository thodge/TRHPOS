package trhpos;

public class PercentageOffDiscount implements DiscountStrategy {
    private double percentageOff = .30;
    private double prodPrice;
    private double qty;
    
    public PercentageOffDiscount(double percentageOff){
        setPercentageOff(percentageOff);
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
        return prodPrice * qty * percentageOff;
    }

  
    public double getPercentageOff() {
        return percentageOff;
    }

   
    public void setPercentageOff(double percentageOff) {
        if(percentageOff < 0){
            System.out.println("Need valid percentage off");
        }
        this.percentageOff = percentageOff;
    }



    
    
    
}
