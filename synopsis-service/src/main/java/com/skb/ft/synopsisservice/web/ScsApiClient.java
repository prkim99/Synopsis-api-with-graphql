package com.skb.ft.synopsisservice.web;

import com.skb.ft.synopsisservice.domain.scs.dto.ScsDirectviewRequestDto;
import com.skb.ft.synopsisservice.domain.scs.dto.ScsDirectviewResponseDto;
import com.skb.ft.synopsisservice.global.config.HttpHeaderConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "scsApi", url = "${env.SCS_URL}",configuration = HttpHeaderConfig.class)
public interface ScsApiClient {
    @PostMapping(value="/directview",consumes = "application/json")
    public ScsDirectviewResponseDto requestScsDirectview(@RequestBody ScsDirectviewRequestDto scsDirectviewRequestDto);
}
