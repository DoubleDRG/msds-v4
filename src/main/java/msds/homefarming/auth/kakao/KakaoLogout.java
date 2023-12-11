package msds.homefarming.auth.kakao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

@WebServlet(name = "kakaoLogoutServlet", urlPatterns = "/kakao/logout")
public class KakaoLogout extends HttpServlet
{

    @Value("${msds.front.home-uri}")
    String HOME_REDIRECT_URI;

    @Value("${kakao.cookie.domain}")
    String COOKIE_DOMAIN;

    @Value("${kakao.cookie.path}")
    String COOKIE_PAHT;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //==Authorization 쿠키만료==//
        String cookieName = "Authorization";
        Cookie cookie = new Cookie(cookieName, null);
        cookie.setMaxAge(0);
        cookie.setDomain(COOKIE_DOMAIN);
        cookie.setPath(COOKIE_PAHT);
        response.addCookie(cookie);
        response.setHeader("Location", HOME_REDIRECT_URI);
        response.setStatus(HttpServletResponse.SC_FOUND);
    }
}
