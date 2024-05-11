package com.entity.vo;

import com.entity.ShentisuzhicepingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 身体素质测评
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
public class ShentisuzhicepingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 身高
	 */
	
	private Float shengao;
		
	/**
	 * 体重
	 */
	
	private Float tizhong;
		
	/**
	 * 血糖
	 */
	
	private Float xuetang;
		
	/**
	 * 心率
	 */
	
	private Float xinlv;
		
	/**
	 * 胸围
	 */
	
	private Float xiongwei;
		
	/**
	 * 血脂
	 */
	
	private Float xuezhi;
		
	/**
	 * 肺活量
	 */
	
	private Float feihuoliang;
		
	/**
	 * 握力
	 */
	
	private String woli;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
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
	 * 设置：身高
	 */
	 
	public void setShengao(Float shengao) {
		this.shengao = shengao;
	}
	
	/**
	 * 获取：身高
	 */
	public Float getShengao() {
		return shengao;
	}
				
	
	/**
	 * 设置：体重
	 */
	 
	public void setTizhong(Float tizhong) {
		this.tizhong = tizhong;
	}
	
	/**
	 * 获取：体重
	 */
	public Float getTizhong() {
		return tizhong;
	}
				
	
	/**
	 * 设置：血糖
	 */
	 
	public void setXuetang(Float xuetang) {
		this.xuetang = xuetang;
	}
	
	/**
	 * 获取：血糖
	 */
	public Float getXuetang() {
		return xuetang;
	}
				
	
	/**
	 * 设置：心率
	 */
	 
	public void setXinlv(Float xinlv) {
		this.xinlv = xinlv;
	}
	
	/**
	 * 获取：心率
	 */
	public Float getXinlv() {
		return xinlv;
	}
				
	
	/**
	 * 设置：胸围
	 */
	 
	public void setXiongwei(Float xiongwei) {
		this.xiongwei = xiongwei;
	}
	
	/**
	 * 获取：胸围
	 */
	public Float getXiongwei() {
		return xiongwei;
	}
				
	
	/**
	 * 设置：血脂
	 */
	 
	public void setXuezhi(Float xuezhi) {
		this.xuezhi = xuezhi;
	}
	
	/**
	 * 获取：血脂
	 */
	public Float getXuezhi() {
		return xuezhi;
	}
				
	
	/**
	 * 设置：肺活量
	 */
	 
	public void setFeihuoliang(Float feihuoliang) {
		this.feihuoliang = feihuoliang;
	}
	
	/**
	 * 获取：肺活量
	 */
	public Float getFeihuoliang() {
		return feihuoliang;
	}
				
	
	/**
	 * 设置：握力
	 */
	 
	public void setWoli(String woli) {
		this.woli = woli;
	}
	
	/**
	 * 获取：握力
	 */
	public String getWoli() {
		return woli;
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
