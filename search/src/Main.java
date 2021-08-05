import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        input();
    }
    public static void input(){
        String[] students = {"Duc", "Christian", "Michael", "Camila", "Sienna", "Tanya",
                "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học sinh muốn tìm kiếm : ");
        String studentName = scanner.nextLine();
        checkStudent(studentName, students);
        input();
    }

    public static void checkStudent(String name, String[] students) {
        int check = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                check = i;
                break;
            }
        }
        if (check != -1){
            System.out.printf("Tìm thấy học sinh tên %s ở vị trí thứ %d trong danh sách\n", name, check);
        }else {
            System.out.printf("Không tìm thấy học sinh có tên %s trong danh sách \n", name);
        }
    }
}
