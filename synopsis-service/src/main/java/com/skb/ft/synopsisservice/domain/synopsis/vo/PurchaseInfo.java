package com.skb.ft.synopsisservice.domain.synopsis.vo;

import com.skb.ft.synopsisservice.domain.common.YN;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseInfo {
    Double sale_price_vat;
    YN yn_purchase;
    String avail_period;
}
