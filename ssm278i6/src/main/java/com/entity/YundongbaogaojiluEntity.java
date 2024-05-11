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
 * 运动报告记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
@TableName("yundongbaogaojilu")
public class YundongbaogaojiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YundongbaogaojiluEntity() {
		
	}
	
	public YundongbaogaojiluEntity(T t) {
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
	 * 报告名称
	 */
					
	private String baogaomingcheng;
	
	/**
	 * 运动地点
	 */
					
	private String yundongdidian;
	
	/**
	 * 运动时长
	 */
					
	private String yundongshizhang;
	
	/**
	 * 运动图片
	 */
					
	private String yundongtupian;
	
	/**
	 * 运动内容
	 */
					
	private String yundongneirong;
	
	/**
	 * 报告内容
	 */
					
	private String baogaoneirong;
	
	/**
	 * 记录日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiluriqi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：报告名称
	 */
	public void setBaogaomingcheng(String baogaomingcheng) {
		this.baogaomingcheng = baogaomingcheng;
	}
	/**
	 * 获取：报告名称
	 */
	public String getBaogaomingcheng() {
		return baogaomingcheng;
	}
	/**
	 * 设置：运动地点
	 */
	public void setYundongdidian(String yundongdidian) {
		this.yundongdidian = yundongdidian;
	}
	/**
	 * 获取：运动地点
	 */
	public String getYundongdidian() {
		return yundongdidian;
	}
	/**
	 * 设置：运动时长
	 */
	public void setYundongshizhang(String yundongshizhang) {
		this.yundongshizhang = yundongshizhang;
	}
	/**
	 * 获取：运动时长
	 */
	public String getYundongshizhang() {
		return yundongshizhang;
	}
	/**
	 * 设置：运动图片
	 */
	public void setYundongtupian(String yundongtupian) {
		this.yundongtupian = yundongtupian;
	}
	/**
	 * 获取：运动图片
	 */
	public String getYundongtupian() {
		return yundongtupian;
	}
	/**
	 * 设置：运动内容
	 */
	public void setYundongneirong(String yundongneirong) {
		this.yundongneirong = yundongneirong;
	}
	/**
	 * 获取：运动内容
	 */
	public String getYundongneirong() {
		return yundongneirong;
	}
	/**
	 * 设置：报告内容
	 */
	public void setBaogaoneirong(String baogaoneirong) {
		this.baogaoneirong = baogaoneirong;
	}
	/**
	 * 获取：报告内容
	 */
	public String getBaogaoneirong() {
		return baogaoneirong;
	}
	/**
	 * 设置：记录日期
	 */
	public void setJiluriqi(Date jiluriqi) {
		this.jiluriqi = jiluriqi;
	}
	/**
	 * 获取：记录日期
	 */
	public Date getJiluriqi() {
		return jiluriqi;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
