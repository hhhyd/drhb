package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StatisticsMapper;
import com.ruoyi.system.domain.Statistics;
import com.ruoyi.system.service.IStatisticsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
@Service
public class StatisticsServiceImpl implements IStatisticsService 
{
    @Autowired
    private StatisticsMapper statisticsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Statistics selectStatisticsById(Long id)
    {
        return statisticsMapper.selectStatisticsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param statistics 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Statistics> selectStatisticsList(Statistics statistics)
    {
        return statisticsMapper.selectStatisticsList(statistics);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param statistics 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertStatistics(Statistics statistics)
    {
        return statisticsMapper.insertStatistics(statistics);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param statistics 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateStatistics(Statistics statistics)
    {
        return statisticsMapper.updateStatistics(statistics);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStatisticsByIds(Long[] ids)
    {
        return statisticsMapper.deleteStatisticsByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStatisticsById(Long id)
    {
        return statisticsMapper.deleteStatisticsById(id);
    }
}
