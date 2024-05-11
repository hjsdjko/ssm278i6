package com.dao;

import com.entity.XueshengxinlvEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengxinlvVO;
import com.entity.view.XueshengxinlvView;


/**
 * 学生心率
 * 
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface XueshengxinlvDao extends BaseMapper<XueshengxinlvEntity> {
	
	List<XueshengxinlvVO> selectListVO(@Param("ew") Wrapper<XueshengxinlvEntity> wrapper);
	
	XueshengxinlvVO selectVO(@Param("ew") Wrapper<XueshengxinlvEntity> wrapper);
	
	List<XueshengxinlvView> selectListView(@Param("ew") Wrapper<XueshengxinlvEntity> wrapper);

	List<XueshengxinlvView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengxinlvEntity> wrapper);
	
	XueshengxinlvView selectView(@Param("ew") Wrapper<XueshengxinlvEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<XueshengxinlvEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueshengxinlvEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueshengxinlvEntity> wrapper);
}
