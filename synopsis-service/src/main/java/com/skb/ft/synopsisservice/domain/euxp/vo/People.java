package com.skb.ft.synopsisservice.domain.euxp.vo;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class People {
    public String prs_id;
    public String prs_nm;
    public String prs_plrl_nm;
    public String prs_role_cd;
    public String prs_role_nm;
    public String brth_ymd;
    public String img_path;
    public int sort_seq;
}
