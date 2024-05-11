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


import com.dao.DianmingceDao;
import com.entity.DianmingceEntity;
import com.service.DianmingceService;
import com.entity.vo.DianmingceVO;
import com.entity.view.DianmingceView;

@Service("dianmingceService")
public class DianmingceServiceImpl extends ServiceImpl<DianmingceDao, DianmingceEntity> implements DianmingceService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianmingceEntity> page = this.selectPage(
                new Query<DianmingceEntity>(params).getPage(),
                new EntityWrapper<DianmingceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianmingceEntity> wrapper) {
		  Page<DianmingceView> page =new Query<DianmingceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianmingceVO> selectListVO(Wrapper<DianmingceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianmingceVO selectVO(Wrapper<DianmingceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianmingceView> selectListView(Wrapper<DianmingceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianmingceView selectView(Wrapper<DianmingceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
