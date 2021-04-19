<%@ include file="common/header.jspf" %>
<%@ include file="common/artistnavigation.jspf" %>

<div class="container">
<br/><br/><br/><br/>
<div class="row">
    <div class="col">
     
    </div>
    <div class="col-5">
    
    <form action="addDesc" method="post">
  
  <div class="form-group">
   <input type="hidden" value="${usermodel.userid}" name="userid"/>
<input type="text" name="desc"  class="form-control" placeholder="Enter Description"/>
  </div>
  
  <input type="submit" class="btn btn-primary" value="submit"/>
</form>
    
    
    
    
    

    </div>
    <div class="col">
     
    </div>
  </div>
<%-- <form action="addSkill" method="post">

<input type="hidden" value="${usermodel.userid}" name="userid"/>
<input type="text" name="skill" placeholder="Enter your skill"/>
<input type="submit" value="submit"/>

</form> --%>
</div>
</body>
</html>










<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
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
</html> --%>