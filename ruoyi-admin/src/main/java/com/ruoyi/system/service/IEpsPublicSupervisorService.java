package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.EpsPublicSupervisor;

/**
 * 公众监督员详细信息Service接口
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
public interface IEpsPublicSupervisorService 
{
    /**
     * 查询公众监督员详细信息
     * 
     * @param supervisorId 公众监督员详细信息主键
     * @return 公众监督员详细信息
     */
    public EpsPublicSupervisor selectEpsPublicSupervisorBySupervisorId(Long supervisorId);

    /**
     * 查询公众监督员详细信息列表
     * 
     * @param epsPublicSupervisor 公众监督员详细信息
     * @return 公众监督员详细信息集合
     */
    public List<EpsPublicSupervisor> selectEpsPublicSupervisorList(EpsPublicSupervisor epsPublicSupervisor);

    /**
     * 新增公众监督员详细信息
     * 
     * @param epsPublicSupervisor 公众监督员详细信息
     * @return 结果
     */
    public int insertEpsPublicSupervisor(EpsPublicSupervisor epsPublicSupervisor);

    /**
     * 修改公众监督员详细信息
     * 
     * @param epsPublicSupervisor 公众监督员详细信息
     * @return 结果
     */
    public int updateEpsPublicSupervisor(EpsPublicSupervisor epsPublicSupervisor);

    /**
     * 批量删除公众监督员详细信息
     * 
     * @param supervisorIds 需要删除的公众监督员详细信息主键集合
     * @return 结果
     */
    public int deleteEpsPublicSupervisorBySupervisorIds(Long[] supervisorIds);

    /**
     * 删除公众监督员详细信息信息
     * 
     * @param supervisorId 公众监督员详细信息主键
     * @return 结果
     */
    public int deleteEpsPublicSupervisorBySupervisorId(Long supervisorId);
}
