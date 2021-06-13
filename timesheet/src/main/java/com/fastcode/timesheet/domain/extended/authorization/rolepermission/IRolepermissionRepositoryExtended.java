package com.fastcode.timesheet.domain.extended.authorization.rolepermission;

import org.springframework.stereotype.Repository;
import com.fastcode.timesheet.domain.core.authorization.rolepermission.IRolepermissionRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("rolepermissionRepositoryExtended")
public interface IRolepermissionRepositoryExtended extends IRolepermissionRepository {

	//Add your custom code here
}

