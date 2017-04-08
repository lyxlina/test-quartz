<%--
  Created by IntelliJ IDEA.
  User: qiaowentao
  Date: 2017/3/17
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>test-quartz项目</title>
</head>
<body>
<div style="color: red;font-weight: bold;">test-quartz 项目。</div>
<%
    //HttpSession session = request.getSession(true);
    System.out.println(session.getId());
    out.println("<br> SESSION ID:" + session.getId()+"<br>");
%>

</body>
</html>
