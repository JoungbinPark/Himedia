package com.ohgiraffers.section01.uses;

public class MemberFinder {
    public Member[] findAllMembers(){
        return MemberRepository.findAllMembers();
    }
}
