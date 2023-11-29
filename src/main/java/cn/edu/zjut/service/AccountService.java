package cn.edu.zjut.service;

import cn.edu.zjut.entity.dto.Account;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AccountService extends IService<Account>, UserDetailsService {

    Account findAccountByName(String text);
}
