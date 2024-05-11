package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaoxuepingfenDao;
import com.entity.JiaoxuepingfenEntity;
import com.service.JiaoxuepingfenService;
import com.entity.vo.JiaoxuepingfenVO;
import com.entity.view.JiaoxuepingfenView;

@Service("jiaoxuepingfenService")
public class JiaoxuepingfenServiceImpl extends ServiceImpl<JiaoxuepingfenDao, JiaoxuepingfenEntity> implements JiaoxuepingfenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoxuepingfenEntity> page = this.selectPage(
                new Query<JiaoxuepingfenEntity>(params).getPage(),
                new EntityWrapper<JiaoxuepingfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoxuepingfenEntity> wrapper) {
		  Page<JiaoxuepingfenView> page =new Query<JiaoxuepingfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoxuepingfenVO> selectListVO(Wrapper<JiaoxuepingfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoxuepingfenVO selectVO(Wrapper<JiaoxuepingfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoxuepingfenView> selectListView(Wrapper<JiaoxuepingfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoxuepingfenView selectView(Wrapper<JiaoxuepingfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
