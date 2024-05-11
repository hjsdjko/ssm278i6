package com.dao;

import com.entity.ShentisuzhicepingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShentisuzhicepingVO;
import com.entity.view.ShentisuzhicepingView;


/**
 * 身体素质测评
 * 
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface ShentisuzhicepingDao extends BaseMapper<ShentisuzhicepingEntity> {
	
	List<ShentisuzhicepingVO> selectListVO(@Param("ew") Wrapper<ShentisuzhicepingEntity> wrapper);
	
	ShentisuzhicepingVO selectVO(@Param("ew") Wrapper<ShentisuzhicepingEntity> wrapper);
	
	List<ShentisuzhicepingView> selectListView(@Param("ew") Wrapper<ShentisuzhicepingEntity> wrapper);

	List<ShentisuzhicepingView> selectListView(Pagination page,@Param("ew") Wrapper<ShentisuzhicepingEntity> wrapper);
	
	ShentisuzhicepingView selectView(@Param("ew") Wrapper<ShentisuzhicepingEntity> wrapper);
	

}
