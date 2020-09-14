public class Student {
    // instance variables -> attributes
    private String name;
    private int gradeLevel;
    private double GPA;

    // constructors
    // job of a constructor -> initialize instance variables
    // no-argument constructor
    public Student() {
        name = "Default Name";
        gradeLevel = 9;
        GPA = 2.0;
    }

    // parameterized constructor
    public Student(String nameInput, int gradeLevelInput, double GPAInput) {
        name = nameInput;
        gradeLevel = gradeLevelInput;
        GPA = GPAInput;
    }

    // methods -> actions
    // getter methods (accessors)
    public String getName() { return name; }
    public int getGradeLevel() { return gradeLevel; }
    public double getGPA() { return GPA; }

    // toString() method
    public String toString() {
        return name + " (" + gradeLevel + ") - " + GPA;
    }

    // void-void method
    public void promoteGrade() { gradeLevel++; }

    // value-void method
    // setter method (mutator)
    public void updateGPA(double newGPA) { GPA = newGPA; }

    // value-value method
    public boolean compareGPATo(double otherGPA) {
        if (GPA > otherGPA) {
            return true;
        } else {
            return false;
        }
    }

}
