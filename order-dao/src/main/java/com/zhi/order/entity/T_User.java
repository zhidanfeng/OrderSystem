package com.zhi.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@TableName(value = "t_user")
public class T_User {
    /**
     * 主键ID
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    @Getter
    @Setter
    private Integer userId;
    /**
     * 用户名
     */
    @TableField(value = "username")
    @Getter @Setter
    private String userName;
}
