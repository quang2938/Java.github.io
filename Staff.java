public abstract class Staff{
    //abstract: Dùng để chứa những method cụ thể và được triển khai và quyết định bởi các lớp con
    //protected: Là thành phần được bảo vệ, bị hạn chế quyền truy cập từ bên ngoài (cụ thể là ngoài package)
    //public: Tự do truy cập
    protected int maNhanVien;
    protected String tenNhanVien;
    protected int tuoiNhanVien;
    protected double heSoLuong;
    protected String ngayVaoLam;
    protected String boPhan;
    protected int nghiPhep;
    protected int luongNV;
    public abstract void displayInformation();
    public String getBoPhan(){
        return boPhan;
    }
    public int getMaNhanVien(){
        return maNhanVien;
    }
    public String getTenNhanVien(){
        return tenNhanVien;
    }
    public int getLuongNV(){return luongNV;}
}



