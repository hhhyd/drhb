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
import com.ruoyi.system.domain.GridCity;
import com.ruoyi.system.service.IGridCityService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 系统网格覆盖市区域Controller
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
@RestController
@RequestMapping("/system/city")
public class GridCityController extends BaseController
{
    @Autowired
    private IGridCityService gridCityService;

    /**
     * 查询系统网格覆盖市区域列表
     */
    @PreAuthorize("@ss.hasPermi('system:city:list')")
    @GetMapping("/list")
    public TableDataInfo list(GridCity gridCity)
    {
        startPage();
        List<GridCity> list = gridCityService.selectGridCityList(gridCity);
        return getDataTable(list);
    }

    /**
     * 导出系统网格覆盖市区域列表
     */
    @PreAuthorize("@ss.hasPermi('system:city:export')")
    @Log(title = "系统网格覆盖市区域", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, GridCity gridCity)
    {
        List<GridCity> list = gridCityService.selectGridCityList(gridCity);
        ExcelUtil<GridCity> util = new ExcelUtil<GridCity>(GridCity.class);
        util.exportExcel(response, list, "系统网格覆盖市区域数据");
    }

    /**
     * 获取系统网格覆盖市区域详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:city:query')")
    @GetMapping(value = "/{cityId}")
    public AjaxResult getInfo(@PathVariable("cityId") Long cityId)
    {
        return success(gridCityService.selectGridCityByCityId(cityId));
    }

    /**
     * 新增系统网格覆盖市区域
     */
    @PreAuthorize("@ss.hasPermi('system:city:add')")
    @Log(title = "系统网格覆盖市区域", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GridCity gridCity)
    {
        return toAjax(gridCityService.insertGridCity(gridCity));
    }

    /**
     * 修改系统网格覆盖市区域
     */
    @PreAuthorize("@ss.hasPermi('system:city:edit')")
    @Log(title = "系统网格覆盖市区域", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GridCity gridCity)
    {
        return toAjax(gridCityService.updateGridCity(gridCity));
    }

    /**
     * 删除系统网格覆盖市区域
     */
    @PreAuthorize("@ss.hasPermi('system:city:remove')")
    @Log(title = "系统网格覆盖市区域", businessType = BusinessType.DELETE)
	@DeleteMapping("/{cityIds}")
    public AjaxResult remove(@PathVariable Long[] cityIds)
    {
        return toAjax(gridCityService.deleteGridCityByCityIds(cityIds));
    }
}
