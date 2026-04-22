package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GridProvinceMapper;
import com.ruoyi.system.domain.GridProvince;
import com.ruoyi.system.service.IGridProvinceService;

/**
 * 系统网格覆盖省区域Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
@Service
public class GridProvinceServiceImpl implements IGridProvinceService 
{
    @Autowired
    private GridProvinceMapper gridProvinceMapper;

    /**
     * 查询系统网格覆盖省区域
     * 
     * @param provinceId 系统网格覆盖省区域主键
     * @return 系统网格覆盖省区域
     */
    @Override
    public GridProvince selectGridProvinceByProvinceId(Long provinceId)
    {
        return gridProvinceMapper.selectGridProvinceByProvinceId(provinceId);
    }

    /**
     * 查询系统网格覆盖省区域列表
     * 
     * @param gridProvince 系统网格覆盖省区域
     * @return 系统网格覆盖省区域
     */
    @Override
    public List<GridProvince> selectGridProvinceList(GridProvince gridProvince)
    {
        return gridProvinceMapper.selectGridProvinceList(gridProvince);
    }

    /**
     * 新增系统网格覆盖省区域
     * 
     * @param gridProvince 系统网格覆盖省区域
     * @return 结果
     */
    @Override
    public int insertGridProvince(GridProvince gridProvince)
    {
        return gridProvinceMapper.insertGridProvince(gridProvince);
    }

    /**
     * 修改系统网格覆盖省区域
     * 
     * @param gridProvince 系统网格覆盖省区域
     * @return 结果
     */
    @Override
    public int updateGridProvince(GridProvince gridProvince)
    {
        return gridProvinceMapper.updateGridProvince(gridProvince);
    }

    /**
     * 批量删除系统网格覆盖省区域
     * 
     * @param provinceIds 需要删除的系统网格覆盖省区域主键
     * @return 结果
     */
    @Override
    public int deleteGridProvinceByProvinceIds(Long[] provinceIds)
    {
        return gridProvinceMapper.deleteGridProvinceByProvinceIds(provinceIds);
    }

    /**
     * 删除系统网格覆盖省区域信息
     * 
     * @param provinceId 系统网格覆盖省区域主键
     * @return 结果
     */
    @Override
    public int deleteGridProvinceByProvinceId(Long provinceId)
    {
        return gridProvinceMapper.deleteGridProvinceByProvinceId(provinceId);
    }
}
