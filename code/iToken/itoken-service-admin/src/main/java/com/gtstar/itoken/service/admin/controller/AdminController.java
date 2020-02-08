package com.gtstar.itoken.service.admin.controller;


import com.github.pagehelper.PageInfo;
import com.gtstar.itoken.common.dto.BaseResult;
import com.gtstar.itoken.common.domain.TbSysUser;
import com.gtstar.itoken.common.utils.MapperUtils;
import com.gtstar.itoken.service.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "v1/admins")
public class AdminController {
    @Autowired
    private AdminService<TbSysUser> adminService;

    /**
     * 分页查询
     *
     * @param pageNum
     * @param pageSize
     * @param tbSysUser
     * @return
     */
    @GetMapping("pageInfo/{pageNum}/{pageSize}")
    public BaseResult pageInfo(@PathVariable(required = true) int pageNum,
                               @PathVariable(required = true) int pageSize,
                               @RequestParam(required = false) TbSysUser tbSysUser) {
        PageInfo pageInfo = adminService.page(pageNum, pageSize, tbSysUser);
        List<TbSysUser> list = pageInfo.getList();
        BaseResult.Cursor cursor = new BaseResult.Cursor();
        cursor.setTotal(new Long(pageInfo.getTotal()).intValue());
        cursor.setOffset(pageInfo.getPageNum());
        cursor.setLimit(pageInfo.getSize());
        return BaseResult.ok(list, cursor);
    }

    /**
     * 保存管理员
     * @param tbSysUserJson
     * @param optsBy
     * @return
     */
    @PostMapping
    public BaseResult save(@RequestParam(required = true) String tbSysUserJson,
                           @RequestParam(required = true) String optsBy) {
        int result = 0;
        TbSysUser tbSysUser = null;
        try {
            tbSysUser = MapperUtils.json2pojo(tbSysUserJson, TbSysUser.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (null != tbSysUser) {
            //密码加密
            String password = DigestUtils.md5DigestAsHex(tbSysUser.getPassword().getBytes());
            tbSysUser.setPassword(password);

            //新增用户
            if (StringUtils.isEmpty(tbSysUser.getUserCode())) {
                tbSysUser.setUserCode(UUID.randomUUID().toString());
                result = adminService.insert(tbSysUser, optsBy);
            } else {
                //修改用户
                result = adminService.update(tbSysUser, optsBy);
            }

            if (result > 0) {
                return BaseResult.ok("保存管理员成功");
            }
        }
        return BaseResult.ok("保存管理员失败");
    }
}
