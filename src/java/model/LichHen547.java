package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class LichHen547 {
    private int id;
    private LocalDate ngayhen;
    private LocalTime giohen;
    private KhachHang547 khachhang;

    public LichHen547(LocalDate ngayhen, LocalTime giohen, KhachHang547 khachhang) {
        this.ngayhen = ngayhen;
        this.giohen = giohen;
        this.khachhang = khachhang;
    }

    public int getId() { return id; }
    public LocalDate getNgayhen() { return ngayhen; }
    public LocalTime getGiohen() { return giohen; }
    public KhachHang547 getKhachhang() { return khachhang; }
}
