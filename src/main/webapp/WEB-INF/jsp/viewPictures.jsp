<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css" rel="stylesheet">
<script src="webjars/bootstrap/4.6.0/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<div class="container">

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/home">Home <span class="sr-only">(current)</span></a>
      </li>
     <!--  <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li> -->
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          View Artisians
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Crafts</a>
          <a class="dropdown-item" href="#">Potory</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Atrists</a>
        </div>
      </li>
      <li class="nav-item  dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          View Pictures
        </a>
       
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Crafts</a>
          <a class="dropdown-item" href="#">Potory</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="viewPictures">Atrists</a>
        </div>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
     
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Logout</button>
    </form>
  </div>
</nav>
<c:forEach var="pic" items="${pictures}">
           <img src="/images/${pic.pictureName}" alt="image" width="200px" height="200px">
          <!--  <input type="button" value="review"/> -->
           <%-- <form action="like" method="get">
           <input type="hidden" value="${pic.picid}" name="picid"/>
            <input type="button" value="like"/>
            </form> --%>
            <a href="like?picid=${pic.picid}&&userid=${usermodel.userid}">like</a> 
             <a href="dislike?picid=${pic.picid}&&userid=${usermodel.userid}">dislike</a>
              <a href="review?picid=${pic.picid}&&userid=${usermodel.userid}">review</a>
           <!--  <form action="dislike" method="get">
            <input type="button" value="dislike"/>
            </form> -->
        </c:forEach>

</div>

<!-- <ul>
<li>Home</li>
<li>View Artisians</li>
<li><a href="viewPictures">view pictures</a></li> -->



<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>