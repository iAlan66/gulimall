package com.alan.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.alan.common.utils.PageUtils;
import com.alan.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author alan
 * @email cxy814941789@gmail.com
 * @date 2022-06-14 18:03:37
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

