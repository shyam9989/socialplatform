<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="addDesc" method="post">

<input type="hidden" value="${usermodel.userid}" name="userid"/>
<input type="text" name="desc" placeholder="Enter Description"/>
<input type="submit" value="submit"/>

</form>

</body>
</html>