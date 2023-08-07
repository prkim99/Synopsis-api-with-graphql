package com.skb.ft.synopsisservice.domain.euxp.vo;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Genre {
    public String rep_gnr_yn;
    public String gnr_id;
    public String meta_gnr_nm;
}
