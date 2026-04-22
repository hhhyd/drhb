package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 系统网格覆盖市区域对象 grid_city
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
public class GridCity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 系统网格覆盖市区域编号 */
    private Long cityId;

    /** 系统网格覆盖市区域名称 */
    @Excel(name = "系统网格覆盖市区域名称")
    private String cityName;

    /** 所属省区编号 */
    @Excel(name = "所属省区编号")
    private Long provinceId;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    public void setCityId(Long cityId) 
    {
        this.cityId = cityId;
    }

    public Long getCityId() 
    {
        return cityId;
    }

    public void setCityName(String cityName) 
    {
        this.cityName = cityName;
    }

    public String getCityName() 
    {
        return cityName;
    }

    public void setProvinceId(Long provinceId) 
    {
        this.provinceId = provinceId;
    }

    public Long getProvinceId() 
    {
        return provinceId;
    }

    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cityId", getCityId())
            .append("cityName", getCityName())
            .append("provinceId", getProvinceId())
            .append("remarks", getRemarks())
            .toString();
    }
}
