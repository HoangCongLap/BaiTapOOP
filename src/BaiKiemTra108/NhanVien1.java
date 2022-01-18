package BaiKiemTra108;

import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public abstract class NhanVien1 {

    static NhanVien1[] sort(NhanVien1[] nv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String hoTen;
    private int ngaySinh;
    private String soCanCuoc;
    private String noiSinh;
    private double luong;

    public NhanVien1() {
        this.hoTen = "";
        this.ngaySinh = 0;
        this.soCanCuoc = "";
        this.noiSinh = "";
        this.luong = 0;
    }

    public NhanVien1(String hoTen, int ngaySinh, String soCanCuoc, String noiSinh, double luong) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soCanCuoc = soCanCuoc;
        this.noiSinh = noiSinh;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public String getSoCanCuoc() {
        return soCanCuoc;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public double getLuong() {
        return luong;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setSoCanCuoc(String soCanCuoc) {
        this.soCanCuoc = soCanCuoc;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten:");
        hoTen = scanner.nextLine();
        System.out.print("Nhap ngay sinh:");
        ngaySinh = scanner.nextInt();
        scanner = new Scanner(System.in);
        System.out.print("Nhap so can cuoc:");
        soCanCuoc = scanner.nextLine();
        System.out.print("Nhap noi sinh:");
        noiSinh = scanner.nextLine();
        System.out.print("Nhap luong:");
        luong = scanner.nextDouble();
    }

    public void output() {
        System.out.println("Ho ten:" + this.getHoTen());
        System.out.println("Ngay sinh:" + this.getNgaySinh());
        System.out.println("So can cuoc:" + this.getSoCanCuoc());
        System.out.println("Noi sinh:" + this.getNoiSinh());
        System.out.println("Luong:" + this.getLuong());
    }

    public abstract double tinhLuong();

    public static NhanVien1[] Sort(NhanVien1[] nvs) {
        for (int i = 0; i < nvs.length - 1; i++) {
            for (int j = i + 1; j < nvs.length; j++) {
                if (nvs[i].luong > nvs[j].luong) {
                    NhanVien1 max = nvs[i];
                    nvs[i] = nvs[j];
                    nvs[j] = max;
                }
            }
        }
        return nvs;
    }
}
