public class Employee extends Staff implements ICalculator {
    /* Employee được kế thừa (extends) từ lớp Staff và triển khai (implements) các method đã được khai báo hoặc
    định nghĩa sẵn từ ICalculator */
    int soGioLamThem;
    Employee(){}
    Employee(int maNhanVien, String tenNhanVien, int tuoi, double heSoLuong,
             String ngayVaoLam, String boPhan, int nghiPhep, int soGioLamThem) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoi;
        this.heSoLuong = heSoLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhan = boPhan;
        this.nghiPhep = nghiPhep;
        this.soGioLamThem = soGioLamThem;
    }

    public void displayInformation(){
        System.out.print(maNhanVien + "\t");
        System.out.print(tenNhanVien + "\t\t");
        System.out.print(tuoiNhanVien + "\t\t");
        System.out.print(heSoLuong + "\t\t");
        System.out.print(ngayVaoLam + "\t\t");
        if(boPhan.length() < 10) {
            System.out.print(boPhan + "\t\t\t");
        }else {
            System.out.print(boPhan + "\t\t");
        }
        System.out.print(nghiPhep + "\t\t\t");
        System.out.print(soGioLamThem + "\t\t\t\t");
        System.out.println(luongNV);
    }
    public double calculateSalary() {
        luongNV = (int) (heSoLuong * 3000000 + soGioLamThem * 200000);
        return luongNV;
    }
}
