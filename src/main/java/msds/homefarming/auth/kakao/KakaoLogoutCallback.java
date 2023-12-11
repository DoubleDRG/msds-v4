package msds.homefarming.auth.kakao;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KakaoLogoutCallback
{
    @Value("${msds.front.home-uri}")
    String HOME_REDIRECT_URI;

    @Value("${kakao.cookie.domain}")
    String COOKIE_DOMAIN;

    @Value("${kakao.cookie.path}")
    String COOKIE_PAHT;

    @GetMapping("/kakao/logout/callback")
    public String logout(HttpServletResponse response)
    {
        //==Authorization 쿠키만료==//
        String cookieName = "Authorization";
        Cookie cookie = new Cookie(cookieName, null);
        cookie.setMaxAge(0);
        cookie.setDomain(COOKIE_DOMAIN);
        cookie.setPath(COOKIE_PAHT);
        response.addCookie(cookie);
        return "redirect:/";
    }
}