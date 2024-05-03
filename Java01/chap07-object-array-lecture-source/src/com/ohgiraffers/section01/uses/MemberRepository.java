package com.ohgiraffers.section01.uses;

public class MemberRepository {
    private final static Member[] member;
    private static int count;
    static {
        member = new Member[10];
    }

    public static boolean store(Member[] members) {
        for(int i = 0; i<members.length; i++){
            member[count++] = members[i];
        }
        return true;
    }

    public static Member[] findAllMembers() {
        return member;
    }
}
