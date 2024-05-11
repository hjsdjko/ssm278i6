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

import com.entity.DianmingceEntity;
import com.entity.view.DianmingceView;

import com.service.DianmingceService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.InputStream;
import org.springframework.web.multipart.MultipartFile;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 点名册
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
@RestController
@RequestMapping("/dianmingce")
public class DianmingceController {
    @Autowired
    private DianmingceService dianmingceService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DianmingceEntity dianmingce, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			dianmingce.setJiaoshixingming((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			dianmingce.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DianmingceEntity> ew = new EntityWrapper<DianmingceEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);
		PageUtils page = dianmingceService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dianmingce), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DianmingceEntity dianmingce, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			dianmingce.setJiaoshixingming((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			dianmingce.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DianmingceEntity> ew = new EntityWrapper<DianmingceEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);
		PageUtils page = dianmingceService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dianmingce), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DianmingceEntity dianmingce){
       	EntityWrapper<DianmingceEntity> ew = new EntityWrapper<DianmingceEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dianmingce, "dianmingce")); 
        return R.ok().put("data", dianmingceService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DianmingceEntity dianmingce){
        EntityWrapper< DianmingceEntity> ew = new EntityWrapper< DianmingceEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dianmingce, "dianmingce")); 
		DianmingceView dianmingceView =  dianmingceService.selectView(ew);
		return R.ok("查询点名册成功").put("data", dianmingceView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DianmingceEntity dianmingce = dianmingceService.selectById(id);
        return R.ok().put("data", dianmingce);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DianmingceEntity dianmingce = dianmingceService.selectById(id);
        return R.ok().put("data", dianmingce);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DianmingceEntity dianmingce, HttpServletRequest request){
    	dianmingce.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dianmingce);

        dianmingceService.insert(dianmingce);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DianmingceEntity dianmingce, HttpServletRequest request){
    	dianmingce.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dianmingce);
    	dianmingce.setUserid((Long)request.getSession().getAttribute("userId"));

        dianmingceService.insert(dianmingce);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DianmingceEntity dianmingce, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dianmingce);
        dianmingceService.updateById(dianmingce);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dianmingceService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DianmingceEntity> wrapper = new EntityWrapper<DianmingceEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshixingming", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = dianmingceService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	






    @RequestMapping("/importExcel")
    public R importExcel(@RequestParam("file") MultipartFile file){
        try {
            //获取输入流
            InputStream inputStream = file.getInputStream();
            //创建读取工作簿
            Workbook workbook = WorkbookFactory.create(inputStream);
            //获取工作表
            Sheet sheet = workbook.getSheetAt(0);
            //获取总行
            int rows=sheet.getPhysicalNumberOfRows();
            if(rows>1){
                //获取单元格
                for (int i = 1; i < rows; i++) {
                    Row row = sheet.getRow(i);
                    DianmingceEntity dianmingceEntity =new DianmingceEntity();
                    dianmingceEntity.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
                    String jiaoshixingming = CommonUtil.getCellValue(row.getCell(0));
                    dianmingceEntity.setJiaoshixingming(jiaoshixingming);
                    String kaoqinzhuangkuang = CommonUtil.getCellValue(row.getCell(1));
                    dianmingceEntity.setKaoqinzhuangkuang(kaoqinzhuangkuang);
                    String beizhu = CommonUtil.getCellValue(row.getCell(2));
                    dianmingceEntity.setBeizhu(beizhu);
                    String xuehao = CommonUtil.getCellValue(row.getCell(3));
                    dianmingceEntity.setXuehao(xuehao);
                    String xingming = CommonUtil.getCellValue(row.getCell(4));
                    dianmingceEntity.setXingming(xingming);
                     
                    //想数据库中添加新对象
                    dianmingceService.insert(dianmingceEntity);//方法
                }
            }
            inputStream.close();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return R.ok("导入成功");
    }

}
