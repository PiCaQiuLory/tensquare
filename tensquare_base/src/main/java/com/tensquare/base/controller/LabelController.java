package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lory.li
 * @description 标签操作控制层
 * @date 2019-07-16
 */
@RestController
@CrossOrigin//跨域处理
@RequestMapping("/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    /**
     * 获取所有label
     * @return label列表
     */
    @GetMapping
    public Result getAll(){
        return new Result(true, StatusCode.OK, "查询成功", labelService.getAll());
    }

    @GetMapping("/{labelId}")
    public Result getLabelById(@PathVariable(name = "labelId") String labelId){
        return new Result(true, StatusCode.OK, "查询成功", labelService.findById(labelId));
    }

    @PostMapping
    public Result save(@RequestBody Label label){
        labelService.save(label);
        return new Result(true, StatusCode.OK, "添加成功");
    }

    @PutMapping("/{labelId}")
    public Result update(@PathVariable(name = "labelId") String labelId, @RequestBody Label label){
        label.setId(labelId);
        labelService.update(label);
        return new Result(true, StatusCode.OK, "更新成功");
    }

    @DeleteMapping("/{labelId}")
    public Result deleteById(@PathVariable(name = "labelId") String labelId){
        labelService.deleteById(labelId);
        return new Result(true, StatusCode.OK, "删除成功");
    }
}
