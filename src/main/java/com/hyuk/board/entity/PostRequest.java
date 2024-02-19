package com.hyuk.board.entity;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor
@Getter @Setter
public class PostRequest {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private Boolean noticeYn;
}
