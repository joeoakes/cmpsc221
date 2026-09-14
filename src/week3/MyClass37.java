package week3;

public class MyClass37 {
    public static void main(String[] args) {
        for(int x=1; x<=4; x=x+1) {
            if(x == 3) {
                continue;
            }
            System.out.println(x);
        }
    }
}