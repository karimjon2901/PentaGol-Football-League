package com.example.pentagol.service;

import com.example.pentagol.dto.GameDto;
import com.example.pentagol.dto.ResponseDto;
import com.example.pentagol.dto.TeamDto;
import com.example.pentagol.model.Team;
import com.example.pentagol.repository.TeamRepository;
import com.example.pentagol.service.mapper.TeamMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.pentagol.service.AppStatus.AppStatusCodes.*;
import static com.example.pentagol.service.AppStatus.AppStatusMessages.*;
import static java.util.stream.Collectors.toList;
import static org.hibernate.boot.model.process.spi.MetadataBuildingProcess.build;


@Service
@RequiredArgsConstructor
public class TeamService {
    private final TeamRepository teamRepository;
    private final TeamMapper teamMapper;

    public ResponseDto<List<TeamDto>> getAll() {
        List<Team> teams = teamRepository.findAll();
        return ResponseDto.<List<TeamDto>>builder()
                .code(OK_CODE)
                .message(OK)
                .success(true)
                .data(teams.stream().map(teamMapper::toDto).toList())
                .build();
    }

    public ResponseDto<TeamDto> addTeam(TeamDto teamDto) {
//        Team team = new Team();
//        team.setId(teamDto.getId());
//        team.setName(teamDto.getName());
//        team.setLigaName(teamDto.getLigaName());
//        team.setLogoUrl(teamDto.getLogoUrl());
//        teamRepository.save(team);
        Team team = new Team();
        team=teamMapper.toEntity(teamDto);
        teamRepository.save(team);
        return ResponseDto.<TeamDto>builder()
                .data(teamDto)
                .success(true)
                .code(OK_CODE)
                .message(OK)
                .build();
    }

    public ResponseDto<List<TeamDto>> sort() {
        List<Team> teams = teamRepository.findAllByOrderByPoint();

        return ResponseDto.<List<TeamDto>>builder()
                .message(OK)
                .code(OK_CODE)
                .success(true)
                .data(teams.stream().map(teamMapper::toDto).toList())
                .build();
    }
}
