<%@ page contentType = "text/html; charset = UTF-8" pageEncoding ="UTF-8" %>
<%@ page import = "java.util.Date" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import="dao.BookRepository" %>
<%@ page import="dto.Book" %>
<jsp:useBean id="bookDAO" class="dao.BookRepository" scope="session" />
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<html>
<head>
<link 04 href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
rel="stylesheet" />
<title>Book List</title>
</head>
<style>
	.fs-4 {
		margin-right: 20px;
		margin-left: 5px;
	}
	.down-please {
		margin-bottom: 50px;
	}
</style>
<body>
<div class="container py-4">
<%@ include file = "menu.jsp" %>
<%! String greeting = "저의 북마켓에 오신 것을 환영합니다.";
String tagline = "제 웹사이트에 방문하셔서 재밌고 다양한 책들을 마음껏 구경하세요!"; %>

<div class="p-5 mb-4 bg-body-tertiary rounded-3">
	<div class="container-fluid py-5">
		<h1 class="display-5 fw-bold"><%= greeting %></h1>
		<p class="col-md-8 fs-4">Byeong Uk's BookMarket</p>
	</div>
</div>

<%
		BookRepository dao = BookRepository.getInstance();
		ArrayList<Book> listOfBooks = dao.getAllBooks();
%>
<div class="row align-items-md-stretch">
	<%
        for (int i = 0; i < listOfBooks.size(); i++) {
            Book book = listOfBooks.get(i);
    %>
        <div class="col-md-4">
            <div class="h-100 p-2">
         		<img src="./resources/images/<%=book.getFilename() %>" style="width:250; height:350" />
                <h5><b><%= book.getName() %></b></h5>
                <p><%= book.getAuthor() %>
                <br><%= book.getPublisher() %> | <%= book.getUnitPrice() %>원
                <p><%= book.getDescription().substring(0, Math.min(book.getDescription().length(), 25)) %>.....
                <p><%= book.getUnitPrice() %>원
                <p> <a href = "./book.jsp?id=<%=book.getBookId()  %>"
                class="btn btn-secondary" role="button">Details &raquo;</a>
            </div>
        </div>
    <% } %>
    </div>

    <% 
    	response.setIntHeader("Refresh", 5);
        Date day = new java.util.Date();
        String am_pm;
        int hour = day.getHours();
        int minute = day.getMinutes();
        int second = day.getSeconds();
        if (hour / 12 == 0) {
            am_pm = "오전";
        } else {
            am_pm = "오후";
            hour = hour - 12;
        }
        String CT = String.format("%02d:%02d:%02d %s", hour, minute, second, am_pm);
        out.println("접속 시각 : " + CT + "\n");
    %>
<%@ include file = "footer.jsp" %>
</div>
</body>
</html>