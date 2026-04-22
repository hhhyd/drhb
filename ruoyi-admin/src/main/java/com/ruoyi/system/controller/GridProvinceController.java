package com.ruoyi.system.controller;

import java.util.List;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.GridProvince;
import com.ruoyi.system.service.IGridProvinceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 系统网格覆盖省区域Controller
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
@RestController
@RequestMapping("/system/province")
public class GridProvinceController extends BaseController
{
    @Autowired
    private IGridProvinceService gridProvinceService;

    /**
     * 查询系统网格覆盖省区域列表
     */
    @PreAuthorize("@ss.hasPermi('system:province:list')")
    @GetMapping("/list")
    public TableDataInfo list(GridProvince gridProvince)
    {
        startPage();
        List<GridProvince> list = gridProvinceService.selectGridProvinceList(gridProvince);
        return getDataTable(list);
    }

    /**
     * 导出系统网格覆盖省区域列表
     */
    @PreAuthorize("@ss.hasPermi('system:province:export')")
    @Log(title = "系统网格覆盖省区域", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, GridProvince gridProvince)
    {
        List<GridProvince> list = gridProvinceService.selectGridProvinceList(gridProvince);
        ExcelUtil<GridProvince> util = new ExcelUtil<GridProvince>(GridProvince.class);
        util.exportExcel(response, list, "系统网格覆盖省区域数据");
    }

    /**
     * 获取系统网格覆盖省区域详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:province:query')")
    @GetMapping(value = "/{provinceId}")
    public AjaxResult getInfo(@PathVariable("provinceId") Long provinceId)
    {
        return success(gridProvinceService.selectGridProvinceByProvinceId(provinceId));
    }

    /**
     * 新增系统网格覆盖省区域
     */
    @PreAuthorize("@ss.hasPermi('system:province:add')")
    @Log(title = "系统网格覆盖省区域", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GridProvince gridProvince)
    {
        return toAjax(gridProvinceService.insertGridProvince(gridProvince));
    }

    /**
     * 修改系统网格覆盖省区域
     */
    @PreAuthorize("@ss.hasPermi('system:province:edit')")
    @Log(title = "系统网格覆盖省区域", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GridProvince gridProvince)
    {
        return toAjax(gridProvinceService.updateGridProvince(gridProvince));
    }

    /**
     * 删除系统网格覆盖省区域
     */
    @PreAuthorize("@ss.hasPermi('system:province:remove')")
    @Log(title = "系统网格覆盖省区域", businessType = BusinessType.DELETE)
	@DeleteMapping("/{provinceIds}")
    public AjaxResult remove(@PathVariable Long[] provinceIds)
    {
        return toAjax(gridProvinceService.deleteGridProvinceByProvinceIds(provinceIds));
    }
}
