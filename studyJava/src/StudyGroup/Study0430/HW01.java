package StudyGroup.Study0430;

import java.security.interfaces.DSAKey;
import java.util.Arrays;

/* 참고자료 0430(1) 파일 참고해서 코드 작성

1.정방 배열 만들기
2.비정방 베열 만들기

 */
public class HW01 {
    public static void main(String[] args) {
        int[][] array1 = new int[4][10];
        array1[0][0]=1;
        array1[0][1]=2;
        array1[0][2]=3;
        array1[0][3]=4;
        array1[0][4]=5;
        array1[0][5]=6;
        array1[0][6]=7;
        array1[0][7]=8;
        array1[0][8]=9;
        array1[0][9]=10;

        for (int i=0; i < array1.length; i++) {

            System.out.println(Arrays.toString(array1[i]));
        }


        int[][] array2 = new int[4][10];
        array2[0][0]= 10;
        array2[0][1]= 20;
        array2[0][2]= 30;
        array2[0][3]= 40;
        array2[0][4]= 50;
        array2[0][5]= 60;
        array2[0][6]= 70;
        array2[0][7]= 80;
        array2[0][8]= 90;
        array2[0][9]= 100;

        for (int i=0; i < array2.length; i++) {

            System.out.println(Arrays.toString(array2[i]));
        }

        int[][] array3 = new int[3][10];

        array3[1][0]= 10;
        array3[1][1]= 9;
        array3[1][2]= 8;
        array3[1][3]= 7;
        array3[1][4]= 6;
        array3[1][5]= 5;
        array3[1][6]= 4;
        array3[1][7]= 3;
        array3[1][8]= 2;
        array3[1][9]= 1;

        for (int i=0; i<array3.length; i++){
            System.out.println(Arrays.toString(array3[i]));
        }


        int[][] array4 = new int[4][10];

        array4[3][0]= 2;
        array4[3][1]= 4;
        array4[3][2]= 6;
        array4[3][3]= 8;
        array4[3][4]= 10;
        array4[3][5]= 12;
        array4[3][6]= 14;
        array4[3][7]= 16;
        array4[3][8]= 18;
        array4[3][9]= 20;





        for (int i=0; i<array4.length; i++) {
            System.out.println(Arrays.toString(array4[i]));
        }
    }
}
