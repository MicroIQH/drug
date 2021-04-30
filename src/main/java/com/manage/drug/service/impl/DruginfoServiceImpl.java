package com.manage.drug.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manage.drug.entity.Druginfo;
import com.manage.drug.mapper.DruginfoMapper;
import com.manage.drug.service.IDruginfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author 杉子
 * @date 2021/4/30 17:03
 * * 药品service实现类
 */
@Service
public class DruginfoServiceImpl extends ServiceImpl<DruginfoMapper, Druginfo> implements IDruginfoService {

    @Autowired
    private DruginfoMapper druginfoMapper;

    /**
     * 分页查询药品数据
     *
     * @param pageNum  第几页
     * @param pageSize 每页多少条数据
     * @param param    查询参数-药品名称
     * @return
     */
    @Override
    public IPage<Druginfo> selectDruginfoPage(int pageNum, int pageSize, String param) {
        QueryWrapper<Druginfo> queryWrapper = new QueryWrapper<>();
        if(StringUtils.isNotEmpty(param)){
            queryWrapper.like("name",param);
        }
        Page<Druginfo> page = new Page<>(pageNum,pageSize);
        return druginfoMapper.selectPage(page,queryWrapper);
    }

    /**
     * 新增一条药品信息
     *
     * @param druginfo
     */
    @Override
    public int addDruginfo(Druginfo druginfo) {
        return druginfoMapper.insert(druginfo);
    }

    /**
     * 修改一条药品信息
     *
     * @param druginfo
     */
    @Override
    public int editDruginfo(Druginfo druginfo) {
        return druginfoMapper.updateById(druginfo);
    }

    /**
     * 根据主键id查询一个药品对象
     *
     * @param id
     * @return
     */
    @Override
    public Druginfo queryDruginfoById(Integer id) {
        return druginfoMapper.selectById(id);
    }

    /**
     * 根据主键id删除一个药品对象
     *
     * @param id
     * @return
     */
    @Override
    public int delDruginfoById(Integer id) {
        return druginfoMapper.deleteById(id);
    }

    /**
     * 查询所有药品
     *
     * @return
     */
    @Override
    public List<Druginfo> queryDruginfoList() {
        return druginfoMapper.selectList(null);
    }
}