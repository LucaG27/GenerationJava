<%@ include file="header.jsp"%>
<%@ include file="nav-bar.jsp"%>
<div class="container">
<div class ="card w-50 mx-auto my-5">
<div class="card-header text-center">Login</div>
<div class="card-body">

	<form action="login" method="post">
    <div class="form-group">
		<label>Email:</label>
		<input type="text" class="form-control" name="email" /> <br>
		</div>
		<div class="form-group">
		<label>Password:</label>
		<input type="password" class="form-control"name="password" /> <br>
		</div>
		<input type="submit" class="btn btn-primary" value="login" />
	</form>
	</div>
	</div>
	</div>
<%@ include file="footer.jsp"%>