package com.example.reflect.annotation;


import com.example.reflect.demo.FillCommentEnum;

import java.lang.annotation.*;

/**
 * Title: RecordTemplateAnnotation
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-29
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RecordTemplateAnnotation {
     //行号
     int rowNo();
     //列号
     int columnNo();
     //是否必填
     FillCommentEnum comment();
     //单元格名称
     String name();
     //数据类型

}
