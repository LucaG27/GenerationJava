
<%
String msg = (String) request.getAttribute("avvisoMessaggio");
if (msg != null) {
	out.print("<script>alert(\"" + msg + "\");</script>");
}
%>