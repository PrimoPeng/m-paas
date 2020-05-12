package com.taoding.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * MyMapper
 *
 * @author primo
 * @date 2019/11/13
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
