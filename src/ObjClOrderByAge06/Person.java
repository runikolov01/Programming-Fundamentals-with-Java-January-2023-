package ObjClOrderByAge06;

public class Person {
    private String name;
    private int id;
    private int age;

    public Person(String nameInput, int idInput, int ageInput){
        this.name = nameInput;
        this.id = idInput;
        this.age = ageInput;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}
