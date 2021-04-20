<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<br/><br/><br/>
<div class="container">
 <form action="viewArtist" method="get">
<input type="text" name="artname"/> <input type="submit" value="search" class="btn btn-success"/>
</form>
<br/>
<c:set var="name" scope="application" value="${user}"/>

<c:choose>
    <c:when test="${user.equals('userone')}">
       <table border=1 class="table">
<tr>
<td scope="col">Name</td>
<td scope="col">Email Id</td>
<td scope="col">Skill Set</td>
<td scope="col">Description</td>

</tr>

          <tr>
          <td>${art.name }</td>
           <td>${art.emailid }</td>
            <td>${art.skillset }</td>
             <td>${art.myDescription }</td>
          </tr>
        
</table>
    </c:when>
    <c:when test="${user.equals('userall')}">
        
        
        <table border=1 class="table">
<tr>
<td scope="col">Name</td>
<td scope="col">Email Id</td>
<td scope="col">Skill Set</td>
<td scope="col">Description</td>

</tr>
<c:forEach var="artist" items="${art}">
          <tr>
          <td>${artist.name }</td>
           <td>${artist.emailid }</td>
            <td>${artist.skillset }</td>
             <td>${artist.myDescription }</td>
          </tr>
        </c:forEach>

</table>
        
        
        
    </c:when>
    <c:otherwise>
       
    </c:otherwise>
</c:choose>





<%-- <c:if test = "${name == 'userall'}">



</c:if> --%>


</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>