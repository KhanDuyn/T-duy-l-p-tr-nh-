import java.util.Scanner;

public class BTVN_1 {
    public static void main(String[] args) {
        final byte so_lan_nhap = 5;
        int tongCacSoNhapVao;
        System.out.println("Tính trung bình năm số nhập");
        Scanner scan = new Scanner(System.in);

        System.out.println("Vui lòng nhập số thứ nhất: ");
        tongCacSoNhapVao = Integer.parseInt(scan.nextLine());

        System.out.println("Vui lòng nhập số thứ hai: ");
        tongCacSoNhapVao += Integer.parseInt(scan.nextLine());

        System.out.println("Vui lòng nhập số thứ ba: ");
        tongCacSoNhapVao += Integer.parseInt(scan.nextLine());

        System.out.println("Vui lòng nhập số thứ tư: ");
        tongCacSoNhapVao += Integer.parseInt(scan.nextLine());

        System.out.println("Vui lòng nhập số thứ năm: ");
        tongCacSoNhapVao += Integer.parseInt(scan.nextLine());

        System.out.println("Trung binh của năm số nhập là: " + (int) (tongCacSoNhapVao / so_lan_nhap));
    }
}
