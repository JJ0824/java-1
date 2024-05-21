package StudyGroup.Study0521;

import Java0326.A;
import StudyGroup.Study0402.Array;

import java.util.Arrays;
import java.util.Scanner;

class Name {
    public String[] strings(String[] studentName) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < studentName.length; i++) {
            studentName[i] = scanner.nextLine();
        }
        return studentName;
    }
}
public class HW01 {

    //DW 고등학교 1학년 신입생 이름 저장 프로그램
    //조건 : 외부클래스 사용 / 입력매게변수 사용
    //각 A,B,C반이 있으며 각 반의 학생은 5명으로 규정한다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] A = new String[5];
        String[] B = new String[5];
        String[] C = new String[5];

        Name name = new Name();
        String[] string = name.strings(A);
        String[] string1 = name.strings(B);
        String[] string2 = name.strings(C);


        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(C));
    }
}