package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 体育教案
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
@TableName("tiyujiaoan")
public class TiyujiaoanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TiyujiaoanEntity() {
		
	}
	
	public TiyujiaoanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 课堂名称
	 */
					
	private String ketangmingcheng;
	
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
	 * 基本说明
	 */
					
	private String jibenshuoming;
	
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
	 * 教学文件
	 */
					
	private String jiaoxuewenjian;
	
	/**
	 * 制定时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date zhidingshijian;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：课堂名称
	 */
	public void setKetangmingcheng(String ketangmingcheng) {
		this.ketangmingcheng = ketangmingcheng;
	}
	/**
	 * 获取：课堂名称
	 */
	public String getKetangmingcheng() {
		return ketangmingcheng;
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
	 * 设置：基本说明
	 */
	public void setJibenshuoming(String jibenshuoming) {
		this.jibenshuoming = jibenshuoming;
	}
	/**
	 * 获取：基本说明
	 */
	public String getJibenshuoming() {
		return jibenshuoming;
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
	 * 设置：教学文件
	 */
	public void setJiaoxuewenjian(String jiaoxuewenjian) {
		this.jiaoxuewenjian = jiaoxuewenjian;
	}
	/**
	 * 获取：教学文件
	 */
	public String getJiaoxuewenjian() {
		return jiaoxuewenjian;
	}
	/**
	 * 设置：制定时间
	 */
	public void setZhidingshijian(Date zhidingshijian) {
		this.zhidingshijian = zhidingshijian;
	}
	/**
	 * 获取：制定时间
	 */
	public Date getZhidingshijian() {
		return zhidingshijian;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}

}
