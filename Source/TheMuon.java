public class TheMuon {
    private SinhVien sinhVien;
    private String soPhieuMuon;
    private String ngayMuon;
    private String hanTra;
    private String soHieuSach;

    public TheMuon() {}

    public TheMuon(SinhVien sinhVien, String soPhieuMuon, String ngayMuon, String hanTra, String soHieuSach) {
        this.sinhVien = sinhVien;
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public String getHanTra() {
        return hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void hienThiThongTin() {
        sinhVien.hienThiThongTin();
        System.out.println("So phieu muon: " + soPhieuMuon);
        System.out.println("Ngay muon: " + ngayMuon);
        System.out.println("Han tra: " + hanTra);
        System.out.println("So hieu sach: " + soHieuSach);
    }
}
