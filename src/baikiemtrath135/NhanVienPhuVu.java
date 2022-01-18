package baikiemtrath135;

/**
 *
 * @author LapHoang
 */
public class NhanVienPhuVu extends NhanVien{

    public NhanVienPhuVu() {
        super();
    }

    public NhanVienPhuVu(String hoTen, String ngaySinh, String soCanCuoc, String noiSinh, double luong) {
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
