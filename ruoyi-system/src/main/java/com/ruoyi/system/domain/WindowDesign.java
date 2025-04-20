package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 窗户设计对象 window_design
 * 
 * @author ruoyi
 */
public class WindowDesign extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设计ID */
    private String id;

    /** 设计名称 */
    @Excel(name = "设计名称")
    private String name;

    /** 宽度 */
    @Excel(name = "宽度")
    private Double width;

    /** 高度 */
    @Excel(name = "高度")
    private Double height;

    /** 框架尺寸 */
    @Excel(name = "框架尺寸")
    private Double frameSize;

    /** 缩略图（Base64） */
    private String thumbnail;

    /** 设计数据（JSON） */
    private String designData;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    
    public void setWidth(Double width) 
    {
        this.width = width;
    }

    public Double getWidth() 
    {
        return width;
    }
    
    public void setHeight(Double height) 
    {
        this.height = height;
    }

    public Double getHeight() 
    {
        return height;
    }
    
    public void setFrameSize(Double frameSize) 
    {
        this.frameSize = frameSize;
    }

    public Double getFrameSize() 
    {
        return frameSize;
    }
    
    public void setThumbnail(String thumbnail) 
    {
        this.thumbnail = thumbnail;
    }

    public String getThumbnail() 
    {
        return thumbnail;
    }
    
    public void setDesignData(String designData) 
    {
        this.designData = designData;
    }

    public String getDesignData() 
    {
        return designData;
    }
    
    public void setCreateTime(Date createTime) 
    {
        this.createTime = createTime;
    }

    public Date getCreateTime() 
    {
        return createTime;
    }
    
    public void setUpdateTime(Date updateTime) 
    {
        this.updateTime = updateTime;
    }

    public Date getUpdateTime() 
    {
        return updateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("width", getWidth())
            .append("height", getHeight())
            .append("frameSize", getFrameSize())
            .append("thumbnail", getThumbnail())
            .append("designData", getDesignData())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .toString();
    }
} 