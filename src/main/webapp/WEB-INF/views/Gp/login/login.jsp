<!DOCTYPE html>
<%@ page contentType = "text/html;charset=utf-8" %> <!-- utf-8설정 -->
<html lang="ko">

<head>
  <meta charset="UTF-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Gp - Login</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="resources/Gp/assets/img/favicon.png" rel="icon">
  <link href="resources/Gp/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
    <%@ include file="/WEB-INF/views/Gp/includes/css.jsp" %>

</head>

<body>

<!-- ======= Header ======= -->
<%@ include file="/WEB-INF/views/Gp/includes/header_login.jsp" %>
<!-- End Header -->

<!-- ======= Hero Section ======= -->
<section id="hero" class="d-flex align-items-center justify-content-center">
  <div class="container pt-0" data-aos="fade-up">

    <div class="row justify-content-center" data-aos="fade-up" data-aos-delay="150">
      <div class="col-xl-6 col-lg-8">
        <h1>Login<span>.</span></h1>
        <h2>Wellcome</h2>
      </div>
    </div>

    <div class="row gy-4 mt-5 justify-content-center" data-aos="zoom-in" data-aos-delay="250">
      <div class="col-xl-5 ">
        <div class="icon-box">
          <i class="ri-login-box-line"></i>
           <form method="post" action="/">
                <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1" style="width:98.125px;">ID</span>
                  <input type="text" class="form-control" placeholder="ID를 입력하세요." name="id" aria-label="Id" aria-describedby="basic-addon1">
                </div>
                <div class="input-group mb-3">
                   <span class="input-group-text" id="basic-addon1">Password</span>
                   <input type="password" class="form-control" placeholder="Password를 입력하세요." name="pwd"aria-label="Pwd" aria-describedby="basic-addon1">
                </div>
                <div>
                     <button type="submit" class="btn btn-primary">로그인</button>
                </div>
                <div class="mt-3">
                <button type="submit" class="btn btn-success">회원가입</button>
                <button type="submit" class="btn btn-danger">ID/PWD 찾기</button>
                <div>

           </form>
        </div>

      </div>
  </div>
</section><!-- End Hero -->
<!-- ======= Footer ======= -->
    <%@ include file="/WEB-INF/views/Gp/includes/footer_login.jsp" %>
<!-- END Footer -->

<div id="preloader"></div>
<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

<!-- Vendor JS Files -->
     <%@ include file="/WEB-INF/views/Gp/includes/js.jsp" %>
<!-- Template Main JS File -->
<script src="resources/Gp/assets/js/main.js"></script>

</body>

</html>