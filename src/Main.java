import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        dog.sound();
        dog.play();
        System.out.println("\n");
        cat.eat();
        cat.sound();
        cat.play();
    }
}

class Dog implements Animal, Pet{
    public static void main(String[] args) {

    }
    public void eat() {
        System.out.println("Собака ест собачий корм");
    }
    public void sound() {
        System.out.println("Гав");
    }
    public void play() {
        System.out.println("Собака играет с косточко");
    }
}
class Cat implements Animal, Pet{
    public static void main(String[] args) {
    }
    public void eat() {
        System.out.println("Кот ест кошачий корм");
    }
    public void sound() {
        System.out.println("Мяу");
    }
    public void play() {
        System.out.println("Котик играет с лазерной указкой");
    }
}
