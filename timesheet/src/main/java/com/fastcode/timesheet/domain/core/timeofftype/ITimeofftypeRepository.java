package com.fastcode.timesheet.domain.core.timeofftype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("timeofftypeRepository")
public interface ITimeofftypeRepository extends JpaRepository<Timeofftype, Long>,QuerydslPredicateExecutor<Timeofftype> {

}

