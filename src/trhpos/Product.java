package trhpos;

/**
 *
 * @author Tammie
 */
public class Product {

    private double price;
    private String description;
    private String productId;
    private DiscountStrategy discount;

    public Product(double price, String description, String productId, DiscountStrategy discount) {
        setPrice(price);
        setDescription(description);
        setProductId(productId);
        setDiscount(discount);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }    
        @Override
    public String toString() {
        return "Product{" + "price=" + price + ", description=" + description + ", productId=" + productId + ", discount=" + discount.getDiscount(price,2) + '}';
    }
    public static void main(String[] args) {
        Product product = new Product(10, "Dog Collar", "B22", new DollarOffDiscount(9));
        System.out.println(product.toString());
    }



}
