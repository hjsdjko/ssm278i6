package com.entity.view;

import com.entity.ShentisuzhicepingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 身体素质测评
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
@TableName("shentisuzhiceping")
public class ShentisuzhicepingView  extends ShentisuzhicepingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShentisuzhicepingView(){
	}
 
 	public ShentisuzhicepingView(ShentisuzhicepingEntity shentisuzhicepingEntity){
 	try {
			BeanUtils.copyProperties(this, shentisuzhicepingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
