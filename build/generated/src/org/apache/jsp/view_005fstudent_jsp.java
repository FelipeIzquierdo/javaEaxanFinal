package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_005fstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/finalExamPA2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/finalExamPA2/css/style.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"col-sm-offset-1 col-sm-10 col-md-offset-2 col-md-8\">\n");
      out.write("            <h1 class=\"title-page\">Usuario Registrado</h1>\n");
      out.write("            ");
      jspa.view.vo.StudentVOVw student = null;
      synchronized (request) {
        student = (jspa.view.vo.StudentVOVw) _jspx_page_context.getAttribute("student", PageContext.REQUEST_SCOPE);
        if (student == null){
          student = new jspa.view.vo.StudentVOVw();
          _jspx_page_context.setAttribute("student", student, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("            <dl class=\"dl-horizontal\">\n");
      out.write("                <dt>Nombre:</dt> <dd>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((jspa.view.vo.StudentVOVw)_jspx_page_context.findAttribute("student")).getStudentName())));
      out.write("</dd>\n");
      out.write("                <dt>id:</dt> <dd>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((jspa.view.vo.StudentVOVw)_jspx_page_context.findAttribute("student")).getId())));
      out.write("</dd>\n");
      out.write("                <dt>tel:</dt> <dd>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((jspa.view.vo.StudentVOVw)_jspx_page_context.findAttribute("student")).getPhone())));
      out.write("</dd>\n");
      out.write("                <dt>email:</dt> <dd>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((jspa.view.vo.StudentVOVw)_jspx_page_context.findAttribute("student")).getEmail())));
      out.write("</dd>\n");
      out.write("                <dt>dir:</dt> <dd>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((jspa.view.vo.StudentVOVw)_jspx_page_context.findAttribute("student")).getAddress())));
      out.write("</dd>\n");
      out.write("                <dt>ciudad:</dt> <dd>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((jspa.view.vo.StudentVOVw)_jspx_page_context.findAttribute("student")).getCity())));
      out.write("</dd>\n");
      out.write("            </dl>\n");
      out.write("            \n");
      out.write("            <a class=\"btn btn-info\" href=\"/finalExamPA2/StudentController\">Ver Usuarios</a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
