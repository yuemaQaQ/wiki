package com.yuemaz.wiki.controller;

import com.yuemaz.wiki.req.EbookReq;
import com.yuemaz.wiki.resp.Result;
import com.yuemaz.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author yuemaz
 * @Date 2022/6/25 8:16
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public Result list(EbookReq req) {
        return Result.ok().setData(ebookService.list(req));
    }
}
