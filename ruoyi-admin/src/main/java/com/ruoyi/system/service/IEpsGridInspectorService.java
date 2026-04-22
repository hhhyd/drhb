package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.EpsGridInspector;

/**
 * AQI检测网格员详细信息Service接口
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
public interface IEpsGridInspectorService 
{
    /**
     * 查询AQI检测网格员详细信息
     * 
     * @param inspectorId AQI检测网格员详细信息主键
     * @return AQI检测网格员详细信息
     */
    public EpsGridInspector selectEpsGridInspectorByInspectorId(Long inspectorId);

    /**
     * 查询AQI检测网格员详细信息列表
     * 
     * @param epsGridInspector AQI检测网格员详细信息
     * @return AQI检测网格员详细信息集合
     */
    public List<EpsGridInspector> selectEpsGridInspectorList(EpsGridInspector epsGridInspector);

    /**
     * 新增AQI检测网格员详细信息
     * 
     * @param epsGridInspector AQI检测网格员详细信息
     * @return 结果
     */
    public int insertEpsGridInspector(EpsGridInspector epsGridInspector);

    /**
     * 修改AQI检测网格员详细信息
     * 
     * @param epsGridInspector AQI检测网格员详细信息
     * @return 结果
     */
    public int updateEpsGridInspector(EpsGridInspector epsGridInspector);

    /**
     * 批量删除AQI检测网格员详细信息
     * 
     * @param inspectorIds 需要删除的AQI检测网格员详细信息主键集合
     * @return 结果
     */
    public int deleteEpsGridInspectorByInspectorIds(Long[] inspectorIds);

    /**
     * 删除AQI检测网格员详细信息信息
     * 
     * @param inspectorId AQI检测网格员详细信息主键
     * @return 结果
     */
    public int deleteEpsGridInspectorByInspectorId(Long inspectorId);
}
