/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2016-10-04 13:56:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistarEmprestimo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/links.jsp", Long.valueOf(1475589204573L));
    _jspx_dependants.put("/menu.jsp", Long.valueOf(1475589204714L));
    _jspx_dependants.put("/cabecalho.jsp", Long.valueOf(1475589204354L));
    _jspx_dependants.put("/rodape.jsp", Long.valueOf(1475589205120L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registar Emprestimo</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/estilo.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("         \n");
      out.write("   <form action=\"principal.jsp\">\n");
      out.write("        <button id=\"sair\" > <img src=\"imagem/Users-Remove-User-icon.png\" width=\"15px\" height=\"15px\"> Sair </button>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("          <form action=\"criarUtilizador.jsp\">\n");
      out.write("             <button id=\"adicionarCliente\"> <img src=\"imagem/adduser_añadir_3553.png\" width=\"15px\" height=\"15px\"> Novo Cliente </button>\n");
      out.write("         </form>\n");
      out.write("        \n");
      out.write("             ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>cabecalho</title>\n");
      out.write("           <link type=\"text/css\" rel=\"stylesheet\" href=\"css/estilo.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <header>   \n");
      out.write("         <a href=\"principal.jsp?acao=1\"> \n");
      out.write("             <img id=\"logo\" src=\"imagem/transferir.png\"></a>\n");
      out.write("            Sistema de Gestão de Empréstimos Monetários\n");
      out.write("          </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("             \n");
      out.write("            \n");
      out.write("             ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menu</title>\n");
      out.write("           <link type=\"text/css\" rel=\"stylesheet\" href=\"css/estilo.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"search\">\n");
      out.write("            <form action=\"resultadoFunionario.jsp\" method=\"post\">\n");
      out.write("                \n");
      out.write("                <input id=\"espaco\" class=\"texto\" name=\"nomePesquisa\" type=\"text\" value=\"\" >\n");
      out.write("                <button value=\"\" type=\"submit\" id=\"btn_send\" class=\"pesquisar\">pesquisar</button></form>\n");
      out.write("\n");
      out.write("                \n");
      out.write("         \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("       \n");
      out.write("       \n");
      out.write("         \n");
      out.write("    \n");
      out.write("         <div class=\"menu\">\n");
      out.write("             \n");
      out.write("              <form action=\"RegistarPagamento.jsp?acao=1\">\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                <button value=\"\" type=\"submit\" id=\"btn_menu\" class=\"pesquisar\">Registar Pagamento</button>\n");
      out.write("              </form>\n");
      out.write("             \n");
      out.write("             <br>\n");
      out.write("                \n");
      out.write("                    <form action=\"RegistarEmprestimo.jsp?acao=1\">\n");
      out.write("                \n");
      out.write("            \n");
      out.write("                <button value=\"\" type=\"submit\" id=\"btn_menu\" class=\"pesquisar\">Registar Emprestimo</button>\n");
      out.write("                     \n");
      out.write("                    </form>  \n");
      out.write("             \n");
      out.write("                          <br>\n");
      out.write("\n");
      out.write("             <form action=\"TodosUtilizadores.jsp?acao=1\">\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                <button value=\"\" type=\"submit\" id=\"btn_menu\" class=\"pesquisar\">Clientes Cadastrados</button>\n");
      out.write("              </form>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("         </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("             \n");
      out.write("       \n");
      out.write("        \n");
      out.write("    <div id=\"area1\">\n");
      out.write("        <form id=\"formulario\" autocomplete=\"off\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Registar Empréstimo</legend>\n");
      out.write("              \n");
      out.write("              <p>Nome Cliente:<input class=\"campo\" type=\"text\" placeholder=\"ex.Miguel Juior\"></p>\n");
      out.write("                <p>Email:<input class=\"campo\" type=\"text\" placeholder=\"ex:migueljunior@gmail.com\"></p>\n");
      out.write("                <p>Contacto:<input class=\"campo\" type=\"text\" value=\"84\"> <input class=\"campo\" type=\"text\" value=\"82\"></p>\n");
      out.write("                <p>Montante:<input class=\"campo\" type=\"text\" placeholder=\"0000,00MT\"> </p>\n");
      out.write("                <p>Data:<input class=\"campo\" type=\"text\" placeholder=\"dia/mes/ano\"> </p>\n");
      out.write("                <p>Estado:<input class=\"campo\" type=\"text\" value=\"Não iniciado\"> </p>\n");
      out.write("                <p  align=\"center\"> Conta do Sistema de Gestão de Empréstimos Monetários</p>\n");
      out.write("                \n");
      out.write("                <p>NomeUtilizador:<input class=\"campo\" type=\"text\" placeholder=\"Miguel Junior\"></p>\n");
      out.write("                \n");
      out.write("        </form>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                     <form action=\"principalFuncionario.jsp\">\n");
      out.write("                    <button id=\"Confimacao2\" type=\"submit\"> <img src=\"imagem/save.png\" width=\"15px\" height=\"15px\"> Submeter </button> \n");
      out.write("                </form>\n");
      out.write("                    \n");
      out.write("                <form action=\"principalFuncionario.jsp\">\n");
      out.write("                    \n");
      out.write("                    <button id=\"Cancelar2\">  <img src=\"imagem/eliminar.png\" width=\"15px\" height=\"15px\"> Cancelar </button></form>\n");
      out.write("                  <p>.</p>\n");
      out.write("             \n");
      out.write("                    \n");
      out.write("               \n");
      out.write("                \n");
      out.write("               \n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("    </div\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <table id=\"separador\">\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </table> \n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>links</title>\n");
      out.write("           <link type=\"text/css\" rel=\"stylesheet\" href=\"css/estilo.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table id=\"links\">\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("        \n");
      out.write("          \n");
      out.write("                    \n");
      out.write("            \n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>rodape</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/estilo.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("        <footer>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("             \n");
      out.write("                    \n");
      out.write("               \n");
      out.write("                \n");
      out.write("               \n");
      out.write("            </fieldset>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}