package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 决策者可视化数据对象 nepv_decision_data
 * 
 * @author ruoyi
 * @date 2026-04-24
 */
public class NepvDecisionData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 统计类型 */
    @Excel(name = "统计类型")
    private String statType;

    /** 地区编码 */
    @Excel(name = "地区编码")
    private String regionCode;

    /** 地区名称 */
    @Excel(name = "地区名称")
    private String regionName;

    /** 统计周期 */
    @Excel(name = "统计周期")
    private String statPeriod;

    /** 统计日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "统计日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date statDate;

    /** SO2超标累计数量 */
    @Excel(name = "SO2超标累计数量")
    private Long so2ExceedCount;

    /** CO超标累计数量 */
    @Excel(name = "CO超标累计数量")
    private Long coExceedCount;

    /** PM2.5超标累计数量 */
    @Excel(name = "PM2.5超标累计数量")
    private Long pm25ExceedCount;

    /** AQI等级超标累计数量 */
    @Excel(name = "AQI等级超标累计数量")
    private Long aqiExceedCount;

    /** AQI指数级别 */
    @Excel(name = "AQI指数级别")
    private String aqiLevel;

    /** AQI检测累计总数 */
    @Excel(name = "AQI检测累计总数")
    private Long totalDetectionCount;

    /** AQI检测良好数 */
    @Excel(name = "AQI检测良好数")
    private Long goodDetectionCount;

    /** AQI检测超标数 */
    @Excel(name = "AQI检测超标数")
    private Long exceedDetectionCount;

    /** 覆盖率百分比 */
    @Excel(name = "覆盖率百分比")
    private BigDecimal coverageRate;

    /** 数据值（通用） */
    @Excel(name = "数据值", readConverterExp = "通=用")
    private BigDecimal dataValue;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setStatType(String statType) 
    {
        this.statType = statType;
    }

    public String getStatType() 
    {
        return statType;
    }

    public void setRegionCode(String regionCode) 
    {
        this.regionCode = regionCode;
    }

    public String getRegionCode() 
    {
        return regionCode;
    }

    public void setRegionName(String regionName) 
    {
        this.regionName = regionName;
    }

    public String getRegionName() 
    {
        return regionName;
    }

    public void setStatPeriod(String statPeriod) 
    {
        this.statPeriod = statPeriod;
    }

    public String getStatPeriod() 
    {
        return statPeriod;
    }

    public void setStatDate(Date statDate) 
    {
        this.statDate = statDate;
    }

    public Date getStatDate() 
    {
        return statDate;
    }

    public void setSo2ExceedCount(Long so2ExceedCount) 
    {
        this.so2ExceedCount = so2ExceedCount;
    }

    public Long getSo2ExceedCount() 
    {
        return so2ExceedCount;
    }

    public void setCoExceedCount(Long coExceedCount) 
    {
        this.coExceedCount = coExceedCount;
    }

    public Long getCoExceedCount() 
    {
        return coExceedCount;
    }

    public void setPm25ExceedCount(Long pm25ExceedCount) 
    {
        this.pm25ExceedCount = pm25ExceedCount;
    }

    public Long getPm25ExceedCount() 
    {
        return pm25ExceedCount;
    }

    public void setAqiExceedCount(Long aqiExceedCount) 
    {
        this.aqiExceedCount = aqiExceedCount;
    }

    public Long getAqiExceedCount() 
    {
        return aqiExceedCount;
    }

    public void setAqiLevel(String aqiLevel) 
    {
        this.aqiLevel = aqiLevel;
    }

    public String getAqiLevel() 
    {
        return aqiLevel;
    }

    public void setTotalDetectionCount(Long totalDetectionCount) 
    {
        this.totalDetectionCount = totalDetectionCount;
    }

    public Long getTotalDetectionCount() 
    {
        return totalDetectionCount;
    }

    public void setGoodDetectionCount(Long goodDetectionCount) 
    {
        this.goodDetectionCount = goodDetectionCount;
    }

    public Long getGoodDetectionCount() 
    {
        return goodDetectionCount;
    }

    public void setExceedDetectionCount(Long exceedDetectionCount) 
    {
        this.exceedDetectionCount = exceedDetectionCount;
    }

    public Long getExceedDetectionCount() 
    {
        return exceedDetectionCount;
    }

    public void setCoverageRate(BigDecimal coverageRate) 
    {
        this.coverageRate = coverageRate;
    }

    public BigDecimal getCoverageRate() 
    {
        return coverageRate;
    }

    public void setDataValue(BigDecimal dataValue) 
    {
        this.dataValue = dataValue;
    }

    public BigDecimal getDataValue() 
    {
        return dataValue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("statType", getStatType())
            .append("regionCode", getRegionCode())
            .append("regionName", getRegionName())
            .append("statPeriod", getStatPeriod())
            .append("statDate", getStatDate())
            .append("so2ExceedCount", getSo2ExceedCount())
            .append("coExceedCount", getCoExceedCount())
            .append("pm25ExceedCount", getPm25ExceedCount())
            .append("aqiExceedCount", getAqiExceedCount())
            .append("aqiLevel", getAqiLevel())
            .append("totalDetectionCount", getTotalDetectionCount())
            .append("goodDetectionCount", getGoodDetectionCount())
            .append("exceedDetectionCount", getExceedDetectionCount())
            .append("coverageRate", getCoverageRate())
            .append("dataValue", getDataValue())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
