package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.NepvDecisionData;

/**
 * 决策者可视化数据Service接口
 * 
 * @author ruoyi
 * @date 2026-04-24
 */
public interface INepvDecisionDataService 
{
    /**
     * 查询决策者可视化数据
     * 
     * @param id 决策者可视化数据主键
     * @return 决策者可视化数据
     */
    public NepvDecisionData selectNepvDecisionDataById(Long id);

    /**
     * 查询决策者可视化数据列表
     * 
     * @param nepvDecisionData 决策者可视化数据
     * @return 决策者可视化数据集合
     */
    public List<NepvDecisionData> selectNepvDecisionDataList(NepvDecisionData nepvDecisionData);

    /**
     * 新增决策者可视化数据
     * 
     * @param nepvDecisionData 决策者可视化数据
     * @return 结果
     */
    public int insertNepvDecisionData(NepvDecisionData nepvDecisionData);

    /**
     * 修改决策者可视化数据
     * 
     * @param nepvDecisionData 决策者可视化数据
     * @return 结果
     */
    public int updateNepvDecisionData(NepvDecisionData nepvDecisionData);

    /**
     * 批量删除决策者可视化数据
     * 
     * @param ids 需要删除的决策者可视化数据主键集合
     * @return 结果
     */
    public int deleteNepvDecisionDataByIds(Long[] ids);

    /**
     * 删除决策者可视化数据信息
     * 
     * @param id 决策者可视化数据主键
     * @return 结果
     */
    public int deleteNepvDecisionDataById(Long id);
}
