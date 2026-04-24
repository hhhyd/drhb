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
import com.ruoyi.system.domain.NepvDecisionData;
import com.ruoyi.system.service.INepvDecisionDataService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 决策者可视化数据Controller
 * 
 * @author ruoyi
 * @date 2026-04-24
 */
@RestController
@RequestMapping("/system/data")
public class NepvDecisionDataController extends BaseController
{
    @Autowired
    private INepvDecisionDataService nepvDecisionDataService;

    /**
     * 查询决策者可视化数据列表
     */
    @PreAuthorize("@ss.hasPermi('system:data:list')")
    @GetMapping("/list")
    public TableDataInfo list(NepvDecisionData nepvDecisionData)
    {
        startPage();
        List<NepvDecisionData> list = nepvDecisionDataService.selectNepvDecisionDataList(nepvDecisionData);
        return getDataTable(list);
    }

    /**
     * 导出决策者可视化数据列表
     */
    @PreAuthorize("@ss.hasPermi('system:data:export')")
    @Log(title = "决策者可视化数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NepvDecisionData nepvDecisionData)
    {
        List<NepvDecisionData> list = nepvDecisionDataService.selectNepvDecisionDataList(nepvDecisionData);
        ExcelUtil<NepvDecisionData> util = new ExcelUtil<NepvDecisionData>(NepvDecisionData.class);
        util.exportExcel(response, list, "决策者可视化数据数据");
    }

    /**
     * 获取决策者可视化数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:data:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nepvDecisionDataService.selectNepvDecisionDataById(id));
    }

    /**
     * 新增决策者可视化数据
     */
    @PreAuthorize("@ss.hasPermi('system:data:add')")
    @Log(title = "决策者可视化数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NepvDecisionData nepvDecisionData)
    {
        return toAjax(nepvDecisionDataService.insertNepvDecisionData(nepvDecisionData));
    }

    /**
     * 修改决策者可视化数据
     */
    @PreAuthorize("@ss.hasPermi('system:data:edit')")
    @Log(title = "决策者可视化数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NepvDecisionData nepvDecisionData)
    {
        return toAjax(nepvDecisionDataService.updateNepvDecisionData(nepvDecisionData));
    }

    /**
     * 删除决策者可视化数据
     */
    @PreAuthorize("@ss.hasPermi('system:data:remove')")
    @Log(title = "决策者可视化数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nepvDecisionDataService.deleteNepvDecisionDataByIds(ids));
    }
}
