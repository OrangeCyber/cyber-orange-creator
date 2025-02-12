package com.cyber.orange.creator.controller;


import com.cyber.orange.creator.common.base.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author cyberorange
 * @date 2025/2/6 9:06
 * @description 服务检查
 */
@RestController
@RequestMapping("/check")
@Slf4j
public class CheckController {
    @GetMapping("")
    public Result<LocalDateTime> check() {
        return Result.success(LocalDateTime.now());
    }
}
