package com.cyber.orange.creator.service;

import com.cyber.orange.creator.domain.ContentSource;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cyber.orange.creator.domain.req.ContentSourceDownLandReq;

import java.util.List;

/**
* @author 17727
* @description 针对表【content_source(源内容)】的数据库操作Service
* @createDate 2025-02-06 10:42:53
*/
public interface ContentSourceService extends IService<ContentSource> {

    List<String> downland(ContentSourceDownLandReq req);
}
