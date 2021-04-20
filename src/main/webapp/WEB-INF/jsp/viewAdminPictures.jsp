<%@ include file="common/header.jspf" %>
<%@ include file="common/adminnavigation.jspf" %>

<br/><br/><br/>
<div class="container">


<c:forEach var="pic" items="${pictures}">
           <img src="/images/${pic.pictureName}" alt="image" width="200px" height="200px">
          <!--  <input type="button" value="review"/> -->
           <%-- <form action="like" method="get">
           <input type="hidden" value="${pic.picid}" name="picid"/>
            <input type="button" value="like"/>
            </form> --%>
            <%-- <a href="like?picid=${pic.picid}&&userid=${usermodel.userid}">like</a> 
             <a href="dislike?picid=${pic.picid}&&userid=${usermodel.userid}">dislike</a>
              <a href="review?picid=${pic.picid}&&userid=${usermodel.userid}">review</a> --%>
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