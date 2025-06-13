package com.project.example;

import com.project.example.member.Grade;
import com.project.example.member.Member;
import com.project.example.member.MemberService;
import com.project.example.member.MemberServiceImpl;
import com.project.example.order.Order;
import com.project.example.order.OrderService;
import com.project.example.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();
        long memberId = 1L;
        Member member = new Member(memberId, "new", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "item", 25000);
        System.out.println("order = " + order);
    }
}
