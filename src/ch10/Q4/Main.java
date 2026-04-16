package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서(오름차순)
        list.sort(new Comparator<String>(){ //Compartor 객체 필요
            @Override
            public int compare(String s1, String s2) {
                // s1과 s2 비교
                return s1.compareTo(s2);    // s1이 더 클 때 양수 반환, 위치 전환(큰 값이 뒤로 이동-> 오름차순)
            }
        });  
        System.out.println(list);

        list.sort((s1, s2) -> s1.compareTo(s2));    // 람다식

        // 사전순으로 큰 순서 (내림차순)
        list.sort(new Comparator<String>(){ // Compartor 객체 필요
            @Override
            public int compare(String s1, String s2) {
                // s1과 s2 비교
                return s2.compareTo(s1);    // s2가 더 클 때 양수 반환, 위치 전환(큰 값이 앞으로 이동-> 내림차순)
            }
        }); 
        System.out.println(list);
    }
}
