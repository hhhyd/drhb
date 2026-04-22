package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.EpsSupervisorInspectorRel;

/**
 * 监督员-网格员多对多关联Service接口
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
public interface IEpsSupervisorInspectorRelService 
{
    /**
     * 查询监督员-网格员多对多关联
     * 
     * @param id 监督员-网格员多对多关联主键
     * @return 监督员-网格员多对多关联
     */
    public EpsSupervisorInspectorRel selectEpsSupervisorInspectorRelById(Long id);

    /**
     * 查询监督员-网格员多对多关联列表
     * 
     * @param epsSupervisorInspectorRel 监督员-网格员多对多关联
     * @return 监督员-网格员多对多关联集合
     */
    public List<EpsSupervisorInspectorRel> selectEpsSupervisorInspectorRelList(EpsSupervisorInspectorRel epsSupervisorInspectorRel);

    /**
     * 新增监督员-网格员多对多关联
     * 
     * @param epsSupervisorInspectorRel 监督员-网格员多对多关联
     * @return 结果
     */
    public int insertEpsSupervisorInspectorRel(EpsSupervisorInspectorRel epsSupervisorInspectorRel);

    /**
     * 修改监督员-网格员多对多关联
     * 
     * @param epsSupervisorInspectorRel 监督员-网格员多对多关联
     * @return 结果
     */
    public int updateEpsSupervisorInspectorRel(EpsSupervisorInspectorRel epsSupervisorInspectorRel);

    /**
     * 批量删除监督员-网格员多对多关联
     * 
     * @param ids 需要删除的监督员-网格员多对多关联主键集合
     * @return 结果
     */
    public int deleteEpsSupervisorInspectorRelByIds(Long[] ids);

    /**
     * 删除监督员-网格员多对多关联信息
     * 
     * @param id 监督员-网格员多对多关联主键
     * @return 结果
     */
    public int deleteEpsSupervisorInspectorRelById(Long id);
}
