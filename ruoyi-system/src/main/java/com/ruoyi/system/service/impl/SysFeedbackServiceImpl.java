package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysFeedbackMapper;
import com.ruoyi.system.domain.SysFeedback;
import com.ruoyi.system.service.ISysFeedbackService;

/**
 * 用户反馈Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
@Service
public class SysFeedbackServiceImpl implements ISysFeedbackService 
{
    @Autowired
    private SysFeedbackMapper sysFeedbackMapper;

    /**
     * 查询用户反馈
     * 
     * @param id 用户反馈主键
     * @return 用户反馈
     */
    @Override
    public SysFeedback selectSysFeedbackById(Long id)
    {
        return sysFeedbackMapper.selectSysFeedbackById(id);
    }

    /**
     * 查询用户反馈列表
     * 
     * @param sysFeedback 用户反馈
     * @return 用户反馈
     */
    @Override
    public List<SysFeedback> selectSysFeedbackList(SysFeedback sysFeedback)
    {
        return sysFeedbackMapper.selectSysFeedbackList(sysFeedback);
    }

    /**
     * 新增用户反馈
     * 
     * @param sysFeedback 用户反馈
     * @return 结果
     */
    @Override
    public int insertSysFeedback(SysFeedback sysFeedback)
    {
        sysFeedback.setCreateTime(DateUtils.getNowDate());
        return sysFeedbackMapper.insertSysFeedback(sysFeedback);
    }

    /**
     * 修改用户反馈
     * 
     * @param sysFeedback 用户反馈
     * @return 结果
     */
    @Override
    public int updateSysFeedback(SysFeedback sysFeedback)
    {
        sysFeedback.setUpdateTime(DateUtils.getNowDate());
        return sysFeedbackMapper.updateSysFeedback(sysFeedback);
    }

    /**
     * 批量删除用户反馈
     * 
     * @param ids 需要删除的用户反馈主键
     * @return 结果
     */
    @Override
    public int deleteSysFeedbackByIds(Long[] ids)
    {
        return sysFeedbackMapper.deleteSysFeedbackByIds(ids);
    }

    /**
     * 删除用户反馈信息
     * 
     * @param id 用户反馈主键
     * @return 结果
     */
    @Override
    public int deleteSysFeedbackById(Long id)
    {
        return sysFeedbackMapper.deleteSysFeedbackById(id);
    }
}
