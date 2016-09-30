<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Insert title here</title>

<style>
<%-- header --%> 
	a{text-decoration:none;}
	a:hover{text-decoration:none;}
	a:active{text-decoration: none}
	
	header>div>a{
		font-size:40px; 
		color:#000000;
		text-shadow:2px 2px #000000;
		margin-left:10px;  
	} 
	header>div>a:hover{
		text-decoration:none; 
	} 
	
	#users{
		float:right;
	}
	#users>a{
		color:#000000;
	}
	#users>a:hover{
		text-decoration:none; 
	}
</style>

<header>
	<div class="contatiner-fluid">
		<div id="users">
			<a href="#"><span class="glyphicon glyphicon-user"></span>������</a>
			<a href="#"><span class="glyphicon glyphicon-log-in"></span>�α���</a>
		</div>
		<a href="../member/main">Flower</a>
	</div>
</header>


<script>

	//��ٱ��� ����
	function basketinst(a){
		if(confirm("��ٱ��Ͽ� �����Ͻðڽ��ϱ�?")){
			window.location.href="../basket/basketsuccess?item_no="+a+"&buy_vol="+$('#buy_vol option:selected').val();
		}else{
			return false;
		}
	}
	
	//������������ �̵�
	function buyitem(a){
		if(confirm("���� �������� �̵��մϴ�.")){
			window.location.href="../basket/buy?item_no="+a+"&buy_vol="+$('#buy_vol option:selected').val();
		}
		
	}

</script>
</head>

<body> 
  
<!-- ��ǰ �� ���� -->
	<div class="container">
			<p></p><p></p>
			
			<b style="color:white; background-color: black;font-size: 20px;margin-left: 250;font-style:inherit;">${list.item_name }</b><br><br><br>
			<table style="width: 700;height: 350" border="1" >
				<tr>
					<td rowspan="4" width="300" height="250"><img src="${list.img}" width=100% height=100%></td>
					<td style="background-color:red" align="center" valign="middle" width="100"><b style="font-size: 13">��ǰ ��ȣ</b></td>
					<td align="center" valign="middle"><font size='3'>${list.item_no }</font></td>
				</tr>
				<tr>
					<td style="background-color:red" align="center" valign="middle" width="100"><b style="font-size: 13">����</b></td>
					<td align="center" valign="middle"><font size='3'>${list.price }</font></td>
				</tr>
				<tr>
					<td style="background-color:red" align="center" valign="middle" width="100"><b style="font-size: 13">���� ����</b></td>
					<td align="center" valign="middle"><font size='3'>${list.volume }</font></td>
				</tr>
				<tr>
					<td style="background-color:red" align="center" valign="middle" width="100"><b style="font-size: 13">�󼼼���</b></td>
					<td>${list.item_content }</td>
				</tr>
			</table>
	</div>
	
	<div class="first">
		<div class="two" style="margin-left: 150;margin-top: 30">
			<form name="form1">
			
			���� : <select id="buy_vol" name="buy_vol">
					<option>���� ����</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
				  </select>&nbsp;&nbsp; | &nbsp;&nbsp;�ִ� ���� : 10��
				   &nbsp;&nbsp;&nbsp;&nbsp;
			    
			    <!-- ��ٱ��Ͽ� ���� ��ư�� Ŭ���� ��, Ȯ���� ������ �Ķ���Ͱ����� item_no(��ǰ��ȣ)�� buy_vol(���ż���)���� ���� -->
			 	<input type="button" id="bt1" value="��ٱ���" style="font-size: 15;" onclick="basketinst(${list.item_no});">
			 	&nbsp;&nbsp;&nbsp;&nbsp;
			 	<input type="button" id="bt2" value="����" style="font-size: 15"; onclick="buyitem(${list.item_no});">
			 	
			</form>
		</div><br><br>
	</div><br><br><br>
  
  
<!-- ������ -->
    
    <div id="review" align="center">
	
	<b> REVIEW</b> <hr color="#828282"  width="800">

	<c:if test="${empty review}">
		���䰡 �����ϴ�. 
	</c:if>
	
		<c:if test="${not empty review}">
		 	<table border="1" >
		 	<c:forEach items="${review}" var="re">
		 		<tr>
		 			<b>�ۼ���</b> ${re.id} | <b>�ۼ���</b> ${re.review_date}<br>
		 			${re.review_tit} <br>
		 			${re.review_con} <br>
		 			���� <br>
		 			<hr color="#c8c8c8" width="800">
		 		</tr>
		 	</c:forEach>
		 	</table>
	 	</c:if>
 	</div>

</body>
</html>