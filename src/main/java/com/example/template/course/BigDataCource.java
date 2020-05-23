package com.example.template.course;

/**
 * Title: BigDataCource
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-20
 */
public class BigDataCource extends NetWorkCourse {
    private boolean needHomeworkFlag = false;

    public BigDataCource(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    void checkHomework() {
        System.out.println("检查大数据的课后作业");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }
}
