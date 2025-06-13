package com.project.example.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memId);
}
