/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-11-14 15:36:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ClientLoginView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/Users/annakim/Downloads/tomcat/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("file:/Users/annakim/Downloads/tomcat/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1664823970000L));
    _jspx_dependants.put("/Nav2.jsp", Long.valueOf(1668395386000L));
    _jspx_dependants.put("/Foot.jsp", Long.valueOf(1668330809000L));
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
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Detail View - ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${DetailView.regName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</title>\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.2/examples/navbar-fixed/\">\n");
      out.write("	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" \n");
      out.write("	 rel=\"stylesheet\" >\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" >\n");
      out.write("<style type=\"text/css\">\n");
      out.write("@import url('https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700,800'); \n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Ubuntu&display=swap');\n");
      out.write("</style>\n");
      out.write("		\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<!-- Header Start -->\n");
      out.write("    ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" >\n");
      out.write("<style type=\"text/css\">\n");
      out.write("@import url('https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700,800'); \n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Ubuntu&display=swap');\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<!-- 2022-11-8 Hosik - Hoping svg 클릭시 메인화면으로 링크 달았음 --> \n");
      out.write("	<!-- 2022-11-9 Hosik - 성연씨 코드 받고 회원메뉴 부분 수정함.\n");
      out.write("						 - 로그인이 안되어 있을시 로그인 및 회원가입 메뉴 \n");
      out.write("						 - 로그인 세션이 있을경우 메뉴가 회원정보수정-탈퇴 , 로그아웃 그리고 예약정보확인 페이지 등록예정 \n");
      out.write("		2022-11-10 Hosik - Created Navbar2 기존 Navbar에서 검색기능을 없앤 navbar의 필요성을 느껴서 생성 					 	\n");
      out.write("						 \n");
      out.write("							 --> \n");
      out.write("							 \n");
      out.write("	");
      out.write("\n");
      out.write("	<div class=\"container\">\n");
      out.write("	   <header class=\"d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom\">\n");
      out.write("	     <a href=\"main.do\" class=\"d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none\">\n");
      out.write("	       <svg class=\"mysvg\" xmlns=\"http://www.w3.org/2000/svg\" width=\"28\" height=\"28\" fill=\"currentColor\" class=\"bi bi-house-heart\" viewBox=\"0 0 16 16\">\n");
      out.write("		  <path d=\"M8 6.982C9.664 5.309 13.825 8.236 8 12 2.175 8.236 6.336 5.309 8 6.982Z\"/>\n");
      out.write("		  <path d=\"M8.707 1.5a1 1 0 0 0-1.414 0L.646 8.146a.5.5 0 0 0 .708.707L2 8.207V13.5A1.5 1.5 0 0 0 3.5 15h9a1.5 1.5 0 0 0 1.5-1.5V8.207l.646.646a.5.5 0 0 0 .708-.707L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.707 1.5ZM13 7.207V13.5a.5.5 0 0 1-.5.5h-9a.5.5 0 0 1-.5-.5V7.207l5-5 5 5Z\"/>\n");
      out.write("		</svg>\n");
      out.write("	       <span class=\"mytitle\"><b>Hoping</b></span>\n");
      out.write("	     </a>\n");
      out.write("	     \n");
      out.write("	     <ul class=\"nav nav-pills\">\n");
      out.write("	     	<li class=\"nav-item\" style=\"font-size: 14px;\">\n");
      out.write("	     		<!-- <a href=\"../../../../Host/src/main/webapp/HostTerms.jsp\" class=\"link-dark nav-link\">호스트 모드</a> -->\n");
      out.write("	     		\n");
      out.write("	     	");
 if (session.getAttribute("CID") != null) { 
      out.write("\n");
      out.write("	     		<a href=\"../joohyuncamping/check.do?cId=");
      out.print((String) session.getAttribute("CID"));
      out.write("\" class=\"link-dark nav-link\">호스트 모드로 전환하기</a>\n");
      out.write("	     			  ");
 } 
      out.write("	\n");
      out.write("	     	</li>\n");
      out.write("	     	\n");
      out.write("	     	<li class=\"nav-item\">\n");
      out.write("				<svg class=\"dropdown-toggle\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\" xmlns=\"http://www.w3.org/2000/svg\" width=\"28\" height=\"28\" fill=\"currentColor\" class=\"bi bi-person-lines-fill\" viewBox=\"0 0 16 16\">\n");
      out.write("					<path d=\"M6 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm-5 6s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H1zM11 3.5a.5.5 0 0 1 .5-.5h4a.5.5 0 0 1 0 1h-4a.5.5 0 0 1-.5-.5zm.5 2.5a.5.5 0 0 0 0 1h4a.5.5 0 0 0 0-1h-4zm2 3a.5.5 0 0 0 0 1h2a.5.5 0 0 0 0-1h-2zm0 3a.5.5 0 0 0 0 1h2a.5.5 0 0 0 0-1h-2z\"/>\n");
      out.write("				</svg>\n");
      out.write("				<ul class=\"dropdown-menu\">\n");
      out.write("				");
 if (session.getAttribute("cId") == null) { 
      out.write("\n");
      out.write("			    <li><a class=\"dropdown-item\" href=\"ClientLoginView.jsp\">로그인</a></li>\n");
      out.write("			    <li><a class=\"dropdown-item\" href=\"ClientSignupView.jsp\">회원가입</a></li>\n");
      out.write("			       ");
 } else { 
			       
      out.write("\n");
      out.write("			    <li>");
      out.print(session.getAttribute("cId")  );
      out.write(" 님 환영합니다 </li>\n");
      out.write("			    <li><a class=\"dropdown-item\" href=\"#\">예약 정보 관리</a></li>\n");
      out.write("			    <li><a class=\"dropdown-item\" href=\"#\">위시 리스트</a></li>\n");
      out.write("			    <li><a class=\"dropdown-item\" href=\"mypageView.do\">마이페이지</a></li>\n");
      out.write("			    <li><a class=\"dropdown-item\" href=\"ClientLogout.jsp\">로그아웃</a></li>\n");
      out.write("			    \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("			  </ul>\n");
      out.write("			</li>\n");
      out.write("	     </ul>\n");
      out.write("	   </header>\n");
      out.write(" 	</div>\n");
      out.write("\n");
      out.write("	\n");
      out.write("	\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("    <!-- Header End --> \n");
      out.write("    <!-- Main Start -->\n");
      out.write("    <main >\n");
      out.write("		<div  class=\"container-md d-flex justify-content-center\">\n");
      out.write("		 	<div class=\"row\">\n");
      out.write("		 	<div class=\"col\">\n");
      out.write("\n");
      out.write("		 <form action=\"login.do\" method=\"post\">\n");
      out.write("			    <h1 class=\"h3 mb-3 fw-normal\">로그인</h1>\n");
      out.write("			\n");
      out.write("			    <div class=\"form-floating\">\n");
      out.write("			      <input type=\"text\" class=\"form-control\" id=\"floatingInput\" name=\"cId\" placeholder=\"ID\" >\n");
      out.write("			    </div>\n");
      out.write("			    <div class=\"form-floating\">\n");
      out.write("			      <input type=\"password\" class=\"form-control\" id=\"floatingPassword\" name=\"cPw\" placeholder=\"PW\">\n");
      out.write("			    </div>\n");
      out.write("			\n");
      out.write("			    <div class=\"checkbox mb-3\">\n");
      out.write("			    </div>\n");
      out.write("			    <button class=\"w-100 btn btn-lg btn-primary\" type=\"submit\" >로그인</button>\n");
      out.write("			  	\n");
      out.write("			  	<div class=\"links\" style=\"text-decoration: none\">\n");
      out.write("		            <a href=\"ClientSignupView.jsp\" style=\"text-decoration: none\">회원가입</a>\n");
      out.write("		            <a href=\"#\" style=\"text-decoration: none\">아이디 찾기</a>\n");
      out.write("		            <a href=\"#\" style=\"text-decoration: none\">비밀번호 찾기</a>\n");
      out.write("		        </div>\n");
      out.write("			  \n");
      out.write("		  </form>\n");
      out.write("		\n");
      out.write("    	     </div><!-- DIV row End -->\n");
      out.write("		    </div><!-- DIV row End -->\n");
      out.write("	    </div> <!-- DIV container End -->\n");
      out.write("    </main> \n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>	\n");
      out.write("<!-- Foot -->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<style>\n");
      out.write("/* pc 화면 */\n");
      out.write("@media (min-width: 768px) {\n");
      out.write("    #kakao-talk-channel-chat-button {\n");
      out.write("    position: fixed;\n");
      out.write("    z-index: 999;\n");
      out.write("    right: 30px; /* 화면 오른쪽으로부터의 거리, 숫자만 변경 */\n");
      out.write("    bottom: 30px; /* 화면 아래쪽으로부터의 거리, 숫자만 변경 */\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("/* 모바일 화면 */\n");
      out.write("@media (max-width:767px) {\n");
      out.write("    #kakao-talk-channel-chat-button {\n");
      out.write("    position: fixed;\n");
      out.write("    z-index: 999;\n");
      out.write("    right: 15px; /* 화면 오른쪽으로부터의 거리, 숫자만 변경 */\n");
      out.write("    bottom: 30px; /* 화면 아래쪽으로부터의 거리, 숫자만 변경 */\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("	<!-- \n");
      out.write("	2022-11-08 Hosik - 우측하단 카카오톡 1:1 채팅 DIV 추가 \n");
      out.write("		 11-11 Hosik - 강사님이 빼라고 하셔서 뺌 \n");
      out.write("	 -->\n");
      out.write("<!-- 	\n");
      out.write("<div id=\"kakao-talk-channel-chat-button\"></div>\n");
      out.write("\n");
      out.write("<script src=\"//developers.kakao.com/sdk/js/kakao.min.js\"></script>\n");
      out.write("<script type='text/javascript'>\n");
      out.write("  //<![CDATA[\n");
      out.write("    // 사용할 앱의 JavaScript 키를 설정해 주세요.\n");
      out.write("    Kakao.init('8d20a512bea587bcc64da4d1d6a184b3');\n");
      out.write("    // 카카오톡 채널 1:1채팅 버튼을 생성합니다.\n");
      out.write("    Kakao.Channel.createChatButton({\n");
      out.write("      container: '#kakao-talk-channel-chat-button',\n");
      out.write("      channelPublicId: '_cxfgGxj' // 카카오톡 채널 홈 URL에 명시된 ID\n");
      out.write("    });\n");
      out.write("  //]]>\n");
      out.write("</script>\n");
      out.write(" -->\n");
      out.write("\n");
      out.write("<!-- Start Footer -->\n");
      out.write("     <footer class=\"my-5 pt-5 text-muted text-center text-small album py-5 bg-light\">\n");
      out.write("    <p class=\"mb-1\">&copy; 2022–Team Bootcamp </p>\n");
      out.write("    <p>Hoping은 통신판매 중개자로서 통신판매의 당사자가 아니며 <br>\n");
      out.write("    고객지원을 제외한 상품의 예약, 이용 등과 관련한 의무와 책임 등 모든 거래에 대한 책임은 가맹점에게 있습니다.\n");
      out.write("    </p>\n");
      out.write("    <ul class=\"list-inline\">\n");
      out.write("      <li class=\"list-inline-item\"><a href=\"TermsHomepage.jsp\">이용약관</a></li>\n");
      out.write("      <li class=\"list-inline-item\"><a href=\"support.jsp\">Support</a></li>\n");
      out.write("      <li class=\"list-inline-item\"><a href=\"#\">Contact Us</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </footer>\n");
      out.write("    <!-- End Footer -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </html>");
      out.write("\n");
      out.write("<!-- Foot End -->\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("</html>");
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