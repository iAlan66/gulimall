package com.alan.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.alan.common.utils.PageUtils;
import com.alan.gulimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author alan
 * @email cxy814941789@gmail.com
 * @date 2022-06-15 13:18:57
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

