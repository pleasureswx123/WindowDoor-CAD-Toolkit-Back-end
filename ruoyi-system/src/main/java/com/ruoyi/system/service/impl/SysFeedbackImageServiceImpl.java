package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysFeedbackImageMapper;
import com.ruoyi.system.domain.SysFeedbackImage;
import com.ruoyi.system.service.ISysFeedbackImageService;

/**
 * 反馈图片Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
@Service
public class SysFeedbackImageServiceImpl implements ISysFeedbackImageService 
{
    @Autowired
    private SysFeedbackImageMapper sysFeedbackImageMapper;

    /**
     * 查询反馈图片
     * 
     * @param id 反馈图片主键
     * @return 反馈图片
     */
    @Override
    public SysFeedbackImage selectSysFeedbackImageById(Long id)
    {
        return sysFeedbackImageMapper.selectSysFeedbackImageById(id);
    }

    /**
     * 查询反馈图片列表
     * 
     * @param sysFeedbackImage 反馈图片
     * @return 反馈图片
     */
    @Override
    public List<SysFeedbackImage> selectSysFeedbackImageList(SysFeedbackImage sysFeedbackImage)
    {
        return sysFeedbackImageMapper.selectSysFeedbackImageList(sysFeedbackImage);
    }

    /**
     * 新增反馈图片
     * 
     * @param sysFeedbackImage 反馈图片
     * @return 结果
     */
    @Override
    public int insertSysFeedbackImage(SysFeedbackImage sysFeedbackImage)
    {
        sysFeedbackImage.setCreateTime(DateUtils.getNowDate());
        return sysFeedbackImageMapper.insertSysFeedbackImage(sysFeedbackImage);
    }

    /**
     * 修改反馈图片
     * 
     * @param sysFeedbackImage 反馈图片
     * @return 结果
     */
    @Override
    public int updateSysFeedbackImage(SysFeedbackImage sysFeedbackImage)
    {
        return sysFeedbackImageMapper.updateSysFeedbackImage(sysFeedbackImage);
    }

    /**
     * 批量删除反馈图片
     * 
     * @param ids 需要删除的反馈图片主键
     * @return 结果
     */
    @Override
    public int deleteSysFeedbackImageByIds(Long[] ids)
    {
        return sysFeedbackImageMapper.deleteSysFeedbackImageByIds(ids);
    }

    /**
     * 删除反馈图片信息
     * 
     * @param id 反馈图片主键
     * @return 结果
     */
    @Override
    public int deleteSysFeedbackImageById(Long id)
    {
        return sysFeedbackImageMapper.deleteSysFeedbackImageById(id);
    }
}
