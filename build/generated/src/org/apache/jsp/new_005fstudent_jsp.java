package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_005fstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Crear nuevo Usuario</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"col-sm-offset-1 col-sm-10 col-md-offset-2 col-md-8\">\n");
      out.write("            <h1 class=\"title-page\">Datos de Usuario</h1>\n");
      out.write("            <form method=\"POST\" action=\"StudentController\" class=\"form-horizontal\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-sm-1 control-label\">Id</label>\n");
      out.write("                    <div class=\"col-sm-11\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"id\" value=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-sm-1 control-label\">Nombre</label>\n");
      out.write("                    <div class=\"col-sm-11\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"studentName\" value=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-sm-1 control-label\">Teléfono</label>\n");
      out.write("                    <div class=\"col-sm-11\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"phone\" value=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-sm-1 control-label\">Email</label>\n");
      out.write("                    <div class=\"col-sm-11\">\n");
      out.write("                        <input class=\"form-control\" type=\"email\" name=\"email\" value=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-sm-1 control-label\">Dirección</label>\n");
      out.write("                    <div class=\"col-sm-11\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"address\" value=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-sm-1 control-label\">Ciudad</label>\n");
      out.write("                    <div class=\"col-sm-11\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"city\" value=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" class=\"btn btn-info col-sm-offset-1\" value=\"Crear Usuario\"/>\n");
      out.write("            </form>\n");
      out.write("        </div> \n");
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
