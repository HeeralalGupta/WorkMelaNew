<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible"
		content="IE=edge">
	<meta name="viewport"
		content="width=device-width, 
				initial-scale=1.0">
	<title>Dashboard</title>
	<link rel="stylesheet"
		href="assets/css/dashboard.css">
	<link rel="stylesheet"
		href="assets/css/responsive-dashboard.css">
		
	<!--Font Awsome-->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="assets/css/register.css" rel="stylesheet">
<style>
			
ul{
    padding: 0;
    list-style: none;
    background: #f2f2f2;
    border-radius: 5px;
}
ul li{
    display: inline-block;
    position: relative;
    line-height: 21px;
    text-align: center;
    
}
ul li a{
    display: block;
    padding: 6px 25px 8px 12px;
    color: #333;
    text-decoration: none;
    
}
ul li a:hover{
    color: #fff;
    background: darkslategrey;
    transition: 0.3s ease-in;
    border-radius: 0 5px 0 5px;
    
}
ul li ul.dropdown{
    min-width: 80px; /* Set width of the dropdown */
    background: #f2f2f2;
    display: none;
    position: absolute;
    z-index: 999;
    right: -20px;
    border-radius: 5px;
    box-shadow: 0 3px 6px rgba(0,0,0,0.16), 0 3px 6px rgba(0,0,0,0.23);
}
ul li:hover ul.dropdown{
    display: block; /* Display the dropdown */
    
}
ul li ul.dropdown li{
    display: block;
}
.btnLogout{
	background-color: transparent;
	border: none;
	width: auto;
	height: auto;
	font-weight: bold;
	font-size: 18px;
	color: black;
	cursor: pointer;
	font-family: "Poppins", sans-serif;
	
}
.menu{
	text-decoration: none;
	color: black;
}
/* success message */
.alert {
  padding: 20px;
  background-color: #d4edda;
  color: #155724;
  opacity: 1;
  transition: opacity 0.6s;
}

.closebtn {
  margin-left: 15px;
  color: #155724;
  font-weight: bold;
  float: right;
  font-size: 22px;
  line-height: 20px;
  cursor: pointer;
  transition: 0.3s;
}

.closebtn:hover {
  color: black;
}
</style>

</head>

<body>
	
	<% 
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // Preventing from back after logout.
		
			if(session.getAttribute("emailHT") == null){ %>
			
				response.sendRedirect("loginHireTalent");
				<%	
			}
	%>
	
	<!-- for header part -->
	<header>

		<div class="logosec">
			<div class="logo">Hire Talent</div>
			<img src="https://media.geeksforgeeks.org/wp-content/uploads/20221210182541/Untitled-design-(30).png"
				class="icn menuicn"
				id="menuicn"
				alt="menu-icon">
		</div>

		<div class="message">
	
			<ul>
				<li>
					<div class="dp">
						<img src="https://media.geeksforgeeks.org/wp-content/uploads/20221210180014/profile-removebg-preview.png"
							class="dpicn" alt="dp">
					</div>
					<ul class="dropdown">
						<li><a href="#"><span><i aria-hidden="true" class="fa fa-user"> Profile</i></span></a></li>
						<li><a href="logout"><span><i aria-hidden="true" class="fa fa-sign-out"> Logout</i></span></a></li>
					</ul>
				</li>
			</ul>
			<%
			out.print("Welcome ");
			String name = session.getAttribute("firstNameHT").toString();
			out.print(name);
			%>
		</div>

	</header>

	<div class="main-container">
		<div class="navcontainer">
			<nav class="nav">
				<div class="nav-upper-options">
					
					<a class = "menu" href = "recruiterDashboard">
					<div class="nav-option option1">
						<img src="https://media.geeksforgeeks.org/wp-content/uploads/20221210182148/Untitled-design-(29).png"
							class="nav-img"
							alt="dashboard">
						<h3> Dashboard</h3>				
					</div>
					</a>
					<a class = "menu" href = "postJob">
					<div class="option2 nav-option">
						<img src="https://media.geeksforgeeks.org/wp-content/uploads/20221210183322/9.png"
							class="nav-img"
							alt="articles">
						<h3>Post Jobs</h3>
					</div>
					</a>
					<a class = "menu" href = "postInternship">
					<div class="nav-option option3">
						<img src="https://media.geeksforgeeks.org/wp-content/uploads/20221210183320/5.png"
							class="nav-img"
							alt="report">
						<h3>Post Internship</h3>
					</div>
					</a>
					<a class = "menu" href = "postCourse">
					<div class="nav-option option4">
						<img src="https://media.geeksforgeeks.org/wp-content/uploads/20221210183321/6.png"
							class="nav-img"
							alt="institution">
						<h3>Post Courses</h3>
					</div>
					</a>
					<a class = "menu" href = "recruiterProfile">
					<div class="nav-option option5">
						<img src="https://media.geeksforgeeks.org/wp-content/uploads/20221210183323/10.png"
							class="nav-img"
							alt="blog">
						<h3>Profile</h3>
					</div>
					</a>
					<a class = "menu" href = "recruiterHelp">
					<div class="nav-option option6">
						<img src="https://media.geeksforgeeks.org/wp-content/uploads/20221210183320/4.png"
							class="nav-img"
							alt="settings">
						<h3>Help</h3>
					</div>
					</a>
					<form action = "logoutHTUser" method="post">
						<div class="nav-option">
						<img src="https://media.geeksforgeeks.org/wp-content/uploads/20221210183321/7.png" class="nav-img" alt="logout">
						<button type = "submit" class = "btnLogout">Logout</button>
					</div>
					</form>

				</div>
			</nav>
		</div>
		<div class="main">

			<div class="searchbar2">
				<input type="text"
					name=""
					id=""
					placeholder="Search">
				<div class="searchbtn">
				<img src="https://media.geeksforgeeks.org/wp-content/uploads/20221210180758/Untitled-design-(28).png"
						class="icn srchicn"
						alt="search-button">
				</div>
			</div>

			<div class="box-container">
			
				
			</div>

			<!-- Body start -->
			<%
						if(session.getAttribute("helpSuccess") != null){
							out.print("<div class='alert'><span class='closebtn'>&times;</span> <strong>Thanks!</strong> We will back to you soon.</div>");
						}
						%>
				
			<!--Login form start-->
			<div class="form_wrapper">
			  <div class="form_container">
			  
			    <div class="title_container">
			      <h2>Get in Touch</h2>
			      <font color="red">${errorMessage}</font>
			    </div>
			    <div class="row clearfix">
			      <div class="">
			        <form action="help" method="post">
			          <div class="input_field"> <span><i aria-hidden="true" class="fa fa-user-circle"></i></span>
			            <input type="text" name="name" placeholder="Name" required />
			          </div>
			          <div class="input_field"> <span><i aria-hidden="true" class="fa fa-envelope"></i></span>
			            <input type="email" name="email" placeholder="Email" required />
			          </div>
			          <div class="input_field"> <span><i aria-hidden="true" class="fa fa-phone"></i></span>
			            <input type="text" name="mobile" placeholder="Moblile Number" required />
			          </div>
			          <div class="input_field"> <span><i aria-hidden="true" class="fa fa-comment"></i></span>
			            <input type = "text" name="comments" placeholder="Comments" width = "100px" required />
			          </div>
		               
			          <input class="button" type="submit" value="Submit" />
			        </form>
			        
			      </div>
			    </div>
			  </div>
			</div>
		  <!--Login form ends-->			
		</div>
	</div>
	
	<script>
		let menuicn = document.querySelector(".menuicn");
		let nav = document.querySelector(".navcontainer");

		menuicn.addEventListener("click", () => {
		nav.classList.toggle("navclose");
	})
	</script>
	<!-- //close success box -->
	<script>
		var close = document.getElementsByClassName("closebtn");
		var i;
		
		for (i = 0; i < close.length; i++) {
		  close[i].onclick = function(){
		    var div = this.parentElement;
		    div.style.opacity = "0";
		    setTimeout(function(){ div.style.display = "none"; }, 600);
		  }
		}
</script>
</body>
</html>
