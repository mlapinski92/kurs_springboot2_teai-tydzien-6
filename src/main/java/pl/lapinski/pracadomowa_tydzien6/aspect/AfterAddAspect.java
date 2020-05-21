package pl.lapinski.pracadomowa_tydzien6.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.lapinski.pracadomowa_tydzien6.service.EmailService;

@Aspect
@Component
public class AfterAddAspect {

    private EmailService emailService;

    @Autowired
    public AfterAddAspect(EmailService emailService) {
        this.emailService = emailService;
    }

    @After("@annotation(AddAspect)")
    private void afterAddMovie() {
        emailService.sendMessage("maciej.lapinski92@gmail.com", "Movie added", "Test message");
    }
}
