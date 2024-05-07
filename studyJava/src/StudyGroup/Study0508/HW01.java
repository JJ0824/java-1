package StudyGroup.Study0508;
//복권 당첨 확인 프로그램 만들기
/*
프로그램에는 랜덤으로 생성되는 값 = 당첨 번호가 존재 하며(6개의 숫자), Scanner로부터 6개의 값 입력
유저가 값 6개를 입력한다.    Scanner 입력

조건.    if문
(당첨 번호 끼리는 서로 값이 중복 되지 않아야 한다.)
1등 = 6개 모두 일치   6개가 같다면(==) if문 System.out.println("축하드립니다 1등입니다");
2등 = 5개 일치       5개가 같다면(==) if문  System.out.println("축하드립니다 2등입니다");
3등 = 4개 일치       3개가 같다면(==) if문 System.out.println("축하드립니다 3등입니다");
나머지는 모두 꽝      아니라면 else문

//난수 생성법
Random rd = new Random();
        int randNum = rd.nextInt(10)+1; // 0 부터 입력한 (정수값-1) 범위에서 랜덤
 */
//1. 프로그램을 설계하시오.
//2. 코드를 작성하시오.

import java.util.Random;
import java.util.Scanner;

/*
    1.로또 당첨 프로그램을 만들기 위해 6개의 당첨번호를 저장 할 6개의 크기의 새로운 배열을 만든다
    1-2.1번에서 만든 배열에 6개의 중복되지 않는 난수 생성 한다 난수 생성을 할때
     로또번호 1~45까지의 숫자를 나타내야 하기 위해 (45)+1을 해준다
    2.유저에게 값을 입력받기 위해 Scnner 를 쓴다(한번 선언하고 6개의 값을 받는 코드를 작성)
    2-1.유저에게 입력받은 6개의 값이 저장되는 새로운 배열을 만든다.
    2-2.반복문과 스캐너를 이용해서 2-1에 만든 배열에 6개의 값을 넣어준다 당첨자를 가려내는것
    3.당첨결과를 확인하는 코드를 짠다.
    3-1.숫자확인 당청숫자랑 내가 뽑은 숫자를 비교한다.
    3-2.6개 모두 동일할시 1등,5개가 모두 동일할시 2등, 4개가 모두 동일할시 3등,나머지는 모두 꽝
    이라는 조건을 달아준다. 여기 이 조건부분 어떤식으로 걸어야 할지 모르겠어
      로또 당첨번호와 유저가 입력한 번호(배열)가 일치할 때


 */
public class HW01 {
    public static void main(String[] args) {
        int[] num = new int[6];

        Scanner sc = new Scanner(System.in);
        System.out.println("로또 추첨을 시작하겠습니다 1~45까지의 숫자를 입력해주세요");

        Random rd = new Random();
        int randNum = rd.nextInt(45)+1;  // 랜덤한 값이 어디에 저장 되어있다? 라고?



        for (int i=0; i<num.length; i++) {   // 각각 돌린다
            System.out.println((i+1) + "번째 값을 입력해주세요");
            num[i] = sc.nextInt();
        }


    }
}