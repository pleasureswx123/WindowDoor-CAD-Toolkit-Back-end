package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysFeedbackImage;

/**
 * 反馈图片Service接口
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
public interface ISysFeedbackImageService 
{
    /**
     * 查询反馈图片
     * 
     * @param id 反馈图片主键
     * @return 反馈图片
     */
    public SysFeedbackImage selectSysFeedbackImageById(Long id);

    /**
     * 查询反馈图片列表
     * 
     * @param sysFeedbackImage 反馈图片
     * @return 反馈图片集合
     */
    public List<SysFeedbackImage> selectSysFeedbackImageList(SysFeedbackImage sysFeedbackImage);

    /**
     * 新增反馈图片
     * 
     * @param sysFeedbackImage 反馈图片
     * @return 结果
     */
    public int insertSysFeedbackImage(SysFeedbackImage sysFeedbackImage);

    /**
     * 修改反馈图片
     * 
     * @param sysFeedbackImage 反馈图片
     * @return 结果
     */
    public int updateSysFeedbackImage(SysFeedbackImage sysFeedbackImage);

    /**
     * 批量删除反馈图片
     * 
     * @param ids 需要删除的反馈图片主键集合
     * @return 结果
     */
    public int deleteSysFeedbackImageByIds(Long[] ids);

    /**
     * 删除反馈图片信息
     * 
     * @param id 反馈图片主键
     * @return 结果
     */
    public int deleteSysFeedbackImageById(Long id);
}
