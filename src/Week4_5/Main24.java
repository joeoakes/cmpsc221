package Week4_5;

//anonymous inner class

public class Main24{
   public static void main(String[ ] args) {
    Machine m = new Machine() {
        @Override public void start() {
            System.out.println("Wooooo");
        }
    };
    m.start(); //Outputs "Wooooo";
   }
}