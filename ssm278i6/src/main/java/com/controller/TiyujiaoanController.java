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

import com.entity.TiyujiaoanEntity;
import com.entity.view.TiyujiaoanView;

import com.service.TiyujiaoanService;
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
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 体育教案
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-09 16:56:24
 */
@RestController
@RequestMapping("/tiyujiaoan")
public class TiyujiaoanController {
    @Autowired
    private TiyujiaoanService tiyujiaoanService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TiyujiaoanEntity tiyujiaoan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			tiyujiaoan.setJiaoshixingming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TiyujiaoanEntity> ew = new EntityWrapper<TiyujiaoanEntity>();
		PageUtils page = tiyujiaoanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tiyujiaoan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TiyujiaoanEntity tiyujiaoan, 
		HttpServletRequest request){
        EntityWrapper<TiyujiaoanEntity> ew = new EntityWrapper<TiyujiaoanEntity>();
		PageUtils page = tiyujiaoanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tiyujiaoan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TiyujiaoanEntity tiyujiaoan){
       	EntityWrapper<TiyujiaoanEntity> ew = new EntityWrapper<TiyujiaoanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tiyujiaoan, "tiyujiaoan")); 
        return R.ok().put("data", tiyujiaoanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TiyujiaoanEntity tiyujiaoan){
        EntityWrapper< TiyujiaoanEntity> ew = new EntityWrapper< TiyujiaoanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tiyujiaoan, "tiyujiaoan")); 
		TiyujiaoanView tiyujiaoanView =  tiyujiaoanService.selectView(ew);
		return R.ok("查询体育教案成功").put("data", tiyujiaoanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TiyujiaoanEntity tiyujiaoan = tiyujiaoanService.selectById(id);
		tiyujiaoan.setClicktime(new Date());
		tiyujiaoanService.updateById(tiyujiaoan);
        return R.ok().put("data", tiyujiaoan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TiyujiaoanEntity tiyujiaoan = tiyujiaoanService.selectById(id);
		tiyujiaoan.setClicktime(new Date());
		tiyujiaoanService.updateById(tiyujiaoan);
        return R.ok().put("data", tiyujiaoan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TiyujiaoanEntity tiyujiaoan, HttpServletRequest request){
    	tiyujiaoan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tiyujiaoan);

        tiyujiaoanService.insert(tiyujiaoan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TiyujiaoanEntity tiyujiaoan, HttpServletRequest request){
    	tiyujiaoan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tiyujiaoan);

        tiyujiaoanService.insert(tiyujiaoan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TiyujiaoanEntity tiyujiaoan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tiyujiaoan);
        tiyujiaoanService.updateById(tiyujiaoan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tiyujiaoanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<TiyujiaoanEntity> wrapper = new EntityWrapper<TiyujiaoanEntity>();
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

		int count = tiyujiaoanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,TiyujiaoanEntity tiyujiaoan, HttpServletRequest request,String pre){
        EntityWrapper<TiyujiaoanEntity> ew = new EntityWrapper<TiyujiaoanEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        
        params.put("order", "desc");
		PageUtils page = tiyujiaoanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tiyujiaoan), params), params));
        return R.ok().put("data", page);
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
                    TiyujiaoanEntity tiyujiaoanEntity =new TiyujiaoanEntity();
                    tiyujiaoanEntity.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
                    String ketangmingcheng = CommonUtil.getCellValue(row.getCell(0));
                    tiyujiaoanEntity.setKetangmingcheng(ketangmingcheng);
                    String jiaoshixingming = CommonUtil.getCellValue(row.getCell(1));
                    tiyujiaoanEntity.setJiaoshixingming(jiaoshixingming);
                    String jiaochengfenxi = CommonUtil.getCellValue(row.getCell(2));
                    tiyujiaoanEntity.setJiaochengfenxi(jiaochengfenxi);
                    String shejilinian = CommonUtil.getCellValue(row.getCell(3));
                    tiyujiaoanEntity.setShejilinian(shejilinian);
                    String jiaoxuemubiao = CommonUtil.getCellValue(row.getCell(4));
                    tiyujiaoanEntity.setJiaoxuemubiao(jiaoxuemubiao);
                    String jiaoxuezhunbei = CommonUtil.getCellValue(row.getCell(5));
                    tiyujiaoanEntity.setJiaoxuezhunbei(jiaoxuezhunbei);
                    String jiaoxuezhongdian = CommonUtil.getCellValue(row.getCell(6));
                    tiyujiaoanEntity.setJiaoxuezhongdian(jiaoxuezhongdian);
                     
                    //想数据库中添加新对象
                    tiyujiaoanService.insert(tiyujiaoanEntity);//方法
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
