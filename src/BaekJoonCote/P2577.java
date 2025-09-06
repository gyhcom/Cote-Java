package BaekJoonCote;
/*
    * 백준 2577번 숫자의 개수
    * https://www.acmicpc.net/problem/2577
    * Bronze 2
    * 2024-06-12

    * 문제
    * 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지각각의 숫자가 몇 번씩 쓰였는지 구하는 프로그램을 작성하시오.
 */
public class P2577 {
    public static void main(String[] args) {
        int a = 150;
        int b = 222;
        int c = 343;

        int result = a * b * c;
        int[] counts = new int[10];

        String str = String.valueOf(result);
        for (int i = 0; i < str.length(); i++) {
            /* charAt() 메서드를 사용하여 문자열의 각 문자를 가져오고,
             * '0'을 빼서 해당 문자의 숫자 값을 얻습니다.
             * 그런 다음, counts 배열에서 해당 숫자의 인덱스를 증가시킵니다.
             * 예를 들어, 문자가 '3'이라면 '3' - '0' = 3이 되어 counts[3]이 증가합니다.
             * 이렇게 하면 각 숫자가 몇 번 나타나는지 쉽게 셀 수 있습니다.
             */
            int digit = str.charAt(i) - '0';
            counts[digit] ++;
        }

        for (int count : counts) {
            System.out.println(count);
        }
    }
}
