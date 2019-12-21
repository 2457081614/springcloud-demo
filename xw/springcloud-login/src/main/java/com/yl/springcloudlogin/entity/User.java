package com.yl.springcloudlogin.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author 向往啊 2457081614@qq.com
 * @Date 2019/07/21 22:41
 * @Version 1.0
 * @package com.yl.springcloudlogin.entity
 */
@Data
@NoArgsConstructor
@ToString
@Table(name = "t_user")
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    private String account;

    private String password;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
