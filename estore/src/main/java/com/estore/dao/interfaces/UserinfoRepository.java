package com.estore.dao.interfaces;

import com.estore.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by zhaolg on 2018/1/21
 *
 * @return
 * @throws Exception
 */
public interface UserinfoRepository extends JpaRepository<UserInfo, Long> {

    @Query("select p from UserInfo p where p.userName =:userName")
    UserInfo findOneByUserName(@Param("userName") String userName);

    @Query("select p from UserInfo p where p.loginName =:loginName")
    UserInfo findOneByLoginName(@Param("loginName") String loginName);
}
