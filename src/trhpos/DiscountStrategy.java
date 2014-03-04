package trhpos;


public interface DiscountStrategy  {

    public abstract double getDiscount(double prodPrice, double qty);
    public abstract double getProdPrice();
    public abstract double getQty();    
    public abstract void setProdPrice(double prodPrice);
    public abstract void setQty(double qty);
    
}
