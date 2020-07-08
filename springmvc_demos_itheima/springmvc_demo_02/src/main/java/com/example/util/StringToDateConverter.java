package com.example.util;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        try {
            if (source == null)
                throw new RuntimeException("请传入数据");
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            return df.parse(source);
        } catch (Exception e) {
            throw new RuntimeException("数据类型转换错误");
        }
    }
}
