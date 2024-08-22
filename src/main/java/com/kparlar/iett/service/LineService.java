package com.kparlar.iett.service;

import com.kparlar.iett.dto.LineDTO;
import com.kparlar.iett.entity.LineEntity;
import com.kparlar.iett.repository.LineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LineService {

    private final LineRepository lineRepository;

    public List<LineDTO> findAll(){
        var lineEntities = this.lineRepository.findAll();
        return lineEntities.stream().map(LineEntity::toDTO).toList();
    }
}
