<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
	<script>
	
		function addReview(){
			
			document.getElementById('addBtn').onclick=function(){
				document.f.encoding="multipart/form-date";
			}
			document.f.submit();
			alert("��ϵǾ����ϴ�.");
			parent.opener.location.reload();
			window.close();
			
		}
	
		function cancle(){
			window.close();
		}
		
	</script>
</head>

<body>
	<form name="f" action="${pageContext.request.contextPath}/product/addReview">
		<div id="writeReview" align="center">
		
			<b>�����ۼ�</b><hr color="#828282"  width="500">
			��ǰ��ȣ : ${item_no }<br> <input type="hidden" name="item_no" id="item_no" value="${item_no }">
			�ۼ��� : user01 <br> <input type="hidden" name="id" id="id" value="user01" value="user01">
			���� : <input type="text" name="review_tit"> <br>
			<textarea name="review_con" rows="10" cols="50" placeholder="���並 �����ּ���."></textarea> <br>
			����÷�� : <input type="file" name="review_imgfile"> <br><br>
			
			<input type="button" id="addBtn" onclick="addReview()" value="���"> <input type="button" onclick="cancle()" value="���">
		 
		</div>
	</form>
</body>
</html>