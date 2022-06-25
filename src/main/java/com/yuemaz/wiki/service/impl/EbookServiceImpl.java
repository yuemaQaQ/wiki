package com.yuemaz.wiki.service.impl;

import com.yuemaz.wiki.entity.Ebook;
import com.yuemaz.wiki.mapper.EbookMapper;
import com.yuemaz.wiki.service.EbookService;
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
    public List<Ebook> list() {
        return ebookMapper.selectByExample(null);
    }
}
