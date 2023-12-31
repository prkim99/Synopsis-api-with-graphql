package com.skb.ft.synopsisservice.domain.euxp.vo;

import lombok.*;

import java.util.ArrayList;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SiteReview {
    public String sris_id;
    public TmdbPntInfo tmdb_pnt_info;
    public ArrayList<Site> sites;
    public ArrayList<BtvPntInfo> btv_pnt_info;
    public ArrayList<Object> prize_history;
}
