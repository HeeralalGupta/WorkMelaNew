package com.workmelahelper;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.workmela.model.User;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookiesHelper {
	public static boolean setAllCookie(String cookieName, String value,int maxAge,HttpServletResponse response){
        try {
            String encodeName = URLEncoder.encode(cookieName, StandardCharsets.UTF_8.toString());
            String encodedValue = URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
            Cookie cookie = new Cookie(encodeName, encodedValue);
            cookie.setMaxAge(maxAge);
            response.addCookie(cookie);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean setUserCookies(String cookieName,User user , int maxAge, HttpServletResponse response){
        try {
            return setAllCookie(cookieName, new ObjectMapper().writeValueAsString(user), maxAge, response);
        } catch (Exception e) {
           e.printStackTrace();
        }
        return false;
    }
   
    public static String getNormalCookies(String cookieName, HttpServletRequest request) {
		String cookieContent = null;
		try {
			Cookie[] cookies = request.getCookies();
			if (cookies != null) {
				for (Cookie cookie : cookies) {
					if (cookieName.equals(cookie.getName())) {
						cookieContent = URLDecoder.decode(cookie.getValue(), StandardCharsets.UTF_8.toString());
						break;
					}
				}
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return cookieContent;
	}


    public static User getUserCookie(String cookieName, HttpServletRequest request) {
		String normalCookies = getNormalCookies(cookieName, request);
	    try {
            return new ObjectMapper().readValue(normalCookies,User.class);
        } catch (Exception e) {
           e.printStackTrace();
        }
        return null;
	}
}
