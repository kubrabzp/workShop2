import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class studentList {
    public static <integer> void main(String[] args) {
        // 5-) Öğrenci adlarının ve notlarının olduğu bir Arraylist kullanarak
        // belirli not aralığı altında kalan öğrenciyi listeden silme algoritması
        // yazınız.

        List<HashMap<String, Object>> students = new ArrayList<>();

        HashMap<String, Object> student1 = new HashMap<>();
        student1.put("Student Name", "bengü");
        student1.put("Student Surname", "seker");
        student1.put("Grade", 80);
        students.add(student1);

        HashMap<String, Object> student2 = new HashMap<>();
        student2.put("Student Name", "yagız");
        student2.put("Student Surname", "delibas");
        student2.put("Grade", 90);
        students.add(student2);

        HashMap<String, Object> student3 = new HashMap<>();
        student3.put("Student Name", "ekin");
        student3.put("Student Surname", "karadağ");
        student3.put("Grade", 50);
        students.add(student3);


        int minGrade = 60;

        List<HashMap<String, Object>> deleted = new ArrayList<>();

        for (var student : students) {
            System.out.println("Student:" + student.get("Student Name") + " " + student.get("Student Surname") + "\nStudent Grade:" + student.get("Grade"));
            if ((Integer) student.get("Grade") < minGrade) {
                System.out.println("Öğrenci kaldı");
                System.out.println("----------------------------------");
                deleted.add(student);
                break;
            } else {
                System.out.println("Öğrenci geçti");
                System.out.println("----------------------------------");
            }
        }
        students.removeAll(deleted);
        for (var student : students) {
            System.out.println("Geçenler:" + student.get("Student Name") + " " + student.get("Student Surname"));
        }
        System.out.println("Kalanlar:" + deleted);
    }
}


