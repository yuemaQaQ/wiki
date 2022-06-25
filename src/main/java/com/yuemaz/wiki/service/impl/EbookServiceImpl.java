package com.yuemaz.wiki.service.impl;

import com.yuemaz.wiki.mapper.EbookMapper;
import com.yuemaz.wiki.resp.EbookResp;
import com.yuemaz.wiki.service.EbookService;
import com.yuemaz.wiki.utils.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yuemaz
 * @Date 2022/6/25 8:14
 */
@Service
public class EbookServiceImpl implements EbookService {

    @Resource
    private EbookMapper ebookMapper;

    @Override
    public List<EbookResp> list() {
        return CopyUtil.copyList(ebookMapper.selectByExample(null), EbookResp.class);
    }
}
