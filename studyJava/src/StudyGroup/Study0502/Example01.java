package StudyGroup.Study0502;

import java.util.Arrays;
import java.util.Scanner;

//[배열의 최대값과 최소값 찾기]
//배열의 최대값과 최소값을 찾는 프로그램을 작성하시오.
public class Example01 {
    public static void main(String[] args) {
       int[] str1=new int[] {100,54,6,78,98,74,85,65,24,26};

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        for (int i=0; i<str1.length; i++) {
            if (str1[i] < num) {
                System.out.println(str1[i]);
            } else if (str1[i] > num) {

            }
        }
    }
}
