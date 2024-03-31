package com.ismhac.jspace.controller;

import com.ismhac.jspace.dto.common.ApiResponse;
import com.ismhac.jspace.dto.common.PageResponse;
import com.ismhac.jspace.dto.user.employee.EmployeeDto;
import com.ismhac.jspace.service.EmployeeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/employees")
@RequiredArgsConstructor
@Tag(name = "Employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    @GetMapping()
    ApiResponse<PageResponse<EmployeeDto>> getPage(
            @RequestParam("company_id") int companyId,
            @RequestParam("email") String email,
            @RequestParam("name") String name,
            @RequestParam("pageNumber") int pageNumber,
            @RequestParam("pageSize") int pageSize){
        var result = employeeService.getPage(companyId, email, name, pageNumber, pageSize);

        return ApiResponse.<PageResponse<EmployeeDto>>builder()
                .result(result)
                .build();
    }
}
