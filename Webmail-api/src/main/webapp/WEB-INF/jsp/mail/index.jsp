<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    

    <title>Signin Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="/mels/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
   
    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
<body>
	<H4>
		Liste des mails/user <span class="badge"><c:out value="${list.size()}" /></span>
	</H4>
	<c:choose>
	
	<c:when test="${list.size()>0}">
		<table class="table table-bordered table-striped">
		<thead>
			<tr><th>Nom</th><th>Prenom</th><th>mails</th><th></th>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="mail">
    		<tr>
    			<td><img src="${mail.imageBase64}" width="50" height="50"></img></td>
    			<td>${mail.lastName}</td>
    			<td>${mail.firstName}</td>
    			<td>${mail.user.firstName} ${mail.user.lastName}</td>
    			
    			<td> 
    				<p>
    					<a href="/mels/app/mail/${mail.id}/uploadPhoto" class="btn btn-info" role="button">Photo</a>
    					<form action="/mels/app/mail/${mail.id}/delete" method="post">
    						<button class="btn btn-danger glyphicon glyphicon-remove" type="submit"></button>
    						</form>
					</p>    				
    				
    				</td>
    				
    		</tr>
		</c:forEach>
		</tbody>
		</table>
		
	</c:when>
	<c:otherwise>
		<h5>La liste des mails/users est vide</h5>
	</c:otherwise>
</c:choose>
		
</body>
</html>





