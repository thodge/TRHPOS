package trhpos;

public class Receipt {

    //has a customer, line item array
    private Customer customer;
    private LineItem[] lineItems;
    private static int receiptNo = 0;
    private DataStorageStrategy db;
    private OutputReceiptStrategy outputReceiptConsole;

    
    public Receipt(String customerId, DataStorageStrategy db, OutputReceiptStrategy outputReceiptConsole) {//put db strategy in there...be flexible 
        this.setDb(db);
        this.outputReceiptConsole = outputReceiptConsole;
        this.customer = findCustomer(customerId);
        receiptNo++;
        lineItems = new LineItem[0];
    }

    public DataStorageStrategy getDb() {
        return db;
    }

    public void setDb(DataStorageStrategy db) {
        this.db = db;
    }
    

    private Customer findCustomer(String customerId) {
        return db.findCustomer(customerId);
    }

    public void addLineItem(String productId, int qty) {
        LineItem item = new LineItem(db, productId, qty);
        addToArray(item);
    }

    private void addToArray(final LineItem item) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    public final void outputReceipt() {
        final String CRLF = "\n";
        final String CRLF2 = "\n\n";
        
        // Build header
        StringBuilder receiptData = new StringBuilder("Thank you for shopping at Kohls!\n\n");
        receiptData.append("Sold to: ").append(customer.getName()).append(CRLF);
        receiptData.append("Receipt No.: " ).append(Receipt.receiptNo).append(CRLF2);
        
        // Now process line items
        receiptData.append("ID\tItem\t\t\tPrice\tQty\tSubtotal\tDiscount").append(CRLF);
        receiptData.append("------------------------------------------------------------------------").append(CRLF);
        for(LineItem item : lineItems) {
            receiptData.append(item.getProduct().getProductId()).append("\t");
            receiptData.append(item.getProduct().getDescription()).append("\t");
            receiptData.append(item.getQty()).append("\t");

        }
        

        outputReceiptConsole.outputReceipt(receiptData.toString());
    }
    /**
     * Sets and validates the output strategy.
     * @param output - the designated output strategy option. 
     * @throws IllegalArgumentException if output is null or not a valid
     * option
     */
    public void setOutput(OutputReceiptStrategy output) {
        if(output == null) {
            throw new IllegalArgumentException("Error");
        }
        this.outputReceiptConsole = output;
    }    
    
}
