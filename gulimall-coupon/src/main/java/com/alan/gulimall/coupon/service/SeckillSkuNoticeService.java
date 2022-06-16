package com.alan.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.alan.common.utils.PageUtils;
import com.alan.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author alan
 * @email cxy814941789@gmail.com
 * @date 2022-06-14 18:03:37
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

