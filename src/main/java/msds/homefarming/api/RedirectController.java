package msds.homefarming.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//==FE의 챗봇화면, 일지화면, .. 등에서 새로고침 시 404안뜨도록 리다이렉트==//
@Controller
public class RedirectController
{
    @GetMapping("/diag-ai")
    public String diagAiRedirect()
    {
        return "redirect:/";
    }

    @GetMapping("/dict")
    public String dictRedirect()
    {
        return "redirect:/";
    }

    @GetMapping("/diary")
    public String diaryRedirect()
    {
        return "redirect:/";
    }

    @GetMapping("/diary/edit")
    public String diaryEditRedirect()
    {
        return "redirect:/";
    }

    @GetMapping("/chatbot")
    public String chatbotRedircet()
    {
        return "redirect:/";
    }

    @GetMapping("/my-info")
    public String myInfoRedirect()
    {
        return "redirect:/";
    }

}
