package BaiKiemTra108;

import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu:");
        int soPhanTu = scanner.nextInt();
        NhanVien1[] nv = new NhanVien1[soPhanTu];
        int luachon;
        do {
            System.out.println("\nMENU");
            System.out.println("1.Nhap danh sach nhan vien lap trinh.\n"
                    + "2.Nhap danh sach nhan vien phu vu.\n"
                    + "3.Nhap danh sach nhan vien kinh doanh.\n"
                    + "4.Xuat danh sach nhan vienn kinh doanh.\n"
                    + "5.Tinh tong luong nhan vien luong>5tr song HCM.\n");
            System.out.print("Nhap lua chon:");
            luachon = scanner.nextInt();
            switch (luachon) {
                case 1:
                    System.out.println("+Nhap thong tin sinh vien lap trinh:");
                    for (int i = 0; i < soPhanTu; i++) {
                        System.out.println("==Nhap sinh vien thu:" + (i + 1));
                        nv[i] = new NhanVienLapTrinh1();
                        nv[i].input();
                    }
                    break;
                case 2:
                    System.out.println("+++Nhap thong tin sinh vien phu vu:");
                    for (int i = 0; i < soPhanTu; i++) {
                        System.out.println("==Nhap sinh vien thu:" + (i + 1));
                        nv[i] = new NhanVienPhuVu1();
                        nv[i].input();
                    }
                    break;
                case 3:
                    System.out.println("+++Nhap thong tin sinh vien kinh doanh:");
                    for (int i = 0; i < soPhanTu; i++) {
                        System.out.println("==Nhap sinh vien thu:" + (i + 1));
                        nv[i] = new NhanVienKinhDoanh1();
                        nv[i].input();
                    }
                    break;
                case 4:
                    NhanVien1[] SortedNVS = NhanVien1.Sort(nv);
                    System.out.println("+++Xuat thong tin sinh vien kinh doanh:");
                    for (int i = 0; i < soPhanTu; i++) {
                        System.out.println("==Xuat sinh vien thu:" + (i + 1));
                        SortedNVS[i].output();
                    }
                    break;
                case 5:
                    double sum = 0;
                    for (int i = 0; i < soPhanTu; i++) {
                        String ten = "ho chi minh";
                        if (nv[i].getNoiSinh().equals(ten)) {
                            sum += nv[i].tinhLuong();
                        }
                    }
                    System.out.println("+++Tinh tong luong nhan vien luong>5tr song HCM:" + sum);
                    break;
                default:
                    break;
            }
        } while (luachon != 0);
    }
}
