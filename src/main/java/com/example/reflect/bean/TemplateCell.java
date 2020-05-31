package com.example.reflect.bean;

import com.example.reflect.demo.FillCommentEnum;

/**
 * Title: TemplateCell
 * Description: 单元格属性
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-29
 */
public class TemplateCell {
    //行号
    private Integer rowNo;
    //列号
    private Integer columnNo;
    //是否必填
    private FillCommentEnum comment;
    //单元格名称
    private String name;

    public TemplateCell() {
    }

    public TemplateCell(Integer rowNo, Integer columnNo, FillCommentEnum comment, String name) {
        this.rowNo = rowNo;
        this.columnNo = columnNo;
        this.comment = comment;
        this.name = name;
    }

    public Integer getRowNo() {
        return rowNo;
    }

    public void setRowNo(Integer rowNo) {
        this.rowNo = rowNo;
    }

    public Integer getColumnNo() {
        return columnNo;
    }

    public void setColumnNo(Integer columnNo) {
        this.columnNo = columnNo;
    }

    public FillCommentEnum getComment() {
        return comment;
    }

    public void setComment(FillCommentEnum comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
