
package javaproject;

public class TeacherMain {
    public static void main(String[] args) {
        
        TeacherClass teacher1 = new TeacherClass();
        teacher1.setInfo("Zihad Shariar","Male",27739268);
       
        
        TeacherClass teacher2 = new TeacherClass();
        teacher2.setInfo("Kazi Shanto","Male",25364581);
        
        teacher1.display();
        teacher2.display();
        
    }
    
}
