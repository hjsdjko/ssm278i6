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


import com.dao.JiaoxuebisaichengjiDao;
import com.entity.JiaoxuebisaichengjiEntity;
import com.service.JiaoxuebisaichengjiService;
import com.entity.vo.JiaoxuebisaichengjiVO;
import com.entity.view.JiaoxuebisaichengjiView;

@Service("jiaoxuebisaichengjiService")
public class JiaoxuebisaichengjiServiceImpl extends ServiceImpl<JiaoxuebisaichengjiDao, JiaoxuebisaichengjiEntity> implements JiaoxuebisaichengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoxuebisaichengjiEntity> page = this.selectPage(
                new Query<JiaoxuebisaichengjiEntity>(params).getPage(),
                new EntityWrapper<JiaoxuebisaichengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoxuebisaichengjiEntity> wrapper) {
		  Page<JiaoxuebisaichengjiView> page =new Query<JiaoxuebisaichengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoxuebisaichengjiVO> selectListVO(Wrapper<JiaoxuebisaichengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoxuebisaichengjiVO selectVO(Wrapper<JiaoxuebisaichengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoxuebisaichengjiView> selectListView(Wrapper<JiaoxuebisaichengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoxuebisaichengjiView selectView(Wrapper<JiaoxuebisaichengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
