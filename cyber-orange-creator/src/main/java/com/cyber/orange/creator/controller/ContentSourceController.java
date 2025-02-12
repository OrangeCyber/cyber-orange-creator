package com.cyber.orange.creator.controller;


import com.cyber.orange.creator.common.base.Result;
import com.cyber.orange.creator.domain.req.ContentSourceDownLandReq;
import com.cyber.orange.creator.service.ContentSourceService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author huangchuanju
 * @date 2025/2/6 9:06
 * @description 服务检查
 */
@RestController
@RequestMapping("/check")
@RequiredArgsConstructor
@Slf4j
public class ContentSourceController {

    private final ContentSourceService contentSourceService;

    @GetMapping("/downland")
    public Result<List<String>> downland(@RequestBody ContentSourceDownLandReq req) {
        return Result.success(contentSourceService.downland(req));
    }
}
