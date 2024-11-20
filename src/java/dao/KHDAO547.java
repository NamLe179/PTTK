package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.KhachHang547;

public class KHDAO547 extends DAO547 {
    public KhachHang547 getKH(String hoten, String diachi, String email, String sdt) {
        String sql = "SELECT * FROM KhachHang547 WHERE hoten = ? AND diachi = ? AND email = ? AND sdt = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, hoten);
            ps.setString(2, diachi);
            ps.setString(3, email);
            ps.setString(4, sdt);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new KhachHang547(
                    rs.getInt("id"),
                    rs.getString("hoten"),
                    rs.getString("diachi"),
                    rs.getString("email"),
                    rs.getString("sdt")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean luuKH(KhachHang547 kh) {
        String sql = "INSERT INTO KhachHang547 (hoten, diachi, email, sdt) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, kh.getHoten());
            ps.setString(2, kh.getDiachi());
            ps.setString(3, kh.getEmail());
            ps.setString(4, kh.getSdt());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
