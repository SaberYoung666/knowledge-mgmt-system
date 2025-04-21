package org.sabery.knowledge.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

//	@PostMapping("/login")
//	public Boolean login() {
//		// 登录代码
//		JwtUtil jwtUtil = new JwtUtil();
//
////		// Jwt验证代码
////		try {
////			Jws<Claims> claimsJws = Jwts.parser().verifyWith(jwtUtil.key).build().parseSignedClaims(jwtUtil.wrongJws);
////			log.info(String.valueOf(claimsJws));
////			return Boolean.TRUE;
////		} catch (JwtException e) {
////			log.error(String.valueOf(e.getClass()));
////			return Boolean.FALSE;
////		}
//	}



}
