package com.entity.view;

import com.entity.DianmingceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 点名册
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
@TableName("dianmingce")
public class DianmingceView  extends DianmingceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianmingceView(){
	}
 
 	public DianmingceView(DianmingceEntity dianmingceEntity){
 	try {
			BeanUtils.copyProperties(this, dianmingceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
