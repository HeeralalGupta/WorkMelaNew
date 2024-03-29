<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import = "java.text.SimpleDateFormat" %>
<%@page import = "java.util.Date" %>
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
	<link href="assets/css/post.css" rel="stylesheet">
	<link href="assets/css/recruiterTable.css" rel="stylesheet">
	<!--Font Awsome-->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  
  
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
			
				response.sendRedirect("loginRecruiter");
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
						if(session.getAttribute("courseSuccess") != null){
							out.print("<div class='alert'><span class='closebtn'>&times;</span> <strong>Success!</strong> You have posted new course.</div>");
						}
						%>
				
			<!--Login form start-->
				<div class="form_wrapper">
				  <div class="form_container">
				  
				    <div class="title_container">
				      <h2>Post Course</h2>
				      <font color="red">${errorMessage}</font>
				    </div>
				    <div class="row clearfix">
				      <div class="">
				        <form action="postCourse" method="post" enctype="multipart/form-data">
							<div class="row clearfix">
					            <div class="col_half">
					              <div class="input_field"> <span><i aria-hidden="true" class="fa fa-header"></i></span>
					                <input type="text" name="courseTitle" placeholder="Course Title" required/>
					              </div>
					            </div>
					            <div class="col_half">
					              <div class="input_field"> <span><i aria-hidden="true" class="fa fa-clock-o"></i></span>
					                <input type="text" name="courseDuration" placeholder="Course Duration" required />
					              </div>
					            </div>
					            <div class="col_half">
					              <div class="input_field"> <span><i aria-hidden="true" class="fa fa-book"></i></span>
					                <input type="text" name="courseDescription" placeholder="Description" required />
					              </div>
					            </div>
					            <div class="col_half">
					              <div class="input_field"> <span><i aria-hidden="true" class="fa fa-map"></i></span>
					                <input type="text" name="courseSyllabus" placeholder="Syllabus" required />
					              </div>
					            </div>
				          </div>    
							<div class="row clearfix">
					            <div class="col_half">
					              <div class="input_field"> <span><i aria-hidden="true" class="fa fa-money"></i></span>
					                <input type="number" name="courseFees" placeholder="Coures Fees" required/>
					              </div>
					            </div>
					            <div class="col_half">
					              <div class="input_field"> <span><i aria-hidden="true" class="fa fa-list-alt"></i></span>
					                <input type="text" name="courseCategory" placeholder="Course Category" required />
					              </div>
					            </div>
					            <div class="col_half">
					              <div class="input_field"> <span><i aria-hidden="true" class="fa fa-image"></i></span>
					                <input type="file" name="file" placeholder="Upload Image" required/>
					              </div>
					            </div>
					            <div class="col_half">
					              <div class="input_field"> <span><i aria-hidden="true" class="fa fa-calculator"></i></span>
					                <input type="text" name="paymentInformation" placeholder="Payment Information" required />
					              </div>
					            </div>
				          </div>    
							<div class="row clearfix">
					            <div class="col_half">
					              <div class="input_field"> <span><i aria-hidden="true" class="fa fa-home"></i></span>
					                <input type="text" name="courseCertification" placeholder="Certification" required/>
					              </div>
					            </div>
					            <div class="col_half">
					              <div class="input_field"> <span><i aria-hidden="true" class="fa fa-cogs"></i></span>
					                <input type="text" name="notes" placeholder="Notes" required />
					              </div>
					            </div>
					            <div class="col_half">
					              <div class="input_field"> <span><i aria-hidden="true" class="fa fa-calendar"></i></span>
					                <input type="date" name="postDate" placeholder="Select Date" required />
					              </div>
					            </div>
					            <div class="col_half">
					              <div class="input_field"> <span><i aria-hidden="true" class="fa fa-clock-o"></i></span>
					                <input type="time" name="postTime" placeholder="Select Time" required />
					              </div>
					            </div>
				          </div>    
				          <input class="button mx-auto" type="submit" value="Post" />
				        </form>
				        
				      </div>
				    </div>
				  </div>
				</div>
		
			  <!--Login form ends--> 
			  <!-- Table data start -->				  
			<div class="card">
			  <div class="table-title">
			    <h2>ALL POSTED COURSE</h2>
			  </div>
			 </div>
			  <div class="table-concept">
			    <input class="table-radio" type="radio" name="table_radio" id="table_radio_0" checked="checked"/>
			    <div class="table-display">Showing 1 to 20
			      of 95 items
			    </div>
			    <table>
			      <thead>
			        <tr>
			          <th></th>
			          <th>No</th>
			          <th>COURSE TITILE</th>
			          <th>COURSE DURATION</th>
			          <th>COURSE FEES</th>
			          <th>POST DATE</th>
			          <th>ACTION</th>
			        </tr>
			      </thead>
			      <tbody>
			      <c:forEach items="${allCourse}" var="course" varStatus = "counter">
				        <tr>
				          <td> <input type="checkbox"/></td>
				          <td>${counter.count}</td>
				          <td>${course.courseTitle}</td>
				          <td>${course.courseDuration}</td>
				          <td>${course.courseFees}</td>
				          <td>${course.postDate}</td>
				          <td><input type ="submit" value = "Update"><input type = "submit" value = "Delete"></td>
				        </tr>
			        </c:forEach>
			      </tbody>
			    </table>
			    <div class="pagination">
			      <label class="disabled" for="table_radio_-1">&laquo; Previous</label>
			      <label class="active" for="table_radio_0" id="table_pager_0">1</label>
			      <label for="table_radio_1" id="table_pager_1">2</label>
			      <label for="table_radio_2" id="table_pager_2">3</label>
			      <label for="table_radio_3" id="table_pager_3">4</label>
			      <label for="table_radio_4" id="table_pager_4">5</label>
			      <label for="table_radio_1">Next &raquo;</label>
			    </div>			   			   
			  </div>
			  <!-- Table data end -->
			  
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
