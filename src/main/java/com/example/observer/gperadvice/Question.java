package com.example.observer.gperadvice;

/**
 * Title: Question
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-06-03
 */
public class Question {
    //提问者
    private String userName;
    //提问问题
    private String content;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
