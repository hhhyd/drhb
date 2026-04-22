package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.GridProvince;

/**
 * 系统网格覆盖省区域Mapper接口
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
public interface GridProvinceMapper 
{
    /**
     * 查询系统网格覆盖省区域
     * 
     * @param provinceId 系统网格覆盖省区域主键
     * @return 系统网格覆盖省区域
     */
    public GridProvince selectGridProvinceByProvinceId(Long provinceId);

    /**
     * 查询系统网格覆盖省区域列表
     * 
     * @param gridProvince 系统网格覆盖省区域
     * @return 系统网格覆盖省区域集合
     */
    public List<GridProvince> selectGridProvinceList(GridProvince gridProvince);

    /**
     * 新增系统网格覆盖省区域
     * 
     * @param gridProvince 系统网格覆盖省区域
     * @return 结果
     */
    public int insertGridProvince(GridProvince gridProvince);

    /**
     * 修改系统网格覆盖省区域
     * 
     * @param gridProvince 系统网格覆盖省区域
     * @return 结果
     */
    public int updateGridProvince(GridProvince gridProvince);

    /**
     * 删除系统网格覆盖省区域
     * 
     * @param provinceId 系统网格覆盖省区域主键
     * @return 结果
     */
    public int deleteGridProvinceByProvinceId(Long provinceId);

    /**
     * 批量删除系统网格覆盖省区域
     * 
     * @param provinceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGridProvinceByProvinceIds(Long[] provinceIds);
}
