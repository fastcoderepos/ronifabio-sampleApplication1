package com.fastcode.timesheet.domain.extended.authorization.permission;

import org.springframework.stereotype.Repository;
import com.fastcode.timesheet.domain.core.authorization.permission.IPermissionRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("permissionRepositoryExtended")
public interface IPermissionRepositoryExtended extends IPermissionRepository {

	//Add your custom code here
}

