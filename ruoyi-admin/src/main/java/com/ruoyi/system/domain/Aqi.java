package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 空气质量指数级别对象 aqi
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
public class Aqi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 空气质量指数级别ID（共六级） */
    private Long aqiId;

    /** 空气质量指数级别汉字表述 */
    @Excel(name = "空气质量指数级别汉字表述")
    private String chineseExplain;

    /** 空气质量指数级别描述 */
    @Excel(name = "空气质量指数级别描述")
    private String aqiExplain;

    /** 空气质量指数级别表示颜色 */
    @Excel(name = "空气质量指数级别表示颜色")
    private String color;

    /** 对健康影响情况 */
    @Excel(name = "对健康影响情况")
    private String healthImpact;

    /** 建议采取的措施 */
    @Excel(name = "建议采取的措施")
    private String takeSteps;

    /** 本级别二氧化硫浓度最小值限值 */
    @Excel(name = "本级别二氧化硫浓度最小值限值")
    private Long so2Min;

    /** 本级别二氧化硫浓度最大值限值 */
    @Excel(name = "本级别二氧化硫浓度最大值限值")
    private Long so2Max;

    /** 本级别一氧化碳浓度最小值限值 */
    @Excel(name = "本级别一氧化碳浓度最小值限值")
    private Long coMin;

    /** 本级别一氧化碳浓度最大值限值 */
    @Excel(name = "本级别一氧化碳浓度最大值限值")
    private Long coMax;

    /** 本级别悬浮颗粒物浓度最小限值 */
    @Excel(name = "本级别悬浮颗粒物浓度最小限值")
    private Long spmMin;

    /** 本级别悬浮颗粒物浓度最大值限值 */
    @Excel(name = "本级别悬浮颗粒物浓度最大值限值")
    private Long spmMax;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    public void setAqiId(Long aqiId) 
    {
        this.aqiId = aqiId;
    }

    public Long getAqiId() 
    {
        return aqiId;
    }

    public void setChineseExplain(String chineseExplain) 
    {
        this.chineseExplain = chineseExplain;
    }

    public String getChineseExplain() 
    {
        return chineseExplain;
    }

    public void setAqiExplain(String aqiExplain) 
    {
        this.aqiExplain = aqiExplain;
    }

    public String getAqiExplain() 
    {
        return aqiExplain;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public String getColor() 
    {
        return color;
    }

    public void setHealthImpact(String healthImpact) 
    {
        this.healthImpact = healthImpact;
    }

    public String getHealthImpact() 
    {
        return healthImpact;
    }

    public void setTakeSteps(String takeSteps) 
    {
        this.takeSteps = takeSteps;
    }

    public String getTakeSteps() 
    {
        return takeSteps;
    }

    public void setSo2Min(Long so2Min) 
    {
        this.so2Min = so2Min;
    }

    public Long getSo2Min() 
    {
        return so2Min;
    }

    public void setSo2Max(Long so2Max) 
    {
        this.so2Max = so2Max;
    }

    public Long getSo2Max() 
    {
        return so2Max;
    }

    public void setCoMin(Long coMin) 
    {
        this.coMin = coMin;
    }

    public Long getCoMin() 
    {
        return coMin;
    }

    public void setCoMax(Long coMax) 
    {
        this.coMax = coMax;
    }

    public Long getCoMax() 
    {
        return coMax;
    }

    public void setSpmMin(Long spmMin) 
    {
        this.spmMin = spmMin;
    }

    public Long getSpmMin() 
    {
        return spmMin;
    }

    public void setSpmMax(Long spmMax) 
    {
        this.spmMax = spmMax;
    }

    public Long getSpmMax() 
    {
        return spmMax;
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
            .append("aqiId", getAqiId())
            .append("chineseExplain", getChineseExplain())
            .append("aqiExplain", getAqiExplain())
            .append("color", getColor())
            .append("healthImpact", getHealthImpact())
            .append("takeSteps", getTakeSteps())
            .append("so2Min", getSo2Min())
            .append("so2Max", getSo2Max())
            .append("coMin", getCoMin())
            .append("coMax", getCoMax())
            .append("spmMin", getSpmMin())
            .append("spmMax", getSpmMax())
            .append("remarks", getRemarks())
            .toString();
    }
}
