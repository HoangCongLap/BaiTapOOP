package BaiKiemTra108;

import baikiemtrath135.*;
import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public class NhanVienLapTrinh1 extends NhanVien1 {

    private String chuyenMon;
    private int soNamKinhNghiem;
    private double thuongKPI;

    public NhanVienLapTrinh1() {
        super();
        this.chuyenMon = "";
        this.soNamKinhNghiem = 0;
        this.thuongKPI = 0;
    }

    public NhanVienLapTrinh1(String hoTen, int ngaySinh, String soCanCuoc, String noiSinh, double luong, String chuyenMon, int soNamKinhNghiem, double thuongKPI) {
        super(hoTen, ngaySinh, soCanCuoc, noiSinh, luong);
        this.chuyenMon = chuyenMon;
        this.soNamKinhNghiem = soNamKinhNghiem;
        this.thuongKPI = thuongKPI;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public int getSoNamKinhNghiem() {
        return soNamKinhNghiem;
    }

    public double getThuongKPI() {
        return thuongKPI;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public void setSoNamKinhNghiem(int soNamKinhNghiem) {
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    public void setThuongKPI(double thuongKPI) {
        this.thuongKPI = thuongKPI;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuyen mon:");
        chuyenMon = scanner.nextLine();
        System.out.print("Nhap so nam kinh nghiem:");
        soNamKinhNghiem = scanner.nextInt();
        System.out.print("Nhap thuong KPI:");
        thuongKPI = scanner.nextDouble();
    }

    @Override
    public double tinhLuong() {
        return this.thuongKPI + this.getLuong();
    }

//    public void sort() {
//        for (int i = 0; i < lT.length; i++) {
//            for (int j = 0; j < lT.length; j++) {
//                if()
//                    
//                            
//            }
//        }
//    }

    @Override
    public void output() {
        super.output();
        System.out.println("Chuyen mon:" + this.getChuyenMon());
        System.out.println("So nam kinh nghiem:" + this.getSoCanCuoc());
        System.out.println("Thuong KPI:" + this.getThuongKPI());
        System.out.println("Luong:" + tinhLuong());
    }
}
