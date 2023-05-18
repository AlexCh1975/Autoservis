package service.validation;

public class ValidationInputUserByLastname extends TemplatesInputAbstract
        implements ValidationInterface{
    private String value;

    public ValidationInputUserByLastname(String value) {
        this.value = value;
    }

    @Override
    public boolean isValid() {
        MatchingRegexp mRegexp = new MatchingRegexp(this.value, getTemplateStr());
        if (mRegexp.isMatchingRegexp()) return true;
        else {
            return false;
        }
    }
}
