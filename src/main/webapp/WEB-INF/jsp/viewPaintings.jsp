<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Social platform</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home1?userid=${usermodel.userid}">Home <span class="sr-only"></span></a>
      </li>
       <li class="nav-item ">
        <a class="nav-link" href="/viewProifle/?userid=${usermodel.userid}">Profile <span class="sr-only"></span></a>
      </li>
       <li class="nav-item ">
        <a class="nav-link" href="addpaintform">Add painting <span class="sr-only"></span></a>
      </li>
       <li class="nav-item ">
        <a class="nav-link" href="viewPaint/${usermodel.userid}">My painting <span class="sr-only"></span></a>
      </li>
       <li class="nav-item ">
        <a class="nav-link" href="addSkillsetForm">Add  Skillset<span class="sr-only"></span></a>
      </li>
       <li class="nav-item ">
        <a class="nav-link" href="addDescForm">Add Description <span class="sr-only"></span></a>
      </li>
     <!--  <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li> -->
      <!-- <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          View Artisians
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Crafts</a>
          <a class="dropdown-item" href="#">Potory</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="viewArtists?artist=painter">Atrists</a>
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
      </li> -->
    </ul>
    <form class="form-inline my-2 my-lg-0" action="logout" method="get">
     
      <input type="submit" class="btn btn-outline-success my-2 my-sm-0" value="Logout">
    </form>
  </div>
</nav>
</div>
<div class="container">
<c:forEach var="pic" items="${pictures}">
           <img src="/images/${pic.pictureName}" alt="image">
            <c:out value="${pic.picturepath}"/>
        </c:forEach>
</div>

</body>
</html>