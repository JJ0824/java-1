package StudyGroup.Study0416;
import java.util.Scanner;
public class Daa1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("당신의 키는 160cm 이상입니까? (예/아니오)");
            String heightAnswer = scanner.nextLine();

            System.out.println("당신은 검은색 머리입니까? (예/아니오)");
            String hairColorAnswer = scanner.nextLine();

            String candidate = (heightAnswer.equalsIgnoreCase("예") && hairColorAnswer.equalsIgnoreCase("예")) ||
                    (heightAnswer.equalsIgnoreCase("아니오") && hairColorAnswer.equalsIgnoreCase("아니오"))
                    ? "짱구" : "맹구";

            System.out.println("당신이 선택한 후보는 " + candidate + "입니다.");

            if (candidate.equals("짱구")) {
                System.out.println("짱구 173cm 검은머리 여자친구X 19살 반팔 긴바지");
            } else {
                System.out.println("맹구 135cm 갈색머리 여자친구O 16살 긴팔 반바지");
            }

            scanner.close();
        }
    }


