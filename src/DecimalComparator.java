public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double y, double z) {
        y=(int)(y * 1000);
        z=(int)(z * 1000);

        if (y == z){
            return true;
        } else {
            return false;
        }
    }
}
