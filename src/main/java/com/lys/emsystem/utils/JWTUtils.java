package com.lys.emsystem.utils;

import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JWTUtils {
    //    秘钥
    public static final String jwtToken = "lys123";


    // 加密
    public static String createToken(int UserId) {
        HashMap<String, Object> claims = new HashMap<>();
        claims.put("userId", UserId);
        JwtBuilder jwtBuilder = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, jwtToken) //签发算法，秘钥是token
                .setClaims(claims) //body数据，唯一，自定义设置
                .setIssuedAt(new Date()) //设置签发时间
                .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60  * 1000));
        String token = jwtBuilder.compact();
        return token;
    }

    // 解密
    public static Map<String, Object> checkToken(String token) {
        try {
            Jwt parse = Jwts.parser().setSigningKey(jwtToken).parse(token);
            return (Map<String, Object>) parse.getBody();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        int userId = 12345;
        String token = JWTUtils.createToken(userId);
        System.out.println("生成的token:\n" + token);
        Map<String, Object> map = JWTUtils.checkToken(token);
        System.out.println("解密后的数据:"+map.get("userId"));
    }
}