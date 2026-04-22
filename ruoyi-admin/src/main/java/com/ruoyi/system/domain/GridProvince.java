package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 系统网格覆盖省区域对象 grid_province
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
public class GridProvince extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 系统网格覆盖省区域编号 */
    private Long provinceId;

    /** 系统网格覆盖省区域名称 */
    @Excel(name = "系统网格覆盖省区域名称")
    private String provinceName;

    /** 系统网格覆盖省区域简称 */
    @Excel(name = "系统网格覆盖省区域简称")
    private String provinceAbbr;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    public void setProvinceId(Long provinceId) 
    {
        this.provinceId = provinceId;
    }

    public Long getProvinceId() 
    {
        return provinceId;
    }

    public void setProvinceName(String provinceName) 
    {
        this.provinceName = provinceName;
    }

    public String getProvinceName() 
    {
        return provinceName;
    }

    public void setProvinceAbbr(String provinceAbbr) 
    {
        this.provinceAbbr = provinceAbbr;
    }

    public String getProvinceAbbr() 
    {
        return provinceAbbr;
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
            .append("provinceId", getProvinceId())
            .append("provinceName", getProvinceName())
            .append("provinceAbbr", getProvinceAbbr())
            .append("remarks", getRemarks())
            .toString();
    }
}
