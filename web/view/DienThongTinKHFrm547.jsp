<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String ngayhen = request.getParameter("ngayhen");
    String giohen = request.getParameter("giohen");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Điền Thông Tin Khách Hàng</title>
</head>
<body>
    <h1>Điền Thông Tin Khách Hàng</h1>
    <p><strong>Ngày hẹn:</strong> <%= ngayhen %></p>
    <p><strong>Giờ hẹn:</strong> <%= giohen %></p>
    <form action="${pageContext.request.contextPath}/LuuLichHenServlet" method="post" accept-charset="UTF-8">
        <!-- Ngày và giờ hẹn được ẩn để gửi đến servlet -->
        <input type="hidden" name="ngayhen" value="<%= ngayhen %>">
        <input type="hidden" name="giohen" value="<%= giohen %>">

        <label for="hoten">Họ và tên:</label>
        <input type="text" id="hoten" name="hoten" required><br><br>

        <label for="diachi">Địa chỉ:</label>
        <input type="text" id="diachi" name="diachi" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="sdt">Số điện thoại:</label>
        <input type="text" id="sdt" name="sdt" required><br><br>

        <button type="submit">Xác Nhận</button>
    </form>
</body>
</html>
