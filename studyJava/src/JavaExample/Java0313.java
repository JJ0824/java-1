package JavaExample;
public class Java0313 {
    public static void main(String[] args) {
        // 아래 배열중에 짝수만 출력
        int[] arr = new int[]{1, 2, 3, 4, 5};  // arr 배열 값

        for( int i = 0; i<arr.length; i++) { // 배열의 길이를 구함

            if( arr[i] % 2 == 0) { //

                System.out.println(arr[i]); // aar{i} 짝수만 출력
            }
        }
    }
}
