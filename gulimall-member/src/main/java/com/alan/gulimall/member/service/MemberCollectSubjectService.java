package com.alan.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.alan.common.utils.PageUtils;
import com.alan.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author alan
 * @email cxy814941789@gmail.com
 * @date 2022-06-15 12:20:22
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

