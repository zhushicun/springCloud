package com.shawn.order.fegin.memberClient;

import com.shawn.member.memberApi.TestApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "SHAWN-MEMBER")
public interface MerberFeginClient extends TestApi {

}
