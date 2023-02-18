<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.104.2">
<title>제품상세창</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.2/examples/starter-template/">





<link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}

.b-example-divider {
	height: 3rem;
	background-color: rgba(0, 0, 0, .1);
	border: solid rgba(0, 0, 0, .15);
	border-width: 1px 0;
	box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em
		rgba(0, 0, 0, .15);
}

.b-example-vr {
	flex-shrink: 0;
	width: 1.5rem;
	height: 100vh;
}

.bi {
	vertical-align: -.125em;
	fill: currentColor;
}

.nav-scroller {
	position: relative;
	z-index: 2;
	height: 2.75rem;
	overflow-y: hidden;
}

.nav-scroller .nav {
	display: flex;
	flex-wrap: nowrap;
	padding-bottom: 1rem;
	margin-top: -1px;
	overflow-x: auto;
	text-align: center;
	white-space: nowrap;
	-webkit-overflow-scrolling: touch;
}
</style>


<!-- Custom styles for this template -->
<link href="starter-template.css" rel="stylesheet">
</head>
<body>

	<div class="col-lg-8 mx-auto p-4 py-md-5">
		<header class="d-flex align-items-center pb-3 mb-5 border-bottom">
			<a href="/"
				class="d-flex align-items-center text-dark text-decoration-none">
				<svg xmlns="http://www.w3.org/2000/svg" width="40" height="32"
					class="me-2" viewBox="0 0 118 94" role="img">
					<title>제품상세</title><path fill-rule="evenodd"
						clip-rule="evenodd"
						d="M24.509 0c-6.733 0-11.715 5.893-11.492 12.284.214 6.14-.064 14.092-2.066 20.577C8.943 39.365 5.547 43.485 0 44.014v5.972c5.547.529 8.943 4.649 10.951 11.153 2.002 6.485 2.28 14.437 2.066 20.577C12.794 88.106 17.776 94 24.51 94H93.5c6.733 0 11.714-5.893 11.491-12.284-.214-6.14.064-14.092 2.066-20.577 2.009-6.504 5.396-10.624 10.943-11.153v-5.972c-5.547-.529-8.934-4.649-10.943-11.153-2.002-6.484-2.28-14.437-2.066-20.577C105.214 5.894 100.233 0 93.5 0H24.508zM80 57.863C80 66.663 73.436 72 62.543 72H44a2 2 0 01-2-2V24a2 2 0 012-2h18.437c9.083 0 15.044 4.92 15.044 12.474 0 5.302-4.01 10.049-9.119 10.88v.277C75.317 46.394 80 51.21 80 57.863zM60.521 28.34H49.948v14.934h8.905c6.884 0 10.68-2.772 10.68-7.727 0-4.643-3.264-7.207-9.012-7.207zM49.948 49.2v16.458H60.91c7.167 0 10.964-2.876 10.964-8.281 0-5.406-3.903-8.178-11.425-8.178H49.948z"
						fill="currentColor"></path></svg> <span class="fs-4">Zoen Shoes</span>
			</a>
		</header>

		<main>

			<div class="row g-5">


				<div class="col-md-6">
				
				
					<form action="detailOrder.do" method="post">
						<input type="hidden" name="pId" value="<%=session.getAttribute("PID") %>">
						<input type="hidden" name="cId" value="<%=session.getAttribute("CID") %>">
						
						<h2>${detail.pBrand}</h2>
						<p>상품번호 <%=session.getAttribute("PID") %></p>
						<ul class="icon-list ps-0">
							<br>
							<li class="d-flex align-items-start mb-1">사이즈:
								${detail.pSize}</li>


							<br>
							
							<li class="d-flex align-items-start mb-1">색상:
								${detail.pColor}</li>
							<br>

							<li class="d-flex align-items-start mb-1">가격: 
							${detail.pSaleprice}</li>
							<br>
							
							<li class="d-flex align-items-start mb-1">수량: 
							<select name="quantity" id="quantity">
							  <option value="1">1</option>
							  <option value="2">2</option>
							  <option value="3">3</option>
							  <option value="4">4</option>
							  <option value="5">5</option>
							  <option value="6">6</option>
							  <option value="7">7</option>
							  <option value="8">8</option>
							</select>
							
							</li>
							
							
							<br>
							<br>
							<ul>
								<button type="submit" class="btn btn-success" value="구매">바로구매</button>
							</ul>
						</ul>
				</div>
			</div>
			</form>

		</main>
		<footer class="pt-5 my-5 text-muted border-top"> Created by
			the Bootstrap team &middot; &copy; 2022 </footer>
	</div>


	<script src="../assets/dist/js/bootstrap.bundle.min.js"></script>


</body>
</html>
