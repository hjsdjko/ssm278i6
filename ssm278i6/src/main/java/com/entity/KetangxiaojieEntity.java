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
 * 课堂小结
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
@TableName("ketangxiaojie")
public class KetangxiaojieEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KetangxiaojieEntity() {
		
	}
	
	public KetangxiaojieEntity(T t) {
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
