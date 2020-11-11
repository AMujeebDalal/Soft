<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Join Us</title>

<style type="text/css">
.form1{
width:50%;
margin-left:25%;
text-align:center;
margin-top:25px;
}

</style>
</head>
<body>

<%@include file="header.jsp" %>

<script type="text/javascript">
			function Validate()
			{
				var password=document.getElementById("p1").value;
				var confirmPassword=document.getElementById("p2").value;
				
				if(password!=confirmPassword)
				{
					alert("passwords mismatch");
					return false;
				}
			return true;
			}
		</script>
<div class="form1">
	<form action="Test" method="post">
	<h3>Sign Up</h3>
		<label>First name: <input type="text" name="FirstName" required></label><br><br>
		<label>Last name: <input type="text" name="LastName" ></label><br><br>
		<label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;D.O.B: <input type="text" name="DOB" required></label>(YYYY-MM-DD)<br><br>
			
						
		<label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Enter Username: <input type="text" id="utodo" name="username" required></label><br><br>
		<label for="p1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Enter Password: <input type="password" id="p1" name="password1" required></label><br><br>
	    <!--  <label for="p2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Confirm Password: <input type="password" id="p2" name="password" required></label><br><br>-->
     	<label>Email: <input type="email" name="email" required></label><br><br>
		<input class="button btn-success" type="submit" value="Register"><br><br>
		
	</form>
</div>
<p><%@include file="footer.jsp" %></p>
</body>
</html>