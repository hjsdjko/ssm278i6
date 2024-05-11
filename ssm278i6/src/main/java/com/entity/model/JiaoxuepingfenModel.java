package com.entity.model;

import com.entity.JiaoxuepingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 教学评分
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public class JiaoxuepingfenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 图片封面
	 */
	
	private String tupianfengmian;
		
	/**
	 * 教程分析
	 */
	
	private String jiaochengfenxi;
		
	/**
	 * 设计理念
	 */
	
	private String shejilinian;
		
	/**
	 * 教学目标
	 */
	
	private String jiaoxuemubiao;
		
	/**
	 * 教学准备
	 */
	
	private String jiaoxuezhunbei;
		
	/**
	 * 教学重点
	 */
	
	private String jiaoxuezhongdian;
		
	/**
	 * 教学评分
	 */
	
	private Float jiaoxuepingfen;
		
	/**
	 * 意见建议
	 */
	
	private String yijianjianyi;
		
	/**
	 * 评分时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingfenshijian;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
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
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：图片封面
	 */
	 
	public void setTupianfengmian(String tupianfengmian) {
		this.tupianfengmian = tupianfengmian;
	}
	
	/**
	 * 获取：图片封面
	 */
	public String getTupianfengmian() {
		return tupianfengmian;
	}
				
	
	/**
	 * 设置：教程分析
	 */
	 
	public void setJiaochengfenxi(String jiaochengfenxi) {
		this.jiaochengfenxi = jiaochengfenxi;
	}
	
	/**
	 * 获取：教程分析
	 */
	public String getJiaochengfenxi() {
		return jiaochengfenxi;
	}
				
	
	/**
	 * 设置：设计理念
	 */
	 
	public void setShejilinian(String shejilinian) {
		this.shejilinian = shejilinian;
	}
	
	/**
	 * 获取：设计理念
	 */
	public String getShejilinian() {
		return shejilinian;
	}
				
	
	/**
	 * 设置：教学目标
	 */
	 
	public void setJiaoxuemubiao(String jiaoxuemubiao) {
		this.jiaoxuemubiao = jiaoxuemubiao;
	}
	
	/**
	 * 获取：教学目标
	 */
	public String getJiaoxuemubiao() {
		return jiaoxuemubiao;
	}
				
	
	/**
	 * 设置：教学准备
	 */
	 
	public void setJiaoxuezhunbei(String jiaoxuezhunbei) {
		this.jiaoxuezhunbei = jiaoxuezhunbei;
	}
	
	/**
	 * 获取：教学准备
	 */
	public String getJiaoxuezhunbei() {
		return jiaoxuezhunbei;
	}
				
	
	/**
	 * 设置：教学重点
	 */
	 
	public void setJiaoxuezhongdian(String jiaoxuezhongdian) {
		this.jiaoxuezhongdian = jiaoxuezhongdian;
	}
	
	/**
	 * 获取：教学重点
	 */
	public String getJiaoxuezhongdian() {
		return jiaoxuezhongdian;
	}
				
	
	/**
	 * 设置：教学评分
	 */
	 
	public void setJiaoxuepingfen(Float jiaoxuepingfen) {
		this.jiaoxuepingfen = jiaoxuepingfen;
	}
	
	/**
	 * 获取：教学评分
	 */
	public Float getJiaoxuepingfen() {
		return jiaoxuepingfen;
	}
				
	
	/**
	 * 设置：意见建议
	 */
	 
	public void setYijianjianyi(String yijianjianyi) {
		this.yijianjianyi = yijianjianyi;
	}
	
	/**
	 * 获取：意见建议
	 */
	public String getYijianjianyi() {
		return yijianjianyi;
	}
				
	
	/**
	 * 设置：评分时间
	 */
	 
	public void setPingfenshijian(Date pingfenshijian) {
		this.pingfenshijian = pingfenshijian;
	}
	
	/**
	 * 获取：评分时间
	 */
	public Date getPingfenshijian() {
		return pingfenshijian;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
