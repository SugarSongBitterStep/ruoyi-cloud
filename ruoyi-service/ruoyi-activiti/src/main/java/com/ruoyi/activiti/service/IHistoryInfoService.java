package com.ruoyi.activiti.service;

import com.ruoyi.activiti.vo.HiProcInsVo;

import java.util.List;

/**
 * @Auther: Ace Lee
 * @Date: 2019/3/7 16:55
 */
public interface IHistoryInfoService {
    List<HiProcInsVo> getHiProcInsListDone(HiProcInsVo hiProcInsVo);
}
