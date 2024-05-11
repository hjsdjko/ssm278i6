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


import com.dao.KetangxiaojieDao;
import com.entity.KetangxiaojieEntity;
import com.service.KetangxiaojieService;
import com.entity.vo.KetangxiaojieVO;
import com.entity.view.KetangxiaojieView;

@Service("ketangxiaojieService")
public class KetangxiaojieServiceImpl extends ServiceImpl<KetangxiaojieDao, KetangxiaojieEntity> implements KetangxiaojieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KetangxiaojieEntity> page = this.selectPage(
                new Query<KetangxiaojieEntity>(params).getPage(),
                new EntityWrapper<KetangxiaojieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KetangxiaojieEntity> wrapper) {
		  Page<KetangxiaojieView> page =new Query<KetangxiaojieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KetangxiaojieVO> selectListVO(Wrapper<KetangxiaojieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KetangxiaojieVO selectVO(Wrapper<KetangxiaojieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KetangxiaojieView> selectListView(Wrapper<KetangxiaojieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KetangxiaojieView selectView(Wrapper<KetangxiaojieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
