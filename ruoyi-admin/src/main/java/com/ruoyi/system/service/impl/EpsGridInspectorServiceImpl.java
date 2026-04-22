package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EpsGridInspectorMapper;
import com.ruoyi.system.domain.EpsGridInspector;
import com.ruoyi.system.service.IEpsGridInspectorService;

/**
 * AQI检测网格员详细信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
@Service
public class EpsGridInspectorServiceImpl implements IEpsGridInspectorService 
{
    @Autowired
    private EpsGridInspectorMapper epsGridInspectorMapper;

    /**
     * 查询AQI检测网格员详细信息
     * 
     * @param inspectorId AQI检测网格员详细信息主键
     * @return AQI检测网格员详细信息
     */
    @Override
    public EpsGridInspector selectEpsGridInspectorByInspectorId(Long inspectorId)
    {
        return epsGridInspectorMapper.selectEpsGridInspectorByInspectorId(inspectorId);
    }

    /**
     * 查询AQI检测网格员详细信息列表
     * 
     * @param epsGridInspector AQI检测网格员详细信息
     * @return AQI检测网格员详细信息
     */
    @Override
    public List<EpsGridInspector> selectEpsGridInspectorList(EpsGridInspector epsGridInspector)
    {
        return epsGridInspectorMapper.selectEpsGridInspectorList(epsGridInspector);
    }

    /**
     * 新增AQI检测网格员详细信息
     * 
     * @param epsGridInspector AQI检测网格员详细信息
     * @return 结果
     */
    @Override
    public int insertEpsGridInspector(EpsGridInspector epsGridInspector)
    {
        return epsGridInspectorMapper.insertEpsGridInspector(epsGridInspector);
    }

    /**
     * 修改AQI检测网格员详细信息
     * 
     * @param epsGridInspector AQI检测网格员详细信息
     * @return 结果
     */
    @Override
    public int updateEpsGridInspector(EpsGridInspector epsGridInspector)
    {
        return epsGridInspectorMapper.updateEpsGridInspector(epsGridInspector);
    }

    /**
     * 批量删除AQI检测网格员详细信息
     * 
     * @param inspectorIds 需要删除的AQI检测网格员详细信息主键
     * @return 结果
     */
    @Override
    public int deleteEpsGridInspectorByInspectorIds(Long[] inspectorIds)
    {
        return epsGridInspectorMapper.deleteEpsGridInspectorByInspectorIds(inspectorIds);
    }

    /**
     * 删除AQI检测网格员详细信息信息
     * 
     * @param inspectorId AQI检测网格员详细信息主键
     * @return 结果
     */
    @Override
    public int deleteEpsGridInspectorByInspectorId(Long inspectorId)
    {
        return epsGridInspectorMapper.deleteEpsGridInspectorByInspectorId(inspectorId);
    }
}
