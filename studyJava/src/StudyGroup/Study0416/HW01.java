package StudyGroup.Study0416;

import java.util.Scanner;

/*
스무고개 코드를 작성하고 질문의 답을 했을때 후보와 일치 하는지 확인하시오.
질문지
1. 당신의 키는 160cm 이상입니까? 사용자가 예 아니오 둘중에 하나만 대답하게
2. 당신은 검은색 머리입니까?
3. 당신은 이성친구가 있습니까?
4. 당신의 나이는 12살보다 많습니까?
5. 당신은 반바지를 입었습니까?
후보 인포)
짱구 173cm 검은머리 여자친구X 19살 반팔 긴바지
맹구 135cm 갈색머리 여자친구O 16살 긴팔 반바지
철수 161cm 검은머리 여자친구0 18살 반팔 반바지
수지 160cm 빨간머리 남자친구X 14살 긴팔 긴바지
유리 162cm 탈색머리 남자친구0 17살 반팔 반바지
 */
public class HW01 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("당신의 키는 160cm 이상입니까? (예 / 아니오)");
        String height = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("당신은 검은색 머리입니까?? (예 / 아니오)");
        String color = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("당신은 이성친구가 있습니까? (예 / 아니오)");
        String friend = scanner3.nextLine();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("당신의 나이는 12살보다 많습니까? (예 / 아니오)");
        String age = scanner4.nextLine();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("당신은 반바지를 입었습니까? (예 / 아니오)");
        String pant = scanner5.nextLine();


       /* 짱구 173cm 검은머리 여자친구X 19살 반팔 긴바지   여기서부터 어떻게 조건을 걸고 어떻게 써야하는지 막힌곳
        맹구 135cm 갈색머리 여자친구O 16살 긴팔 반바지
        철수 161cm 검은머리 여자친구0 18살 반팔 반바지
        수지 160cm 빨간머리 남자친구X 14살 긴팔 긴바지
        유리 162cm 탈색머리 남자친구0 17살 반팔 반바지   */







    }
}