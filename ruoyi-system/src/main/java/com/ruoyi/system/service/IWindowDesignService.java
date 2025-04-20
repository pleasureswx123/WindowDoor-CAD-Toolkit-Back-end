package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.WindowDesign;

/**
 * 窗户设计Service接口
 * 
 * @author ruoyi
 */
public interface IWindowDesignService 
{
    /**
     * 查询窗户设计
     * 
     * @param id 窗户设计主键
     * @return 窗户设计
     */
    public WindowDesign selectWindowDesignById(String id);

    /**
     * 查询窗户设计列表
     * 
     * @param windowDesign 窗户设计
     * @return 窗户设计集合
     */
    public List<WindowDesign> selectWindowDesignList(WindowDesign windowDesign);

    /**
     * 新增窗户设计
     * 
     * @param windowDesign 窗户设计
     * @return 结果
     */
    public int insertWindowDesign(WindowDesign windowDesign);

    /**
     * 修改窗户设计
     * 
     * @param windowDesign 窗户设计
     * @return 结果
     */
    public int updateWindowDesign(WindowDesign windowDesign);

    /**
     * 批量删除窗户设计
     * 
     * @param ids 需要删除的窗户设计主键集合
     * @return 结果
     */
    public int deleteWindowDesignByIds(String[] ids);

    /**
     * 删除窗户设计信息
     * 
     * @param id 窗户设计主键
     * @return 结果
     */
    public int deleteWindowDesignById(String id);
} 