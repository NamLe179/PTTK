package controller;

import dao.KHDAO547;
import dao.LichHenDAO547;
import model.KhachHang547;
import model.LichHen547;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

//@WebServlet("/LuuLichHenServlet")

public class LuuLichHenServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("LuuLichHenServlet called");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
    
        String ngayhen = request.getParameter("ngayhen");
        String giohen = request.getParameter("giohen");
        String hoten = request.getParameter("hoten");
        String diachi = request.getParameter("diachi");
        String email = request.getParameter("email");
        String sdt = request.getParameter("sdt");

        KHDAO547 khdao = new KHDAO547();
        LichHenDAO547 lhdao = new LichHenDAO547();

        KhachHang547 kh = khdao.getKH(hoten, diachi, email, sdt);
        if (kh == null) {
            kh = new KhachHang547(hoten, diachi, email, sdt);
            khdao.luuKH(kh);
            kh = khdao.getKH(hoten, diachi, email, sdt);
        }

        LichHen547 lh = new LichHen547(LocalDate.parse(ngayhen), LocalTime.parse(giohen), kh);
        if (lhdao.luuLichHen(lh)) {
            response.getWriter().println("Lưu lịch hẹn thành công!");
        } else {
            response.getWriter().println("Không thể lưu lịch hẹn.");
        }
    }
}
