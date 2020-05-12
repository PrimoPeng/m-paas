package com.taoding.mapper;

import com.taoding.common.MyMapper;
import com.taoding.entity.Blog;

import java.util.List;

/**
 * BlogMapper
 *
 * @author primo
 * @date 2019/11/12
 */
public interface BlogMapper extends MyMapper<Blog> {

    /**
     * 获取所有博客
     * @return
     */
    List<Blog> getAllBlog();
}
