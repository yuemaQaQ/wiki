package com.yuemaz.wiki.service.impl;

import com.yuemaz.wiki.entity.EbookExample;
import com.yuemaz.wiki.mapper.EbookMapper;
import com.yuemaz.wiki.req.EbookReq;
import com.yuemaz.wiki.resp.EbookResp;
import com.yuemaz.wiki.service.EbookService;
import com.yuemaz.wiki.utils.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

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
    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }
        return CopyUtil.copyList(ebookMapper.selectByExample(ebookExample), EbookResp.class);
    }
}
