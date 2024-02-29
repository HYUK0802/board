package com.hyuk.board.comment;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentRequest {

    private Long id;            // 댓글 번호 (PK)
    private Long postId;        // 게시글 번호 (FK)
    private String content;     // 내용
    private String writer;      // 작성자
}
