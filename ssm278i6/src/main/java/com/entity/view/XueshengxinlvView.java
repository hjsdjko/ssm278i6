package com.entity.view;

import com.entity.XueshengxinlvEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生心率
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
@TableName("xueshengxinlv")
public class XueshengxinlvView  extends XueshengxinlvEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengxinlvView(){
	}
 
 	public XueshengxinlvView(XueshengxinlvEntity xueshengxinlvEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengxinlvEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
