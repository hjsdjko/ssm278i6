package com.dao;

import com.entity.KetangxiaojieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KetangxiaojieVO;
import com.entity.view.KetangxiaojieView;


/**
 * 课堂小结
 * 
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface KetangxiaojieDao extends BaseMapper<KetangxiaojieEntity> {
	
	List<KetangxiaojieVO> selectListVO(@Param("ew") Wrapper<KetangxiaojieEntity> wrapper);
	
	KetangxiaojieVO selectVO(@Param("ew") Wrapper<KetangxiaojieEntity> wrapper);
	
	List<KetangxiaojieView> selectListView(@Param("ew") Wrapper<KetangxiaojieEntity> wrapper);

	List<KetangxiaojieView> selectListView(Pagination page,@Param("ew") Wrapper<KetangxiaojieEntity> wrapper);
	
	KetangxiaojieView selectView(@Param("ew") Wrapper<KetangxiaojieEntity> wrapper);
	

}
