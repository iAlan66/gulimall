package com.alan.gulimall.coupon.dao;

import com.alan.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author alan
 * @email cxy814941789@gmail.com
 * @date 2022-06-14 18:03:37
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
