package trhpos;

public class Receipt {

    //has a customer, line item array
    private Customer customer;
    private LineItem[] lineItemArray;
    private static int receiptNo = 0;
    private DataStorageStrategy db = new DatabaseStorage();
    private OutputReceiptStrategy output = new OuputReceiptToConsole();

    public Receipt(String customerId) {
        this.customer = findCustomer(customerId);
        receiptNo++;
        lineItemArray = new LineItem[0];
    }

    private Customer findCustomer(String customerId) {
        return db.findCustomer(customerId);
    }

    public void addLineItem(String prodId, int qty) {
        LineItem item = new LineItem(prodId, qty);
        addToArray(item);
    }

    private void addToArray(LineItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void outputReceipt() {
        output.outputReceipt(customer, lineItems);
    }
}
