package com.project.example.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memId);
}
