package com.wuqj.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 测试表
 * </p>
 *
 * @author wuqj
 * @since 2020-06-14
 */
@TableName("T_TEST_INFO")
@ApiModel(value="TestInfo对象", description="测试表")
public class TestInfo extends Model<TestInfo> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableField("ID")
    private String id;

    @ApiModelProperty(value = "名称")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "年龄")
    @TableField("AGE")
    private String age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "TestInfo{" +
        "id=" + id +
        ", name=" + name +
        ", age=" + age +
        "}";
    }
}
