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
import com.ruoyi.system.domain.EpsGridInspector;
import com.ruoyi.system.service.IEpsGridInspectorService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * AQI检测网格员详细信息Controller
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
@RestController
@RequestMapping("/system/inspector")
public class EpsGridInspectorController extends BaseController
{
    @Autowired
    private IEpsGridInspectorService epsGridInspectorService;

    /**
     * 查询AQI检测网格员详细信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:inspector:list')")
    @GetMapping("/list")
    public TableDataInfo list(EpsGridInspector epsGridInspector)
    {
        startPage();
        List<EpsGridInspector> list = epsGridInspectorService.selectEpsGridInspectorList(epsGridInspector);
        return getDataTable(list);
    }

    /**
     * 导出AQI检测网格员详细信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:inspector:export')")
    @Log(title = "AQI检测网格员详细信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EpsGridInspector epsGridInspector)
    {
        List<EpsGridInspector> list = epsGridInspectorService.selectEpsGridInspectorList(epsGridInspector);
        ExcelUtil<EpsGridInspector> util = new ExcelUtil<EpsGridInspector>(EpsGridInspector.class);
        util.exportExcel(response, list, "AQI检测网格员详细信息数据");
    }

    /**
     * 获取AQI检测网格员详细信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:inspector:query')")
    @GetMapping(value = "/{inspectorId}")
    public AjaxResult getInfo(@PathVariable("inspectorId") Long inspectorId)
    {
        return success(epsGridInspectorService.selectEpsGridInspectorByInspectorId(inspectorId));
    }

    /**
     * 新增AQI检测网格员详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:inspector:add')")
    @Log(title = "AQI检测网格员详细信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EpsGridInspector epsGridInspector)
    {
        return toAjax(epsGridInspectorService.insertEpsGridInspector(epsGridInspector));
    }

    /**
     * 修改AQI检测网格员详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:inspector:edit')")
    @Log(title = "AQI检测网格员详细信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EpsGridInspector epsGridInspector)
    {
        return toAjax(epsGridInspectorService.updateEpsGridInspector(epsGridInspector));
    }

    /**
     * 删除AQI检测网格员详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:inspector:remove')")
    @Log(title = "AQI检测网格员详细信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{inspectorIds}")
    public AjaxResult remove(@PathVariable Long[] inspectorIds)
    {
        return toAjax(epsGridInspectorService.deleteEpsGridInspectorByInspectorIds(inspectorIds));
    }
}
