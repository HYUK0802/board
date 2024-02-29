package com.hyuk.board.comment;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class CommentResponse {

    private Long id;                        // 댓글번호 (PK)
    private Long postId;                    // 게시글 번호 (FK)
    private String content;                 // 내용
    private String writer;                  // 작성자
    private Boolean deleteYn;               // 삭제여부
    private LocalDateTime createdDate;      // 생성일시
    private LocalDateTime modifiedDate;     // 최종 수정 일시
}
