package com.gtstar.itoken.common.hystrix;

import com.gtstar.itoken.common.constants.HttpStatusConstants;
import com.gtstar.itoken.common.dto.BaseResult;
import com.gtstar.itoken.common.utils.MapperUtils;

import java.util.ArrayList;
import java.util.List;

public class Fallback {
    /**
     * 通用熔断方法
     * @return
     */
    public static String badGateWay(){
        List<BaseResult.Error> errors = new ArrayList<>();
        errors.add(new BaseResult.Error(String.valueOf(HttpStatusConstants.BAD_GATEWAY.getStatus()), HttpStatusConstants.BAD_GATEWAY.getContents()));
        BaseResult baseResult = BaseResult.notOk(errors);
        try {
            return MapperUtils.obj2json(baseResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
