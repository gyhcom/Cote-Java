package BaekJoonCote;

import java.util.*;

/*
    * 백준 1181번 단어 정렬
    * https://www.acmicpc.net/problem/1181
    * Silver 5
    * 2024-06-12

    * 문제
    * 알파벳 소문자로 이루어진 N개의 단어를 입력받아 아래 조건에 따라 정렬하는 프로그램을 작성하시오.
    * 길이가 짧은 것부터
    * 길이가 같으면 사전 순으로
 */
public class P1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거
        Set<String> wordSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            wordSet.add(sc.nextLine());
        }
        List<String> words = new ArrayList<>(wordSet);

        /*
            * Comparator를 사용하여 단어의 길이를 기준으로 먼저 비교하고,
            * 길이가 같을 경우 사전 순으로 비교합니다.
            * 이렇게 하면 길이가 짧은 단어가 먼저 오고,
            * 길이가 같은 단어는 사전 순으로 정렬됩니다.
            * 예를 들어, "bat"와 "apple"이 있을 때,
            * "bat"가 먼저 오게 되고, "apple"과 "app"이
            * 있을 때는 "app"이 먼저 오게 됩니다.
            * 이 정렬 기준은 문제에서 요구하는 조건을 정확히 반영합니다.
            * Comparator는 두 객체를 비교하는 방법을 정의하는 인터페이스로,
            * 이를 통해 복잡한 정렬 기준을 쉽게 구현할 수 있습니다.
            * 따라서, 이 코드는 주어진 조건에 맞게 단어들을 올바르게 정렬합니다.
            * Comparator는 Java에서 제공하는 기능으로, 사용자 정의 정렬 기준을 쉽게 구현할 수 있게 해줍니다.
            * 이를 통해 복잡한 정렬 로직을 간결하게 표현할 수 있습니다git
         */
        words.sort((o1, o2) -> {
            if (o1.length() != o2.length()) {
                return Integer.compare(o1.length(), o2.length());
            } else {
                return o1.compareTo(o2);
            }
        });

        for (String word : words) {
            System.out.println(word);
        }
    }
}