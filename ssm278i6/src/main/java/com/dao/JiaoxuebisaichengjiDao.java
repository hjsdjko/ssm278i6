package com.dao;

import com.entity.JiaoxuebisaichengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoxuebisaichengjiVO;
import com.entity.view.JiaoxuebisaichengjiView;


/**
 * 教学比赛成绩
 * 
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface JiaoxuebisaichengjiDao extends BaseMapper<JiaoxuebisaichengjiEntity> {
	
	List<JiaoxuebisaichengjiVO> selectListVO(@Param("ew") Wrapper<JiaoxuebisaichengjiEntity> wrapper);
	
	JiaoxuebisaichengjiVO selectVO(@Param("ew") Wrapper<JiaoxuebisaichengjiEntity> wrapper);
	
	List<JiaoxuebisaichengjiView> selectListView(@Param("ew") Wrapper<JiaoxuebisaichengjiEntity> wrapper);

	List<JiaoxuebisaichengjiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoxuebisaichengjiEntity> wrapper);
	
	JiaoxuebisaichengjiView selectView(@Param("ew") Wrapper<JiaoxuebisaichengjiEntity> wrapper);
	

}
