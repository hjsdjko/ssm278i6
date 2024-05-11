package com.entity.view;

import com.entity.TiyujiaoanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体育教案
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
@TableName("tiyujiaoan")
public class TiyujiaoanView  extends TiyujiaoanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TiyujiaoanView(){
	}
 
 	public TiyujiaoanView(TiyujiaoanEntity tiyujiaoanEntity){
 	try {
			BeanUtils.copyProperties(this, tiyujiaoanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
