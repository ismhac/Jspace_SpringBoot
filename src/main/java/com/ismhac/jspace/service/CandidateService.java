package com.ismhac.jspace.service;

import com.ismhac.jspace.dto.common.response.PageResponse;
import com.ismhac.jspace.dto.resume.request.ResumeCreateRequest;
import com.ismhac.jspace.dto.resume.response.ResumeDto;
import com.ismhac.jspace.dto.user.candidate.request.CandidateUpdateRequest;
import com.ismhac.jspace.dto.user.response.UserDto;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public interface CandidateService {
    ResumeDto createResume(int id, String name, MultipartFile file);

    UserDto update(int id, CandidateUpdateRequest request);

    PageResponse<ResumeDto> getListResume(int id, Pageable pageable);

    UserDto updateAvatar(int id, MultipartFile avatar);

    UserDto updateBackground(int id, MultipartFile avatar);

    Map<String, Object> deleteBackground(int id, String backgroundId);

    Map<String, Object> deleteAvatar(int id, String avatarId);

    Map<String, Object> deleteResume(int id, int resumeId);
}
