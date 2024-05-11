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

import com.entity.YundongbaogaojiluEntity;
import com.entity.view.YundongbaogaojiluView;

import com.service.YundongbaogaojiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 运动报告记录
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
@RestController
@RequestMapping("/yundongbaogaojilu")
public class YundongbaogaojiluController {
    @Autowired
    private YundongbaogaojiluService yundongbaogaojiluService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YundongbaogaojiluEntity yundongbaogaojilu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			yundongbaogaojilu.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			yundongbaogaojilu.setJiaoshixingming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YundongbaogaojiluEntity> ew = new EntityWrapper<YundongbaogaojiluEntity>();
		PageUtils page = yundongbaogaojiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yundongbaogaojilu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YundongbaogaojiluEntity yundongbaogaojilu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			yundongbaogaojilu.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			yundongbaogaojilu.setJiaoshixingming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YundongbaogaojiluEntity> ew = new EntityWrapper<YundongbaogaojiluEntity>();
		PageUtils page = yundongbaogaojiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yundongbaogaojilu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YundongbaogaojiluEntity yundongbaogaojilu){
       	EntityWrapper<YundongbaogaojiluEntity> ew = new EntityWrapper<YundongbaogaojiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yundongbaogaojilu, "yundongbaogaojilu")); 
        return R.ok().put("data", yundongbaogaojiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YundongbaogaojiluEntity yundongbaogaojilu){
        EntityWrapper< YundongbaogaojiluEntity> ew = new EntityWrapper< YundongbaogaojiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yundongbaogaojilu, "yundongbaogaojilu")); 
		YundongbaogaojiluView yundongbaogaojiluView =  yundongbaogaojiluService.selectView(ew);
		return R.ok("查询运动报告记录成功").put("data", yundongbaogaojiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YundongbaogaojiluEntity yundongbaogaojilu = yundongbaogaojiluService.selectById(id);
        return R.ok().put("data", yundongbaogaojilu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YundongbaogaojiluEntity yundongbaogaojilu = yundongbaogaojiluService.selectById(id);
        return R.ok().put("data", yundongbaogaojilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YundongbaogaojiluEntity yundongbaogaojilu, HttpServletRequest request){
    	yundongbaogaojilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yundongbaogaojilu);

        yundongbaogaojiluService.insert(yundongbaogaojilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YundongbaogaojiluEntity yundongbaogaojilu, HttpServletRequest request){
    	yundongbaogaojilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yundongbaogaojilu);
    	yundongbaogaojilu.setUserid((Long)request.getSession().getAttribute("userId"));

        yundongbaogaojiluService.insert(yundongbaogaojilu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YundongbaogaojiluEntity yundongbaogaojilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yundongbaogaojilu);
        yundongbaogaojiluService.updateById(yundongbaogaojilu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yundongbaogaojiluService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YundongbaogaojiluEntity> wrapper = new EntityWrapper<YundongbaogaojiluEntity>();
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

		int count = yundongbaogaojiluService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
