package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianmingceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianmingceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianmingceView;


/**
 * 点名册
 *
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface DianmingceService extends IService<DianmingceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianmingceVO> selectListVO(Wrapper<DianmingceEntity> wrapper);
   	
   	DianmingceVO selectVO(@Param("ew") Wrapper<DianmingceEntity> wrapper);
   	
   	List<DianmingceView> selectListView(Wrapper<DianmingceEntity> wrapper);
   	
   	DianmingceView selectView(@Param("ew") Wrapper<DianmingceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianmingceEntity> wrapper);
   	

}

