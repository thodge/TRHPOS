package trhpos;


public interface OutputReceiptStrategy {
    public abstract void outputReceipt(Customer customer, LineItem[] lineItems);
}
