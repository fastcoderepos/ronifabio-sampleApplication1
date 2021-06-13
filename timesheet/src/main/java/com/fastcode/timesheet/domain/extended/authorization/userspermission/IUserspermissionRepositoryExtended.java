package com.fastcode.timesheet.domain.extended.authorization.userspermission;

import org.springframework.stereotype.Repository;
import com.fastcode.timesheet.domain.core.authorization.userspermission.IUserspermissionRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@Repository("userspermissionRepositoryExtended")
public interface IUserspermissionRepositoryExtended extends IUserspermissionRepository {

	//Add your custom code here
}

