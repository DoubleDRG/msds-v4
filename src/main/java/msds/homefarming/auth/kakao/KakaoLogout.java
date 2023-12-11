package msds.homefarming.auth.kakao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;


import java.io.IOException;

@WebServlet(name = "kakaoLogoutServlet", urlPatterns = "/kakao/logout")
public class KakaoLogout extends HttpServlet
{
    @Value("${kakao.logout.uri}")
    String KAKAO_LOGOUT_URI;

    @Value("${kakao.logout.redirect-uri}")
    String KAKAO_LOGOUT_REDIRECT_URI;

    @Value("${kakao.auth.client-id}")
    String KAKAO_AUTH_CLIENT_ID;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String queryString = "?" +
                "client_id=" + KAKAO_AUTH_CLIENT_ID + "&" +
                "logout_redirect_uri=" + KAKAO_LOGOUT_REDIRECT_URI;

        response.setHeader("Location", KAKAO_LOGOUT_URI + queryString);
        response.setStatus(HttpServletResponse.SC_FOUND);
    }
}
