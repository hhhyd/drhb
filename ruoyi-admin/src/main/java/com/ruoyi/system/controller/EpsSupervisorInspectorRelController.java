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
import com.ruoyi.system.domain.EpsSupervisorInspectorRel;
import com.ruoyi.system.service.IEpsSupervisorInspectorRelService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 监督员-网格员多对多关联Controller
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
@RestController
@RequestMapping("/system/rel")
public class EpsSupervisorInspectorRelController extends BaseController
{
    @Autowired
    private IEpsSupervisorInspectorRelService epsSupervisorInspectorRelService;

    /**
     * 查询监督员-网格员多对多关联列表
     */
    @PreAuthorize("@ss.hasPermi('system:rel:list')")
    @GetMapping("/list")
    public TableDataInfo list(EpsSupervisorInspectorRel epsSupervisorInspectorRel)
    {
        startPage();
        List<EpsSupervisorInspectorRel> list = epsSupervisorInspectorRelService.selectEpsSupervisorInspectorRelList(epsSupervisorInspectorRel);
        return getDataTable(list);
    }

    /**
     * 导出监督员-网格员多对多关联列表
     */
    @PreAuthorize("@ss.hasPermi('system:rel:export')")
    @Log(title = "监督员-网格员多对多关联", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EpsSupervisorInspectorRel epsSupervisorInspectorRel)
    {
        List<EpsSupervisorInspectorRel> list = epsSupervisorInspectorRelService.selectEpsSupervisorInspectorRelList(epsSupervisorInspectorRel);
        ExcelUtil<EpsSupervisorInspectorRel> util = new ExcelUtil<EpsSupervisorInspectorRel>(EpsSupervisorInspectorRel.class);
        util.exportExcel(response, list, "监督员-网格员多对多关联数据");
    }

    /**
     * 获取监督员-网格员多对多关联详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:rel:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(epsSupervisorInspectorRelService.selectEpsSupervisorInspectorRelById(id));
    }

    /**
     * 新增监督员-网格员多对多关联
     */
    @PreAuthorize("@ss.hasPermi('system:rel:add')")
    @Log(title = "监督员-网格员多对多关联", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EpsSupervisorInspectorRel epsSupervisorInspectorRel)
    {
        return toAjax(epsSupervisorInspectorRelService.insertEpsSupervisorInspectorRel(epsSupervisorInspectorRel));
    }

    /**
     * 修改监督员-网格员多对多关联
     */
    @PreAuthorize("@ss.hasPermi('system:rel:edit')")
    @Log(title = "监督员-网格员多对多关联", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EpsSupervisorInspectorRel epsSupervisorInspectorRel)
    {
        return toAjax(epsSupervisorInspectorRelService.updateEpsSupervisorInspectorRel(epsSupervisorInspectorRel));
    }

    /**
     * 删除监督员-网格员多对多关联
     */
    @PreAuthorize("@ss.hasPermi('system:rel:remove')")
    @Log(title = "监督员-网格员多对多关联", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(epsSupervisorInspectorRelService.deleteEpsSupervisorInspectorRelByIds(ids));
    }
}
