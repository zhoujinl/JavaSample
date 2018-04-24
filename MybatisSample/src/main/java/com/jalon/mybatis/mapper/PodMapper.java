package com.jalon.mybatis.mapper;

import com.jalon.mybatis.entity.Params;
import com.jalon.mybatis.entity.Pod;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Jalon on 17/04/2018.
 *  关联查询
 *  分页查询
 *  对象作为参数
 */
public interface PodMapper {

    List<Pod> getPodBooksByInUnion(@Param("id") int id);

    List<Pod> getPodBooksByOutUnion(@Param("id") int id);

    List<Pod> getPodPagesByParams(Params params);

}
