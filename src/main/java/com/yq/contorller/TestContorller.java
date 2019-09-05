package com.yq.contorller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestContorller {

	@RequestMapping("/findUserList")
	@ResponseBody
	public List<String> findUserList(){
		List<String> list=new ArrayList<>();
		list.add("zhangsan");
		list.add("lisi");
		list.add("wangwu");
		return list;
		
	}
}
