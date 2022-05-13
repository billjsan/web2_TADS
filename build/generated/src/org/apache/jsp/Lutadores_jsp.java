package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.devcaotics.controllers.servlets.LutadorServlet;
import com.devcaotics.model.negocios.Lutador;
import java.util.List;

public final class Lutadores_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tlds/MyTags.tld");
  }

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
      out.write("        <h1>Lutadores Cadastrados</h1>\n");
      out.write("        \n");
      out.write("        ");
      if (_jspx_meth_ifpe_carrega_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <h3>teste carrega size: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lut.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("         \n");
      out.write("        ");
      if (_jspx_meth_ifpe_carregaum_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <h3>teste carregaUm: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lutador.toString()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("        <a href=\"CadastroLutador.jsp\">Adicionar Lutador</a>      \n");
      out.write("        </div>\n");
      out.write("        ");

            String mensagem = request.getParameter("msg");
            
            if(mensagem != null){
        
      out.write("\n");
      out.write("        <h3>");
      out.print( mensagem );
      out.write("</h3>  \n");
      out.write("        ");

            }    
        
      out.write("\n");
      out.write("        ");

            List<Lutador> lutadores = (List)request.getAttribute("lutadores");
        
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_ifpe_tabela_0(_jspx_page_context))
        return;
      out.write("\n");
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

  private boolean _jspx_meth_ifpe_carrega_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ifpe:carrega
    com.devcaotics.controllers.tags.Carrega _jspx_th_ifpe_carrega_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.devcaotics.controllers.tags.Carrega.class) : new com.devcaotics.controllers.tags.Carrega();
    _jspx_th_ifpe_carrega_0.setJspContext(_jspx_page_context);
    _jspx_th_ifpe_carrega_0.setClasse("lutadores");
    _jspx_th_ifpe_carrega_0.setVar("lut");
    _jspx_th_ifpe_carrega_0.doTag();
    return false;
  }

  private boolean _jspx_meth_ifpe_carregaum_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ifpe:carregaum
    com.devcaotics.controllers.tags.CarregaUm _jspx_th_ifpe_carregaum_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.devcaotics.controllers.tags.CarregaUm.class) : new com.devcaotics.controllers.tags.CarregaUm();
    _jspx_th_ifpe_carregaum_0.setJspContext(_jspx_page_context);
    _jspx_th_ifpe_carregaum_0.setClasse("lutadores");
    _jspx_th_ifpe_carregaum_0.setVar("lutador");
    _jspx_th_ifpe_carregaum_0.setIndice(10);
    _jspx_th_ifpe_carregaum_0.doTag();
    return false;
  }

  private boolean _jspx_meth_ifpe_tabela_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ifpe:tabela
    com.devcaotics.controllers.tags.Tabela _jspx_th_ifpe_tabela_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.devcaotics.controllers.tags.Tabela.class) : new com.devcaotics.controllers.tags.Tabela();
    _jspx_th_ifpe_tabela_0.setJspContext(_jspx_page_context);
    _jspx_th_ifpe_tabela_0.setClasse((java.util.List) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lutadores}", java.util.List.class, (PageContext)_jspx_page_context, null));
    _jspx_th_ifpe_tabela_0.doTag();
    return false;
  }
}
