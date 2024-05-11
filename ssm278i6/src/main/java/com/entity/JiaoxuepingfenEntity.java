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
 * 教学评分
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
@TableName("jiaoxuepingfen")
public class JiaoxuepingfenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoxuepingfenEntity() {
		
	}
	
	public JiaoxuepingfenEntity(T t) {
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
