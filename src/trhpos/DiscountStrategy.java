package trhpos;


public interface DiscountStrategy  {

    double getDiscount(double prodPrice, double qty);
    double getProdPrice();
    double getQty();    
    void setProdPrice(double prodPrice);
    void setQty(double qty);
    
}
