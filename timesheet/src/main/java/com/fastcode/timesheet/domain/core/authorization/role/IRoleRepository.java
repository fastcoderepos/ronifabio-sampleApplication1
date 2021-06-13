package com.fastcode.timesheet.domain.core.authorization.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("roleRepository")
public interface IRoleRepository extends JpaRepository<Role, Long>,QuerydslPredicateExecutor<Role> {

	@Query("select u from Role u where u.name = ?1")
    Role findByRoleName(String value);
    
}
