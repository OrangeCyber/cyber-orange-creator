package com.cyber.orange.creator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cyber.orange.creator.domain.ContentSource;
import com.cyber.orange.creator.domain.req.ContentSourceDownLandReq;
import com.cyber.orange.creator.service.ContentSourceService;
import com.cyber.orange.creator.mapper.ContentSourceMapper;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
* @author 17727
* @description 针对表【content_source(源内容)】的数据库操作Service实现
* @createDate 2025-02-06 10:42:53
*/
@Service
public class ContentSourceServiceImpl extends ServiceImpl<ContentSourceMapper, ContentSource>
    implements ContentSourceService{

    @Override
    public List<String> downland(ContentSourceDownLandReq req) {

    }
}




