package service.validation;

import exception.MessageException;

public class ValidationInputClient extends TemplatesInputAbstract
        implements ValidationInterface {
    private String value;

    public ValidationInputClient(String value) {
        this.value = value;
    }

    @Override
    public boolean isValid() {
        String[] usersStr = this.value.split(" ");

        String[] templates = {getTemplateStr(), getTemplateStr(), getTemplateStr(),
        getTemplateDate(), getTemplateLong(), getTemplateChar(), getTemplateInt()};

        for (int i = 0; i < usersStr.length; i++) {
            MatchingRegexp mRegexp = new MatchingRegexp(usersStr[i], templates[i]);
            if (!mRegexp.isMatchingRegexp()) {
                switch (i) {
                    case (0):
                        MessageException.getMessage("фамилии", usersStr[i]);
                        break;
                    case (1):
                        MessageException.getMessage("имени", usersStr[i]);
                        break;
                    case (2):
                        MessageException.getMessage("отчества", usersStr[i]);
                        break;
                    case (3):
                        MessageException.getMessage("дня рождения", usersStr[i]);
                        break;
                    case (4):
                        MessageException.getMessage("телефона", usersStr[i]);
                        break;
                    case (5):
                        MessageException.getMessage("пола", usersStr[i]);
                        break;
                    case (6):
                        MessageException.getMessage("скидка", usersStr[i]);
                        break;
                }
                return false;
            }
        }
        return true;
    }
}
