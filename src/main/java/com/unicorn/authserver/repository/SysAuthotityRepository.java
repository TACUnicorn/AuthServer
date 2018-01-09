package com.unicorn.authserver.repository;

import com.unicorn.authserver.domain.SysAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysAuthotityRepository extends JpaRepository<SysAuthority, Long>
{
}
