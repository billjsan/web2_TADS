package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.devcaotics.model.negocios.Lutador;
import java.util.List;

public final class Lutadores_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>LocaisCadastrados</h1>\n");
      out.write("        \n");
      out.write("        ");

            String mensagem = request.getParameter("msg");
            
            if(mensagem != null){
        
      out.write("\n");
      out.write("        <h3>");
      out.print( mensagem );
      out.write("</h3>\n");
      out.write("        ");

            }    
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            List<Lutador> lutadores = (List)request.getAttribute("lutadores");
        
      out.write("\n");
      out.write("        \n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>id</th><th>Nome</th><th>Apelido</th><th>Altura</th>\n");
      out.write("                <th>Arte Marcial</th><th>Contato de Emergência</th>\n");
      out.write("                <th>Curso</th><th>IMC</th><th>Nascimento</th><th>Peso</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");
 
                for(Lutador lAux: lutadores){
            
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( lAux.getId() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( lAux.getNome() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( lAux.getApelido() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( lAux.getAltura() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( lAux.getArtMarcial() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( lAux.getContatoEmergencia() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( lAux.getCurso() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( lAux.getImc() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( lAux.getNascimento() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( lAux.getPeso() );
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                    <td><a href=\"LutadorServlet?id=");
      out.print( lAux.getId() );
      out.write("&op=update\">alterar </a>\n");
      out.write("                        <a href=\"LutadorServlet?id=");
      out.print( lAux.getId() );
      out.write("&op=delete\">deletar</a></td>\n");
      out.write("                </tr>\n");
      out.write("            ");
 
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
