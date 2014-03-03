package trhpos;


public class DatabaseStorage implements DataStorageStrategy{
    private Customer[] customers = {
        new Customer("100", "Belle"),
        new Customer("200", "Ariel"),
        new Customer("300", "Calliou")
    };
    
    Product[] products = {
        new Product(19.95, "Sea shell", "B100", new DollarOffDiscount()),
        new Product( 35.50, "Men's Tool Belt", "A304", new DollarOffDiscount()),
        new Product(9.50, "Book", "I222", new PercentageOffDiscount())
    };
    
    public Customer findCustomer(String customerId) {
        Customer customer = null;
        for(Customer c : customers) {
            if(customerId.equals(c.getCustomerId())) {
                customer = c;
                break;
            }
        }
        
        return customer;
    }
    
    public Product findProduct(String productId) {
        Product product = null;
        for(Product p : products) {
            if(productId.equals(p.getProductId())) {
                product = p;
                break;
            }
        }
        
        return product;
    }
    
}
