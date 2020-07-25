package com.accp.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.blBiz;

@RestController
@RequestMapping("api/bishow")
public class blAction {
	@Autowired
	private blBiz biz;
	
	@GetMapping
	public Map<String,Object> show(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code","200");
		map.put("magss", "出错了");
		map.put("data", biz.list());
		return map;
	}
}
