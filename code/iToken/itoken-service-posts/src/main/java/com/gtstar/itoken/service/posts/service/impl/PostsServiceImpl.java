package com.gtstar.itoken.service.posts.service.impl;

import com.gtstar.itoken.common.domain.TbPostsPost;
import com.gtstar.itoken.common.mapper.TbPostsPostMapper;
import com.gtstar.itoken.common.service.impl.BaseServiceImpl;
import com.gtstar.itoken.service.posts.service.PostsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PostsServiceImpl extends BaseServiceImpl<TbPostsPost,TbPostsPostMapper> implements PostsService<TbPostsPost>{
}
