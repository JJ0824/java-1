package StudyGroup.Study0430;
/* 참고자료 0430(2) 파일 참고해서 코드 작성

1. 참고자료 0430(2) 모습을 출력하시오.
[조건 : 메서드 사용]
2. str1의 '!'를 '하세요'로, '나는'을 '저는'으로 변경하여 출력하시오.
3. 안녕하세요. 나는 '김개똥' 입니다!만나서 반갑습니다^^ //를 출력하시오.
4.str3의 도메인(naver.com)과 아이디(조건:소문자)를 출력하시오.
5.뒤죽박죽인 str4에서 특수문자를 모두 제외하고 출력하시오.

 */
public class HW02 {
    public static void main(String[] args) {

        String str1 = "안녕! 나는 '김개똥' 입니다!";
        String str2 = "만나서 반갑습니다^^";
        String str3 = "kgDD123@naver.com";
        String str4 = "안녕!하세요@앞으로*잘부$탁!드립니다@";


        str1 = "안녕! 나는 '김개똥' 입니다.";
        str2 = "만나서 반갑습니다^^";
        str3 = "kgDD123@naver.com";
        str4 = "안녕!하세요@앞으로*잘부$탁!드립니다@";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        // 2. str1의 '!'를 '하세요'로, '나는'을 '저는'으로 변경하여 출력하시오.

        System.out.println(str1.replace("!","하세요"));
        System.out.println(str1.replace("나는","저는"));

        // 3. 안녕하세요. 나는 '김개똥' 입니다!만나서 반갑습니다^^ //를 출력하시오.

        System.out.println(str1 + str2);

        // 4.str3의 도메인(naver.com)과 아이디(조건:소문자)를 출력하시오.

        System.out.println(str3.toLowerCase());



    }
}
