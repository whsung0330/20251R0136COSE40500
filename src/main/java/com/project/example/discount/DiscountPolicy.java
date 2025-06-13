package com.project.example.discount;

import com.project.example.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
