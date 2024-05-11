package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShentisuzhicepingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShentisuzhicepingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShentisuzhicepingView;


/**
 * 身体素质测评
 *
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface ShentisuzhicepingService extends IService<ShentisuzhicepingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShentisuzhicepingVO> selectListVO(Wrapper<ShentisuzhicepingEntity> wrapper);
   	
   	ShentisuzhicepingVO selectVO(@Param("ew") Wrapper<ShentisuzhicepingEntity> wrapper);
   	
   	List<ShentisuzhicepingView> selectListView(Wrapper<ShentisuzhicepingEntity> wrapper);
   	
   	ShentisuzhicepingView selectView(@Param("ew") Wrapper<ShentisuzhicepingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShentisuzhicepingEntity> wrapper);
   	

}

