package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysFeedback;

/**
 * 用户反馈Service接口
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
public interface ISysFeedbackService 
{
    /**
     * 查询用户反馈
     * 
     * @param id 用户反馈主键
     * @return 用户反馈
     */
    public SysFeedback selectSysFeedbackById(Long id);

    /**
     * 查询用户反馈列表
     * 
     * @param sysFeedback 用户反馈
     * @return 用户反馈集合
     */
    public List<SysFeedback> selectSysFeedbackList(SysFeedback sysFeedback);

    /**
     * 新增用户反馈
     * 
     * @param sysFeedback 用户反馈
     * @return 结果
     */
    public int insertSysFeedback(SysFeedback sysFeedback);

    /**
     * 修改用户反馈
     * 
     * @param sysFeedback 用户反馈
     * @return 结果
     */
    public int updateSysFeedback(SysFeedback sysFeedback);

    /**
     * 批量删除用户反馈
     * 
     * @param ids 需要删除的用户反馈主键集合
     * @return 结果
     */
    public int deleteSysFeedbackByIds(Long[] ids);

    /**
     * 删除用户反馈信息
     * 
     * @param id 用户反馈主键
     * @return 结果
     */
    public int deleteSysFeedbackById(Long id);
}
