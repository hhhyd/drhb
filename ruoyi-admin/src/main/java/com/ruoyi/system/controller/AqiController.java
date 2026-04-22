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
import com.ruoyi.system.domain.Aqi;
import com.ruoyi.system.service.IAqiService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 空气质量指数级别Controller
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
@RestController
@RequestMapping("/system/aqi")
public class AqiController extends BaseController
{
    @Autowired
    private IAqiService aqiService;

    /**
     * 查询空气质量指数级别列表
     */
    @PreAuthorize("@ss.hasPermi('system:aqi:list')")
    @GetMapping("/list")
    public TableDataInfo list(Aqi aqi)
    {
        startPage();
        List<Aqi> list = aqiService.selectAqiList(aqi);
        return getDataTable(list);
    }

    /**
     * 导出空气质量指数级别列表
     */
    @PreAuthorize("@ss.hasPermi('system:aqi:export')")
    @Log(title = "空气质量指数级别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Aqi aqi)
    {
        List<Aqi> list = aqiService.selectAqiList(aqi);
        ExcelUtil<Aqi> util = new ExcelUtil<Aqi>(Aqi.class);
        util.exportExcel(response, list, "空气质量指数级别数据");
    }

    /**
     * 获取空气质量指数级别详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:aqi:query')")
    @GetMapping(value = "/{aqiId}")
    public AjaxResult getInfo(@PathVariable("aqiId") Long aqiId)
    {
        return success(aqiService.selectAqiByAqiId(aqiId));
    }

    /**
     * 新增空气质量指数级别
     */
    @PreAuthorize("@ss.hasPermi('system:aqi:add')")
    @Log(title = "空气质量指数级别", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Aqi aqi)
    {
        return toAjax(aqiService.insertAqi(aqi));
    }

    /**
     * 修改空气质量指数级别
     */
    @PreAuthorize("@ss.hasPermi('system:aqi:edit')")
    @Log(title = "空气质量指数级别", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Aqi aqi)
    {
        return toAjax(aqiService.updateAqi(aqi));
    }

    /**
     * 删除空气质量指数级别
     */
    @PreAuthorize("@ss.hasPermi('system:aqi:remove')")
    @Log(title = "空气质量指数级别", businessType = BusinessType.DELETE)
	@DeleteMapping("/{aqiIds}")
    public AjaxResult remove(@PathVariable Long[] aqiIds)
    {
        return toAjax(aqiService.deleteAqiByAqiIds(aqiIds));
    }
}
