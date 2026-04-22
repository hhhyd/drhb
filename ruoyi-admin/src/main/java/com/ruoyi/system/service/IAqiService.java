package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Aqi;

/**
 * 空气质量指数级别Service接口
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
public interface IAqiService 
{
    /**
     * 查询空气质量指数级别
     * 
     * @param aqiId 空气质量指数级别主键
     * @return 空气质量指数级别
     */
    public Aqi selectAqiByAqiId(Long aqiId);

    /**
     * 查询空气质量指数级别列表
     * 
     * @param aqi 空气质量指数级别
     * @return 空气质量指数级别集合
     */
    public List<Aqi> selectAqiList(Aqi aqi);

    /**
     * 新增空气质量指数级别
     * 
     * @param aqi 空气质量指数级别
     * @return 结果
     */
    public int insertAqi(Aqi aqi);

    /**
     * 修改空气质量指数级别
     * 
     * @param aqi 空气质量指数级别
     * @return 结果
     */
    public int updateAqi(Aqi aqi);

    /**
     * 批量删除空气质量指数级别
     * 
     * @param aqiIds 需要删除的空气质量指数级别主键集合
     * @return 结果
     */
    public int deleteAqiByAqiIds(Long[] aqiIds);

    /**
     * 删除空气质量指数级别信息
     * 
     * @param aqiId 空气质量指数级别主键
     * @return 结果
     */
    public int deleteAqiByAqiId(Long aqiId);
}
