package msds.homefarming.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
        return "index.html";
    }

    @GetMapping("/diary/edit")
    public String diaryEditRedirect()
    {
        return "index.html";
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

}
