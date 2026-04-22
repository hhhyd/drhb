package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 监督员-网格员多对多关联对象 eps_supervisor_inspector_rel
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
public class EpsSupervisorInspectorRel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 公众监督员ID */
    @Excel(name = "公众监督员ID")
    private Long supervisorId;

    /** 网格员ID */
    @Excel(name = "网格员ID")
    private Long inspectorId;

    /** 关系类型（如：主要负责-RESPONSIBLE，后备-BACKUP） */
    @Excel(name = "关系类型", readConverterExp = "如=：主要负责-RESPONSIBLE，后备-BACKUP")
    private String relationType;

    /** 绑定时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "绑定时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date bindTime;

    /** 是否有效（0-否，1-是） */
    @Excel(name = "是否有效", readConverterExp = "0=-否，1-是")
    private String isActive;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setSupervisorId(Long supervisorId) 
    {
        this.supervisorId = supervisorId;
    }

    public Long getSupervisorId() 
    {
        return supervisorId;
    }

    public void setInspectorId(Long inspectorId) 
    {
        this.inspectorId = inspectorId;
    }

    public Long getInspectorId() 
    {
        return inspectorId;
    }

    public void setRelationType(String relationType) 
    {
        this.relationType = relationType;
    }

    public String getRelationType() 
    {
        return relationType;
    }

    public void setBindTime(Date bindTime) 
    {
        this.bindTime = bindTime;
    }

    public Date getBindTime() 
    {
        return bindTime;
    }

    public void setIsActive(String isActive) 
    {
        this.isActive = isActive;
    }

    public String getIsActive() 
    {
        return isActive;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("supervisorId", getSupervisorId())
            .append("inspectorId", getInspectorId())
            .append("relationType", getRelationType())
            .append("bindTime", getBindTime())
            .append("isActive", getIsActive())
            .toString();
    }
}
