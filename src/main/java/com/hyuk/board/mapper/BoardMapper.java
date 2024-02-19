package com.hyuk.board.mapper;

import com.hyuk.board.entity.PostRequest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
public interface BoardMapper {

    /**
     * 게시글 저장
     * @param params - 게시글 정보
     */
    void save(PostRequest param);
}
