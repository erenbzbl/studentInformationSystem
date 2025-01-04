import java.util.*;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course oralResult = new Course("Sözlü", "SZL101", "SZL");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");
        Teacher t4 = new Teacher("Ders Sözlü", "90550000003", "SZL");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        oralResult.addTeacher(t4);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya, oralResult);
        s1.addBulkExamNote(1,1,1, 100);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya, oralResult);
        s2.addBulkExamNote(100,100,100, 10);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya, oralResult);
        s3.addBulkExamNote(50,20,40, 90);
        s3.isPass();

    }
}