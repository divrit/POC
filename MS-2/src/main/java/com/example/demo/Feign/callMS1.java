package com.example.demo.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="MS-1")
public interface callMS1 {
	
	
	@GetMapping("/prop")
	public String val();
	
	
	@GetMapping("Div")
	public int va();
	

}
