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


import com.dao.ShentisuzhicepingDao;
import com.entity.ShentisuzhicepingEntity;
import com.service.ShentisuzhicepingService;
import com.entity.vo.ShentisuzhicepingVO;
import com.entity.view.ShentisuzhicepingView;

@Service("shentisuzhicepingService")
public class ShentisuzhicepingServiceImpl extends ServiceImpl<ShentisuzhicepingDao, ShentisuzhicepingEntity> implements ShentisuzhicepingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShentisuzhicepingEntity> page = this.selectPage(
                new Query<ShentisuzhicepingEntity>(params).getPage(),
                new EntityWrapper<ShentisuzhicepingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShentisuzhicepingEntity> wrapper) {
		  Page<ShentisuzhicepingView> page =new Query<ShentisuzhicepingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShentisuzhicepingVO> selectListVO(Wrapper<ShentisuzhicepingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShentisuzhicepingVO selectVO(Wrapper<ShentisuzhicepingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShentisuzhicepingView> selectListView(Wrapper<ShentisuzhicepingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShentisuzhicepingView selectView(Wrapper<ShentisuzhicepingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
