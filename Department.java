public class Department {
    //private: Truy cập nội bộ trong class
    private String maBoPhan;
    private String tenBoPhan;
    private int soLuongNV;

    Department() {}
    Department(String maBoPhan, String tenBoPhan, int soLuongNV) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.soLuongNV = soLuongNV;
    }
    @Override
    public String toString() {
        return maBoPhan + "\t" + tenBoPhan + "\t\t\t" + soLuongNV;
    }
    public String getTenBoPhan(){
        return tenBoPhan;
    }
}