package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.system.domain.WindowDesign;
import com.ruoyi.system.service.IWindowDesignService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 窗户设计Controller
 * 
 * @author ruoyi
 */
@RestController
@RequestMapping("/system/design")
public class WindowDesignController extends BaseController
{
    @Autowired
    private IWindowDesignService windowDesignService;

    /**
     * 查询窗户设计列表
     */
    @PreAuthorize("@ss.hasPermi('system:design:list')")
    @GetMapping("/list")
    public TableDataInfo list(WindowDesign windowDesign)
    {
        startPage();
        List<WindowDesign> list = windowDesignService.selectWindowDesignList(windowDesign);
        return getDataTable(list);
    }

    /**
     * 导出窗户设计列表
     */
    @PreAuthorize("@ss.hasPermi('system:design:export')")
    @Log(title = "窗户设计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WindowDesign windowDesign)
    {
        List<WindowDesign> list = windowDesignService.selectWindowDesignList(windowDesign);
        ExcelUtil<WindowDesign> util = new ExcelUtil<WindowDesign>(WindowDesign.class);
        util.exportExcel(response, list, "窗户设计数据");
    }

    /**
     * 获取窗户设计详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:design:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(windowDesignService.selectWindowDesignById(id));
    }

    /**
     * 新增窗户设计
     */
    @PreAuthorize("@ss.hasPermi('system:design:add')")
    @Log(title = "窗户设计", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WindowDesign windowDesign)
    {
        return toAjax(windowDesignService.insertWindowDesign(windowDesign));
    }

    /**
     * 修改窗户设计
     */
    @PreAuthorize("@ss.hasPermi('system:design:edit')")
    @Log(title = "窗户设计", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WindowDesign windowDesign)
    {
        return toAjax(windowDesignService.updateWindowDesign(windowDesign));
    }

    /**
     * 删除窗户设计
     */
    @PreAuthorize("@ss.hasPermi('system:design:remove')")
    @Log(title = "窗户设计", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(windowDesignService.deleteWindowDesignByIds(ids));
    }
} 