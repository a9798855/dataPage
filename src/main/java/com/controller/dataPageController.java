package com.controller;


import com.Dao.CustomerMapper;
import com.Dao.UserMapper;
import com.utils.ResponseUtils;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.util.List;
import java.util.Map;

@Controller
public class dataPageController {

    @Autowired
    private UserMapper userService;

    @Autowired
    private CustomerMapper customerService;

    @RequestMapping("/customer/dataPage")
    public void login(HttpServletRequest request, HttpServletResponse response) throws Exception{

        try {

            // 读取请求内容
            BufferedReader br = 	request.getReader();
            String line = null;
            StringBuilder sb = new StringBuilder();
            while((line = br.readLine())!=null){
                sb.append(line);
            }
            String reqBody = sb.toString();


            //1122334455


            JSONObject resultJSON= JSONObject.fromObject(reqBody);
            int start = resultJSON.getInt("start");
            int count = resultJSON.getInt("count");
            List<Map> data = customerService.getCustomerPage(start,count);

            JSONArray array =  JSONArray.fromObject(data);

            JSONObject returnJson=new JSONObject();
            returnJson.put("result", "success");
            returnJson.put("status","1");
            returnJson.put("code","02");
            returnJson.put("start",start);
            returnJson.put("end",start+array.size());
            returnJson.put("qty",array.size());
            returnJson.put("data",array);
            ResponseUtils.renderJson(response,returnJson.toString() );

        }
        catch (Exception ex) {
            // User-defined @InitBinder method threw an exception...

            JSONObject returnJson=new JSONObject();
            returnJson.put("result", "false");
            returnJson.put("status","-1");
            returnJson.put("err",ex.getMessage());
            ResponseUtils.renderJson(response,returnJson.toString() );
        }





    }
}
