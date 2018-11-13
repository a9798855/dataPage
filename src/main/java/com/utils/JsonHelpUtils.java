package com.utils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


public class JsonHelpUtils {

    /**
     * 把ResultSet集合转换成JsonArray数组
     *
     * @param rs
     * @return
     * @throws Exception
     */
    public static JSONArray formatRsToJsonArray(ResultSet rs) throws Exception {
        ResultSetMetaData md = rs.getMetaData();// 获取表结构
        int num = md.getColumnCount();// 得到行的总数
        JSONArray array = new JSONArray();// json数组，根据下标找值；[{name1:wp},{name2:{name3:'ww'}}]name为key值，wp为value值
        // JSONArray array=JSONArray.fromObject(String);将String转换为JSONArray格式
        while (rs.next()) {// 如果结果集中有值
            JSONObject mapOfColValues = new JSONObject();// 创建json对象就是一个{name:wp}
            for (int i = 1; i <= num; i++) {
                mapOfColValues.put(md.getColumnName(i), rs.getObject(i));// 添加键值对，比如说{name:Wp}通过name找到wp
                System.out.println(mapOfColValues.toString());
            }
            array.add(mapOfColValues);
        }
        return array;
    }

}
