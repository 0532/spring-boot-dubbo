package org.mvnsearch.uic;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * uic template implementation
 *
 * @author linux_china
 */
@Component(value = "uicTemplate")
@Service
public class UicTemplateImpl implements UicTemplate {
    public User findById(Long id) {
        User user = new User();
        user.setId(id);
        user.setNick("nick:" + id);
        user.setCreatedAt(new Date());
        return user;
    }
}
