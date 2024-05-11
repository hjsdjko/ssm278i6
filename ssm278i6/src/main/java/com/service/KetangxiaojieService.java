package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KetangxiaojieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KetangxiaojieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KetangxiaojieView;


/**
 * 课堂小结
 *
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public interface KetangxiaojieService extends IService<KetangxiaojieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KetangxiaojieVO> selectListVO(Wrapper<KetangxiaojieEntity> wrapper);
   	
   	KetangxiaojieVO selectVO(@Param("ew") Wrapper<KetangxiaojieEntity> wrapper);
   	
   	List<KetangxiaojieView> selectListView(Wrapper<KetangxiaojieEntity> wrapper);
   	
   	KetangxiaojieView selectView(@Param("ew") Wrapper<KetangxiaojieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KetangxiaojieEntity> wrapper);
   	

}

