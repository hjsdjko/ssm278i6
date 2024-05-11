package com.entity.view;

import com.entity.JiaoxuebisaichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教学比赛成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
@TableName("jiaoxuebisaichengji")
public class JiaoxuebisaichengjiView  extends JiaoxuebisaichengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoxuebisaichengjiView(){
	}
 
 	public JiaoxuebisaichengjiView(JiaoxuebisaichengjiEntity jiaoxuebisaichengjiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoxuebisaichengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
