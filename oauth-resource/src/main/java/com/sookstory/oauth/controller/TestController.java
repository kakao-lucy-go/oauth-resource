/* oauth-resource TestController.java 2019. 8. 12.
 * Copyright (c) 2001-2019 Alticast Corp. 
 * All rights reserved. http://www.alticast.com/ 
 * This software is the confidential and proprietary information of
 * Alticast Corp. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in 
 * accordance with the terms of the license agreement you entered into 
 * with Alticast.
 */
package com.sookstory.oauth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sookstory.oauth.entity.Test;
import com.sookstory.oauth.repository.TestRepository;

/**
 * @FileName TestController.java
 * @Project oauth-resource
 * @Author ksko
 * @Date   2019. 8. 12.
 */
@RestController
public class TestController {

	@Autowired
	private TestRepository testRepository;
	
	@GetMapping(value = "/test")
	public List<Test> findAll() {
		return testRepository.findAll();
	}
	
	
}
