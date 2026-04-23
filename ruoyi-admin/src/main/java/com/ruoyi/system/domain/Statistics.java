package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 统计信息对象 statistics
 * 
 * @author ruoyi
 * @date 2026-04-23
 */
public class Statistics extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 统计信息编号 */
    private Long id;

    /** 所属省区域编号 */
    @Excel(name = "所属省区域编号")
    private Long provinceId;

    /** 所属市区域编号 */
    @Excel(name = "所属市区域编号")
    private Long cityId;

    /** 反馈信息所在区域详细地址 */
    @Excel(name = "反馈信息所在区域详细地址")
    private String address;

    /** 空气二氧化硫浓度值（单位：μg/m3） */
    @Excel(name = "空气二氧化硫浓度值", readConverterExp = "单=位：μg/m3")
    private Long so2Value;

    /** 空气二氧化硫指数级别 */
    @Excel(name = "空气二氧化硫指数级别")
    private Long so2Level;

    /** 空气一氧化碳浓度值（单位：μg/m3） */
    @Excel(name = "空气一氧化碳浓度值", readConverterExp = "单=位：μg/m3")
    private Long coValue;

    /** 空气一氧化碳指数级别 */
    @Excel(name = "空气一氧化碳指数级别")
    private Long coLevel;

    /** 空气悬浮颗粒物浓度值（单位：μg/m3） */
    @Excel(name = "空气悬浮颗粒物浓度值", readConverterExp = "单=位：μg/m3")
    private Long spmValue;

    /** 空气PM2.5指数级别 */
    @Excel(name = "空气PM2.5指数级别")
    private Long spmLevel;

    /** 空气质量指数级别 */
    @Excel(name = "空气质量指数级别")
    private Long aqiId;

    /** 确认日期 */
    @Excel(name = "确认日期")
    private String confirmDate;

    /** 确认时间 */
    @Excel(name = "确认时间")
    private String confirmTime;

    /** 所属网格员编号 */
    @Excel(name = "所属网格员编号")
    private Long gmId;

    /** 反馈者编号（公众监督员电话号码） */
    @Excel(name = "反馈者编号", readConverterExp = "公=众监督员电话号码")
    private String fdId;

    /** 反馈信息描述 */
    @Excel(name = "反馈信息描述")
    private String information;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setProvinceId(Long provinceId) 
    {
        this.provinceId = provinceId;
    }

    public Long getProvinceId() 
    {
        return provinceId;
    }

    public void setCityId(Long cityId) 
    {
        this.cityId = cityId;
    }

    public Long getCityId() 
    {
        return cityId;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setSo2Value(Long so2Value) 
    {
        this.so2Value = so2Value;
    }

    public Long getSo2Value() 
    {
        return so2Value;
    }

    public void setSo2Level(Long so2Level) 
    {
        this.so2Level = so2Level;
    }

    public Long getSo2Level() 
    {
        return so2Level;
    }

    public void setCoValue(Long coValue) 
    {
        this.coValue = coValue;
    }

    public Long getCoValue() 
    {
        return coValue;
    }

    public void setCoLevel(Long coLevel) 
    {
        this.coLevel = coLevel;
    }

    public Long getCoLevel() 
    {
        return coLevel;
    }

    public void setSpmValue(Long spmValue) 
    {
        this.spmValue = spmValue;
    }

    public Long getSpmValue() 
    {
        return spmValue;
    }

    public void setSpmLevel(Long spmLevel) 
    {
        this.spmLevel = spmLevel;
    }

    public Long getSpmLevel() 
    {
        return spmLevel;
    }

    public void setAqiId(Long aqiId) 
    {
        this.aqiId = aqiId;
    }

    public Long getAqiId() 
    {
        return aqiId;
    }

    public void setConfirmDate(String confirmDate) 
    {
        this.confirmDate = confirmDate;
    }

    public String getConfirmDate() 
    {
        return confirmDate;
    }

    public void setConfirmTime(String confirmTime) 
    {
        this.confirmTime = confirmTime;
    }

    public String getConfirmTime() 
    {
        return confirmTime;
    }

    public void setGmId(Long gmId) 
    {
        this.gmId = gmId;
    }

    public Long getGmId() 
    {
        return gmId;
    }

    public void setFdId(String fdId) 
    {
        this.fdId = fdId;
    }

    public String getFdId() 
    {
        return fdId;
    }

    public void setInformation(String information) 
    {
        this.information = information;
    }

    public String getInformation() 
    {
        return information;
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
            .append("id", getId())
            .append("provinceId", getProvinceId())
            .append("cityId", getCityId())
            .append("address", getAddress())
            .append("so2Value", getSo2Value())
            .append("so2Level", getSo2Level())
            .append("coValue", getCoValue())
            .append("coLevel", getCoLevel())
            .append("spmValue", getSpmValue())
            .append("spmLevel", getSpmLevel())
            .append("aqiId", getAqiId())
            .append("confirmDate", getConfirmDate())
            .append("confirmTime", getConfirmTime())
            .append("gmId", getGmId())
            .append("fdId", getFdId())
            .append("information", getInformation())
            .append("remarks", getRemarks())
            .toString();
    }
}
