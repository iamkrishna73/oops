package ClassAndObject;

class Student{
    String name;
    int age;
    String collegeName;
    String course;
    public Student(String name, int age, String collegeName, String course){
        this.name = name;
        this.age = age;
        this.collegeName = collegeName;
        this.course = course;
    }

}
public class CreateYourOwnClass {
    public static void main(String[] args){
        Student student = new Student("Mike Dane", 21, "CELTech", "BE");
        Student student2 = new Student("Mosh", 23, "MIT", "BS");
        System.out.println(student.name + " " + student.age + " " +student.collegeName +" " +student.course);
        System.out.println(student2.name + " " + student2.age + " " +student2.collegeName +" " +student2.course);
    }
}
