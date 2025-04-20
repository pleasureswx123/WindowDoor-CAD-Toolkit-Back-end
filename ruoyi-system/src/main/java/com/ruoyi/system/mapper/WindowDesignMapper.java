package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.WindowDesign;

/**
 * 窗户设计Mapper接口
 * 
 * @author ruoyi
 */
public interface WindowDesignMapper 
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
     * 删除窗户设计
     * 
     * @param id 窗户设计主键
     * @return 结果
     */
    public int deleteWindowDesignById(String id);

    /**
     * 批量删除窗户设计
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWindowDesignByIds(String[] ids);
} 