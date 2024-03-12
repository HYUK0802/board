package com.hyuk.board;

import com.hyuk.board.common.dto.SearchDto;
import com.hyuk.board.domain.post.PostResponse;
import com.hyuk.board.common.paging.PagingResponse;
import com.hyuk.board.domain.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class RestApiTestController {

    private final PostService postService;

    @GetMapping("/members")
    public PagingResponse<PostResponse> findAllPost() {

        return postService.findAllPost(new SearchDto());

    }
}
