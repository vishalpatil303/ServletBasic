<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/AddServlet" method="post">
		<h1>Enter Numbers</h1><br> 
		Enter number 1 : <input type="text" name="number1"><br>
		Enter number 2 : <input type="text" name="number2"><br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>