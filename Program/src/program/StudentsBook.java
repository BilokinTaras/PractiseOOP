import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentsBook {
   private List<Students> students;

   public StudentsBook(List<Students> students) {
      this.students = students;
   }

   public StudentsBook() {
      this.students = new LinkedList<>();
   }

   public void addStudent(Students student) {
      this.students.add(student);
   }

   public List<Students> getStudents() {
      return students;
   }

   public void setStudents(List<Students> students) {
      this.students = students;
   }

   public List<Students> SortStudents() {
      Collections.reverse(students);
      return students;
   }

   @Override
   public String toString() {
      return "StudentsBook{" + "students=" + students + '}';
   }
}
