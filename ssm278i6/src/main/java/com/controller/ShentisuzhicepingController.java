package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShentisuzhicepingEntity;
import com.entity.view.ShentisuzhicepingView;

import com.service.ShentisuzhicepingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 身体素质测评
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
@RestController
@RequestMapping("/shentisuzhiceping")
public class ShentisuzhicepingController {
    @Autowired
    private ShentisuzhicepingService shentisuzhicepingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShentisuzhicepingEntity shentisuzhiceping, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dengjishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dengjishijianend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			shentisuzhiceping.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			shentisuzhiceping.setJiaoshixingming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShentisuzhicepingEntity> ew = new EntityWrapper<ShentisuzhicepingEntity>();
                if(dengjishijianstart!=null) ew.ge("dengjishijian", dengjishijianstart);
                if(dengjishijianend!=null) ew.le("dengjishijian", dengjishijianend);
		PageUtils page = shentisuzhicepingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shentisuzhiceping), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShentisuzhicepingEntity shentisuzhiceping, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dengjishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dengjishijianend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			shentisuzhiceping.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			shentisuzhiceping.setJiaoshixingming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShentisuzhicepingEntity> ew = new EntityWrapper<ShentisuzhicepingEntity>();
                if(dengjishijianstart!=null) ew.ge("dengjishijian", dengjishijianstart);
                if(dengjishijianend!=null) ew.le("dengjishijian", dengjishijianend);
		PageUtils page = shentisuzhicepingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shentisuzhiceping), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShentisuzhicepingEntity shentisuzhiceping){
       	EntityWrapper<ShentisuzhicepingEntity> ew = new EntityWrapper<ShentisuzhicepingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shentisuzhiceping, "shentisuzhiceping")); 
        return R.ok().put("data", shentisuzhicepingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShentisuzhicepingEntity shentisuzhiceping){
        EntityWrapper< ShentisuzhicepingEntity> ew = new EntityWrapper< ShentisuzhicepingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shentisuzhiceping, "shentisuzhiceping")); 
		ShentisuzhicepingView shentisuzhicepingView =  shentisuzhicepingService.selectView(ew);
		return R.ok("查询身体素质测评成功").put("data", shentisuzhicepingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShentisuzhicepingEntity shentisuzhiceping = shentisuzhicepingService.selectById(id);
        return R.ok().put("data", shentisuzhiceping);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShentisuzhicepingEntity shentisuzhiceping = shentisuzhicepingService.selectById(id);
        return R.ok().put("data", shentisuzhiceping);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShentisuzhicepingEntity shentisuzhiceping, HttpServletRequest request){
    	shentisuzhiceping.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shentisuzhiceping);

        shentisuzhicepingService.insert(shentisuzhiceping);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShentisuzhicepingEntity shentisuzhiceping, HttpServletRequest request){
    	shentisuzhiceping.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shentisuzhiceping);
    	shentisuzhiceping.setUserid((Long)request.getSession().getAttribute("userId"));

        shentisuzhicepingService.insert(shentisuzhiceping);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShentisuzhicepingEntity shentisuzhiceping, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shentisuzhiceping);
        shentisuzhicepingService.updateById(shentisuzhiceping);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shentisuzhicepingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShentisuzhicepingEntity> wrapper = new EntityWrapper<ShentisuzhicepingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshixingming", (String)request.getSession().getAttribute("username"));
		}

		int count = shentisuzhicepingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
