package com.odianyun.internship.model;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @description:
 * @author: EDZ
 * @time: 15:43
 * @date: 2021/7/13
 */
public class User implements Serializable {

    private static final long serialVersionUID = 4425149734703057491L;
    @NotEmpty(message = "用户名不能为空")
    private String userName;
    private String mobile;
    private Integer sex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public static void talk() {
        System.out.println("发出声音");
    }
}
