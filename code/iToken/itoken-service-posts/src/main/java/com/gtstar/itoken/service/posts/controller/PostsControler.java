package com.gtstar.itoken.service.posts.controller;

import com.github.pagehelper.PageInfo;
import com.gtstar.itoken.common.domain.TbPostsPost;
import com.gtstar.itoken.common.dto.BaseResult;
import com.gtstar.itoken.service.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "v1/posts")
public class PostsControler {
    @Autowired
    private PostsService<TbPostsPost> postsService;

    /**
     * 分页查询
     *
     * @param pageNum
     * @param pageSize
     * @param tbPostsPost
     * @return
     */
    @GetMapping("pageInfo/{pageNum}/{pageSize}")
    public BaseResult pageInfo(@PathVariable(required = true) int pageNum,
                               @PathVariable(required = true) int pageSize,
                               @RequestParam(required = false) TbPostsPost tbPostsPost) {
        PageInfo pageInfo = postsService.page(pageNum, pageSize, tbPostsPost);
        List<TbPostsPost> list = pageInfo.getList();
        BaseResult.Cursor cursor = new BaseResult.Cursor();
        cursor.setTotal(new Long(pageInfo.getTotal()).intValue());
        cursor.setOffset(pageInfo.getPageNum());
        cursor.setLimit(pageInfo.getSize());
        return BaseResult.ok(list, cursor);
    }
}
