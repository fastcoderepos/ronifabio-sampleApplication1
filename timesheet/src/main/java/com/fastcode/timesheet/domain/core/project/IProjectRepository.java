package com.fastcode.timesheet.domain.core.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("projectRepository")
public interface IProjectRepository extends JpaRepository<Project, Long>,QuerydslPredicateExecutor<Project> {

}

