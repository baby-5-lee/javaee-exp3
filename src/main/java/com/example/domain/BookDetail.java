package com.example.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName book_detail
 */
@Data
public class BookDetail implements Serializable {
    /**
     * 图书编号
     */
    private Integer id;

    /**
     * 书名
     */
    private String name;

    /**
     * 作者
     */
    private String author;

    /**
     * 出版社
     */
    private String press;

    /**
     * 库存
     */
    private Integer inventory;

    /**
     * 出版时间
     */
    private Date pubTime;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 是否可借阅
     */
    private Boolean available;

    /**
     * 是否被借阅
     */
    private Boolean borrowed;

    private static final long serialVersionUID = 1L;
}