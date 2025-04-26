package com.ruoyi.system.controller;

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
import com.ruoyi.system.domain.SysFeedbackImage;
import com.ruoyi.system.service.ISysFeedbackImageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 反馈图片Controller
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
@RestController
@RequestMapping("/system/image")
public class SysFeedbackImageController extends BaseController
{
    @Autowired
    private ISysFeedbackImageService sysFeedbackImageService;

    /**
     * 查询反馈图片列表
     */
    @PreAuthorize("@ss.hasPermi('system:image:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysFeedbackImage sysFeedbackImage)
    {
        startPage();
        List<SysFeedbackImage> list = sysFeedbackImageService.selectSysFeedbackImageList(sysFeedbackImage);
        return getDataTable(list);
    }

    /**
     * 导出反馈图片列表
     */
    @PreAuthorize("@ss.hasPermi('system:image:export')")
    @Log(title = "反馈图片", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysFeedbackImage sysFeedbackImage)
    {
        List<SysFeedbackImage> list = sysFeedbackImageService.selectSysFeedbackImageList(sysFeedbackImage);
        ExcelUtil<SysFeedbackImage> util = new ExcelUtil<SysFeedbackImage>(SysFeedbackImage.class);
        util.exportExcel(response, list, "反馈图片数据");
    }

    /**
     * 获取反馈图片详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:image:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysFeedbackImageService.selectSysFeedbackImageById(id));
    }

    /**
     * 新增反馈图片
     */
    @PreAuthorize("@ss.hasPermi('system:image:add')")
    @Log(title = "反馈图片", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysFeedbackImage sysFeedbackImage)
    {
        return toAjax(sysFeedbackImageService.insertSysFeedbackImage(sysFeedbackImage));
    }

    /**
     * 修改反馈图片
     */
    @PreAuthorize("@ss.hasPermi('system:image:edit')")
    @Log(title = "反馈图片", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysFeedbackImage sysFeedbackImage)
    {
        return toAjax(sysFeedbackImageService.updateSysFeedbackImage(sysFeedbackImage));
    }

    /**
     * 删除反馈图片
     */
    @PreAuthorize("@ss.hasPermi('system:image:remove')")
    @Log(title = "反馈图片", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysFeedbackImageService.deleteSysFeedbackImageByIds(ids));
    }
}
