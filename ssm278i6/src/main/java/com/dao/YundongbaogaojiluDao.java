package com.dao;

import com.entity.YundongbaogaojiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YundongbaogaojiluVO;
import com.entity.view.YundongbaogaojiluView;


/**
 * 运动报告记录
 * 
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface YundongbaogaojiluDao extends BaseMapper<YundongbaogaojiluEntity> {
	
	List<YundongbaogaojiluVO> selectListVO(@Param("ew") Wrapper<YundongbaogaojiluEntity> wrapper);
	
	YundongbaogaojiluVO selectVO(@Param("ew") Wrapper<YundongbaogaojiluEntity> wrapper);
	
	List<YundongbaogaojiluView> selectListView(@Param("ew") Wrapper<YundongbaogaojiluEntity> wrapper);

	List<YundongbaogaojiluView> selectListView(Pagination page,@Param("ew") Wrapper<YundongbaogaojiluEntity> wrapper);
	
	YundongbaogaojiluView selectView(@Param("ew") Wrapper<YundongbaogaojiluEntity> wrapper);
	

}
