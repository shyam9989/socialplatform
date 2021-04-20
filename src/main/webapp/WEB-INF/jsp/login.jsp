
<%@ include file="common/header.jspf" %>

<div class="container">
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="#">Social Platform</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="loginform">Login</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="registerform">Register</a>
      </li>
     
    </ul>
  </div>
</nav>
<br/><br/><br/><br/>
<div class="row">
    <div class="col">
     
    </div>
    <div class="col-5">
    
    <form action="login" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Email Name</label>
    <input type="text" class="form-control"  name="username" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" name="password" placeholder="Password">
  </div>
  <div class="form-group">
  <select name="role" class="form-control">
<option>USER</option>
<option>ARTIST</option>
<option>ADMIN</option>
</select>
</div>
  <input type="submit" class="btn btn-primary" value="submit"/>
</form>
    
    
    
    
    
<%--      <h1>${messsge}</h1>
<form action="login" method="post">
<input type="text" name="username" placeholder="Enter your email"/><br/><br/>
<input type="password" name="password" placeholder="Enter your password"/><br/><br/>
<select name="role">
<option>user</option>
<option>artist</option>
</select><br/><br/>
<input type="submit" value="submit"/>
</form> --%>
    </div>
    <div class="col">
     
    </div>
  </div>
</div>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>