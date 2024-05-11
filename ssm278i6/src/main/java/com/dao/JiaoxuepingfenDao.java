package com.dao;

import com.entity.JiaoxuepingfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoxuepingfenVO;
import com.entity.view.JiaoxuepingfenView;


/**
 * 教学评分
 * 
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface JiaoxuepingfenDao extends BaseMapper<JiaoxuepingfenEntity> {
	
	List<JiaoxuepingfenVO> selectListVO(@Param("ew") Wrapper<JiaoxuepingfenEntity> wrapper);
	
	JiaoxuepingfenVO selectVO(@Param("ew") Wrapper<JiaoxuepingfenEntity> wrapper);
	
	List<JiaoxuepingfenView> selectListView(@Param("ew") Wrapper<JiaoxuepingfenEntity> wrapper);

	List<JiaoxuepingfenView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoxuepingfenEntity> wrapper);
	
	JiaoxuepingfenView selectView(@Param("ew") Wrapper<JiaoxuepingfenEntity> wrapper);
	

}
