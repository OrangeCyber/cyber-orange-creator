package com.cyber.orange.creator.domain;

import lombok.Data;

/**
 * 源内容
 *
 * @author 17727
 * @TableName content_source
 */
@Data
public class ContentSource {
    /**
     * 主键
     */
    private Long id;

    /**
     * 内容类型
     */
    private String type;

    /**
     * 内容id
     */
    private String contentId;

    /**
     * 内容
     */
    private String content;
}