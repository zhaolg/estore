package com.estore.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import java.util.Date;

/**
 * Created by zhaolg on 2018/1/21
 *
 * @return
 * @throws Exception
 */
@Entity
@NamedQuery(name = "UserInfo.queryUserInfoByName", query="select p from UserInfo p where p.userId = ?1 and p.userName = ?2 ")
public class UserInfo {

    /**
     * 用户编号
     */
    @Id
    @GeneratedValue
    private Long userId ;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户状态
     */
    private String userState;

    /**
     * 状态
     */
    private String state;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 用户星级
     */
    private String userLevel;

    /**
     * 用户地址
     */
    private String address;

    /**
     * 用户年龄
     */
    private Long age;

    /**
     * 登录名称:默认为名称首字母 ：即： 赵林刚 默认为 zhaolg
     */
    private String loginName;

    /**
     * 登录密码：加密 MD5加密
     */
    private String loginPasswd;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPasswd() {
        return loginPasswd;
    }

    public void setLoginPasswd(String loginPasswd) {
        this.loginPasswd = loginPasswd;
    }

    public UserInfo() {
    }

    public UserInfo(Long userId, String userName, String userState, String state, Date createDate, String userLevel, String address, Long age) {
        this.userId = userId;
        this.userName = userName;
        this.userState = userState;
        this.state = state;
        this.createDate = createDate;
        this.userLevel = userLevel;
        this.address = address;
        this.age = age;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
