package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Collection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.StudentsServices;
import vo.AddressVO;
import vo.ProgramVO;
import vo.StudentVO;

/**
 *
 * @author ESTUDIANTE
 */
@WebServlet(name = "/StudentController", urlPatterns = {"/StudentController"})
public class StudentController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet studentServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet studentServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        StudentsServices service = new StudentsServices();
        Collection<StudentVO> studentsVO = service.allStudents();
        request.setAttribute("students", studentsVO);
        int funcion =parseInt(request.getParameter("funcion"));
        switch(funcion) {
                   case 1:
                       Long id = new Long(request.getParameter("id"));
                       StudentVO studentVO = service.findStudent(id);
                       request.setAttribute("student", studentVO);
                       RequestDispatcher rd = request.getRequestDispatcher("update_student.jsp");
                       rd.forward(request, response);
                   break;
                   case 2:
                       rd = request.getRequestDispatcher("table_students.jsp");
                       rd.forward(request, response);
                   break;
        }
        

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int funcion =parseInt(request.getParameter("funcion"));        
        StudentsServices service = new StudentsServices();
        switch(funcion) {
                   case 1:   
                        String name = request.getParameter("studentName");
                        String identification = request.getParameter("id");
                        String phone = request.getParameter("phone");
                        String email = request.getParameter("email");
                        String street = request.getParameter("street");
                        String city = request.getParameter("city");
                        String program = request.getParameter("programName");

                        AddressVO addressVO = new AddressVO(street, city);
                        ProgramVO programVO = new ProgramVO(program);
                        StudentVO studentVO = new StudentVO(name, identification, phone, email, addressVO, programVO);                        
                        
                        studentVO = service.newStudent(studentVO);
                        request.setAttribute("student", studentVO);
                        RequestDispatcher rd = request.getRequestDispatcher("view_student.jsp");
                        rd.forward(request, response);                        
                        break;
                   case 2:
                       Long id = new Long(request.getParameter("id"));
                       studentVO = service.findStudent(id);
                       if(studentVO != null){                            
                            request.setAttribute("student", studentVO);
                            rd = request.getRequestDispatcher("view_student.jsp");
                        }
                        else{
                           String message = "No existe el usuario";
                            request.setAttribute("message", message);
                            rd = request.getRequestDispatcher("page_message.jsp");
                        }                    
                       
                       rd.forward(request, response);
                       break;
                   case 3:
                        id = new Long(request.getParameter("id"));
                        if(service.deleteStudent(id)){                            
                             String message = "Estudiante eliminado correctamente";
                             request.setAttribute("message", message);                             
                         }
                         else{                            
                             String message = "El estudiante no se eliminó";
                             request.setAttribute("message", message);
                         } 
                        
                        rd = request.getRequestDispatcher("page_message.jsp");
                        rd.forward(request, response);
                       break;
                       case 4:
                            id = new Long(request.getParameter("id"));
                            Collection<StudentVO> studentsVO = service.findStudentByProgram(id);
                            request.setAttribute("students", studentsVO);
                            rd = request.getRequestDispatcher("table_students.jsp");
                            rd.forward(request, response);
                       break;
                       case 5:
                            id = new Long(request.getParameter("id"));
                            studentsVO = service.findStudentByAddress(id);
                            request.setAttribute("students", studentsVO);
                            rd = request.getRequestDispatcher("table_students.jsp");
                            rd.forward(request, response);
                       break;
                       case 6:
                           id = new Long(request.getParameter("id"));
                           studentVO = service.findStudent(id);
                           addressVO = studentVO.getAddressVO();
                           programVO = studentVO.getProgramVO();
                           studentVO.setIdentification(request.getParameter("identification"));
                           studentVO.setName(request.getParameter("studentName"));
                           studentVO.setPhone(request.getParameter("phone"));
                           studentVO.setEmail(request.getParameter("email"));
                           addressVO.setCity(request.getParameter("city"));
                           addressVO.setStreet(request.getParameter("street"));
                           studentVO.setAddressVO(addressVO);
                           programVO.setName(request.getParameter("programName"));
                           studentVO.setProgramVO(programVO);
                           service.updateStudent(studentVO);
                           request.setAttribute("student", studentVO);
                           rd = request.getRequestDispatcher("view_student.jsp");
                           rd.forward(request, response);                            
                       break;
                       case 7 :
                           String path = request.getParameter("path");
                            if(service.uploadCsv(path , ",")){
                                String message = "Archivo CSV ingresado correctamente";
                                request.setAttribute("message", message);                                
                            }
                            else{
                                String message = "El archivo no se subió";
                                request.setAttribute("message", message);                                
                            }
                           
                           rd = request.getRequestDispatcher("page_message.jsp");
                           rd.forward(request, response);
                       break;                       
                }     
    }
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
