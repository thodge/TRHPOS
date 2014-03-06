package trhpos;

public class CashRegister {

    //receipt..pass in the storage strategy in start new sale, then passed to receipt
     
    private Receipt receipt;

    public void startNewSale(String customerId, DataStorageStrategy db, OutputReceiptStrategy output) {
        receipt = new Receipt(customerId, db, output);
    }

    public void addItemToSale(String productId, int qty) {
        receipt.addLineItem(productId, qty);
    }

    public void endSaleAndOutputReceipt() {
        receipt.outputReceipt();
    }

}
