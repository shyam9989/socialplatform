<%@ include file="common/header.jspf" %>
<%@ include file="common/adminnavigation.jspf" %>


<div class="container">
<br/><br/>
<table border='1' class="table">
<tr>
<td>reviews</td>
<td>Rating</td>

</tr>
<c:forEach var="rev" items="${rating}">
         <tr>
          <td>  <c:out value="${rev.review}"/></td>
          <td>  <c:out value="${rev.rating}"/></td>
            </tr>
        </c:forEach>
        
        </table>
        <i class="fa fa-thumbs-o-up"></i> :${like}
       <i class="fa fa-thumbs-o-down"></i> :${dislikes}
       </div>
       <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>