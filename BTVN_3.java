import java.util.Scanner;

public class BTVN_3 {
    public static void main(String[] args) {
        float xTamDuongTron; // tọa độ x của tâm đường tròn
        float yTamDuongTron; // tọa độ y của tâm đường tròn
        float r; //bán kính đường tròn
        float xDiemM; // tọa độ x của điểm M
        float yDiemM; // tọa độ y của điểm M
        float khoangCach; // khoảng cách từ điểm M đến tâm đường tròn

        System.out.println("Xác định tọa độ điểm M");
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập tọa độ x của tâm đường tròn: ");
        xTamDuongTron = Float.parseFloat(sc.nextLine());
        System.out.print("Vui lòng nhập tọa độ y của tâm đường tròn: ");
        yTamDuongTron = Float.parseFloat(sc.nextLine());

        System.out.print("Vui lòng nhập bán kính của đường tròn: ");
        r = Float.parseFloat(sc.nextLine());

        System.out.print("Vui lòng nhập tọa độ x của điểm M: ");
        xDiemM = Float.parseFloat(sc.nextLine());
        System.out.print("Vui lòng nhập tọa độ y của điểm M: ");
        yDiemM = Float.parseFloat(sc.nextLine());

        khoangCach = (float) Math.sqrt((xDiemM-xTamDuongTron)*(xDiemM-xTamDuongTron) + (yDiemM-yTamDuongTron)*(yDiemM-yTamDuongTron));

        if(khoangCach == r) {
            System.out.println("Điểm M nằm trên đường tròn.");
        } else if (khoangCach > r) {
            System.out.println("Điểm M nằm ngoài đường tròn.");
        } else {
            System.out.println("Điểm M nằm trong đường tròn.");
        }
    }
}
