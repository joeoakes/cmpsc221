package week4;

public class Program30 {
    public static void main(String[ ] args) {
      int retInt = max(1, 3);
      System.out.println(retInt);
      double retDouble = max(1.0, 3.0);
      System.out.println(retDouble);
    }
    static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    static double max(double a, double b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
}
