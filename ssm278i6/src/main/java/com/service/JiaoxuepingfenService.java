package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoxuepingfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoxuepingfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxuepingfenView;


/**
 * 教学评分
 *
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface JiaoxuepingfenService extends IService<JiaoxuepingfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoxuepingfenVO> selectListVO(Wrapper<JiaoxuepingfenEntity> wrapper);
   	
   	JiaoxuepingfenVO selectVO(@Param("ew") Wrapper<JiaoxuepingfenEntity> wrapper);
   	
   	List<JiaoxuepingfenView> selectListView(Wrapper<JiaoxuepingfenEntity> wrapper);
   	
   	JiaoxuepingfenView selectView(@Param("ew") Wrapper<JiaoxuepingfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoxuepingfenEntity> wrapper);
   	

}

