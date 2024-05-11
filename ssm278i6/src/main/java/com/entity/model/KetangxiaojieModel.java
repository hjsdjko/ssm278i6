package com.entity.model;

import com.entity.KetangxiaojieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 课堂小结
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public class KetangxiaojieModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课堂内容
	 */
	
	private String ketangneirong;
		
	/**
	 * 小结内容
	 */
	
	private String xiaojieneirong;
		
	/**
	 * 意见
	 */
	
	private String yijian;
		
	/**
	 * 课堂时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ketangshijian;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
	/**
	 * 设置：课堂内容
	 */
	 
	public void setKetangneirong(String ketangneirong) {
		this.ketangneirong = ketangneirong;
	}
	
	/**
	 * 获取：课堂内容
	 */
	public String getKetangneirong() {
		return ketangneirong;
	}
				
	
	/**
	 * 设置：小结内容
	 */
	 
	public void setXiaojieneirong(String xiaojieneirong) {
		this.xiaojieneirong = xiaojieneirong;
	}
	
	/**
	 * 获取：小结内容
	 */
	public String getXiaojieneirong() {
		return xiaojieneirong;
	}
				
	
	/**
	 * 设置：意见
	 */
	 
	public void setYijian(String yijian) {
		this.yijian = yijian;
	}
	
	/**
	 * 获取：意见
	 */
	public String getYijian() {
		return yijian;
	}
				
	
	/**
	 * 设置：课堂时间
	 */
	 
	public void setKetangshijian(Date ketangshijian) {
		this.ketangshijian = ketangshijian;
	}
	
	/**
	 * 获取：课堂时间
	 */
	public Date getKetangshijian() {
		return ketangshijian;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}
