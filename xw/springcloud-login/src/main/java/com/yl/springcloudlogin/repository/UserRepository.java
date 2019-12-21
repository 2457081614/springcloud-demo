package com.yl.springcloudlogin.repository;

import com.yl.springcloudlogin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author 向往啊 2457081614@qq.com
 * @Date 2019/07/21 22:43
 * @Version 1.0
 * @package com.yl.springcloudlogin.repository
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
