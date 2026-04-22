package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AqiMapper;
import com.ruoyi.system.domain.Aqi;
import com.ruoyi.system.service.IAqiService;

/**
 * 空气质量指数级别Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
@Service
public class AqiServiceImpl implements IAqiService 
{
    @Autowired
    private AqiMapper aqiMapper;

    /**
     * 查询空气质量指数级别
     * 
     * @param aqiId 空气质量指数级别主键
     * @return 空气质量指数级别
     */
    @Override
    public Aqi selectAqiByAqiId(Long aqiId)
    {
        return aqiMapper.selectAqiByAqiId(aqiId);
    }

    /**
     * 查询空气质量指数级别列表
     * 
     * @param aqi 空气质量指数级别
     * @return 空气质量指数级别
     */
    @Override
    public List<Aqi> selectAqiList(Aqi aqi)
    {
        return aqiMapper.selectAqiList(aqi);
    }

    /**
     * 新增空气质量指数级别
     * 
     * @param aqi 空气质量指数级别
     * @return 结果
     */
    @Override
    public int insertAqi(Aqi aqi)
    {
        return aqiMapper.insertAqi(aqi);
    }

    /**
     * 修改空气质量指数级别
     * 
     * @param aqi 空气质量指数级别
     * @return 结果
     */
    @Override
    public int updateAqi(Aqi aqi)
    {
        return aqiMapper.updateAqi(aqi);
    }

    /**
     * 批量删除空气质量指数级别
     * 
     * @param aqiIds 需要删除的空气质量指数级别主键
     * @return 结果
     */
    @Override
    public int deleteAqiByAqiIds(Long[] aqiIds)
    {
        return aqiMapper.deleteAqiByAqiIds(aqiIds);
    }

    /**
     * 删除空气质量指数级别信息
     * 
     * @param aqiId 空气质量指数级别主键
     * @return 结果
     */
    @Override
    public int deleteAqiByAqiId(Long aqiId)
    {
        return aqiMapper.deleteAqiByAqiId(aqiId);
    }
}
