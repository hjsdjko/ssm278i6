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


import com.dao.YundongbaogaojiluDao;
import com.entity.YundongbaogaojiluEntity;
import com.service.YundongbaogaojiluService;
import com.entity.vo.YundongbaogaojiluVO;
import com.entity.view.YundongbaogaojiluView;

@Service("yundongbaogaojiluService")
public class YundongbaogaojiluServiceImpl extends ServiceImpl<YundongbaogaojiluDao, YundongbaogaojiluEntity> implements YundongbaogaojiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YundongbaogaojiluEntity> page = this.selectPage(
                new Query<YundongbaogaojiluEntity>(params).getPage(),
                new EntityWrapper<YundongbaogaojiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YundongbaogaojiluEntity> wrapper) {
		  Page<YundongbaogaojiluView> page =new Query<YundongbaogaojiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YundongbaogaojiluVO> selectListVO(Wrapper<YundongbaogaojiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YundongbaogaojiluVO selectVO(Wrapper<YundongbaogaojiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YundongbaogaojiluView> selectListView(Wrapper<YundongbaogaojiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YundongbaogaojiluView selectView(Wrapper<YundongbaogaojiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
