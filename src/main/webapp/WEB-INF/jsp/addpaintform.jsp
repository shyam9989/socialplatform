<%@ include file="common/header.jspf" %>
<%@ include file="common/artistnavigation.jspf" %>
<div class="container">

<br/><br/><br/><br/><br/>
<div class="row">
    <div class="col">
     
    </div>
    <div class="col-5">
    
    <form action="addPaint" method="post" enctype="multipart/form-data">
  
  <div class="form-group">
    <label for="exampleInputPassword1">Select Image</label>
    <!-- <input type="password" class="form-control" name="password" placeholder="Password"> -->
 <input type="hidden" name="imagename"/>
<input type="hidden" value="${usermodel.userid}" name="userid"/>
<input type="file" name="image"  class="form-control" accept="image/png, image/jpeg" />
  </div>
  
  <input type="submit" class="btn btn-primary" value="submit"/>
</form>
    
    
    
    
    

    </div>
    <div class="col">
     
    </div>
  </div>

<%-- 


<form action="addPaint" method="post" enctype="multipart/form-data"">
<input type="hidden" name="imagename"/>
<input type="hidden" value="${usermodel.userid}" name="userid"/>
<input type="file" name="image" accept="image/png, image/jpeg" />
<input type="submit" value="submit"/> --%>

</form>
</div>
</body>
</html>