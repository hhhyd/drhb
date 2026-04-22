package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.GridCity;

/**
 * 系统网格覆盖市区域Mapper接口
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
public interface GridCityMapper 
{
    /**
     * 查询系统网格覆盖市区域
     * 
     * @param cityId 系统网格覆盖市区域主键
     * @return 系统网格覆盖市区域
     */
    public GridCity selectGridCityByCityId(Long cityId);

    /**
     * 查询系统网格覆盖市区域列表
     * 
     * @param gridCity 系统网格覆盖市区域
     * @return 系统网格覆盖市区域集合
     */
    public List<GridCity> selectGridCityList(GridCity gridCity);

    /**
     * 新增系统网格覆盖市区域
     * 
     * @param gridCity 系统网格覆盖市区域
     * @return 结果
     */
    public int insertGridCity(GridCity gridCity);

    /**
     * 修改系统网格覆盖市区域
     * 
     * @param gridCity 系统网格覆盖市区域
     * @return 结果
     */
    public int updateGridCity(GridCity gridCity);

    /**
     * 删除系统网格覆盖市区域
     * 
     * @param cityId 系统网格覆盖市区域主键
     * @return 结果
     */
    public int deleteGridCityByCityId(Long cityId);

    /**
     * 批量删除系统网格覆盖市区域
     * 
     * @param cityIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGridCityByCityIds(Long[] cityIds);
}
