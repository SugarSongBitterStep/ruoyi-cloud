package com.ruoyi.activiti.mapper;

import com.ruoyi.activiti.vo.HiProcInsVo;

import java.util.List;

public interface HistoryMapper {
    List<HiProcInsVo> getHiProcInsListDone(HiProcInsVo hiProcInsVo);
}