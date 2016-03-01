
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import jspa.view.vo.StudentVOVw;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrestntx
 */
public class FileStudent {
    
    private File file;
    private FileReader fr;
    private FileWriter fw;
    private PrintWriter pw;
    private BufferedReader br;
    private String fileName = "dbstudents.txt";
    private Collection students;
    
    public FileStudent() {
    }
    
    public FileStudent(StudentVOVw student) {
        this.writeFile(student);
    }
    
    public FileStudent(String fileName) {
        this.fileName = fileName;
    }
    
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    } 

    public Collection getStudents() {
        this.readFile();
        return students;
    }
    
    private void readFile() {
        try {
            this.students = new ArrayList<>();
            this.file = new File (this.getFileName());
            this.fr = new FileReader (file);
            this.br = new BufferedReader(fr);
 
            String lineText;
            int count = 1;
            StudentVOVw student = new StudentVOVw();
            
            while((lineText=br.readLine())!=null) {
                switch(count) {
                   case 1:    student.setId(lineText);
                              break;
                   case 2:    student.setStudentName(lineText);
                              break;
                   case 3:    student.setAddress(lineText);
                              break;
                   case 4:    student.setCity(lineText);
                              break;
                   case 5:    student.setEmail(lineText);
                              break;
                   case 6:    student.setPhone(lineText);
                              break;
                   case 7:    this.students.add(student);
                              student = new StudentVOVw();
                              count = 0;
                              break;
                } 
                count ++;
            }
        }
        catch(Exception e){
           e.printStackTrace();
            System.out.println("fallando");
        }finally{
           try{                    
              if( null != fr ){   
                 fr.close();     
              }                  
           }catch (Exception e2){ 
              e2.printStackTrace();
           }
        }
    }
    
    public void writeFile(StudentVOVw student){ 
        try {            
           this.fw = new FileWriter(this.getFileName(), true);
           this.pw = new PrintWriter(this.fw);
           this.pw.println(student.getId()); 
           this.pw.println(student.getStudentName());
           this.pw.println(student.getAddress());
           this.pw.println(student.getCity());
           this.pw.println(student.getEmail());
           this.pw.println(student.getPhone());
           this.pw.println("--end--");

       } catch (Exception e) {
           e.printStackTrace();
           System.out.println("Error");
       } finally {
          try {

          if (null != this.fw)
             this.fw.close();
          } catch (Exception e2) {
             e2.printStackTrace();
          }
       }               
    }
}
