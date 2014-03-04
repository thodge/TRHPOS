package trhpos;

public class CashRegister {

    //has a storage strategy, receipt
    
        
    
    
    
    
    
    private Receipt receipt;

    public void startNewSale(String customerId) {
        receipt = new Receipt(customerId);
    }

    public void addItemToSale(String productId, int qty) {
        receipt.addLineItem(productId, qty);
    }

    public void endSaleAndOutputReceipt() {
        receipt.outputReceipt();
    }

}
