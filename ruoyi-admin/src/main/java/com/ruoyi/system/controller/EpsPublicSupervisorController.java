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
import com.ruoyi.system.domain.EpsPublicSupervisor;
import com.ruoyi.system.service.IEpsPublicSupervisorService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 公众监督员详细信息Controller
 * 
 * @author ruoyi
 * @date 2026-04-22
 */
@RestController
@RequestMapping("/system/supervisor")
public class EpsPublicSupervisorController extends BaseController
{
    @Autowired
    private IEpsPublicSupervisorService epsPublicSupervisorService;

    /**
     * 查询公众监督员详细信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:supervisor:list')")
    @GetMapping("/list")
    public TableDataInfo list(EpsPublicSupervisor epsPublicSupervisor)
    {
        startPage();
        List<EpsPublicSupervisor> list = epsPublicSupervisorService.selectEpsPublicSupervisorList(epsPublicSupervisor);
        return getDataTable(list);
    }

    /**
     * 导出公众监督员详细信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:supervisor:export')")
    @Log(title = "公众监督员详细信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EpsPublicSupervisor epsPublicSupervisor)
    {
        List<EpsPublicSupervisor> list = epsPublicSupervisorService.selectEpsPublicSupervisorList(epsPublicSupervisor);
        ExcelUtil<EpsPublicSupervisor> util = new ExcelUtil<EpsPublicSupervisor>(EpsPublicSupervisor.class);
        util.exportExcel(response, list, "公众监督员详细信息数据");
    }

    /**
     * 获取公众监督员详细信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:supervisor:query')")
    @GetMapping(value = "/{supervisorId}")
    public AjaxResult getInfo(@PathVariable("supervisorId") Long supervisorId)
    {
        return success(epsPublicSupervisorService.selectEpsPublicSupervisorBySupervisorId(supervisorId));
    }

    /**
     * 新增公众监督员详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:supervisor:add')")
    @Log(title = "公众监督员详细信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EpsPublicSupervisor epsPublicSupervisor)
    {
        return toAjax(epsPublicSupervisorService.insertEpsPublicSupervisor(epsPublicSupervisor));
    }

    /**
     * 修改公众监督员详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:supervisor:edit')")
    @Log(title = "公众监督员详细信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EpsPublicSupervisor epsPublicSupervisor)
    {
        return toAjax(epsPublicSupervisorService.updateEpsPublicSupervisor(epsPublicSupervisor));
    }

    /**
     * 删除公众监督员详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:supervisor:remove')")
    @Log(title = "公众监督员详细信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{supervisorIds}")
    public AjaxResult remove(@PathVariable Long[] supervisorIds)
    {
        return toAjax(epsPublicSupervisorService.deleteEpsPublicSupervisorBySupervisorIds(supervisorIds));
    }
}
