import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Management {
    private static Scanner sc = new Scanner(System.in);
    private static Vector<Student> students = new Vector<>();

    public void addCollegeStudent(int loop){
        for(int i = 0; i < loop; i++){
            CollegeStudent student = new CollegeStudent();
            student.Input();
            students.add(student);
        }
    }
    public void addUniversityStudent(int loop2){
        for (int i = 0; i < loop2; i++) {
            UniversityStudent student = new UniversityStudent();
            student.Input();
            students.add(student);
        }
    }

    public void printStudentList(){
        System.out.println(" Student List");
        for(Student student : students){
            System.out.println();
            System.out.println("System: " + student.getClass().getSimpleName());
            System.out.println("Full Name: " + student.getStudentFullName());
            System.out.println("Student Number: " + student.getStudentNumber());
            System.out.println();
        }
    }

    public void eligibleCheck(){
        int counter = 0;
        System.out.println("Students eligible for graduation: ");
        for(Student student : students){
            if (student.CheckGraduation()){
                System.out.println(student.getStudentFullName());
                counter++;
            }
        }
        System.out.println("Number of students eligible: " + counter);
    }

    public void removeStudent(String code){
        students.removeIf(student -> student.getStudentNumber().equals(code));
    }

    public void sortStudentList() {
        students.sort(Comparator.comparing((Student student) -> student.getClass().getSimpleName())
                .thenComparing(Student::getStudentNumber));
    }

    public void findByName(String name){
        for(Student student : students){
            if(student.getStudentFullName().contains(name)){
                System.out.println(student.getStudentFullName() + " " + student.getStudentNumber());
            }
        }
    }


    //RANDOM
    public void addRandomCollegeStudent(String fullName, String number, int totalCredits, double averageScore, double graduationExamScore) {
        CollegeStudent student = new CollegeStudent();
        student.setStudentFullName(fullName);
        student.setStudentNumber(number);
        student.setCredits(totalCredits);
        student.setAvgScore(averageScore);
        student.setGraduateScore(graduationExamScore);
        students.add(student);
    }

    public void addRandomUniversityStudent(String fullName, String number, int totalCredits, double averageScore, String thesisName, double thesisScore) {
        UniversityStudent student = new UniversityStudent();
        student.setStudentFullName(fullName);
        student.setStudentNumber(number);
        student.setCredits(totalCredits);
        student.setAvgScore(averageScore);
        student.setThesisName(thesisName);
        student.setThesisScore(thesisScore);
        students.add(student);
    }
}