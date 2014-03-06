package trhpos;

public class LineItem {

    //has product
    private DataStorageStrategy db;
    private Product product;
    private int qty;

    public LineItem(DataStorageStrategy db, String productId, int qty) {
        setDb(db);
        this.product = findProduct(productId);
        setQty(qty);
    }

    private final Product findProduct(final String productId) {
        // validation needed
        return db.findProduct(productId);
    }

    public DataStorageStrategy getDb() {
        return db;
    }

    public void setDb(DataStorageStrategy db) {
        this.db = db;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}
