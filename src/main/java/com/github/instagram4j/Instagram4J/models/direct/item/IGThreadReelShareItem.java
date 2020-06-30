package com.github.instagram4j.Instagram4J.models.direct.item;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.github.instagram4j.Instagram4J.models.media.reel.IGReelMedia;

import lombok.Data;

@Data
@JsonTypeName("reel_share")
public class IGThreadReelShareItem extends IGThreadItem {
    private String text;
    private String type;
    private boolean is_reel_persisted;
    private String reel_owner_id;
    private String reel_type;
    private IGReelMedia media;
}
