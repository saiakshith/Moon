package com.reality.relations.test;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.lang.BooleanUtils;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.HashMap;
import java.util.Map;

public class LifeTest {
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<>();
        map.put("me", "y");
        
        
        System.out.println(BooleanUtils.toBoolean(map.get("me")));
    }
    
}
