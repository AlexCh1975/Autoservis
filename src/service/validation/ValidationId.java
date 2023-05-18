package service.validation;

public class ValidationId extends TemplatesInputAbstract
        implements ValidationInterface{

    private String id;

    public ValidationId(String id) {
        this.id = id;
    }

    @Override
    public boolean isValid() {
        MatchingRegexp mRegexp = new MatchingRegexp(this.id, getTemplateId());
        if (mRegexp.isMatchingRegexp()) return true;
        else {
            return false;
        }
    }
}

