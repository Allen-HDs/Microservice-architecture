package com.gtstar.itoken.service.admin.controller;


import com.github.pagehelper.PageInfo;
import com.gtstar.itoken.common.dto.BaseResult;
import com.gtstar.itoken.common.domain.TbSysUser;
import com.gtstar.itoken.service.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "v1/admins")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("pageInfo/{pageNum}/{pageSize}")
    public BaseResult pageInfo(@PathVariable(required = true) int pageNum,
                               @PathVariable(required = true) int pageSize,
                               @RequestParam(required = false) TbSysUser tbSysUser){
        PageInfo pageInfo = adminService.page(pageNum, pageSize, tbSysUser);
        List<TbSysUser> list = pageInfo.getList();
        BaseResult.Cursor cursor = new BaseResult.Cursor();
        cursor.setTotal(new Long(pageInfo.getTotal()).intValue());
        cursor.setOffset(pageInfo.getPageNum());
        cursor.setLimit(pageInfo.getSize());
        return BaseResult.ok(list,cursor);
    }
}
