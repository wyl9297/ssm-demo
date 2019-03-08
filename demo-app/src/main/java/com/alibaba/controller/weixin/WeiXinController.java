package com.alibaba.controller.weixin;

import com.alibaba.utils.CheckUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2018/9/30.
 */
@Controller
@RequestMapping( value = "/weixin",method = RequestMethod.GET )
public class WeiXinController {

    Logger logger = LoggerFactory.getLogger(WeiXinController.class);

    @RequestMapping(value = "/checkAccess",method = RequestMethod.GET)
    public void checkAccess(HttpServletRequest request, HttpServletResponse response) {

        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");

        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (CheckUtil.checkSignature(signature, timestamp, nonce)) {
            logger.info("微信端口 注册成功 返回微信端的值：{}" , echostr );
            //如果校验成功，将得到的随机字符串原路返回
            out.print(echostr);
        } else {
            logger.info("校验失败");
            out.print("check fail");
        }
        if(out != null){
            out.close();
        }
    }
}
