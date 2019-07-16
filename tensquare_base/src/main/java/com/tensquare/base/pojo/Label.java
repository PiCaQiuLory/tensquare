package com.tensquare.base.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author lory.li
 * @description 标签类
 * @date 2019-07-16
 */
@Entity
@Table(name = "tb_label")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Label implements Serializable {

    @Id
    private String id;
    private String labelname;//标签名称
    private String state;//状态
    private Long count;//使用数量
    private Long fans;//关注数
    private String recommend;//是否推荐

}
