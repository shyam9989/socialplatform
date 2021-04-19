<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${messsge}</h1>
<form action="login" method="post">
<input type="text" name="username" placeholder="Enter your email"/>
<input type="password" name="password" placeholder="Enter your password"/>
<select name="role">
<option>user</option>
<option>artist</option>
</select><br/><br/>
<input type="submit" value="submit"/>
</form>
</body>
</html>