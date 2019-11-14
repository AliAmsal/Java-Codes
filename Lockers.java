public class Lockers
{
    public static void main(String[] args) {
        int[] LockerNum = new int[101];
        String[] LockerStatus = new String[101];
        for (int i = 1; i <= 100; ++i) {
            LockerStatus[i] = "OPEN";
        }
        for (int j = 2; j <= 100; j++) {
            for (int k = 1; k <= 100; k++) {
                if (k % j == 0) {
                    if (LockerStatus[k] == "OPEN") {LockerStatus[k] = "CLOSE";}
                    else {LockerStatus[k] = "OPEN";}
                }
            }
        }
        for (int i = 1; i <= 100; i++) {
            if (LockerStatus[i] == "OPEN") {
                System.out.println("Locker " + i + "  " + LockerStatus[i]);
            }
        }
    }
}