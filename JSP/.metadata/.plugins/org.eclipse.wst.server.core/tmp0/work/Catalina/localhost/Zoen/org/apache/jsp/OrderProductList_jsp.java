/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-10-28 10:40:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class OrderProductList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/Users/annakim/Downloads/tomcat/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("file:/Users/annakim/Downloads/tomcat/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1664823970000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\"\n");
      out.write("	content=\"Mark Otto, Jacob Thornton, 그리고 Bootstrap 기여자들\">\n");
      out.write("<meta name=\"generator\" content=\"Hugo 0.104.2\">\n");
      out.write("<title>ZOEN-결제리스트</title>\n");
      out.write("\n");
      out.write("<link rel=\"canonical\"\n");
      out.write("	href=\"https://getbootstrap.kr/docs/5.2/examples/checkout/\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\"\n");
      out.write("	rel=\"stylesheet\"\n");
      out.write("	integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\"\n");
      out.write("	crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!-- Favicons -->\n");
      out.write("<link rel=\"apple-touch-icon\"\n");
      out.write("	href=\"/docs/5.2/assets/img/favicons/apple-touch-icon.png\"\n");
      out.write("	sizes=\"180x180\">\n");
      out.write("<link rel=\"icon\" href=\"/docs/5.2/assets/img/favicons/favicon-32x32.png\"\n");
      out.write("	sizes=\"32x32\" type=\"image/png\">\n");
      out.write("<link rel=\"icon\" href=\"/docs/5.2/assets/img/favicons/favicon-16x16.png\"\n");
      out.write("	sizes=\"16x16\" type=\"image/png\">\n");
      out.write("<link rel=\"manifest\" href=\"/docs/5.2/assets/img/favicons/manifest.json\">\n");
      out.write("<link rel=\"mask-icon\"\n");
      out.write("	href=\"/docs/5.2/assets/img/favicons/safari-pinned-tab.svg\"\n");
      out.write("	color=\"#712cf9\">\n");
      out.write("<link rel=\"icon\" href=\"/docs/5.2/assets/img/favicons/favicon.ico\">\n");
      out.write("<meta name=\"theme-color\" content=\"#712cf9\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".bd-placeholder-img {\n");
      out.write("	font-size: 1.125rem;\n");
      out.write("	text-anchor: middle;\n");
      out.write("	-webkit-user-select: none;\n");
      out.write("	-moz-user-select: none;\n");
      out.write("	user-select: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media ( min-width : 768px) {\n");
      out.write("	.bd-placeholder-img-lg {\n");
      out.write("		font-size: 3.5rem;\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".b-example-divider {\n");
      out.write("	height: 3rem;\n");
      out.write("	background-color: rgba(0, 0, 0, .1);\n");
      out.write("	border: solid rgba(0, 0, 0, .15);\n");
      out.write("	border-width: 1px 0;\n");
      out.write("	box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em\n");
      out.write("		rgba(0, 0, 0, .15);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".b-example-vr {\n");
      out.write("	flex-shrink: 0;\n");
      out.write("	width: 1.5rem;\n");
      out.write("	height: 100vh;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bi {\n");
      out.write("	vertical-align: -.125em;\n");
      out.write("	fill: currentColor;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nav-scroller {\n");
      out.write("	position: relative;\n");
      out.write("	z-index: 2;\n");
      out.write("	height: 2.75rem;\n");
      out.write("	overflow-y: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nav-scroller .nav {\n");
      out.write("	display: flex;\n");
      out.write("	flex-wrap: nowrap;\n");
      out.write("	padding-bottom: 1rem;\n");
      out.write("	margin-top: -1px;\n");
      out.write("	overflow-x: auto;\n");
      out.write("	text-align: center;\n");
      out.write("	white-space: nowrap;\n");
      out.write("	-webkit-overflow-scrolling: touch;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- 결제 리스트 폼 -->\n");
      out.write("<link href=\"form-validation.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body class=\"bg-light\">\n");
      out.write("\n");
      out.write("	<div class=\"container text-center\">\n");
      out.write("		<main>\n");
      out.write("			<div class=\"py-5 text-center\">\n");
      out.write("\n");
      out.write("				<h2>상품 리스트</h2>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("		<form action=\"list.do\" method=\"post\">\n");
      out.write("			<div class=\"row g-5\">\n");
      out.write("				<div class=\"col-md-5 col-lg-4 order-md-last\">\n");
      out.write("					<h4 class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("						<span class=\"text-primary\">상품 리스트</span> \n");
      out.write("					</h4>\n");
      out.write("\n");
      out.write("					<table border=\"1\">\n");
      out.write("						<tr>\n");
      out.write("							<th>번호</th>\n");
      out.write("							<th>이름</th>\n");
      out.write("							<th>색상</th>\n");
      out.write("							<th>사이즈</th>\n");
      out.write("							<th>가격</th>\n");
      out.write("						</tr>\n");
      out.write("						\n");
      out.write("						");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("					\n");
      out.write("					\n");
      out.write("					</table>\n");
      out.write("\n");
      out.write("					<button class=\"w-100 btn btn-primary btn-lg\" type=\"submit\">결제하러가기</button>\n");
      out.write("\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			</form>\n");
      out.write("		</main>\n");
      out.write("\n");
      out.write("\n");
      out.write("		<script\n");
      out.write("			src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("			integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\"\n");
      out.write("			crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("		<script src=\"form-validation.js\"></script>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /OrderProductList.jsp(128,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/OrderProductList.jsp(128,6) '${list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /OrderProductList.jsp(128,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("dto");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("							<tr>\n");
            out.write("							<td><a href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.pId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.pId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></td>\n");
            out.write("							\n");
            out.write("								<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.pName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("								<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.pColor}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("								\n");
            out.write("								<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.pSize}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("					\n");
            out.write("								\n");
            out.write("								<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.pSaleprice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("							</tr>\n");
            out.write("						\n");
            out.write("					");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
