import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachTheMuon ds = new DanhSachTheMuon();

        int choice;
        do {
            System.out.println("\n===== MENU QUAN LY THU VIEN =====");
            System.out.println("1. Nhap danh sach the muon");
            System.out.println("2. Hien thi danh sach the muon");
            System.out.println("3. Hien thi danh sach can tra sach cuoi thang");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    ds.nhapDanhSach();
                    break;
                case 2:
                    ds.hienThiDanhSach();
                    break;
                case 3:
                    ds.hienThiCuoiThang();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
    }
}
