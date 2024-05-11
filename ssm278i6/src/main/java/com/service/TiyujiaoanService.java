package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiyujiaoanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiyujiaoanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiyujiaoanView;


/**
 * 体育教案
 *
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface TiyujiaoanService extends IService<TiyujiaoanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiyujiaoanVO> selectListVO(Wrapper<TiyujiaoanEntity> wrapper);
   	
   	TiyujiaoanVO selectVO(@Param("ew") Wrapper<TiyujiaoanEntity> wrapper);
   	
   	List<TiyujiaoanView> selectListView(Wrapper<TiyujiaoanEntity> wrapper);
   	
   	TiyujiaoanView selectView(@Param("ew") Wrapper<TiyujiaoanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiyujiaoanEntity> wrapper);
   	

}

