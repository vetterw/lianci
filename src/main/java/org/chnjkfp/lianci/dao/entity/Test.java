package org.chnjkfp.lianci.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("test")
public class Test {
    /**
     * 指定主键名、主键生产策略
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     *指定列名,若一致可以不用指定
     */
    @TableField("user_name")
    private String userName;
}
