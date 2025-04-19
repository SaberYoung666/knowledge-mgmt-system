package org.sabery.knowledge.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/user")
public class UserController {

	@PostMapping("/login")
	public void login() {

		// 登录代码
	}

}
