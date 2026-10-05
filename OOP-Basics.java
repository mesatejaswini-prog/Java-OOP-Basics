class Student {
    void display() {
        System.out.println("Student object created");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
OUTPUT:
Student object created
  

class Student {

    Student() {
        System.out.println("Constructor called");
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Student s = new Student();
    }
}

Output:

Constructor called


class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum of two numbers: " + c.add(10, 20));
        System.out.println("Sum of three numbers: " + c.add(10, 20, 30));
    }
}

Output:

Sum of two numbers: 30
Sum of three numbers: 60



class Student {

    Student() {
        System.out.println("Default constructor");
    }

    Student(String name) {
        System.out.println("Name: " + name);
    }

    Student(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Rahul");
        Student s3 = new Student("Rahul", 20);
    }
}

Output:

Default constructor
Name: Rahul
Name: Rahul
Age: 20



class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}

Output:

Animal is eating
Dog is barking



class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {

    void play() {
        System.out.println("Puppy is playing");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
    }
}

Output:

Animal is eating
Dog is barking
Puppy is playing


class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}

Output:

Animal is eating
Dog is barking
Animal is eating
Cat is meowing



class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}

Output:

Dog barks



abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}

Output:

Dog barks
Animal is eating


interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}

Output:

Dog barks
