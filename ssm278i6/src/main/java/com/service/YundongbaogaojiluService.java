package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YundongbaogaojiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YundongbaogaojiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YundongbaogaojiluView;


/**
 * 运动报告记录
 *
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface YundongbaogaojiluService extends IService<YundongbaogaojiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YundongbaogaojiluVO> selectListVO(Wrapper<YundongbaogaojiluEntity> wrapper);
   	
   	YundongbaogaojiluVO selectVO(@Param("ew") Wrapper<YundongbaogaojiluEntity> wrapper);
   	
   	List<YundongbaogaojiluView> selectListView(Wrapper<YundongbaogaojiluEntity> wrapper);
   	
   	YundongbaogaojiluView selectView(@Param("ew") Wrapper<YundongbaogaojiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YundongbaogaojiluEntity> wrapper);
   	

}

