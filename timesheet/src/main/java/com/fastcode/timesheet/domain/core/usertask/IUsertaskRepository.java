package com.fastcode.timesheet.domain.core.usertask;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("usertaskRepository")
public interface IUsertaskRepository extends JpaRepository<Usertask, UsertaskId>,QuerydslPredicateExecutor<Usertask> {

}

