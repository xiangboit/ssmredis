package com.mingjiang.servciceimplo;

import com.mingjiang.BaseServiceImplo.BaseServiceImplo;
import com.mingjiang.bean.User;
import com.mingjiang.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016/12/28.
 */
@Service
public class UserServiceImplo extends BaseServiceImplo<User> implements UserService{

}
