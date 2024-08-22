package com.kparlar.iett.controller;

import com.kparlar.iett.dto.LineDTO;
import com.kparlar.iett.service.LineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lines")
@RequiredArgsConstructor
public class LineController {

    private final LineService lineService;

    @GetMapping
    public ResponseEntity<List<LineDTO>> findAll(){
        //throw new RuntimeException("Deneme");
            return ResponseEntity.ok(this.lineService.findAll());
    }



}
