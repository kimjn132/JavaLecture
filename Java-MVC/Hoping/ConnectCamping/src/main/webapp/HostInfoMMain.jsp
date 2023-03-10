<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/yjstyle.css">

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/css/bootstrap.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.3.2/css/bootstrap-responsive.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js"></script>
<script src="https://https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.js"></script>

<style type="text/css">
.mybtns {
	border: 0 solid black;
	transition: background-color .5s;
	border-radius: 15px;
}

.mybtns:hover {
	background-color: #E94560;
}
</style>
</head>
<body>

<%-- nav --%>
<div class="container">
   <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
     <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
		<svg class="mysvg" xmlns="http://www.w3.org/2000/svg" width="28" height="28" fill="currentColor" class="bi bi-house-heart" viewBox="0 0 16 16">
			<path d="M8 6.982C9.664 5.309 13.825 8.236 8 12 2.175 8.236 6.336 5.309 8 6.982Z"/>
			<path d="M8.707 1.5a1 1 0 0 0-1.414 0L.646 8.146a.5.5 0 0 0 .708.707L2 8.207V13.5A1.5 1.5 0 0 0 3.5 15h9a1.5 1.5 0 0 0 1.5-1.5V8.207l.646.646a.5.5 0 0 0 .708-.707L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.707 1.5ZM13 7.207V13.5a.5.5 0 0 1-.5.5h-9a.5.5 0 0 1-.5-.5V7.207l5-5 5 5Z"/>
		</svg>
       <span class="mytitle"><b>Hoping Host</b></span>
     </a>
     
     <ul class="nav nav-pills">
     	<li class="nav-item">
			<svg class="dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false" xmlns="http://www.w3.org/2000/svg" width="28" height="28" fill="currentColor" class="bi bi-person-lines-fill" viewBox="0 0 16 16">
				<path d="M6 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm-5 6s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H1zM11 3.5a.5.5 0 0 1 .5-.5h4a.5.5 0 0 1 0 1h-4a.5.5 0 0 1-.5-.5zm.5 2.5a.5.5 0 0 0 0 1h4a.5.5 0 0 0 0-1h-4zm2 3a.5.5 0 0 0 0 1h2a.5.5 0 0 0 0-1h-2zm0 3a.5.5 0 0 0 0 1h2a.5.5 0 0 0 0-1h-2z"/>
			<ul class="dropdown-menu">
		    <li><a class="dropdown-item" href="#">??? ??????</a></li>
		    <li><a class="dropdown-item" href="#">?????? ??????</a></li>
		    <li><a class="dropdown-item" href="#">?????? ??????</a></li>
		    <li><a class="dropdown-item" href="#">?????? ??? ????????? ??????</a></li>
		    <li><a class="dropdown-item" href="#">?????? ??????</a></li>
		    <li><a class="dropdown-item" href="#">????????????</a></li>
		  </ul>
		</li>
     </ul>
   </header>
 </div>
 
 <%-- ?????? --%>
 <div class="container">
 	<h4 style="margin: 50px 0 50px 0">???????????? ?????? ????????? ????????????????</h4>
 	<div class="row myhdrow">
 		<div class="col-6 "><a href="HostInfoMLoView.do" type="button" style="border-radius: 10px; width:400px; height: 60px;" class="btn mybtns btn-secondary">????????? ?????? / ??????</a></div>
 		<div class="col-6 "><a href="HostInfoMNCTView.do" type="button" style="border-radius: 10px; width:400px; height: 60px;" class="btn mybtns btn-secondary">?????? / ???????????? / ????????????</a></div>
 	</div>
 	<div class="row myhdrow">
 		<div class="col-6 "><a href="HostInfoKeyView.do" type="button" style="border-radius: 10px; width:400px; height: 60px;" class="btn mybtns btn-secondary">?????????</a></div>
 		<div class="col-6 "><a href="HostInfoFaciView.do" type="button" style="border-radius: 10px; width:400px; height: 60px;" class="btn mybtns btn-secondary">????????????</a></div>
 	</div>
 	<div class="row myhdrow">
 		<div class="col-6 "><a href="HostInfoImagesView.do" type="button" style="border-radius: 10px; width:400px; height: 60px;" class="btn mybtns btn-secondary">?????????</a></div>
 		<div class="col-6 "><a href="HostInfoRoughView.do" type="button" style="border-radius: 10px; width:400px; height: 60px;" class="btn mybtns btn-secondary">??????</a></div>
 	</div>
 	<div class="row myhdrow">
 		<div class="col-6 "><a href="HostInfoRoomView.do" type="button" style="border-radius: 10px; width:400px; height: 60px;" class="btn mybtns btn-secondary">?????? ??????</a></div>
 		<div class="col-6 "><a href="host_confirm_delete.do" type="button" style="border-radius: 10px; width:400px; height: 60px;" class="btn mybtns btn-secondary">????????? ??????</a></div>
 	</div>
 </div>
 
 

</body>
</html>