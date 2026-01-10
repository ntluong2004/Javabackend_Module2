/**
 * <p>
 * public class Exercise1 {
 * <p>
 * Phân biệt OR và OL: Trong mỗi TH sau, hãy phán đoán xem có xuất hiện hiện tượng OL hoặc OR hay không?
 * <p>
 * Trường hợp 1
 * package abc;
 * public class HocVien {
 * public void a() {
 * System.out.println("a cha");
 * }
 * }
 * package abc;
 * public class SinhVien extends HocVien {
 * public void a() {
 * System.out.println("a con");
 * }
 * }
 * Overriding vì lớp con đang định nghĩa lại phương thức a của lớp  cha
 */

/**
 * Trường hợp 2
 * package abc;
 * public class HocVien {
 *    void a() {
 *        System.out.println("a cha");
 *    }
 * }
 * package abc;
 * public class SinhVien extends HocVien {
 *    public void a() {
 *        System.out.println("a con");
 *    }
 * }
 * Overriding vì lớp con vẫn đang định nghĩa lại phương thức của lớp cha. Có một điểm
 * khác ở đây là lớp cha dùng default access khi không khai báo public, còn ở lớp con thì lại có public
 * Trong overriding lớp con có thể mở rộng phạm vi truy cập (default lên public là hợp lệ) nhưng không thể thu hẹp (vd: public - private không được phép)
 */

/**
 *Trường hợp 3
 * package abc;
 * public class HocVien {
 *    private void a() {
 *        System.out.println("a cha");
 *    }
 * }
 * package abc;
 * public class SinhVien extends HocVien {
 *    public void a() {
 *        System.out.println("a con");
 *    }
 * }
 * Không phải Overriding cũng không phải OverLoading. Vì phương thước "a" của lớp cha đang là private nên việc
 * định nghĩa lại phương thức a ở lớp con đang là định nghĩa phương thức mới chứ không phải truy cập tới "a" của lớp cha
 */

/**
 * Trường hợp 4
 * package abc;
 * public class HocVien {
 *    public void a() {
 *        System.out.println("a cha");
 *    }
 * }
 * package abc;
 * public class SinhVien extends HocVien {
 *    protected void a() {
 *        System.out.println("a con");
 *    }
 * }
 *Lỗi: lý thuyết đã được nhắc đến ở trường hợp 2. Lớp con không được thu hẹp phạm vi truy cập của các thành phần trong lớp cha
 */

/**
 * Trường hợp 5
 * package abc;
 * public class HocVien {
 *    public byte a() {
 *        System.out.println("a cha");
 *        return 1;
 *    }
 * }
 * package abc;
 * public class SinhVien extends HocVien {
 *    public int a() {
 *        System.out.println("a con");
 *        return 1;
 *    }
 * }
 * Nhìn thì giống OverLoading nhưng mà nhầm rồi ní ơi
 * (Lỗi: Quy tắc kiểu trả về nguyên thủy: Trong Java, khi ghi đè một phương thức có kiểu trả về là các kiểu dữ
 * liệu nguyên thủy (primitive types như int, byte, long, double,...), thì phương thức ở lớp con phải có kiểu
 * trả về giống hệt lớp cha)
 */

/**
 * Trường hợp 6
 * package abc;
 * public class HocVien {
 *    public Animal a() {
 *        System.out.println("a cha");
 *        return null;
 *    }
 * }
 * package abc;
 * public class SinhVien extends HocVien {
 *    public Dog a() {
 *        System.out.println("a con");
 *        return null;
 *    }
 * }
 *Overriding: Ở trường hợp 5 đã nêu rõ là quy tắc chỉ áp dụng với kiểu dữ liệu nguyên thuỷ, còn animal và dog ở đây là object.
 * Dog là con của animal, Lớp cha trả về một động vật "animal" và lớp con sau khi ghi đè th trả về "Dog" cũng là một động vật
 * Nên vẫn đúng
 */

/**
 * Trường hợp 7
 * package abc;
 * public class HocVien {
 *    public void a(){
 *    }
 * }
 * package abc;
 * public class SinhVien extends HocVien {
 *    public void a(int i){
 *    }
 * }
 * Overloading: tham số truyền vào đã thay đổi.
 */

/**
 * Trường hợp 8
 * package abc;
 * public class HocVien {
 *    public static void a(){
 *    }
 * }
 * package abc;
 * public class SinhVien extends HocVien {
 *    public static void a(){
 *    }
 * }
 *Không lỗi. Nhưng trường hợp này không phải đa hình. Với static phương thức sẽ thuộc về lớp chứ không phải đối tượng
 * Nên trong trường hợp này việc định nghĩa phuương thức a  ở lớp con đang liên quan tới một khái niệm là Method Hidding.
 * Nếu trong chương trình chúng ta tạo một biến object mới
 * vd: HocVien obj = new SinhVien;
 *     obj.a;
 * Thì sẽ gọi tới phương thức a của cha chứ không phải a của con
 * Nói cách khác nó sẽ tương đương với việc chúng ta dùng 'HocVien.a'
 */

/**
 * Trường hợp 9
 * package abc;
 * public class HocVien {
 *    public void a(int b, int c){
 *    System.out.println(b+""+c)
 *    }
 * }
 * package abc;
 * public class SinhVien extends HocVien {
 *    public void a(double d, int c){
 *    System.out.println(d+""+c)
 *    }
 * }
 * Overloading: vì đã thay đổi kiểu dữ liệu của tham ố truyền vào
 * lưu ý: Ở đây có một tình huống mơ hồ: khi gọi a và truyền vào 2 tham số int thif sẽ dùng phương thức của cha, còn truyền vào double int thì sẽ
 * duùng phương thức của con
 */

/**
 * Trường hợp 10
 * package abc;
 * public class HocVien {
 *    public void a(int b, int c){
 *    System.out.println(b+""+c)
 *    }
 * }
 * package abc;
 * public class SinhVien extends HocVien {
 *    public void b(double d, int c){
 *    System.out.println(d+""+c)
 *    }
 * }
 *Không phải OR cũng không phải OL. lớp con đang định nghĩa một phương thức hoàn toàn mới
 */

