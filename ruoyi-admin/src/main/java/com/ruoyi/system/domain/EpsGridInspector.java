package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * AQI检测网格员详细信息对象 eps_grid_inspector
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
public class EpsGridInspector extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 网格员ID */
    private Long inspectorId;

    /** 关联的系统用户ID */
    @Excel(name = "关联的系统用户ID")
    private Long userId;

    /** 员工编码（来自HR） */
    @Excel(name = "员工编码", readConverterExp = "来=自HR")
    private String employeeCode;

    /** 真实姓名 */
    @Excel(name = "真实姓名")
    private String realName;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 工作状态（0-离线，1-在线） */
    @Excel(name = "工作状态", readConverterExp = "0=-离线，1-在线")
    private String workStatus;

    /** 常驻省编码 */
    @Excel(name = "常驻省编码")
    private String provinceCode;

    /** 常驻市编码 */
    @Excel(name = "常驻市编码")
    private String cityCode;

    public void setInspectorId(Long inspectorId) 
    {
        this.inspectorId = inspectorId;
    }

    public Long getInspectorId() 
    {
        return inspectorId;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setEmployeeCode(String employeeCode) 
    {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeCode() 
    {
        return employeeCode;
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

    public void setWorkStatus(String workStatus) 
    {
        this.workStatus = workStatus;
    }

    public String getWorkStatus() 
    {
        return workStatus;
    }

    public void setProvinceCode(String provinceCode) 
    {
        this.provinceCode = provinceCode;
    }

    public String getProvinceCode() 
    {
        return provinceCode;
    }

    public void setCityCode(String cityCode) 
    {
        this.cityCode = cityCode;
    }

    public String getCityCode() 
    {
        return cityCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("inspectorId", getInspectorId())
            .append("userId", getUserId())
            .append("employeeCode", getEmployeeCode())
            .append("realName", getRealName())
            .append("phone", getPhone())
            .append("workStatus", getWorkStatus())
            .append("provinceCode", getProvinceCode())
            .append("cityCode", getCityCode())
            .toString();
    }
}
