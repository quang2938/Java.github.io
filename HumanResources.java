import java.util.*;

public abstract class HumanResources {
    //ArrayList: Là một mảng động sử dụng để lưu trữ các phần tử.
    public static ArrayList<Staff> listStaff = new ArrayList<>();
    public static ArrayList<Department> listDepartment = new ArrayList<>();
    public static void init(){
        Manager bussinessLeader = new Manager(1000,"Nguyen Van Bi", 25,1.5,
                "20/01/2019", "Kinh doanh", 2, "Bussiness Leader");
        Manager projectLeader = new Manager(1105, "Nguyen Van Pi", 26,1.4,
                "20/02/2019", "Dự án", 2, "Project Leader");
        Manager technicalLeader = new Manager(1004, "Nguyen Van Tec", 25,1.3,
                "20/03/2019", "Kỹ thuật", 2, "Technical Leader");

        Employee baoVe1 = new Employee(1011, "Nguyen Van Ve", 20,
            1.0, "20/01/2020", "An ninh", 2, 20 );
        Employee baoVe2 = new Employee(1070, "Nguyen Van Vu", 20,
                1.0, "20/01/2020", "An ninh", 2, 10 );
        Employee baoVe3 = new Employee(1080, "Nguyen Van Vinh", 20,
                1.0, "20/01/2020", "An ninh", 2, 5);
        Employee nhanVienVS1 = new Employee(1010, "Nguyen Van Sinh", 26,1.0,
                "20/01/2020", "Vệ sinh", 2, 8);
        Employee nhanVienVS2 = new Employee(1070, "Nguyen Van Si", 26,1.0,
                "20/01/2020", "Vệ sinh", 2, 4);
        Employee thuNgan = new Employee(1020, "Nguyen Van Ngan", 21,
                1.1, "20/02/2020", "Tài chính", 2, 7);
        Employee keToan = new Employee(1030, "Nguyen Van Toan", 22,1.2,
                "20/03/2020", "Tài chính", 1, 2);
        Employee leTan = new Employee(1040, "Nguyen Van Pho", 23,
                1.2, "20/03/2020", "CSKH", 2, 2);
        Employee tiepKhach = new Employee(1050, "Nguyen Van Tri", 24,1.2,
                "20/04/2020", "CSKH", 2,6);
        Employee customerSV = new Employee(1060, "Nguyen Van Kieu", 25,1.2,
                "20/05/2020", "CSKH", 0,5);
        Employee Seller = new Employee(1111, "Nguyen Van Seo", 30, 1.2,
                "20/3/2020", "Kinh doanh", 1,5);
        Employee Strategy = new Employee(1121, "Nguyen Van Gy", 25, 1.2,
                "20/11/2020", "Dự án", 1,4);
        Employee Engineer = new Employee(1131, "Nguyen Van En", 30, 1.2,
                "20/12/2020", "Kinh doanh", 1,9);

        Department anNinh = new Department("A1510", "An ninh", 3);
        Department veSinh = new Department("A1520", "Vệ sinh", 2);
        Department taiChinh = new Department("A1530", "Tài chính", 2);
        Department customerService = new Department("A1540", "CSKH", 3);
        Department Bussiness = new Department("A1550", "Kinh doanh", 1);
        Department Project = new Department("A1560", "Dự án", 1);
        Department Tech = new Department("A1570", "Kỹ thuật", 1);

        listStaff.add(bussinessLeader);
        listStaff.add(projectLeader);
        listStaff.add(technicalLeader);
        listStaff.add(baoVe1);
        listStaff.add(baoVe2);
        listStaff.add(baoVe3);
        listStaff.add(nhanVienVS1);
        listStaff.add(nhanVienVS2);
        listStaff.add(thuNgan);
        listStaff.add(keToan);
        listStaff.add(leTan);
        listStaff.add(tiepKhach);
        listStaff.add(customerSV);
        listStaff.add(Seller);
        listStaff.add(Strategy);
        listStaff.add(Engineer);
        listDepartment.add(anNinh);
        listDepartment.add(veSinh);
        listDepartment.add(taiChinh);
        listDepartment.add(customerService);
        listDepartment.add(Bussiness);
        listDepartment.add(Project);
        listDepartment.add(Tech);
        bangLuong();
    }

    public static void printListStaff(){
        for (int i = 0; i < listStaff.size(); i++){
            listStaff.get(i).displayInformation();
        }
    }

    public static void printListDepartment(){
        for (int i = 0; i < listDepartment.size(); i++){
            System.out.println(listDepartment.get(i).toString());
        }
    }

    public static void printListDepartmentStaff(){
        for (int i = 0; i < listDepartment.size(); i++){
            System.out.println("\n" + listDepartment.get(i).getTenBoPhan());
            for (int a = 0; a < listStaff.size(); a++) {
                if(listStaff.get(a).getBoPhan().equalsIgnoreCase(listDepartment.get(i).getTenBoPhan())){
                    listStaff.get(a).displayInformation();
                }
            }
        }
    }

    public static void themNVmoi(){
        Scanner sc = new Scanner(System.in);
        int numb  = sc.nextInt();
        do {
            if(numb == 1) {
                System.out.println("Mã nhân viên");
                    int maNhanVien = sc.nextInt();
                System.out.println("Tên nhân viên");
                    sc.nextLine();
                    String tenNhanVien = sc.nextLine();
                System.out.println("Tuổi nhân viên");
                    int tuoiNhanVien = sc.nextInt();
                System.out.println("Hệ số lương");
                    double heSoLuong = sc.nextDouble();
                System.out.println("Ngày vào làm");
                    String ngayVaoLam = sc.next();
                System.out.println("Bộ phận");
                    sc.nextLine();
                    String boPhan = sc.nextLine();
                System.out.println("Nghỉ phép");
                    int nghiPhep = sc.nextInt();
                System.out.println("Số giờ làm thêm");
                    int gioLamThem = sc.nextInt();
                Employee nvm = new Employee(maNhanVien, tenNhanVien, tuoiNhanVien,heSoLuong, ngayVaoLam, boPhan,
                        nghiPhep, gioLamThem);
                nvm.calculateSalary();
                nvm.displayInformation();
                listStaff.add(nvm);
            }else if (numb == 2) {
                System.out.println("Mã nhân viên");
                    int maNhanVien = sc.nextInt();
                System.out.println("Tên nhân viên");
                    sc.nextLine();
                    String tenNhanVien = sc.nextLine();
                System.out.println("Tuổi nhân viên");
                    int tuoiNhanVien = sc.nextInt();
                System.out.println("Hệ số lương");
                    double heSoLuong = sc.nextDouble();
                System.out.println("Ngày vào làm");
                    sc.nextLine();
                    String ngayVaoLam = sc.nextLine();
                System.out.println("Bộ phận");
                    String boPhan = sc.nextLine();
                System.out.println("Nghỉ phép");
                    int nghiPhep = sc.nextInt();
                System.out.println("Chức danh");
                    sc.nextLine();
                    String chucDanh = sc.nextLine();
                Manager lanhDaoMoi = new Manager(maNhanVien, tenNhanVien, tuoiNhanVien,heSoLuong, ngayVaoLam,
                        boPhan, nghiPhep, chucDanh);
                lanhDaoMoi.calculateSalary();
                lanhDaoMoi.displayInformation();
                listStaff.add(lanhDaoMoi);
            }
        }while(numb > 2);
    }

    public static void timNhanVien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tìm nhân viên theo mã nhân viên = 1 / tìm nhân viên theo tên nhân viên = 2");
        int numb = sc.nextInt();
            do {
                boolean kiemTra = false;
                if(numb == 1){
                    System.out.println("Vui lòng nhập mã nhân viên");
                    int timMaNV = sc.nextInt();
                    for (int i = 0; i < listStaff.size(); i++) {
                        if (timMaNV == listStaff.get(i).getMaNhanVien()) {
                            listStaff.get(i).displayInformation();
                            kiemTra = true;
                        }
                    }
                    if(!kiemTra) {
                        System.out.println("Không có mã nhân viên này");
                    }
                }else if(numb == 2){
                    System.out.println("Vui lòng nhập tên nhân viên");
                    sc.nextLine();
                    String timTenNV = sc.nextLine();
                    for (int i = 0; i < listStaff.size(); i++){
                        if(timTenNV.equalsIgnoreCase(listStaff.get(i).getTenNhanVien())){
                            listStaff.get(i).displayInformation();
                            kiemTra = true;
                        }
                    }
                    if(!kiemTra){
                        System.out.println("Không có tên nhân viên này");
                    }
                }
            }while (numb > 2);
        }

    public static void bangLuong() {
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i) instanceof Employee) {
                //instanceof: So sánh kiểu trả về boolean
                //So sánh kiểu giữa listStaff.get(i) và class Employee
                ((Employee) listStaff.get(i)).calculateSalary();
            }else {
                ((Manager) listStaff.get(i)).calculateSalary();
            }
        }
    }

    public static void bangLuongTangDan() {
        Comparator<Staff> tangDan = Comparator.comparingInt(Staff::getLuongNV);
        //Khai báo hàm so sánh được phép truy cập vào class Staff phương thức getLuongNV
        listStaff.sort(tangDan);
        //Sắp xếp listStaff theo Comparator tangDan
        for (int i = listStaff.size() - 1; i > -1; i--) {
            listStaff.get(i).displayInformation();
            //Vòng for cho phép hiển thị thông tin nhân viên theo lương tăng dần
        }
    }

    public static void bangLuongGiamDan() {
        Comparator<Staff> giamDan = Comparator.comparingInt(Staff::getLuongNV);
        //Khai báo hàm so sánh được phép truy cập vào class Staff phương thức getLuongNV
        listStaff.sort(giamDan);
        //Sắp xếp listStaff theo Comparator giamDan
        for (int i = 0; i < listStaff.size(); i++) {
            listStaff.get(i).displayInformation();
            //Vòng for cho phép hiển thị thông tin nhân viên theo lương giảm dần
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int menuNumb;
        init();
        do {
            System.out.println("\nCác chức năng của chương trình quản lý nhân sự công ty");
            System.out.println("1) Danh sách nhân viên trong công ty");
            System.out.println("2) Các bộ phận trong công ty");
            System.out.println("3) Các nhân viên theo từng bộ phận");
            System.out.println("4) Thêm nhân viên mới");
            System.out.println("5) Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên");
            System.out.println("6) Hiển thị bảng lương của nhân viên theo thứ tự giảm dần");
            System.out.println("7) Hiển thị bảng lương của nhân viên theo thứ tự tăng dần");
            System.out.println("8) Thoát");
            System.out.println("Hãy nhập số 1~8 tương ứng với sự lựa chọn của bạn");
            menuNumb = sc.nextInt();
            switch (menuNumb) {
                case 1 -> {
                    System.out.println("1) Danh sách nhân viên trong công ty");
                    System.out.println("\nMNV\t\tTên nhân viên\t\tTuổi\tHSL\t\tNgày vào làm\tBộ phận\t\t Nghỉ phép\tGiờ làm thêm\t Lương nhân viên \tChức danh");
                    printListStaff();
                }
                case 2 -> {
                    System.out.println("2) Các bộ phận trong công ty");
                    System.out.println("\nMã\t\tTên bộ phận\t Số người");
                    printListDepartment();
                }
                case 3 -> {
                    System.out.println("3) Các nhân viên theo từng bộ phận");
                    printListDepartmentStaff();
                }
                case 4 -> {
                    System.out.println("4) Thêm nhân viên thường = 1, thêm lãnh đạo = 2");
                    themNVmoi();
                }
                case 5 -> {
                    System.out.println("5) Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên\n");
                    timNhanVien();
                }
                case 6 -> {
                    System.out.println("6) Hiển thị bảng lương của nhân viên theo thứ tự giảm dần");
                    System.out.println("\nMNV\t\tTên nhân viên\t\tTuổi\tHSL\t\tNgày vào làm\tBộ phận\t\t Nghỉ phép" +
                            "\tGiờ làm thêm\t Lương nhân viên \tChức danh");
                    bangLuongTangDan();
                }
                case 7 -> {
                    System.out.println("7) Hiển thị bảng lương của nhân viên theo thứ tự tăng dần");
                    System.out.println("\nMNV\t\tTên nhân viên\t\tTuổi\tHSL\t\tNgày vào làm\tBộ phận\t\t Nghỉ phép\t" +
                            "Giờ làm thêm\t Lương nhân viên \tChức danh");
                    bangLuongGiamDan();
                }
                case 8 -> System.out.println("Cảm ơn bạn đã sử dụng chương trình");
                default -> System.out.println("Bạn đã nhập sai, vui lòng nhập lại 1~8\n");
            }
        }while(menuNumb != 8);
    }
}