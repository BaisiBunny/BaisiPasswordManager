package tech.baisi.web.passwordmanager;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetCookie {
    @RequestMapping("/getcookie")
    public String getCookie(@CookieValue(value = "key",defaultValue = "noKey") String cookie_key){
        return "<h1>key: " + cookie_key + "</h1>";
    }
}
