package com.fastcode.timesheet.domain.core.authorization.userspermission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("userspermissionRepository")
public interface IUserspermissionRepository extends JpaRepository<Userspermission, UserspermissionId>,QuerydslPredicateExecutor<Userspermission> {

    List<Userspermission> findByUsersId(Long usersId);

}

