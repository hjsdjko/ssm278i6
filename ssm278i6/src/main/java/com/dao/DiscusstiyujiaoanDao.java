package com.dao;

import com.entity.DiscusstiyujiaoanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstiyujiaoanVO;
import com.entity.view.DiscusstiyujiaoanView;


/**
 * 体育教案评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface DiscusstiyujiaoanDao extends BaseMapper<DiscusstiyujiaoanEntity> {
	
	List<DiscusstiyujiaoanVO> selectListVO(@Param("ew") Wrapper<DiscusstiyujiaoanEntity> wrapper);
	
	DiscusstiyujiaoanVO selectVO(@Param("ew") Wrapper<DiscusstiyujiaoanEntity> wrapper);
	
	List<DiscusstiyujiaoanView> selectListView(@Param("ew") Wrapper<DiscusstiyujiaoanEntity> wrapper);

	List<DiscusstiyujiaoanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstiyujiaoanEntity> wrapper);
	
	DiscusstiyujiaoanView selectView(@Param("ew") Wrapper<DiscusstiyujiaoanEntity> wrapper);
	

}
