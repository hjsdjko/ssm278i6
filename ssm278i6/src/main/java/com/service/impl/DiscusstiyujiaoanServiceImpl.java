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


import com.dao.DiscusstiyujiaoanDao;
import com.entity.DiscusstiyujiaoanEntity;
import com.service.DiscusstiyujiaoanService;
import com.entity.vo.DiscusstiyujiaoanVO;
import com.entity.view.DiscusstiyujiaoanView;

@Service("discusstiyujiaoanService")
public class DiscusstiyujiaoanServiceImpl extends ServiceImpl<DiscusstiyujiaoanDao, DiscusstiyujiaoanEntity> implements DiscusstiyujiaoanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstiyujiaoanEntity> page = this.selectPage(
                new Query<DiscusstiyujiaoanEntity>(params).getPage(),
                new EntityWrapper<DiscusstiyujiaoanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstiyujiaoanEntity> wrapper) {
		  Page<DiscusstiyujiaoanView> page =new Query<DiscusstiyujiaoanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstiyujiaoanVO> selectListVO(Wrapper<DiscusstiyujiaoanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstiyujiaoanVO selectVO(Wrapper<DiscusstiyujiaoanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstiyujiaoanView> selectListView(Wrapper<DiscusstiyujiaoanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstiyujiaoanView selectView(Wrapper<DiscusstiyujiaoanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
