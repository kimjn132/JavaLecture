<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
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
       <span class="mytitle"><b>Hoping Admin</b></span>
     </a>
     
     <ul class="nav nav-pills">
     	<li class="nav-item">
			<svg class="dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false" xmlns="http://www.w3.org/2000/svg" width="28" height="28" fill="currentColor" class="bi bi-person-lines-fill" viewBox="0 0 16 16">
				<path d="M6 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm-5 6s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H1zM11 3.5a.5.5 0 0 1 .5-.5h4a.5.5 0 0 1 0 1h-4a.5.5 0 0 1-.5-.5zm.5 2.5a.5.5 0 0 0 0 1h4a.5.5 0 0 0 0-1h-4zm2 3a.5.5 0 0 0 0 1h2a.5.5 0 0 0 0-1h-2zm0 3a.5.5 0 0 0 0 1h2a.5.5 0 0 0 0-1h-2z"/>
			<ul class="dropdown-menu">
		    <li><a class="dropdown-item" href="#">내 정보</a></li>
		    <li><a class="dropdown-item" href="#">예약 목록</a></li>
		    <li><a class="dropdown-item" href="#">문의 목록</a></li>
		    <li><a class="dropdown-item" href="#">수입 및 예약건 통계</a></li>
		    <li><a class="dropdown-item" href="#">후기 관리</a></li>
		    <li><a class="dropdown-item" href="#">로그아웃</a></li>
		  </ul>
		</li>
     </ul>
   </header>
 </div>
<%--search바 --%>
<div class="container myscontainer">
	<div class="row myhtitle">
		<div><b>예약 관리</b></div>
	</div>
	<div class="row">
		<%-- 콤보박스 --%>
		<select class="col-2 form-select form-select-sm" aria-label=".form-select-sm example">
		  <option selected>캠핑장 이름</option>
		  <option value="1">One</option>
		  <option value="1">One</option>
		  <option value="1">One</option>
		</select>
		<%-- 달력입니당. --%>
		<form class="col-10" action="bookSearch.do">
			<div class="row">
			<div class="col-4" autocomplete="off">
				<div class="col-4 col-11" style="margin-right: 0px;">
					<div class="input-group input-daterange">
						<input name="start" type="text" style="background-color: white; border-radius: 13px; height: 33px; font-size: 13px;" class="mydinput form-control" placeholder="Start" readonly>
						<input name="end" type="text" style="border-radius: 13px; height: 33px; font-size: 13px;" class="secondary form-control" placeholder="End" readonly>
					</div>
				</div>
			</div>
			<%-- search --%>
			<div class="col-5 col-lg-auto" role="search">
				<input name="strSearch" class="mysearch" type="search" class="form-control" aria-label="Search">
			</div>
	        <div class="col-1 text-conter">
				<button type="submit" class="text-decoration-none">
					<svg class="mysvg" xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
						  <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"/>
					</svg>
				</button>
	        </div>
	        </div>
        </form>
        </div>
	</div>

<%-- 테이블 --%>
<div class="container">
	<div class="card myhcard" style="border-radius: 20px;">
		<table>
			<tr class="myhtr">
				<td class="myth">예약번호</td><td class="myth">캠핑장 이름</td><td class="myth">예약자ID</td><td class="myth">요금</td><td class="myth">예약일</td><td class="myth">자리</td><td class="myth">체크인 날짜</td><td class="myth">체크아웃 날짜</td><td class="myth">예약 인원</td>
			</tr>
			<%-- 예약 내역 list for문 돌리기 --%>
			<c:forEach items="${list}" var="dto">
				
				<tr class="myhtr">
					<td class="mytd"><a href="YJHostBookDetail.do?boSeq=${dto.boSeq }">${dto.boSeq }</a></td>
					<td class="mytd">${dto.regName }</td>
					<td class="mytd">${dto.pay_cid }</td>
					<td class="mytd">${dto.total }</td>
					<td class="mytd">${dto.boDate }</td>
					<td class="mytd">${dto.roNum }</td>
					<td class="mytd">${dto.boCheckindate }</td>
					<td class="mytd">${dto.boCheckoutdate }</td>
					<td class="mytd">${dto.boCount }</td>
				
				</tr>
			</c:forEach>
		</table>	  
	</div>
</div>
    

<script type="text/javascript">
$(document).ready(function(){
	
	$('.input-daterange').datepicker({
	    format: 'yyyy-mm-dd',
	    autoclose: true
	});

});
</script>
  
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>