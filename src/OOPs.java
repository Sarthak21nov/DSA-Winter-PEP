// Abstraction

abstract class Animal {
    abstract void Sound();
    void props(){
        System.out.println("Animal Sleeps");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Dog Barks");
    }
}

public class OOPs {
    public static void main(String[] args) {
        Animal d1 = new Dog();
//        Animal a2 = new Animal();   We Cannot instantiate Abstract class
        d1.Sound();
        d1.props();
    }
}
