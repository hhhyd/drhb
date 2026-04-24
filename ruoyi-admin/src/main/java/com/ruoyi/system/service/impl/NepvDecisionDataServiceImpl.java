package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NepvDecisionDataMapper;
import com.ruoyi.system.domain.NepvDecisionData;
import com.ruoyi.system.service.INepvDecisionDataService;

/**
 * 决策者可视化数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-04-24
 */
@Service
public class NepvDecisionDataServiceImpl implements INepvDecisionDataService 
{
    @Autowired
    private NepvDecisionDataMapper nepvDecisionDataMapper;

    /**
     * 查询决策者可视化数据
     * 
     * @param id 决策者可视化数据主键
     * @return 决策者可视化数据
     */
    @Override
    public NepvDecisionData selectNepvDecisionDataById(Long id)
    {
        return nepvDecisionDataMapper.selectNepvDecisionDataById(id);
    }

    /**
     * 查询决策者可视化数据列表
     * 
     * @param nepvDecisionData 决策者可视化数据
     * @return 决策者可视化数据
     */
    @Override
    public List<NepvDecisionData> selectNepvDecisionDataList(NepvDecisionData nepvDecisionData)
    {
        return nepvDecisionDataMapper.selectNepvDecisionDataList(nepvDecisionData);
    }

    /**
     * 新增决策者可视化数据
     * 
     * @param nepvDecisionData 决策者可视化数据
     * @return 结果
     */
    @Override
    public int insertNepvDecisionData(NepvDecisionData nepvDecisionData)
    {
        nepvDecisionData.setCreateTime(DateUtils.getNowDate());
        return nepvDecisionDataMapper.insertNepvDecisionData(nepvDecisionData);
    }

    /**
     * 修改决策者可视化数据
     * 
     * @param nepvDecisionData 决策者可视化数据
     * @return 结果
     */
    @Override
    public int updateNepvDecisionData(NepvDecisionData nepvDecisionData)
    {
        nepvDecisionData.setUpdateTime(DateUtils.getNowDate());
        return nepvDecisionDataMapper.updateNepvDecisionData(nepvDecisionData);
    }

    /**
     * 批量删除决策者可视化数据
     * 
     * @param ids 需要删除的决策者可视化数据主键
     * @return 结果
     */
    @Override
    public int deleteNepvDecisionDataByIds(Long[] ids)
    {
        return nepvDecisionDataMapper.deleteNepvDecisionDataByIds(ids);
    }

    /**
     * 删除决策者可视化数据信息
     * 
     * @param id 决策者可视化数据主键
     * @return 结果
     */
    @Override
    public int deleteNepvDecisionDataById(Long id)
    {
        return nepvDecisionDataMapper.deleteNepvDecisionDataById(id);
    }
}
