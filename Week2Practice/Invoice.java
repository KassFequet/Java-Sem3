package Week2Practice;

public class Invoice {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    private static int invoiceCount = 0;

    public Invoice(String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
        invoiceCount++;
    }

    public Invoice(Invoice other) {
        this.id = other.id;
        this.desc = other.desc;
        this.qty = other.qty;
        this.unitPrice = other.unitPrice;
        invoiceCount++;
    }


    public static int InvoiceCount() {
        return invoiceCount;
    }

    public String getID() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return this.qty * this.unitPrice;
    }

    public String toString() {
        return "Invoice ID: " + id + " Desc: " + desc + " Qty: " + qty + " Unit Price: " + unitPrice + " Total: " + getTotal();
    }
}
