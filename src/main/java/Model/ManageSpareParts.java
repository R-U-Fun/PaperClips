package Model;

//@author Aaroophan

public class ManageSpareParts {

    public static int[] TotalArr = new int[7];
    String[] SPNameArr = {"Bezel", "Case", "Crown", "Crystle", "Dial", "Hand", "Hour Marker"};

    public int AddAction(String SparePartName, int SPQuantity) {
        for (int L = 0; L < 7; L++) {
            if (SparePartName.equals(SPNameArr[L])) {
                TotalArr[L] = TotalArr[L] + SPQuantity;
                return TotalArr[L];
            }
        }
        return 0;
    }

    public int RemoveAction(String SparePartName, int SPQuantity) {
        for (int L = 0; L < 7; L++) {
            if (SparePartName.equals(SPNameArr[L])) {
                TotalArr[L] = TotalArr[L] - SPQuantity;
                return TotalArr[L];
            }
        }
        return 0;
    }
}
