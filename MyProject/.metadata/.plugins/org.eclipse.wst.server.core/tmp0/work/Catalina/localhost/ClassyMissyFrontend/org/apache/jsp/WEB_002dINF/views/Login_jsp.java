/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.44
 * Generated at: 2017-07-10 11:54:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/Footer.jsp", Long.valueOf(1499677780604L));
    _jspx_dependants.put("jar:file:/D:/MyProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ClassyMissyFrontend/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1499578700891L));
    _jspx_dependants.put("/WEB-INF/views/Header.jsp", Long.valueOf(1499687470783L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Navbar Example</title>\r\n");
      out.write("\t\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:#f5cba7\">\r\n");
      out.write("<form action=\"gh\">\r\n");
      out.write("<!-- Starting The Navbar Code -->\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar-header\">\r\n");
      out.write("<a class=\"navbar-brand\" rel=\"home\" href=\"#\" title=\"The Exprssion of Pearl\">\r\n");
      out.write("                <img style=\"max-width:50px; margin-top: -7px;\"\r\n");
      out.write("                     src=\"cma2.jpg\">\r\n");
      out.write("            </a>\r\n");
      out.write("<a class=\"navbar-brand\" href=\"Home.jsp\"></a>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</nav>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"login-overlay\" class=\"modal-dialog\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("          <div class=\"modal-header\">\r\n");
      out.write("              <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">×</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("              <h4 class=\"modal-title\" id=\"myModalLabel\">SignIn </h4>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-body\">\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-xs-6\">\r\n");
      out.write("                      <div class=\"well\">\r\n");
      out.write("                          <form id=\"loginForm\" action=\"perform_login\" method=\"POST\"  novalidate=\"novalidate\" required>\r\n");
      out.write("                              <div class=\"form-group\">\r\n");
      out.write("                                  <label for=\"username\" class=\"control-label\">Username</label>\r\n");
      out.write("                                  <input type=\"text\" class=\"form-control\" id=\"username\" name=\"username\" value=\"\" required=\"\" title=\"Please enter you username\" placeholder=\"example@gmail.com\">\r\n");
      out.write("                                  <span class=\"help-block\"></span>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-group\">\r\n");
      out.write("                                  <label for=\"password\" class=\"control-label\">Password</label>\r\n");
      out.write("                                  <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" value=\"\" required=\"\" title=\"Please enter your password\">\r\n");
      out.write("                                  <span class=\"help-block\"></span>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div id=\"loginErrorMsg\" class=\"alert alert-error hide\">Wrong username or password</div>\r\n");
      out.write("                              <div class=\"checkbox\">\r\n");
      out.write("                                  <label>\r\n");
      out.write("                                      <input type=\"checkbox\" name=\"remember\" id=\"remember\"> Remember login\r\n");
      out.write("                                  </label>\r\n");
      out.write("                                  \r\n");
      out.write("                              </div>\r\n");
      out.write("                              <button  type=\"submit\" class=\"btn btn-success btn-block\">Login</button>\r\n");
      out.write("                              \r\n");
      out.write("                          </form>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Footer</title>\r\n");
      out.write("\t\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<footer class=\"mt-5\">\r\n");
      out.write("  <div class=\"container-fluid bg-faded mt-5\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row py-3\">\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container-fluid bg-primary py-3\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("      <div class=\"row py-3\">\r\n");
      out.write("        <div class=\"col-md-9\">\r\n");
      out.write("          <p class=\"text-white\">Lorem ipsum.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("          <div class=\"d-inline-block\">\r\n");
      out.write("            <div class=\"bg-circle-outline d-inline-block\">\r\n");
      out.write("              <a href=\"https://www.facebook.com/\" class=\"text-white\"><i class=\"fa fa-2x fa-fw fa-facebook\"></i>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"bg-circle-outline d-inline-block\">\r\n");
      out.write("              <a href=\"https://twitter.com/\" class=\"text-white\">\r\n");
      out.write("                <i class=\"fa fa-2x fa-fw fa-twitter\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"bg-circle-outline d-inline-block\">\r\n");
      out.write("              <a href=\"https://www.linkedin.com/company/\" class=\"text-white\">\r\n");
      out.write("                <i class=\"fa fa-2x fa-fw fa-linkedin\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("  </html>\r\n");
      out.write("  ");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/Header.jsp(27,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loggedIn }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("<ul class=\"nav navbar-nav\">\r\n");
          out.write("<li class=\"active\"><a href=\"AdminHome\"><span class=\"glyphicon glyphicon-home\"></span>Home</a></li>\r\n");
          out.write("<li><a href=\"Category\">Manage Category</a></li>\r\n");
          out.write("<li><a href=\"displayProduct\">Manage Products</a>\r\n");
          out.write("<li><a href=\"Supplier\">Manage Supplier</a></li>\r\n");
          out.write("<div class=\"nav navbar-nav navbar-right\">\r\n");
          out.write("<li><a href=\"Header\">Logout</a></li>\r\n");
          out.write("</div>\r\n");
          out.write(" \r\n");
          out.write(" <div class=\"nav navbar-nav navbar-right\">\r\n");
          out.write("  <a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.uname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("  \r\n");
          out.write(" \r\n");
          out.write(" </ul>\r\n");
          out.write(" </div>\r\n");
          out.write(" ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/Header.jsp(47,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!sessionScope.loggedIn }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("<ul class=\"nav navbar-nav\">\r\n");
          out.write("<li class=\"active\"><a href=\"index.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Home</a></li>\r\n");
          out.write("<li><a href=\"AboutUs\">AboutUs</a></li>\r\n");
          out.write("<li><a href=\"displayProduct\">Products</a>\r\n");
          out.write("<li><a href=\"ContactUs\">ContactUs</a></li>\r\n");
          out.write(" <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\" \r\n");
          out.write(" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" \r\n");
          out.write(" aria-expanded=\"false\">Categories <span class=\"caret\"></span></a>\r\n");
          out.write("          <ul class=\"dropdown-menu\">\r\n");
          out.write("            <li><a href=\"#\">Earing</a></li>\r\n");
          out.write("            <li><a href=\"#\">Bracelet</a></li>\r\n");
          out.write("            <li><a href=\"#\">Ring</a></li>\r\n");
          out.write("          </ul></li>    \r\n");
          out.write("            \r\n");
          out.write("<div class=\"nav navbar-nav navbar-right\">\r\n");
          out.write("<li><a href=\"login\"><span class=\"glyphicon glyphicon-share\"></span>SignIn </a></li>\r\n");
          out.write("<li><a href=\"Register\"><span class=\"glyphicon glyphicon-user\"></span>SignUp </a></li>\r\n");
          out.write("\r\n");
          out.write(" \r\n");
          out.write("      \r\n");
          out.write("      \r\n");
          out.write("</div>\r\n");
          out.write("</ul>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
