package com.project.example.discount;

import com.project.example.member.Grade;
import com.project.example.member.Member;

public class PercentDiscountPolicy implements DiscountPolicy {
    private double percentDiscount = 0.5;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return (int) (price * percentDiscount);
        }
        else return 0;
    }
}
