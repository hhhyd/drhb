package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EpsSupervisorInspectorRelMapper;
import com.ruoyi.system.domain.EpsSupervisorInspectorRel;
import com.ruoyi.system.service.IEpsSupervisorInspectorRelService;

/**
 * 监督员-网格员多对多关联Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
@Service
public class EpsSupervisorInspectorRelServiceImpl implements IEpsSupervisorInspectorRelService 
{
    @Autowired
    private EpsSupervisorInspectorRelMapper epsSupervisorInspectorRelMapper;

    /**
     * 查询监督员-网格员多对多关联
     * 
     * @param id 监督员-网格员多对多关联主键
     * @return 监督员-网格员多对多关联
     */
    @Override
    public EpsSupervisorInspectorRel selectEpsSupervisorInspectorRelById(Long id)
    {
        return epsSupervisorInspectorRelMapper.selectEpsSupervisorInspectorRelById(id);
    }

    /**
     * 查询监督员-网格员多对多关联列表
     * 
     * @param epsSupervisorInspectorRel 监督员-网格员多对多关联
     * @return 监督员-网格员多对多关联
     */
    @Override
    public List<EpsSupervisorInspectorRel> selectEpsSupervisorInspectorRelList(EpsSupervisorInspectorRel epsSupervisorInspectorRel)
    {
        return epsSupervisorInspectorRelMapper.selectEpsSupervisorInspectorRelList(epsSupervisorInspectorRel);
    }

    /**
     * 新增监督员-网格员多对多关联
     * 
     * @param epsSupervisorInspectorRel 监督员-网格员多对多关联
     * @return 结果
     */
    @Override
    public int insertEpsSupervisorInspectorRel(EpsSupervisorInspectorRel epsSupervisorInspectorRel)
    {
        return epsSupervisorInspectorRelMapper.insertEpsSupervisorInspectorRel(epsSupervisorInspectorRel);
    }

    /**
     * 修改监督员-网格员多对多关联
     * 
     * @param epsSupervisorInspectorRel 监督员-网格员多对多关联
     * @return 结果
     */
    @Override
    public int updateEpsSupervisorInspectorRel(EpsSupervisorInspectorRel epsSupervisorInspectorRel)
    {
        return epsSupervisorInspectorRelMapper.updateEpsSupervisorInspectorRel(epsSupervisorInspectorRel);
    }

    /**
     * 批量删除监督员-网格员多对多关联
     * 
     * @param ids 需要删除的监督员-网格员多对多关联主键
     * @return 结果
     */
    @Override
    public int deleteEpsSupervisorInspectorRelByIds(Long[] ids)
    {
        return epsSupervisorInspectorRelMapper.deleteEpsSupervisorInspectorRelByIds(ids);
    }

    /**
     * 删除监督员-网格员多对多关联信息
     * 
     * @param id 监督员-网格员多对多关联主键
     * @return 结果
     */
    @Override
    public int deleteEpsSupervisorInspectorRelById(Long id)
    {
        return epsSupervisorInspectorRelMapper.deleteEpsSupervisorInspectorRelById(id);
    }
}
