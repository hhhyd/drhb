package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GridCityMapper;
import com.ruoyi.system.domain.GridCity;
import com.ruoyi.system.service.IGridCityService;

/**
 * 系统网格覆盖市区域Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
@Service
public class GridCityServiceImpl implements IGridCityService 
{
    @Autowired
    private GridCityMapper gridCityMapper;

    /**
     * 查询系统网格覆盖市区域
     * 
     * @param cityId 系统网格覆盖市区域主键
     * @return 系统网格覆盖市区域
     */
    @Override
    public GridCity selectGridCityByCityId(Long cityId)
    {
        return gridCityMapper.selectGridCityByCityId(cityId);
    }

    /**
     * 查询系统网格覆盖市区域列表
     * 
     * @param gridCity 系统网格覆盖市区域
     * @return 系统网格覆盖市区域
     */
    @Override
    public List<GridCity> selectGridCityList(GridCity gridCity)
    {
        return gridCityMapper.selectGridCityList(gridCity);
    }

    /**
     * 新增系统网格覆盖市区域
     * 
     * @param gridCity 系统网格覆盖市区域
     * @return 结果
     */
    @Override
    public int insertGridCity(GridCity gridCity)
    {
        return gridCityMapper.insertGridCity(gridCity);
    }

    /**
     * 修改系统网格覆盖市区域
     * 
     * @param gridCity 系统网格覆盖市区域
     * @return 结果
     */
    @Override
    public int updateGridCity(GridCity gridCity)
    {
        return gridCityMapper.updateGridCity(gridCity);
    }

    /**
     * 批量删除系统网格覆盖市区域
     * 
     * @param cityIds 需要删除的系统网格覆盖市区域主键
     * @return 结果
     */
    @Override
    public int deleteGridCityByCityIds(Long[] cityIds)
    {
        return gridCityMapper.deleteGridCityByCityIds(cityIds);
    }

    /**
     * 删除系统网格覆盖市区域信息
     * 
     * @param cityId 系统网格覆盖市区域主键
     * @return 结果
     */
    @Override
    public int deleteGridCityByCityId(Long cityId)
    {
        return gridCityMapper.deleteGridCityByCityId(cityId);
    }
}
