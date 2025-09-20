import java.util.Scanner;

public class DanhSachTheMuon {
    private TheMuon[] dsTheMuon;
    private int soLuong;

    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong the muon: ");
        soLuong = sc.nextInt();
        sc.nextLine();

        dsTheMuon = new TheMuon[soLuong];

        for (int i = 0; i < soLuong; i++) {
            System.out.println("\nNhap thong tin the muon thu " + (i+1));

            System.out.print("Ho ten: ");
            String hoTen = sc.nextLine();

            System.out.print("Ma SV: ");
            String msv = sc.nextLine();

            System.out.print("Ngay sinh: ");
            String ngaySinh = sc.nextLine();

            System.out.print("Lop: ");
            String lop = sc.nextLine();

            System.out.print("So phieu muon: ");
            String soPhieu = sc.nextLine();

            System.out.print("Ngay muon: ");
            String ngayMuon = sc.nextLine();

            System.out.print("Han tra (dd/mm/yyyy): ");
            String hanTra = sc.nextLine();

            System.out.print("So hieu sach: ");
            String soHieuSach = sc.nextLine();

            SinhVien sv = new SinhVien(hoTen, msv, ngaySinh, lop);
            dsTheMuon[i] = new TheMuon(sv, soPhieu, ngayMuon, hanTra, soHieuSach);
        }
    }

    public void hienThiDanhSach() {
        System.out.println("\n===== DANH SACH THE MUON =====");
        for (TheMuon tm : dsTheMuon) {
            tm.hienThiThongTin();
            System.out.println("--------------------------------");
        }
    }

    public void hienThiCuoiThang() {
        System.out.println("\n===== DANH SACH SINH VIEN CAN TRA SACH CUOI THANG =====");
        for (TheMuon tm : dsTheMuon) {
            if (tm.getHanTra().startsWith("30/") || tm.getHanTra().startsWith("31/")) {
                tm.getSinhVien().hienThiThongTin();
                System.out.println("Sach muon: " + tm.getSoHieuSach());
                System.out.println("--------------------------------");
            }
        }
    }
}
