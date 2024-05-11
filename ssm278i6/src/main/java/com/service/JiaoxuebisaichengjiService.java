package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoxuebisaichengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoxuebisaichengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxuebisaichengjiView;


/**
 * 教学比赛成绩
 *
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface JiaoxuebisaichengjiService extends IService<JiaoxuebisaichengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoxuebisaichengjiVO> selectListVO(Wrapper<JiaoxuebisaichengjiEntity> wrapper);
   	
   	JiaoxuebisaichengjiVO selectVO(@Param("ew") Wrapper<JiaoxuebisaichengjiEntity> wrapper);
   	
   	List<JiaoxuebisaichengjiView> selectListView(Wrapper<JiaoxuebisaichengjiEntity> wrapper);
   	
   	JiaoxuebisaichengjiView selectView(@Param("ew") Wrapper<JiaoxuebisaichengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoxuebisaichengjiEntity> wrapper);
   	

}

