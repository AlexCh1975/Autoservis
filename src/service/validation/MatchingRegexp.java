package service.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class MatchingRegexp {
    private String text;
    private String template;

    public MatchingRegexp(String text, String template) {
        this.text = text;
        this.template = template;
    }

    public boolean isMatchingRegexp() {
        Pattern pattern = null;
        try {
            pattern = Pattern.compile(this.template);
        } catch (PatternSyntaxException e) {
            e.printStackTrace();
        }
        if (pattern == null) {
            return false;
        }
        final Matcher regexp = pattern.matcher(this.text);
        return regexp.matches();
    }
}
