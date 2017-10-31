package com.wjz;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by wangjinzhao on 2017/10/31.
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/druid/*",
        initParams = {
                @WebInitParam(name = "loginUsername", value = "wjz"),// 用户名
                @WebInitParam(name = "loginPassword", value = "ct123!@#"),// 密码
        })
public class DruidStatViewServlet extends StatViewServlet {

}
