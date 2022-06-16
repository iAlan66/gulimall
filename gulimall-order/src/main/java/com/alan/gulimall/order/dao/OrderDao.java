package com.alan.gulimall.order.dao;

import com.alan.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author alan
 * @email cxy814941789@gmail.com
 * @date 2022-06-15 13:08:01
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
