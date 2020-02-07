package com.gtstar.itoken.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Data
@Accessors(chain = true)
public class BaseResult implements Serializable {
    public static final String RESULT_OK = "ok";
    public static final String RESULT_NOT_OK = "not_ok";
    public static final String SUCCESS = "成功操作";

    private String result;
    private Object data;
    private String success;
    private Cursor cursor;
    private List<Error> errors;

    public static BaseResult ok(){
        return createBaseResult(RESULT_OK,null,SUCCESS,null,null);
    }

    public static BaseResult ok(Object data){
        return createBaseResult(RESULT_OK,data,SUCCESS,null,null);
    }

    public static BaseResult ok(Object data,Cursor cursor){
        return createBaseResult(RESULT_OK,data,SUCCESS,cursor,null);
    }

    public static BaseResult notOk(List<BaseResult.Error> errors){
        return createBaseResult(RESULT_NOT_OK,null,"",null,errors);
    }

    private static BaseResult createBaseResult(String result,Object data,String success,Cursor cursor,List<Error> errors){
        BaseResult baseResult = new BaseResult();
        baseResult.setResult(result).setData(data).setSuccess(success).setCursor(cursor).setErrors(errors);
        return baseResult;
    }

    @Data
    public static class Cursor{
        private int total;
        private int offset;
        private int limit;
    }

    @Data
    @AllArgsConstructor
    public static class Error{
        private String field;
        private String message;
    }
}
