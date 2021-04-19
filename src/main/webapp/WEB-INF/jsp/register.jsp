<%@ include file="common/header.jspf" %>

<div class="container">
<nav class="navbar navbar-dark bg-primary">
  <a class="navbar-brand" href="#" style="text-transform: uppercase;">Social Platform</a>
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