package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户反馈对象 sys_feedback
 * 
 * @author ruoyi
 * @date 2025-04-26
 */
public class SysFeedback extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 反馈ID */
    private Long id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 反馈类型（功能异常、性能问题、功能建议等） */
    @Excel(name = "反馈类型", readConverterExp = "功=能异常、性能问题、功能建议等")
    private String feedbackType;

    /** 问题描述 */
    @Excel(name = "问题描述")
    private String description;

    /** 紧急程度（低、中、高） */
    @Excel(name = "紧急程度", readConverterExp = "低=、中、高")
    private String priority;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String contact;

    /** 处理状态（待处理、处理中、已解决、已关闭） */
    @Excel(name = "处理状态", readConverterExp = "待=处理、处理中、已解决、已关闭")
    private String status;

    /** 处理人ID */
    @Excel(name = "处理人ID")
    private Long handlerId;

    /** 处理意见 */
    @Excel(name = "处理意见")
    private String handlerComment;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setFeedbackType(String feedbackType) 
    {
        this.feedbackType = feedbackType;
    }

    public String getFeedbackType() 
    {
        return feedbackType;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setPriority(String priority) 
    {
        this.priority = priority;
    }

    public String getPriority() 
    {
        return priority;
    }

    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setHandlerId(Long handlerId) 
    {
        this.handlerId = handlerId;
    }

    public Long getHandlerId() 
    {
        return handlerId;
    }

    public void setHandlerComment(String handlerComment) 
    {
        this.handlerComment = handlerComment;
    }

    public String getHandlerComment() 
    {
        return handlerComment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("feedbackType", getFeedbackType())
            .append("description", getDescription())
            .append("priority", getPriority())
            .append("contact", getContact())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("handlerId", getHandlerId())
            .append("handlerComment", getHandlerComment())
            .toString();
    }
}
