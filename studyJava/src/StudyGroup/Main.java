package StudyGroup;

import java.util.Scanner;
// 사용자가 입력한 숫자를 찾는 코드를 작성하시오.
public class Main {
    public static void main(String[] args) {
        long count = 0;
        Scanner scanner = new Scanner(System.in);
        long userNum = scanner.nextInt();
        for (long i = 0; ; i++) {
            count++;
            if (i == userNum) {
                System.out.println("유저가 입력한 값은 [ " + i + " ] 입니다." + count);
                break;
            }
        }
    }
}