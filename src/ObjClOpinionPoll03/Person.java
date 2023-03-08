package ObjClOpinionPoll03;

public class Person {
    private String name;
    private int age;

    // constructor: метод, чрез който създаваме обекти от клас, винаги е публичен
    public Person(String nameInput, int ageInput) {
        this.name = nameInput;
        this.age = ageInput;
    }

    //getters -> методи, които ни дават коя е стойността срещу съответното поле
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
