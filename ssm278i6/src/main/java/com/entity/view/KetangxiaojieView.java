package com.entity.view;

import com.entity.KetangxiaojieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课堂小结
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
@TableName("ketangxiaojie")
public class KetangxiaojieView  extends KetangxiaojieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KetangxiaojieView(){
	}
 
 	public KetangxiaojieView(KetangxiaojieEntity ketangxiaojieEntity){
 	try {
			BeanUtils.copyProperties(this, ketangxiaojieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
