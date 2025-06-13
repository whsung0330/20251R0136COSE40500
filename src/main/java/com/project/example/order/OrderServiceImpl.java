package com.project.example.order;

import com.project.example.discount.AmountDiscountPolicy;
import com.project.example.discount.DiscountPolicy;
import com.project.example.member.Member;
import com.project.example.member.MemberRepository;
import com.project.example.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new AmountDiscountPolicy();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
