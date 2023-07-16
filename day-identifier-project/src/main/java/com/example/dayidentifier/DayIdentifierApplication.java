import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DayIdentifierController {

    @GetMapping("/day")
    public String getDayIdentifier() {
        LocalDate date = LocalDate.now();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String dayIdentifier = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());
        return "Today is " + dayIdentifier;
    }
}
