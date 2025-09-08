package BaekJoonCote;

import java.util.*;
/*
    * 백준 10814번 나이순 정렬
    * https://www.acmicpc.net/problem/10814
    * Silver 5
    * 2024-06-12

    * 문제
    * 온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
    * 이때, 회원들을 나이가 증가하는 순으로,
    * 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
 */
public class P10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine(); // 개행 문자 제거
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            members.add(new Member(age, name));
        }

        members.sort(Comparator.comparingInt(m -> m.age));

        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
    }

    static class Member {
        int age;
        String name;

    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

}

