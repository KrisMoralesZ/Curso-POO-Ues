package ues;

public class Animal {
    private String name;
    private int age;
    private String breed;

    static void eat(Animal animal) {}
    static void sleep(Animal animal) {}
    static void sound(Animal animal) {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
