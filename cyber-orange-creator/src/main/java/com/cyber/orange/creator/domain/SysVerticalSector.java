package com.cyber.orange.creator.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 垂直领域表
 * @author 17727
 * @TableName sys_vertical_sector
 */
@Data
public class SysVerticalSector {
    /**
     * 主键
     */
    private Long id;

    /**
     * 领域
     */
    private String sector;

    /**
     * 描述
     */
    private String desc;
}