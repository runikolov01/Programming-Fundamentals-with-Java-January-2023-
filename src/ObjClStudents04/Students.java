package ObjClStudents04;

public class Students {
    private String firstName;
    private String lastName;
    private double grade;

    public Students(String fNameInput, String lNameInput, double gradeInput){
        this.firstName = fNameInput;
        this.lastName = lNameInput;
        this.grade = gradeInput;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getGrade() {
        return this.grade;
    }
}