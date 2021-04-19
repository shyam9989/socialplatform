<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<label>User Id :</label>
<input type="text"  readonly="readonly" value="${usermodel.userid}"/><br/><br/>
<label>Name :</label>
<input type="text"  readonly="readonly" value="${usermodel.name}"/><br/><br/>
<label>Email id :</label>
<input type="text" readonly="readonly" value="${usermodel.emailid}"/><br/><br/>
<label>Role :</label>
<input type="text"  readonly="readonly" value="${usermodel.role}"/><br/><br/>
<label>Skill Set:</label>
<input type="text"  readonly="readonly" value="${usermodel.skillset}"/><br/><br/>
<label>My Description:</label>
<input type="text"  readonly="readonly" value="${usermodel.myDescription}"/><br/><br/>


</body>
</html>