package com.hh.springbootbeetldemo.underwriting.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 订单中心通用DTO
 */
@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class PlatformDto {

}
