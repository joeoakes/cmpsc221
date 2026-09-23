package Week4_5;

class Animal2 {
    String name;
    Animal2(String n) {
        name = n;
    }
}
class MyClass {
    public static void main(String[ ] args) {
        Animal2 a1 = new Animal2("Robby");
        Animal2 a2 = new Animal2("Robby");
        System.out.println(a1 == a2);
    }
}
//Outputs false
