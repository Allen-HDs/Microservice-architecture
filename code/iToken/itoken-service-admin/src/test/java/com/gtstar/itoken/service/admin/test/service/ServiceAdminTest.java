package com.gtstar.itoken.service.admin.test.service;

import com.gtstar.itoken.service.admin.ServiceAdminApplication;
import com.gtstar.itoken.common.domain.TbSysUser;
import com.gtstar.itoken.service.admin.service.AdminService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceAdminApplication.class)
@ActiveProfiles(value = "prod")
public class ServiceAdminTest {
}
