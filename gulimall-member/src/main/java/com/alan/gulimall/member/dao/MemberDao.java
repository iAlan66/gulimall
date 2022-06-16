package com.alan.gulimall.member.dao;

import com.alan.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author alan
 * @email cxy814941789@gmail.com
 * @date 2022-06-15 12:20:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
