package com.unicorn.authserver.repository;

import com.unicorn.authserver.domain.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysRoleRepository extends JpaRepository<SysRole, Long> {
}
