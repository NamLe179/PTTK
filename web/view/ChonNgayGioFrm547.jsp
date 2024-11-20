<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Chọn Ngày và Giờ</title>
</head>
<body>
    <h1>Chọn Ngày và Giờ Lịch Hẹn</h1>
    <form action="DienThongTinKHFrm547.jsp" method="get">
        <label for="ngayhen">Ngày hẹn:</label>
        <input type="date" id="ngayhen" name="ngayhen" required><br><br>

        <label for="giohen">Giờ hẹn:</label>
        <input type="time" id="giohen" name="giohen" required><br><br>

        <button type="submit">Tiếp Tục</button>
    </form>
</body>
</html>
