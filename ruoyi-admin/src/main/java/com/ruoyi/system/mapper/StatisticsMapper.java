package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Statistics;

/**
 * 统计信息Mapper接口
 * 
 * @author ruoyi
 * @date 2026-04-23
 */
public interface StatisticsMapper 
{
    /**
     * 查询统计信息
     * 
     * @param id 统计信息主键
     * @return 统计信息
     */
    public Statistics selectStatisticsById(Long id);

    /**
     * 查询统计信息列表
     * 
     * @param statistics 统计信息
     * @return 统计信息集合
     */
    public List<Statistics> selectStatisticsList(Statistics statistics);

    /**
     * 新增统计信息
     * 
     * @param statistics 统计信息
     * @return 结果
     */
    public int insertStatistics(Statistics statistics);

    /**
     * 修改统计信息
     * 
     * @param statistics 统计信息
     * @return 结果
     */
    public int updateStatistics(Statistics statistics);

    /**
     * 删除统计信息
     * 
     * @param id 统计信息主键
     * @return 结果
     */
    public int deleteStatisticsById(Long id);

    /**
     * 批量删除统计信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStatisticsByIds(Long[] ids);
}
