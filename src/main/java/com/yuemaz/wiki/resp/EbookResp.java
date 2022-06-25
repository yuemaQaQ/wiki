package com.yuemaz.wiki.resp;

import lombok.Data;

/**
 * @Author yuemaz
 * @Date 2022/6/25 10:07
 */
@Data
public class EbookResp {

    private Long id;

    private String name;

    private Long category1Id;

    private Long category2Id;

    private String description;

    private String cover;

    private Integer docCount;

    private Integer viewCount;

    private Integer voteCount;
}
