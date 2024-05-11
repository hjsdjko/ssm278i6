package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstiyujiaoanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstiyujiaoanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstiyujiaoanView;


/**
 * 体育教案评论表
 *
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface DiscusstiyujiaoanService extends IService<DiscusstiyujiaoanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstiyujiaoanVO> selectListVO(Wrapper<DiscusstiyujiaoanEntity> wrapper);
   	
   	DiscusstiyujiaoanVO selectVO(@Param("ew") Wrapper<DiscusstiyujiaoanEntity> wrapper);
   	
   	List<DiscusstiyujiaoanView> selectListView(Wrapper<DiscusstiyujiaoanEntity> wrapper);
   	
   	DiscusstiyujiaoanView selectView(@Param("ew") Wrapper<DiscusstiyujiaoanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstiyujiaoanEntity> wrapper);
   	

}

