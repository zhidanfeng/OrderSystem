package com.zhi.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhi.order.entity.T_User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<T_User> {
    String getName();
}
