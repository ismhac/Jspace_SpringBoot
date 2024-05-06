package com.ismhac.jspace.service;

import com.ismhac.jspace.dto.company.response.CompanyDto;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CompanyService {

    void verifyEmail(String token, HttpServletResponse httpServletResponse) throws IOException;

    void verifyEmployee(String token, HttpServletResponse httpServletResponse) throws IOException;

    CompanyDto getCompanyById(int id);

    CompanyDto updateLogo(int id, MultipartFile logo);

    CompanyDto updateBackground(int id, MultipartFile  background);
}
