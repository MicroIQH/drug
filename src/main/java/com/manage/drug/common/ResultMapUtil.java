package com.manage.drug.common;

/**
 * @author 杉子
 * @date 2021/4/3 22:27
 */



import com.alibaba.druid.util.StringUtils;

import java.util.HashMap;

/**
 * 返回json格式
 * @author 何杉
 */
public class ResultMapUtil {
    /**
     * 登陆返回结果
     * @param msg 返回消息
     * @param code 代码编号
     * @return
     */
    public static HashMap<String,Object> getHashMapLogin(String msg,String code){
        HashMap<String,Object> resultMap = new HashMap<>();
        resultMap.put("msg",msg);
        resultMap.put("code",code);
        if (StringUtils.equals("1",code)){
            resultMap.put("icon",1);
        }else {
            resultMap.put("icon",3);
        }
        resultMap.put("anim",4);
        return resultMap;
    }
}
