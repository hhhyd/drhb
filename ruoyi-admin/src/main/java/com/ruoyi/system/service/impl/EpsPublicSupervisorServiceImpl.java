package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EpsPublicSupervisorMapper;
import com.ruoyi.system.domain.EpsPublicSupervisor;
import com.ruoyi.system.service.IEpsPublicSupervisorService;

/**
 * 公众监督员详细信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
@Service
public class EpsPublicSupervisorServiceImpl implements IEpsPublicSupervisorService 
{
    @Autowired
    private EpsPublicSupervisorMapper epsPublicSupervisorMapper;

    /**
     * 查询公众监督员详细信息
     * 
     * @param supervisorId 公众监督员详细信息主键
     * @return 公众监督员详细信息
     */
    @Override
    public EpsPublicSupervisor selectEpsPublicSupervisorBySupervisorId(Long supervisorId)
    {
        return epsPublicSupervisorMapper.selectEpsPublicSupervisorBySupervisorId(supervisorId);
    }

    /**
     * 查询公众监督员详细信息列表
     * 
     * @param epsPublicSupervisor 公众监督员详细信息
     * @return 公众监督员详细信息
     */
    @Override
    public List<EpsPublicSupervisor> selectEpsPublicSupervisorList(EpsPublicSupervisor epsPublicSupervisor)
    {
        return epsPublicSupervisorMapper.selectEpsPublicSupervisorList(epsPublicSupervisor);
    }

    /**
     * 新增公众监督员详细信息
     * 
     * @param epsPublicSupervisor 公众监督员详细信息
     * @return 结果
     */
    @Override
    public int insertEpsPublicSupervisor(EpsPublicSupervisor epsPublicSupervisor)
    {
        return epsPublicSupervisorMapper.insertEpsPublicSupervisor(epsPublicSupervisor);
    }

    /**
     * 修改公众监督员详细信息
     * 
     * @param epsPublicSupervisor 公众监督员详细信息
     * @return 结果
     */
    @Override
    public int updateEpsPublicSupervisor(EpsPublicSupervisor epsPublicSupervisor)
    {
        return epsPublicSupervisorMapper.updateEpsPublicSupervisor(epsPublicSupervisor);
    }

    /**
     * 批量删除公众监督员详细信息
     * 
     * @param supervisorIds 需要删除的公众监督员详细信息主键
     * @return 结果
     */
    @Override
    public int deleteEpsPublicSupervisorBySupervisorIds(Long[] supervisorIds)
    {
        return epsPublicSupervisorMapper.deleteEpsPublicSupervisorBySupervisorIds(supervisorIds);
    }

    /**
     * 删除公众监督员详细信息信息
     * 
     * @param supervisorId 公众监督员详细信息主键
     * @return 结果
     */
    @Override
    public int deleteEpsPublicSupervisorBySupervisorId(Long supervisorId)
    {
        return epsPublicSupervisorMapper.deleteEpsPublicSupervisorBySupervisorId(supervisorId);
    }
}
