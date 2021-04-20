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
    <div class="row">
    <div class="col-3"></div>
    </div>
    <h1>REGISTER</h1>
    <form action="registersubmit" method="post">
  <div class="form-group">
    <label for="exampleInput">Email Name</label>
    <input type="text" class="form-control"  name="username" placeholder="Enter Name">
    
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email Id</label>
    <input type="email" class="form-control"  name="emailid" placeholder="Enter email">
   
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" name="password" placeholder="Password">
  </div>
  <div class="form-group">
  <select name="role" class="form-control">
<option>USER</option>
<option>ARTIST</option>
</select>
</div>
  <input type="submit" class="btn btn-primary" value="submit"/>
</form>
    </div>
    <div class="col">
     
    </div>
  </div>
<%-- <h1>${message}</h1>
<form action="registersubmit" method="post">
<input type="text" name="username" placeholder="Enter your name"/><br/><br/>
<input type="text" name="emailid" placeholder="Enter your Email id"/><br/><br/>
<input type="password" name="password" placeholder="Enter password"/><br/><br/>
<select name="role">
<option>user</option>
<option>artist</option>
</select><br/><br/>
<input type="submit" value="submit"/>
</form> --%>
</div>
</body>
</html>