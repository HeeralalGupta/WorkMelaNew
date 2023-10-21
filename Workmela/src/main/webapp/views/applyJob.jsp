<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>Apply Jobs</title>
<meta content="" name="description">
<meta content="" name="keywords">

<!-- Favicons -->
<link href="assets/img/xyz.jfif" rel="icon">
<link href="assets/img/xyz.jfif" rel="apple-touch-icon">

<link href="assets/css/apply.css" rel="stylesheet">

<!--Font Awsome-->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet">

<!-- Vendor CSS Files -->
<link href="assets/vendor/aos/aos.css" rel="stylesheet">
<link href="assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="assets/vendor/bootstrap-icons/bootstrap-icons.css"
	rel="stylesheet">
<link href="assets/vendor/glightbox/css/glightbox.min.css"
	rel="stylesheet">
<link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
<link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

<!-- Template Main CSS File -->
<link href="assets/css/style.css" rel="stylesheet">
<link href="assets/css/register.css" rel="stylesheet">

<!-- =======================================================
  * Template Name: Heera
  * Updated: Sep 18 2023 with Bootstrap v5.3.2
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
<style>
.divider {
	margin-left: 20px;
}

.navbar .getstartedlogin, .navbar .getstartedlogin:focus {
	background: white;
	padding: 5px 20px;
	margin-left: 500px;
	border: 1px solid #4154f1;
	border-radius: 4px;
	color: #4154f1;
}

.navbar .getstartedlogin:hover, .navbar .getstartedlogin:focus:hover {
	color: #fff;
	background: #5969f3;
}

.navbar .getstarted, .navbar .getstarted:focus {
	background: #4154f1;
	padding: 6px 20px;
	margin-left: 20px;
	border-radius: 4px;
	color: #fff;
}

.navbar .getstarted:hover, .navbar .getstarted:focus:hover {
	color: #fff;
	background: #5969f3;
}

.captcha {
	margin-bottom: 15px;
}

.g-recaptcha {
	transform: scale(1.15, 0.9);
	-webkit-transform: scale(1.15, 0.9);
	transform-origin: 0 0;
	-webkit-transform-origin: 0 0;
}

#g-recaptcha-response {
	display: block !important;
	position: absolute;
	margin: -78px 0 0 0 !important;
	width: 302px !important;
	height: 76px !important;
	z-index: -999999;
	opacity: 0;
}

.success {
	width: 300px;
	height: 50px;
	text-alignment: center;
	background-color: ligthgreen;
	border-radiun: 5px;
}

/* Banner */
.back {
	background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)),
		url(assets/img/jobs-banner.jpg);
	width: 100%;
	height: 250px;
}

.head {
	margin-top: 80px;
	text-align: center;
	font-weight: bold;
	font-family: monospace;
	color: white;
	padding-top: 50px;
}

/* search */

/* Bootstrap 4 text input with search icon */
.ms-n5 {
	margin-left: -40px;
}

.search {
	padding-top: 5px;
	padding-bottom: 5px;
}

.backgroundSearch {
	width: 440px;
}
</style>
<script type="text/javascript"> 
        window.history.forward(); 
        function noBack() { 
            window.history.forward(); 
        } 
    </script>
</head>

<body>


	<!--<script>alert("You have registered successfully")</script>-->
	<!-- ======= Header ======= -->
	<header id="header" class="header fixed-top">
		<div
			class="container-fluid container-xl d-flex align-items-center justify-content-between">

			<a href="index" class="logo d-flex align-items-center"> <img
				src="assets/img/logo.png" alt=""> <span>WorkMela</span>
			</a>

			<nav id="navbar" class="navbar">
				<ul>

					<li><a class="nav-link scrollto" href="course">Courses</a></li>
					<li><a class="nav-link scrollto" href="internship">Internship</a></li>
					<li><a class="nav-link scrollto" href="jobs">Jobs</a></li>

					<li><a class="getstartedlogin scrollto" href="login">Login</a></li>
					<li><a class="getstarted scrollto" href="register">Register</a></li>

					<div class="d-flex divider d-xs-none" style="height: 30px;">
						<div class="vr"></div>
					</div>

					<li><a class="nav-link scrollto" href="registerRecruiter">Hire
							Talent</a></li>
				</ul>
				<i class="bi bi-list mobile-nav-toggle"></i>
			</nav>
			<!-- .navbar -->

		</div>
	</header>
	<!-- End Header -->

	<!-- Banner starts -->
	<div class="container-fluid back">
		<div class="row mx-auto head">
			<div class="col-sm-12 mx-auto">
				<h1>Apply Jobs</h1>
				<p style="font-style: italic;">"If opportunity doesn't knock,
					build a door."</p>
			</div>
		</div>
		<!-- search -->
		<div class="row search">
			<div class="col-md-4 mx-auto">
				<div class="input-group backgroundSearch mx-auto">
					<input class="form-control border-end-0 border rounded-pill pl-2"
						type="search" placeholder="Type to search..." id="search-input">
					<span class="input-group-append">
						<button
							class="btn btn-outline-secondary bg-blue border-bottom-0 border rounded-pill ms-n5"
							type="button">
							<i class="fa fa-search"></i>
						</button>
					</span>
				</div>
			</div>
		</div>
	</div>
	<!-- Banner ends -->
	<!--Registration form-->
	<div class="form_wrapper">
		<div class="form_container">
			<div class="title_container">
				<h2>Apply for Jobs</h2>
				<font color="red">${validateEmail}</font>
			</div>
			<div class="row clearfix">
				<div class="">
					<form action="applyinternship" method="post">
						<div class="input_field">
							<span><i aria-hidden="true" class="fa fa-upload"></i></span> <input
								type="file" name="file" placeholder="Upload Resume" required />
						</div>
						<div class="input_field">
							<span><i aria-hidden="true" class="fa fa-user-circle"></i></span> <input
								type="text" name="name" placeholder="Name" maxlength = "10" required />
						</div>
						<div class="input_field">
							<span><i aria-hidden="true" class="fa fa-envelope"></i></span> <input
								type="email" name="email" placeholder="Email" required />
						</div>
						<div class="input_field">
							<span><i aria-hidden="true" class="fa fa-phone"></i></span> <input
								type="number" name="mobile" placeholder="Mobile Number" required />
						</div>
						<div class="input_field">
							<span><i aria-hidden="true" class="fa fa-calendar"></i></span> <input
								type="date" name="date" placeholder="Date of Birth" required />
						</div>
						<div class="input_field">
							<span><i aria-hidden="true" class="fa fa-globe"></i></span> <input
								type="text" name="highestQualification" placeholder="Highest Qualification" required />
						</div>
						<div class="input_field">
							<span><i aria-hidden="true" class="fa fa-map"></i></span> <input
								type="text" name="address" placeholder="Current Location" required />
						</div>
						<div class="input_field">
							<span><i aria-hidden="true" class="fa fa-book"></i></span> <input
								type="text" name="experience" placeholder="Work Experience" required />
						</div>
						<div class="input_field">
							<span><i aria-hidden="true" class="fa fa-globe"></i></span> <input
								type="text" name="skills" placeholder="Skills" required />
						</div>
						<div class="input_field">
							<span><i aria-hidden="true" class="fa fa-money"></i></span> <input
								type="number" name="expectedSalary" placeholder="Expected Salary" required />
						</div>
							
						
						<div class="input_field checkbox_option">
							<input type="checkbox" id="cb1"> <label for="cb1">I
								agree with terms and conditions</label>
						</div>
						<input class="button" type="submit" value="Apply" />
						
					</form>
				</div>
			</div>
		</div>
	</div>
	<!--Registration fom end-->

	<!-- ======= Footer ======= -->
	<footer id="footer" class="footer">

		<div class="footer-newsletter">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-12 text-center">
						<h4>Our Newsletter</h4>
						<p>Tamen quem nulla quae legam multos aute sint culpa legam
							noster magna</p>
					</div>
					<div class="col-lg-6">
						<form action="" method="post">
							<input type="email" name="email"><input type="submit"
								value="Subscribe">
						</form>
					</div>
				</div>
			</div>
		</div>

		<div class="footer-top">
			<div class="container">
				<div class="row gy-4">
					<div class="col-lg-5 col-md-12 footer-info">
						<a href="index" class="logo d-flex align-items-center"> <img
							src="assets/img/logo.png" alt=""> <span>WorkMela</span>
						</a>
						<p>Cras fermentum odio eu feugiat lide par naso tierra. Justo
							eget nada terra videa magna derita valies darta donna mare
							fermentum iaculis eu non diam phasellus.</p>
						<div class="social-links mt-3">
							<a href="#" class="twitter"><i class="bi bi-twitter"></i></a> <a
								href="#" class="facebook"><i class="bi bi-facebook"></i></a> <a
								href="#" class="instagram"><i class="bi bi-instagram"></i></a> <a
								href="#" class="linkedin"><i class="bi bi-linkedin"></i></a>
						</div>
					</div>

					<div class="col-lg-2 col-6 footer-links">
						<h4>Useful Links</h4>
						<ul>
							<li><i class="bi bi-chevron-right"></i> <a href="#">Home</a></li>
							<li><i class="bi bi-chevron-right"></i> <a href="#">About
									us</a></li>
							<li><i class="bi bi-chevron-right"></i> <a href="#">Services</a></li>
							<li><i class="bi bi-chevron-right"></i> <a href="#">Terms
									of service</a></li>
							<li><i class="bi bi-chevron-right"></i> <a href="#">Privacy
									policy</a></li>
						</ul>
					</div>

					<div class="col-lg-2 col-6 footer-links">
						<h4>Our Services</h4>
						<ul>
							<li><i class="bi bi-chevron-right"></i> <a href="#">Web
									Design</a></li>
							<li><i class="bi bi-chevron-right"></i> <a href="#">Web
									Development</a></li>
							<li><i class="bi bi-chevron-right"></i> <a href="#">Product
									Management</a></li>
							<li><i class="bi bi-chevron-right"></i> <a href="#">Marketing</a></li>
							<li><i class="bi bi-chevron-right"></i> <a href="#">Graphic
									Design</a></li>
						</ul>
					</div>

					<div
						class="col-lg-3 col-md-12 footer-contact text-center text-md-start">
						<h4>Contact Us</h4>
						<p>
							A108 Adam Street <br> New York, NY 535022<br> United
							States <br>
							<br> <strong>Phone:</strong> +1 5589 55488 55<br> <strong>Email:</strong>
							info@example.com<br>
						</p>

					</div>

				</div>
			</div>
		</div>

		<div class="container">
			<div class="copyright">
				&copy; Copyright <strong><span>WorkMela</span></strong>. All Rights
				Reserved
			</div>
			<div class="credits">
				<!-- All the links in the footer should remain intact. -->
				<!-- You can delete the links only if you purchased the pro version. -->
				<!-- Licensing information: https://bootstrapmade.com/license/ -->
				<!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/flexstart-bootstrap-startup-template/ -->
				Designed by <a href="https://panditsoft.in/">PanditSoft Pvt.
					Ltd.</a>
			</div>
		</div>
	</footer>
	<!-- End Footer -->



	<a href="#"
		class="back-to-top d-flex align-items-center justify-content-center"><i
		class="bi bi-arrow-up-short"></i></a>

	<!-- Vendor JS Files -->
	<script src="assets/vendor/purecounter/purecounter_vanilla.js"></script>
	<script src="assets/vendor/aos/aos.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
	<script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
	<script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
	<script src="assets/vendor/php-email-form/validate.js"></script>

	<!-- Template Main JS File -->
	<script src="assets/js/main.js"></script>

	<!--you can put this line anywhere in the site-->
	<script src="https://www.google.com/recaptcha/api.js" async defer></script>

	<!--Making google recaptcha is required-->
	<script>
		window.addEventListener('load', () => {
			const $recaptcha = document.querySelector('#g-recaptcha-response');
			if ($recaptcha) {
				$recaptcha.setAttribute('required', 'required');
			}
		})
</script>

</body>

</html>