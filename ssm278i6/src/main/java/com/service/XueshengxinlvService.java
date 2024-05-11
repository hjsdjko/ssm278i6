package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengxinlvEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengxinlvVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengxinlvView;


/**
 * 学生心率
 *
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface XueshengxinlvService extends IService<XueshengxinlvEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengxinlvVO> selectListVO(Wrapper<XueshengxinlvEntity> wrapper);
   	
   	XueshengxinlvVO selectVO(@Param("ew") Wrapper<XueshengxinlvEntity> wrapper);
   	
   	List<XueshengxinlvView> selectListView(Wrapper<XueshengxinlvEntity> wrapper);
   	
   	XueshengxinlvView selectView(@Param("ew") Wrapper<XueshengxinlvEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengxinlvEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XueshengxinlvEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XueshengxinlvEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XueshengxinlvEntity> wrapper);
}

