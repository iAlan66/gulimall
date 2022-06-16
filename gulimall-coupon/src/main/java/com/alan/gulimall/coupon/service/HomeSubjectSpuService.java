package com.alan.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.alan.common.utils.PageUtils;
import com.alan.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author alan
 * @email cxy814941789@gmail.com
 * @date 2022-06-14 18:03:36
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

