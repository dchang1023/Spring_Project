<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>주문목록</title>

<script type="text/javascript">

	//리뷰작성 시 새창
	function writeReview(item_no){
		window.open('${pageContext.request.contextPath}/product/writeReview?item_no='+item_no,'', 'scrollbars=yes, resizeable=no, width=500, height=400');
	}
	
</script>
</head>

<body>

	<input type="button" onclick="writeReview(1)" value="리뷰등록">
	<!-- <input type="button" onclick="writeReview('${list.item_no}')" value="리뷰등록"> -->

</body>
</html>