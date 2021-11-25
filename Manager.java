public class Manager extends Staff implements ICalculator {
    /* Manager được kế thừa (extends) từ Staff và triển khai (implements) các method đã được khai báo hoặc định
    nghĩa từ ICalculator */
    String chucDanh;
    Manager(){}
    Manager(int maNhanVien, String tenNhanVien, int tuoi, double heSoLuong, String ngayVaoLam,
            String boPhan, int nghiPhep, String chucDanh) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoi;
        this.heSoLuong = heSoLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhan = boPhan;
        this.nghiPhep = nghiPhep;
        this.chucDanh = chucDanh;
    }

    public void displayInformation() {
        System.out.print(maNhanVien + "\t");
        System.out.print(tenNhanVien + "\t\t");
        System.out.print(tuoiNhanVien + "\t\t");
        System.out.print(heSoLuong + "\t\t");
        System.out.print(ngayVaoLam + "\t\t");
        if(boPhan.length()< 10) {
            System.out.print(boPhan + "\t\t\t");
        }else {
            System.out.print(boPhan + "\t\t");
        }
        System.out.print(nghiPhep + "\t\t\t\t\t\t\t");
        System.out.print(luongNV + "\t\t");
        System.out.println(chucDanh);
    }

    public double calculateSalary(){
        if(chucDanh.equalsIgnoreCase("Bussiness Leader")) {
            luongNV = (int) (heSoLuong * 5000000 + 8000000);
        }else if (chucDanh.equalsIgnoreCase("Project Leader")){
            luongNV = (int) (heSoLuong * 5000000 + 5000000);
        }else if(chucDanh.equalsIgnoreCase("Technical Leader")) {
            luongNV = (int) (heSoLuong * 5000000 + 5000000);
        }
        return luongNV;
    }
}
