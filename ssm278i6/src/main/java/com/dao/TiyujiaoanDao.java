package com.dao;

import com.entity.TiyujiaoanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiyujiaoanVO;
import com.entity.view.TiyujiaoanView;


/**
 * 体育教案
 * 
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface TiyujiaoanDao extends BaseMapper<TiyujiaoanEntity> {
	
	List<TiyujiaoanVO> selectListVO(@Param("ew") Wrapper<TiyujiaoanEntity> wrapper);
	
	TiyujiaoanVO selectVO(@Param("ew") Wrapper<TiyujiaoanEntity> wrapper);
	
	List<TiyujiaoanView> selectListView(@Param("ew") Wrapper<TiyujiaoanEntity> wrapper);

	List<TiyujiaoanView> selectListView(Pagination page,@Param("ew") Wrapper<TiyujiaoanEntity> wrapper);
	
	TiyujiaoanView selectView(@Param("ew") Wrapper<TiyujiaoanEntity> wrapper);
	

}
