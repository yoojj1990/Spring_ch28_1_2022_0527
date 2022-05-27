<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>한줄 게시판</title>
</head>
<body>
	<h2>한줄 게시판 글쓰기</h2>
	<hr>
	<table width="1000" cellpadding="0"  cellspacing="0" border="1">
		<form action="write">
			<tr>
				<td>글쓴이</td>
				<td><input type="text" name="mwriter" size="50"></td>
			</tr>
			<tr>
				<td>한줄내용</td>
				<td><input type="text" name="mcontent" size="150"></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="글입력">&nbsp;&nbsp;
					<a href="list">글 목록보기</a>
				</td>
			</tr>
		</form>	
	
	</table>
</body>
</html>