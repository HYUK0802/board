package com.hyuk.board;

import com.hyuk.board.dto.SearchDto;
import com.hyuk.board.entity.PostResponse;
import com.hyuk.board.paging.PagingResponse;
import com.hyuk.board.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class RestApiTestController {

    private final PostService postService;

    @GetMapping("/members")
    public PagingResponse<PostResponse> findAllPost() {

        return postService.findAllPost(new SearchDto());

    }
}
