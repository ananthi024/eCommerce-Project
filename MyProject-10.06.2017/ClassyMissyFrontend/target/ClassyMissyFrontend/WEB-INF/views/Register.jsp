<%@ page language="java" contentType="text/html"%>
<%@include file="Header.jsp" %>
<html lang="en">
    <head> 
	
	
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

		<!-- Website CSS style -->
		<link href="css/bootstrap.min.css" rel="stylesheet">

		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		<link rel="stylesheet" href="style.css">
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>

		<title>Admin</title>
	</head>
	<body>
	<div id="login-overlay" class="modal-dialog">
      <div class="modal-content">
          <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">�</span><span class="sr-only">Close</span></button>
              <h4 class="modal-title" id="myModalLabel">SignUp </h4>
          </div>
		
				<div class="modal-body">
              <div class="row">
                  <div class="col-xs-9">
                      <div class="well">
					<form  action="InsertUserDetails" class="" method="post" >
						
					<div class="form-group">
							<label for="username" class="cols-sm-2 control-label">Username</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="username" id="username"  placeholder="Username"  required/>
								</div>
							</div>
						</div>	

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Your Email</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="email" id="email"  placeholder="email" required />
								</div>
							</div>
						</div>

						

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<input type="password" class="form-control" name="password" id="password"  placeholder="Password" required/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">Confirm Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<input type="password" class="form-control" name="confirm" id="confirm"  placeholder="Confirm your Password" required/>
								</div>
							</div>
						</div>

                           <div class="form-group">
							<label for="gender" class="cols-sm-2 control-label">Gender
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<input name="gender" type="radio" value="Male" checked> Male</label>
								    <label> <input name="gender" type="radio" value="Female"> Female</label>
								</div>
							</div>
						</div>

                        <div class="form-group">
							<label for="address" class="cols-sm-2 control-label">Address</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="address"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<input type="address" class="form-control" name="address" id="address"  placeholder="address" />
								
							
							<div class="form-group">
							<label for="mobileno" class="cols-sm-2 control-label">Mobileno</label>		
							<div class="cols-sm-10">
								<div class="input-group">
										 <input
											type="mobileno" name="mobileno" id="mobileno"
											tabindex="2" class="form-control" placeholder="mobileno">
											
											
									</div>
							</div>
						</div>
											
											
											
											
											
						<div class="form-group ">
						<button class="btn btn-primary btn-lg btn-block" type="submit">Register</button>
						</div>
						
					</form>
				</div>
			
			</div>
		</div>
		</div>
		</div></div>
		

		
    	</body>
</html>