package com.project.example.discount;

import com.project.example.member.Grade;
import com.project.example.member.Member;

public class AmountDiscountPolicy implements DiscountPolicy {
    private int discountAmount = 10000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP) {
            return discountAmount;
        } else return 0;
    }
}
