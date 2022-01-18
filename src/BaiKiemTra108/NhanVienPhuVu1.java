package BaiKiemTra108;



/**
 *
 * @author LapHoang
 */
public class NhanVienPhuVu1 extends NhanVien1{

    public NhanVienPhuVu1() {
        super();
    }

    public NhanVienPhuVu1(String hoTen, int ngaySinh, String soCanCuoc, String noiSinh, double luong) {
        super(hoTen, ngaySinh, soCanCuoc, noiSinh, luong);
    }
    @Override
    public void input(){
        super.input();
    }
    @Override
    public double tinhLuong(){
        return this.getLuong();
    }
    @Override
      public void output(){
        super.output();
        System.out.println("luong:"+tinhLuong());
    }
}
