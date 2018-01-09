package com.unicorn.authserver.repository;

import com.unicorn.authserver.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    Optional<SysUser> findOneWithRolesByUsername(String username);
    List<SysUser> findAllByUsernameNotNull();

}
