package com.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@TableName("t_user") //mybatisPlus  框架
@Entity//jpa 指明这是一个实体类
@Table(name = "t_user") // 指定和那个数据表对应   jpa
@ApiModel("用户")
public class User {
 @Id // 标明这是一个主键 //jpa
 @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键   jpa
 @TableId(value = "id", type = IdType.AUTO)//mybatisplus   主键id
 @ApiModelProperty("id")
 private Integer id;
 @Column(name = "username") // 这是和数据表对应的一个列   jpa
 @TableField("username")//Mybatis pluse*/
 @NotNull
 @ApiModelProperty("用户名称")
 private String username;
 @Column(name = "password") // 这是和数据表对应的一个列
 @NotNull
 @TableField("password")
 private String password;


}
