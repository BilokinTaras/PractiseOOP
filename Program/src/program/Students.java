/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author Taras
 */
public class Students {
    private int Id_studenta;
    public String Fam;
    public String Name;
    public int Groupa;
    public String Department;
    public String discipline;
    public int mark;
    public String NameTeacher;
    
     public Students(int Id_studenta, String Fam, String Name, int Groupa, String Department){
         this.Id_studenta = Id_studenta;
         this.Fam = Fam;
         this.Name = Name;
         this.Groupa = Groupa;
         this.Department = Department;
         
     }
    @Override
      public String toString(){
        return this.Fam +" "+ this.Name+" "+ this.Groupa+ " "+ this.Department;
    }
}
