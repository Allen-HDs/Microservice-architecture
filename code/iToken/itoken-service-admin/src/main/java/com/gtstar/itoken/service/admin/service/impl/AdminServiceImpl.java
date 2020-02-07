package com.gtstar.itoken.service.admin.service.impl;

import com.gtstar.itoken.common.domain.BaseDomain;
import com.gtstar.itoken.common.domain.TbSysUser;
import com.gtstar.itoken.common.mapper.TbSysUserMapper;
import com.gtstar.itoken.common.service.impl.BaseServiceImpl;
import com.gtstar.itoken.service.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

@Transactional(readOnly = true)
@Service
public class AdminServiceImpl extends BaseServiceImpl<TbSysUser,TbSysUserMapper> implements AdminService<TbSysUser> {

    @Autowired
    private TbSysUserMapper tbSysUserMapper;
}
