package com.example.pentagol.rest;

import com.example.pentagol.dto.GameDto;
import com.example.pentagol.dto.ResponseDto;
import com.example.pentagol.dto.TeamDto;
import com.example.pentagol.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
@RequiredArgsConstructor
public class TeamResources {
    private final TeamService teamService;
    @GetMapping
//    @CrossOrigin(origins = "http://10.10.3.34:5173")
    public ResponseDto<List<TeamDto>> getAll(){
        return teamService.getAll();
    }
    @PostMapping
    @CrossOrigin(origins = "http://10.10.3.34:5173")
    public ResponseDto<TeamDto> addTeam(@RequestBody TeamDto teamDto){
        return teamService.addTeam(teamDto);
    }
    @GetMapping("/sort")
    @CrossOrigin(origins = "http://10.10.3.34:5173")
    public ResponseDto<List<TeamDto>> sort(){
        return teamService.sort();
    }
}
