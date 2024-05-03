package StudyGroup.Study0502;
//사용자로부터 사각형의 크기(가로와 세로)를 입력받아,
//그 크기만큼의 별(*)로 채워진 사각형을 그리는 프로그램을 작성하시오.

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {

        

        Scanner scanner = new Scanner(System.in);
        System.out.print("가로 길이를 입력하세요: ");
        int width = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("세로 길이를 입력하세요: ");
        int height = scanner1.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
