<%@ include file="common/header.jspf" %>
<%@ include file="common/artistnavigation.jspf" %>

<div class="container">
<br/><br/><br/><br/>
<div class="row">
    <div class="col">
     
    </div>
    <div class="col-5">
    
    <form action="addSkill" method="post"">
  
  <div class="form-group">
   <input type="hidden" value="${usermodel.userid}" name="userid"/>
<input type="text" name="skill"  class="form-control" placeholder="Enter your skill"/>
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