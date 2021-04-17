<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${message}</h1>
<form action="registersubmit" method="post">
<input type="text" name="username" placeholder="Enter your name"/><br/><br/>
<input type="text" name="emailid" placeholder="Enter your Email id"/><br/><br/>
<input type="password" name="password" placeholder="Enter password"/><br/><br/>
<select name="role">
<option>user</option>
<option>artist</option>
</select><br/><br/>
<input type="submit" value="submit"/>
</form>
</body>
</html>