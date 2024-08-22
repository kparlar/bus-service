package com.kparlar.iett.entity;

import com.kparlar.iett.dto.LineDTO;
import lombok.Builder;

import java.util.Date;

@Builder(toBuilder = true)
public record LineEntity(String code, String messageLineId, String name, String recipe, double length, double duration, Date createDate, Date update){

    public LineDTO toDTO(){
        return LineDTO.builder().
                code(this.code)
                .name(this.name)
                .recipe(this.recipe)
                .length(this.length)
                .duration(this.duration)
                .build();
    }
}
