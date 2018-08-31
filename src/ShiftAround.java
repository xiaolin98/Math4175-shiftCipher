import java.util.HashMap;
import java.util.Scanner;

public class ShiftAround {
// public void Main() {
// Scanner un = new Scanner(System.in);
// // un is just a random variable you can choose any other variable name
// // if you want
// System.out.println("Enter Your string in capical letter: ");
// String str = un.next();
// solve(str);
// }

    public static void solve(String str) {
        HashMap<String, Integer> myMapl = new HashMap<String, Integer>();
        String cha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int x = 0; x <= 25; x++) {
            myMapl.put(cha.substring(x, x + 1), x);
            // System.out.print(cha.substring(x, x + 1));
            // System.out.println(myMapl.get(cha.substring(x, x + 1)));
        }

        HashMap<Integer, String> myMapn = new HashMap<Integer, String>();
        String chan = "abcdefghijklmnopqrstuvwxyz";
        for (int x = 0; x <= 25; x++) {
            myMapn.put(x, chan.substring(x, x + 1));
            // System.out.print(x);
            // System.out.println(myMapn.get(x));
        }

        for (int n = 0; n <= 25; n++) {
            int num = 0;
            for (int y = 0; y < str.length(); y++) {
                num = myMapl.get(str.substring(y, y + 1)) + n;
                if (num > 25) {
                    num = num - 26;
                }

                if (y == str.length() - 1) {
                    num = myMapl.get(str.substring(y, y + 1)) + n;
                    if (num > 25) {
                        num = num - 26;
                    }
                    System.out.println(myMapn.get(num));
                }
                else {
                    System.out.print(myMapn.get(num));
                }
            }
        }

    }

}
