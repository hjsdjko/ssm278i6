package com.dao;

import com.entity.DianmingceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianmingceVO;
import com.entity.view.DianmingceView;


/**
 * 点名册
 * 
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface DianmingceDao extends BaseMapper<DianmingceEntity> {
	
	List<DianmingceVO> selectListVO(@Param("ew") Wrapper<DianmingceEntity> wrapper);
	
	DianmingceVO selectVO(@Param("ew") Wrapper<DianmingceEntity> wrapper);
	
	List<DianmingceView> selectListView(@Param("ew") Wrapper<DianmingceEntity> wrapper);

	List<DianmingceView> selectListView(Pagination page,@Param("ew") Wrapper<DianmingceEntity> wrapper);
	
	DianmingceView selectView(@Param("ew") Wrapper<DianmingceEntity> wrapper);
	

}
