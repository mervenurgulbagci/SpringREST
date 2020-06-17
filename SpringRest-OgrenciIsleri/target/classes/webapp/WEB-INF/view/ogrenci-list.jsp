<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Öğrenci İşleri</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</head>
<body>
	<div id="wrapper">
		<div id=header>
			<h2>Öğrenci İşleri</h2>
		</div>
	</div>
	<div id="container" style="background-color: white">
		<div id="content" class="center">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">ID:</th>
						<th scope="col">Isim:</th>
						<th scope="col">Soyisim:</th>
						<th scope="col">Durum:</th>
						<th scope="col">İşlem:</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ogrenciler}" var="ogrnci">
						<c:url var="updateLink" value="/ogrenci/ogrenci-guncelle">
							<c:param name="ogrenciId" value="${ogrnci.ogrenci_id}" />
						</c:url>
						<tr>
							<td>${ogrnci.ogrenci_id}</td>
							<td>${ogrnci.isim}</td>
							<td>${ogrnci.soyisim}</td>
							<td>${ogrnci.durum}</td>
							<td>
								<button onclick="if(confirm('Mezun ediyoruz, Emin misin?'))window.location.href='${updateLink}'"
								 class="update-button">Mezun Et</button>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<hr>
</body>
</html>