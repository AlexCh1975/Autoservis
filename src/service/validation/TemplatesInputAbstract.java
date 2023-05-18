package service.validation;

public abstract class TemplatesInputAbstract {

    private static String TEMPLATE_STR = "[А-Яа-я]{1,15}";
    private static String TEMPLATE_CHAR = "[FfmM]{1}";
    private static String TEMPLATE_DATE = "[12][09][0-9][0-9]\\-[01][0-9]\\-[0-3][0-9]";
    private static String TEMPLATE_LONG = "[0-9]{6,12}";
    private static String TEMPLATE_INT = "[0-9]{1,2}";
    private static String TEMPLATE_ADDRESS = "[А-Яа-я]{1,15}";
    private static String TEMPLATE_ID = "[0-9]{1,1000}";

    public static String getTemplateId() {
        return TEMPLATE_ID;
    }

    public static String getTemplateStr() {
        return TEMPLATE_STR;
    }

    public static String getTemplateChar() {
        return TEMPLATE_CHAR;
    }

    public static String getTemplateDate() {
        return TEMPLATE_DATE;
    }

    public static String getTemplateLong() {
        return TEMPLATE_LONG;
    }

    public static String getTemplateInt() {
        return TEMPLATE_INT;
    }

    public static String getTemplateAddress() {
        return TEMPLATE_ADDRESS;
    }
}
