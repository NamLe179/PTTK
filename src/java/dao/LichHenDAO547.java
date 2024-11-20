package dao;

import java.sql.PreparedStatement;
import model.LichHen547;

public class LichHenDAO547 extends DAO547 {
    public boolean luuLichHen(LichHen547 lh) {
        String sql = "INSERT INTO LichHen547 (ngayhen, giohen, khachhang_id) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(lh.getNgayhen()));
            ps.setTime(2, java.sql.Time.valueOf(lh.getGiohen()));
            ps.setInt(3, lh.getKhachhang().getId());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
