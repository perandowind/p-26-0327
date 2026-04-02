package com.back.domain.member.dto;

import com.back.domain.member.entity.Member;

import java.time.LocalDateTime;

public record MemberWithUsernameDto(
        int id,
        String nickname,
        String username,
        LocalDateTime createDate,
        LocalDateTime modifyDate
) {
    public MemberWithUsernameDto(Member member) {
        this(
                member.getId(),
                member.getNickname(),
                member.getUsername(),
                member.getCreateDate(),
                member.getModifyDate()
        );
    }
}
