package com.ismhac.jspace.mapper;

import com.ismhac.jspace.dto.user.UserDto;
import com.ismhac.jspace.dto.user.employee.EmployeeDto;
import com.ismhac.jspace.model.Employee;
import com.ismhac.jspace.model.User;
import org.mapstruct.*;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mappings({
            @Mapping(target = "id", source = "id.user.id"),
            @Mapping(target = "user", source = "id.user",qualifiedByName = "convertToUserDto")
    })
    EmployeeDto toEmployeeDto(Employee employee);

    default Page<EmployeeDto> toEmployeeDtoPage(Page<Employee> employeePage){
        return employeePage.map(this::toEmployeeDto);
    }

    @Named("convertToUserDto")
    default UserDto convertToUserDto(User user) {
        return UserMapper.INSTANCE.toUserDto(user);
    }
}
