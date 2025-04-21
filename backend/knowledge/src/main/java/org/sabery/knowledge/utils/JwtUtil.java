package org.sabery.knowledge.utils;

import io.jsonwebtoken.Jwts;

import java.util.Date;

/**
 * 本项目中密钥为user_secret_key, 过期时间设置为1天
 */
public class JwtUtil {
//	public SecretKey key = Jwts.SIG.HS256.key().build();

	//public String jws = Jwts.builder().subject("Joe").signWith(key).compact();

	public String wrongJws = "eyJhbGciOabcdzI1NiJ9.eyJzdWIiOiJKb2UifQ.1KP0SsvENi7Uz1oQc07aXTL7kpQG5jBNIybqr60AlD4";

	// 当前时间
	Date now = new Date();
	// 过期时间
	Date expirationTime = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000); // 1 day


	String jwt = Jwts.builder()
			// JSON 声明，或者任何字节数组内容，并带有媒体类型
			.issuer("saber")
			.subject("Bob")
			.issuedAt(now)
			.expiration(expirationTime)

			// 如果要签名，或者如果要加密
//			.signWith(signingKey)
//			.encryptWith(key, keyAlg, encryptionAlg)
			.compact();
}
