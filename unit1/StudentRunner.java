public class StudentRunner {
    public static void main(String[] args) {
        Student myStudent = new Student("Joe Marauder", 9, 3.99);
        System.out.println(myStudent);

        Student myOtherStudent = new Student();
        System.out.println(myOtherStudent);
        myOtherStudent.promoteGrade();
        System.out.println("Grade: " + myOtherStudent.getGradeLevel());
        myOtherStudent.updateGPA(4.7);
        System.out.println(myOtherStudent.compareGPATo(4.9));
        System.out.println(myOtherStudent.compareGPATo(4.7));
        System.out.println(myOtherStudent.compareGPATo(1.9));

    }
}
