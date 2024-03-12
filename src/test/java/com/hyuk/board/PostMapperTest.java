package com.hyuk.board;

import com.hyuk.board.domain.post.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PostMapperTest {
    @Autowired
    BoardMapper boardMapper;

//    @Test
//    void save() {
//        PostRequest params = new PostRequest();
//        params.setTitle("1번게시글제목");
//        params.setContent("1번게시글내용");
//        params.setWriter("테스터");
//        params.setNoticeYn(false);
//        boardMapper.save(params);
//
//        List<PostResponse> posts = boardMapper.findAll();
//        System.out.println("전체 게시글 개수는 : " + posts.size() + " 개입니다.");
//    }
}
