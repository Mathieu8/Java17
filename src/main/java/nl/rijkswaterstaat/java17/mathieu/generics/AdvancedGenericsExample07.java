package nl.rijkswaterstaat.java17.mathieu.generics;

import java.util.ArrayList;
import java.util.List;

public class AdvancedGenericsExample07 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("a"));
        dogs.add(new Dog("b"));

        Animal animal = new Dog("c");
//        dogs.add(animal);

        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(new Dog("a"));
        animals.add(new Cat("1"));

        List<? extends  Dog> extendsAnimal = new ArrayList<>();
//        extendsAnimal.add(animal);
//        extendsAnimal.add(new Dog("a"));
//        extendsAnimal.add(new Cat("1"));
//        extendsAnimal.add(new Object());

        List<?> questionMark = new ArrayList<>();
//        questionMark.add(animal);
//        questionMark.add(new Object());
//        questionMark.add(new Dog("a"));
//        questionMark.add(new Cat("1"));

        List<? super Dog> superDog = new ArrayList<>();
//        superDog.add(animal);
//        superDog.add(new Object());
//        superDog.add(new Dog("a"));
//        superDog.add(new Cat("1"));

        List<? super Animal> superAnimal = new ArrayList<>();
        superAnimal.add(animal);
//        superAnimal.add(new Object()); // object is
        superAnimal.add(new Dog("a"));
        superAnimal.add(new Cat("1"));
    }
}

interface Animal {}
record Dog(String name) implements Animal {}
record Cat(String name) implements Animal {}
