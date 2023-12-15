package msds.homefarming.api;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RedirectController
{
    @GetMapping("/diag-ai")
    public String diagAiRedirect()
    {
        return "index.html";
    }

    @GetMapping("/dict")
    public String dictRedirect()
    {
        return "index.html";
    }

    @GetMapping("/diary")
    public String diaryRedirect()
    {
        return "index.html";
    }


    @GetMapping("/diary/*")
    public String diaryDetailRedirect()
    {
        return "redirect:/diary";
    }

    @GetMapping("/diary/edit")
    public String diaryEditRedirect()
    {
        return "redirect:/diary";
    }

    @GetMapping("/diary/edit/{id}")
    public String diaryEditEtcRedirect(@PathVariable String id)
    {
        return "redirect:/diary/" + id;
    }

    @GetMapping("/chatbot")
    public String chatbotRedirect()
    {
        return "index.html";
    }

    @GetMapping("/my-info")
    public String myInfoRedirect()
    {
        return "index.html";
    }

    @GetMapping("/my-info/*")
    public String myInfoEtcRedirect()
    {
        return "index.html";
    }

    @GetMapping("/my-info/enroll")
    public String myInfoEnrollRedirect()
    {
        return "redirect:/my-info";
    }

    @GetMapping("/my-info/enroll/{id}")
    public String myInfoEnrollDetailRedirect(@PathVariable String id)
    {
        return "redirect:/my-info";
    }

    @GetMapping("/dict/{plantName}")
    public String DictionaryRedirect()
    {
        return "redirect:/dict";
    }

    //==카카오 로그인 새로고침 문제 이슈==//
    @GetMapping("/kakao/login/redirect")
    public String KakaoLoginRedirect()
    {
        return "redirect:/kakao/login";
    }
}
