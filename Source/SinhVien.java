public class SinhVien {
    private String hoTen;
    private String msv;
    private String ngaySinh;
    private String lop;

    public SinhVien() {}

    public SinhVien(String hoTen, String msv, String ngaySinh, String lop) {
        this.hoTen = hoTen;
        this.msv = msv;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    public void hienThiThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ma SV: " + msv);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Lop: " + lop);
    }
}
