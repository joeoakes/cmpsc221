package week4;

class Cat extends Animal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
        cat.legs = 3;
    }
    public void makeSound() {
        System.out.println("Meow");
    }
}

