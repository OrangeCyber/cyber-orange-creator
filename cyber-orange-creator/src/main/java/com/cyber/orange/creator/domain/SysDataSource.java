package com.cyber.orange.creator.domain;

import lombok.Data;

/**
 * 数据源
 * @author cyberorange
 * @TableName sys_data_source
 */
@Data
public class SysDataSource {
    /**
     * 主键
     */
    private Long id;

    /**
     * 链接
     */
    private String url;

    /**
     * 类型
     */
    private String type;
}