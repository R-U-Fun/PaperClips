//@author Keyasuthan 
package Controller;

import Model.Watch;

public class WatchController {

    Watch WatchObj;

    public Watch addWatch(String WID, String CoustomerName, String CustomerID, String CustomerMail, int Quantity, double WPrice) {
        WatchObj = new Watch(WID, CoustomerName, CustomerID,CustomerMail, Quantity, WPrice);
        return WatchObj;
    }
}
