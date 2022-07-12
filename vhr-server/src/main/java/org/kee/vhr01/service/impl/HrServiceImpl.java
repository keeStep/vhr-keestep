package org.kee.vhr01.service.impl;

import org.kee.vhr01.mapper.HrMapper;
import org.kee.vhr01.model.Hr;
import org.kee.vhr01.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Author： 羽子少年
 * @Date： 2020/6/10 23:40
 */
@Service
public class HrServiceImpl implements HrService {

    @Autowired
    private HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(username);
        if (null == hr) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        return hr;
    }
}
