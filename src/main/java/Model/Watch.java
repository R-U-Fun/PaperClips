//@author Keyasuthan 
package Model;

public class Watch {

    private String WID;
    private String CoustomerName;
    private String CustomerID;
    private String CustomerMail;
    private int Quantity;
    private double WPrice;
    private double Total;

    public Watch(String WID, String CoustomerName, String CustomerID, String CustomerMail, int Quantity, double WPrice) {
        this.WID = WID;
        this.CoustomerName = CoustomerName;
        this.CustomerID = CustomerID;
        this.CustomerMail = CustomerMail;
        this.Quantity = Quantity;
        this.WPrice = WPrice;
    }

    public double CalTotal() {
        Total = this.WPrice * this.Quantity;
        return Total;
    }

    public String getWID() {
        return WID;
    }

    public void setWID(String WID) {
        this.WID = WID;
    }

    public String getCoustomerName() {
        return CoustomerName;
    }

    public void setCoustomerName(String CoustomerName) {
        this.CoustomerName = CoustomerName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerMail() {
        return CustomerMail;
    }

    public void setCustomerMail(String CustomerMail) {
        this.CustomerMail = CustomerMail;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getWPrice() {
        return WPrice;
    }

    public void setWPrice(double WPrice) {
        this.WPrice = WPrice;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    @Override
    public String toString() {
        return "Watch{" + "WID=" + WID + ", CoustomerName=" + CoustomerName + ", CustomerID=" + CustomerID + ", Quantity=" + Quantity + ", WPrice=" + WPrice + ", Total=" + Total + '}';
    }

    
}
