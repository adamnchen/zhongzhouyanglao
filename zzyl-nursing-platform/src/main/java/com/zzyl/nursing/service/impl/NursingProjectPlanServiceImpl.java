package com.zzyl.nursing.service.impl;

import java.util.List;
import com.zzyl.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzyl.nursing.mapper.NursingProjectPlanMapper;
import com.zzyl.nursing.domain.NursingProjectPlan;
import com.zzyl.nursing.service.INursingProjectPlanService;

/**
 * 护理计划和项目关联Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-03-18
 */
@Service
public class NursingProjectPlanServiceImpl implements INursingProjectPlanService 
{
    @Autowired
    private NursingProjectPlanMapper nursingProjectPlanMapper;

    /**
     * 查询护理计划和项目关联
     * 
     * @param id 护理计划和项目关联主键
     * @return 护理计划和项目关联
     */
    @Override
    public NursingProjectPlan selectNursingProjectPlanById(Long id)
    {
        return nursingProjectPlanMapper.selectNursingProjectPlanById(id);
    }

    /**
     * 查询护理计划和项目关联列表
     * 
     * @param nursingProjectPlan 护理计划和项目关联
     * @return 护理计划和项目关联
     */
    @Override
    public List<NursingProjectPlan> selectNursingProjectPlanList(NursingProjectPlan nursingProjectPlan)
    {
        return nursingProjectPlanMapper.selectNursingProjectPlanList(nursingProjectPlan);
    }

    /**
     * 新增护理计划和项目关联
     * 
     * @param nursingProjectPlan 护理计划和项目关联
     * @return 结果
     */
    @Override
    public int insertNursingProjectPlan(NursingProjectPlan nursingProjectPlan)
    {
        nursingProjectPlan.setCreateTime(DateUtils.getNowDate());
        return nursingProjectPlanMapper.insertNursingProjectPlan(nursingProjectPlan);
    }

    /**
     * 修改护理计划和项目关联
     * 
     * @param nursingProjectPlan 护理计划和项目关联
     * @return 结果
     */
    @Override
    public int updateNursingProjectPlan(NursingProjectPlan nursingProjectPlan)
    {
        nursingProjectPlan.setUpdateTime(DateUtils.getNowDate());
        return nursingProjectPlanMapper.updateNursingProjectPlan(nursingProjectPlan);
    }

    /**
     * 批量删除护理计划和项目关联
     * 
     * @param ids 需要删除的护理计划和项目关联主键
     * @return 结果
     */
    @Override
    public int deleteNursingProjectPlanByIds(Long[] ids)
    {
        return nursingProjectPlanMapper.deleteNursingProjectPlanByIds(ids);
    }

    /**
     * 删除护理计划和项目关联信息
     * 
     * @param id 护理计划和项目关联主键
     * @return 结果
     */
    @Override
    public int deleteNursingProjectPlanById(Long id)
    {
        return nursingProjectPlanMapper.deleteNursingProjectPlanById(id);
    }
}
