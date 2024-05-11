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


import com.dao.TiyujiaoanDao;
import com.entity.TiyujiaoanEntity;
import com.service.TiyujiaoanService;
import com.entity.vo.TiyujiaoanVO;
import com.entity.view.TiyujiaoanView;

@Service("tiyujiaoanService")
public class TiyujiaoanServiceImpl extends ServiceImpl<TiyujiaoanDao, TiyujiaoanEntity> implements TiyujiaoanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TiyujiaoanEntity> page = this.selectPage(
                new Query<TiyujiaoanEntity>(params).getPage(),
                new EntityWrapper<TiyujiaoanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TiyujiaoanEntity> wrapper) {
		  Page<TiyujiaoanView> page =new Query<TiyujiaoanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TiyujiaoanVO> selectListVO(Wrapper<TiyujiaoanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TiyujiaoanVO selectVO(Wrapper<TiyujiaoanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TiyujiaoanView> selectListView(Wrapper<TiyujiaoanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TiyujiaoanView selectView(Wrapper<TiyujiaoanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
