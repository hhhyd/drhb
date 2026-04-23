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
import com.ruoyi.system.domain.Statistics;
import com.ruoyi.system.service.IStatisticsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 统计信息Controller
 * 
 * @author ruoyi
 * @date 2026-04-23
 */
@RestController
@RequestMapping("/system/statistics")
public class StatisticsController extends BaseController
{
    @Autowired
    private IStatisticsService statisticsService;

    /**
     * 查询统计信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:statistics:list')")
    @GetMapping("/list")
    public TableDataInfo list(Statistics statistics)
    {
        startPage();
        List<Statistics> list = statisticsService.selectStatisticsList(statistics);
        return getDataTable(list);
    }

    /**
     * 导出统计信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:statistics:export')")
    @Log(title = "统计信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Statistics statistics)
    {
        List<Statistics> list = statisticsService.selectStatisticsList(statistics);
        ExcelUtil<Statistics> util = new ExcelUtil<Statistics>(Statistics.class);
        util.exportExcel(response, list, "统计信息数据");
    }

    /**
     * 获取统计信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:statistics:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(statisticsService.selectStatisticsById(id));
    }

    /**
     * 新增统计信息
     */
    @PreAuthorize("@ss.hasPermi('system:statistics:add')")
    @Log(title = "统计信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Statistics statistics)
    {
        return toAjax(statisticsService.insertStatistics(statistics));
    }

    /**
     * 修改统计信息
     */
    @PreAuthorize("@ss.hasPermi('system:statistics:edit')")
    @Log(title = "统计信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Statistics statistics)
    {
        return toAjax(statisticsService.updateStatistics(statistics));
    }

    /**
     * 删除统计信息
     */
    @PreAuthorize("@ss.hasPermi('system:statistics:remove')")
    @Log(title = "统计信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(statisticsService.deleteStatisticsByIds(ids));
    }
}
