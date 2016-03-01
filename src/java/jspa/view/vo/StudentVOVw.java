/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jspa.view.vo;


/**
 *
 * @author Felipe Iz
 */
public class StudentVOVw   {
    
    private String studentName;
    private String id; 
    private String phone; 
    private String email; 
    private String address;
    private String city;
    
    public StudentVOVw(){}
    
    public StudentVOVw(String id, String studentName, String address, String city, String email, String phone) {
        this.studentName = studentName;
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.city = city;
    }
    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    
    
}
