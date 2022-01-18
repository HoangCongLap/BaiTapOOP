package BaiKiemTra108;


import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public class NhanVienKinhDoanh1 extends NhanVien1 {

    private double phuCap;
    private double phiCongTac;

    public NhanVienKinhDoanh1() {
        super();
        this.phuCap = 0;
        this.phiCongTac = 0;
    }

    public NhanVienKinhDoanh1(String hoTen, int ngaySinh, String soCanCuoc, String noiSinh, double luong, double phuCap, double phiCongTac) {
        super(hoTen, ngaySinh, soCanCuoc, noiSinh, luong);
        this.phuCap = phuCap;
        this.phiCongTac = phiCongTac;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public double getPhiCongTac() {
        return phiCongTac;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public void setPhiCongTac(double phiCongTac) {
        this.phiCongTac = phiCongTac;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap phu cap:");
        phuCap = scanner.nextDouble();
        System.out.print("Nhap phi cong tac:");
        phiCongTac = scanner.nextDouble();
    }

    @Override
    public double tinhLuong() {
        return this.phuCap + this.phiCongTac + this.getLuong();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Phu cap:" + this.getPhuCap());
        System.out.println("Phi cong tac:" + this.getPhiCongTac());
        System.out.println("Luong:" + tinhLuong());
    }
}
