package baikiemtrath135;

import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public abstract class NhanVien {

    private String hoTen;
    private String ngaySinh;
    private String soCanCuoc;
    private String noiSinh;
    private double luong;

    public NhanVien() {
        this.hoTen = "";
        this.ngaySinh = "";
        this.soCanCuoc = "";
        this.noiSinh = "";
        this.luong = 0;
    }

    public NhanVien(String hoTen, String ngaySinh, String soCanCuoc, String noiSinh, double luong) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soCanCuoc = soCanCuoc;
        this.noiSinh = noiSinh;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
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

    public void setNgaySinh(String ngaySinh) {
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
//        hoTen = scanner.nextLine();
        hoTen=scanner.nextLine();
        
        this.setHoTen(hoTen);
        System.out.print("Nhap ngay sinh:");
        ngaySinh = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.print("Nhap so can cuoc:");
        soCanCuoc = scanner.nextLine();
        System.out.print("Nhap noi sinh:");
        noiSinh = scanner.nextLine();
        System.out.print("Nhap luong:");
        luong = scanner.nextDouble();
    }

    public static NhanVien[] sort(NhanVien[] nvs) {
        for (int i = 0; i < nvs.length - 1; i++) {
            for (int j = i + 1; j < nvs.length; j++) {
                if (nvs[i].hoTen.compareTo(nvs[j].hoTen) > 0) {
                    NhanVien sx = nvs[i];
                    nvs[i] = nvs[j];
                    nvs[j] = sx;
                }
            }
        }
        return nvs;
    }

    public void output() {
        System.out.println("Ho ten:" + this.getHoTen());
        System.out.println("Ngay sinh:" + this.getNgaySinh());
        System.out.println("So can cuoc:" + this.getSoCanCuoc());
        System.out.println("Noi sinh:" + this.getNoiSinh());
        System.out.println("Luong:" + this.getLuong());
    }

    public abstract double tinhLuong();

}
