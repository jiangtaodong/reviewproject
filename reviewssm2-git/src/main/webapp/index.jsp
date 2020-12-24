<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>index</title>
</head>
<body>
	<%-- <form action="${pageContext.request.contextPath}/saveStudent.do" method="POST">
		<table>
			<tr>
				<td>姓名：</td><td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>年龄：</td><td><input type="text" name="sage"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="注册"></td>
			</tr>
		</table>
	</form> --%>
	<form action="${pageContext.request.contextPath}/findAllStudents.do" method="get">
		<table>
			<tr>
				<td colspan="2"><input type="submit" value="查询"></td>
			</tr>
		</table>
	</form>
</body>
</html>
