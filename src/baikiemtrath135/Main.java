package baikiemtrath135;

import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public class Main {

    public static void main(String[] args) {
//        NhanVien nv = new NhanVienLapTrinh("lcp", "12/4/2002", "2D", "Lavan", 1, "1S", 1, 1);
//        NhanVien nv2 = new NhanVienLapTrinh("lbp", "12/4/2003", "3D", "Lavanha", 2, "1ss", 12, 12);
//        NhanVien[] nvs = new NhanVien[2];
//        nvs[0] = nv;
//        nvs[1] = nv2;
//        NhanVien[] sortedNVS = NhanVien.sort(nvs);
//        System.out.println();
//        for (int i = 0; i < 2; i++) {
//            System.out.println("======");
//            sortedNVS[i].output();
//        }
//       
//    }

//    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu:");
        int soPhanTu = scanner.nextInt();
        NhanVien[] nv = new NhanVien[soPhanTu];
        int luachon;
        do {
            System.out.println("\nMENU");
            System.out.println("1.Nhap danh sach nhan vien lap trinh.\n"
                    + "2.Nhap danh sach nhan vien phu vu.\n"
                    + "3.Nhap danh sach nhan vien kinh doanh.\n"
                    + "4.Xuat danh sach nhan vienn lap trinh.\n"
                    + "5.Tinh tong luong nhan vien luong>5tr.\n");
            System.out.print("Nhap lua chon:");
            luachon = scanner.nextInt();
            switch (luachon) {
                case 1:
                    System.out.println("+++Nhap thong tin sinh vien lap trinh:");
                    for (int i = 0; i < soPhanTu; i++) {
                        System.out.println("==Nhap sinh vien thu:" + (i + 1));
                        nv[i] = new NhanVienLapTrinh();
                        nv[i].input();
                    }
                    break;
                case 2:
                    System.out.println("+++Nhap thong tin sinh vien phu vu:");
                    for (int i = 0; i < soPhanTu; i++) {
                        System.out.println("==Nhap sinh vien thu:" + (i + 1));
                        nv[i] = new NhanVienPhuVu();
                        nv[i].input();
                    }
                    break;
                case 3:
                    System.out.println("+++Nhap thong tin sinh vien kinh doanh:");
                    for (int i = 0; i < soPhanTu; i++) {
                        System.out.println("==Nhap sinh vien thu:" + (i + 1));
                        nv[i] = new NhanVienKinhDoanh();
                        nv[i].input();
                    }
                    break;
                case 4:
                    NhanVien[] sortedNVS = NhanVien.sort(nv);
                    System.out.println("+++Xuat thong tin sinh vien lap trinh:");
                    for (int i = 0; i < soPhanTu; i++) {
                        System.out.println("==Xuat sinh vien thu:" + (i + 1));
                        sortedNVS[i].output();
                    }
                    break;
                case 5:
                    double sum = 0;
                    for (int i = 0; i < soPhanTu; i++) {
                        if (nv[i].tinhLuong() > 5000000) {
                            sum += nv[i].tinhLuong();
                        }
                    }
                    System.out.println("+++Tinh tong luong nhan vien luong>5tr:" + sum);
                    break;
                default:
                    break;
            }
        } while (luachon != 0);
    }
}
