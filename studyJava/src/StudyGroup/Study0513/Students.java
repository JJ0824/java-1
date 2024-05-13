package StudyGroup.Study0513;

import java.util.Scanner;

public class Students {
    String string = "123451231";

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요");
        String text1 = sc.nextLine();
        System.out.println("찾고자 하는 문자혹은 문자열을 입력하세요:");
        String text2 = sc.nextLine();




        int count = 0;
        void num() {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == text1.charAt(0)) {
                    count++;
                }
            }
            System.out.println("입력하신 문자가" + count + "번 포함되어 있습니다.");
        }

}
