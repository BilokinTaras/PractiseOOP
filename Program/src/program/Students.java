import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taras
 */
public class Students {
    private String id;
    public String Fam;
    public String Name;
    public String Groupa;
    public String Department;

    public Students(String id, String Fam, String Name, String Groupa, String Department) {
        this.id = id;
        this.Fam = Fam;
        this.Name = Name;
        this.Groupa = Groupa;
        this.Department = Department;

    }

    public String GetStudents() {
        return Fam;
    }

    public String GetNameStudents() {
        return Name;
    }

    public String GetGroupaStudents() {
        return Groupa;
    }

    public String GetDepartmentStudents() {
        return Department;
    }

    ArrayList<Students> StudentList = new ArrayList<>();
    Students student2 = new Students(id, Fam, Name, Groupa, Department);

    public void AddStudents(Students student2) {
        this.StudentList.add(student2);
    }

    @Override
    public String toString() {
        return this.id + " " + this.Fam + " " + this.Name + " " + this.Groupa + " " + this.Department;
    }
}
