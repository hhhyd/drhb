package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 公众监督员详细信息对象 eps_public_supervisor
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
public class EpsPublicSupervisor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 监督员ID */
    private Long supervisorId;

    /** 关联的系统用户ID */
    @Excel(name = "关联的系统用户ID")
    private Long userId;

    /** 真实姓名 */
    @Excel(name = "真实姓名")
    private String realName;

    /** 手机号（唯一标识） */
    @Excel(name = "手机号", readConverterExp = "唯=一标识")
    private String phone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long age;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String gender;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date registerTime;

    public void setSupervisorId(Long supervisorId) 
    {
        this.supervisorId = supervisorId;
    }

    public Long getSupervisorId() 
    {
        return supervisorId;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setRealName(String realName) 
    {
        this.realName = realName;
    }

    public String getRealName() 
    {
        return realName;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setAge(Long age) 
    {
        this.age = age;
    }

    public Long getAge() 
    {
        return age;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }

    public void setRegisterTime(Date registerTime) 
    {
        this.registerTime = registerTime;
    }

    public Date getRegisterTime() 
    {
        return registerTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("supervisorId", getSupervisorId())
            .append("userId", getUserId())
            .append("realName", getRealName())
            .append("phone", getPhone())
            .append("age", getAge())
            .append("gender", getGender())
            .append("registerTime", getRegisterTime())
            .toString();
    }
}
