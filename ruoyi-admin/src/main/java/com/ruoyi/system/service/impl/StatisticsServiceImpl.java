package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StatisticsMapper;
import com.ruoyi.system.domain.Statistics;
import com.ruoyi.system.service.IStatisticsService;

/**
 * 统计信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-04-23
 */
@Service
public class StatisticsServiceImpl implements IStatisticsService 
{
    @Autowired
    private StatisticsMapper statisticsMapper;

    /**
     * 查询统计信息
     * 
     * @param id 统计信息主键
     * @return 统计信息
     */
    @Override
    public Statistics selectStatisticsById(Long id)
    {
        return statisticsMapper.selectStatisticsById(id);
    }

    /**
     * 查询统计信息列表
     * 
     * @param statistics 统计信息
     * @return 统计信息
     */
    @Override
    public List<Statistics> selectStatisticsList(Statistics statistics)
    {
        return statisticsMapper.selectStatisticsList(statistics);
    }

    /**
     * 新增统计信息
     * 
     * @param statistics 统计信息
     * @return 结果
     */
    @Override
    public int insertStatistics(Statistics statistics)
    {
        return statisticsMapper.insertStatistics(statistics);
    }

    /**
     * 修改统计信息
     * 
     * @param statistics 统计信息
     * @return 结果
     */
    @Override
    public int updateStatistics(Statistics statistics)
    {
        return statisticsMapper.updateStatistics(statistics);
    }

    /**
     * 批量删除统计信息
     * 
     * @param ids 需要删除的统计信息主键
     * @return 结果
     */
    @Override
    public int deleteStatisticsByIds(Long[] ids)
    {
        return statisticsMapper.deleteStatisticsByIds(ids);
    }

    /**
     * 删除统计信息信息
     * 
     * @param id 统计信息主键
     * @return 结果
     */
    @Override
    public int deleteStatisticsById(Long id)
    {
        return statisticsMapper.deleteStatisticsById(id);
    }
}
