import java.util.Scanner;

public class BTVN_2 {
    public static void main(String[] args) {
        final double ty_gia = 23500f;
        float usd;

        System.out.println("Đổi tiền USD => VND");
        Scanner sc = new Scanner(System.in);

        System.out.println("Vui lòng nhập số USD cần đổi: ");
        usd = Float.parseFloat(sc.nextLine());

        System.out.println("Số VND sau khi đổi là: " +  (usd * ty_gia) + " vnđ");

    }
}
