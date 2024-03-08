public class Test {
    public static void main(String[] args) {
    /*    *//*
         *//**//*int a;
        int b;
        float c;
        a =5;
        b= 10;
        *//**//*
        int a =5, b=10;
        if(a>5){
           b=20;
        } else if(a==5) {
            b = 30;
        }
        else if(a<=5) {
            b = 80;
        }
        else
            b=40;
        a=30;
        b=40;
        System.out.println(b);*//*

*//*
    int a =8;
    switch (a){
        case 9:
        System.out.println("pass"); break;
        case 8:
        System.out.println("pass"); break;
        case 3:
        System.out.println("pass");break;
        case 1:
            System.out.println("pass");break;

        default:
            System.out.println("fail");

*//*

*//*
            for = (조건)하는 동안에
                조건
                변수

                        실행
i=0 i<10 i++ {
                안녕
            }
                안녕
                   for(초기식;조건식;증감식;){

                       실행
*//*
        //1부터 100까지 화면에 출력하세요 \. 단 줄바끔 없이

        for (int i=1 ;; i++) {

            System.out.print(i  + " ");
            if(i==5) {
                break;

            }


        }
        boolean bool1 = true;
        boolean bool2 = false;
        if (bool1) {
            System.out.println("실행3");
        }
        if (bool2) {
            System.out.println("실행4");
        }
        for(int i = 0; i <10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    i = 100;
                    break;
                }
                System.out.println( i + ", " + j );
            }

        }
        for (int i=0; i<100; i++) {


        }
        System.out.println(i);

   */
//       for (int i=0; i<=10; i++) {
//           for (int j=0; j<=10; j++){
//               if ( i % 2 == 0 &&  j % 3 == 0);
//
//           } System.out.println(i);
//       }


        for(int i = 0; i<=9; i++) {
            System.out.println(i+1);
            }

        }


}
