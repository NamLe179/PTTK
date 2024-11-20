package model;

public class KhachHang547 {
    private int id;
    private String hoten, diachi, email, sdt;

    public KhachHang547(int id, String hoten, String diachi, String email, String sdt) {
        this.id = id;
        this.hoten = hoten;
        this.diachi = diachi;
        this.email = email;
        this.sdt = sdt;
    }

    public KhachHang547(String hoten, String diachi, String email, String sdt) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.email = email;
        this.sdt = sdt;
    }

    public int getId() { return id; }
    public String getHoten() { return hoten; }
    public String getDiachi() { return diachi; }
    public String getEmail() { return email; }
    public String getSdt() { return sdt; }
}
