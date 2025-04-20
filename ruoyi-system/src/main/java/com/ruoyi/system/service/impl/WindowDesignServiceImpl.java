package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.UUID;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WindowDesignMapper;
import com.ruoyi.system.domain.WindowDesign;
import com.ruoyi.system.service.IWindowDesignService;
import com.ruoyi.common.utils.DateUtils;

/**
 * 窗户设计Service业务层处理
 * 
 * @author ruoyi
 */
@Service
public class WindowDesignServiceImpl implements IWindowDesignService 
{
    @Autowired
    private WindowDesignMapper windowDesignMapper;

    /**
     * 查询窗户设计
     * 
     * @param id 窗户设计主键
     * @return 窗户设计
     */
    @Override
    public WindowDesign selectWindowDesignById(String id)
    {
        return windowDesignMapper.selectWindowDesignById(id);
    }

    /**
     * 查询窗户设计列表
     * 
     * @param windowDesign 窗户设计
     * @return 窗户设计
     */
    @Override
    public List<WindowDesign> selectWindowDesignList(WindowDesign windowDesign)
    {
        return windowDesignMapper.selectWindowDesignList(windowDesign);
    }

    /**
     * 新增窗户设计
     * 
     * @param windowDesign 窗户设计
     * @return 结果
     */
    @Override
    public int insertWindowDesign(WindowDesign windowDesign)
    {
        // 如果没有设置ID，则生成UUID
        if (windowDesign.getId() == null || windowDesign.getId().isEmpty()) {
            windowDesign.setId(UUID.randomUUID().toString());
        }
        
        // 设置创建时间和更新时间
        Date now = DateUtils.getNowDate();
        windowDesign.setCreateTime(now);
        windowDesign.setUpdateTime(now);
        
        return windowDesignMapper.insertWindowDesign(windowDesign);
    }

    /**
     * 修改窗户设计
     * 
     * @param windowDesign 窗户设计
     * @return 结果
     */
    @Override
    public int updateWindowDesign(WindowDesign windowDesign)
    {
        // 设置更新时间
        windowDesign.setUpdateTime(DateUtils.getNowDate());
        
        return windowDesignMapper.updateWindowDesign(windowDesign);
    }

    /**
     * 批量删除窗户设计
     * 
     * @param ids 需要删除的窗户设计主键
     * @return 结果
     */
    @Override
    public int deleteWindowDesignByIds(String[] ids)
    {
        return windowDesignMapper.deleteWindowDesignByIds(ids);
    }

    /**
     * 删除窗户设计信息
     * 
     * @param id 窗户设计主键
     * @return 结果
     */
    @Override
    public int deleteWindowDesignById(String id)
    {
        return windowDesignMapper.deleteWindowDesignById(id);
    }
} 