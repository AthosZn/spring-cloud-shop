package quick.pager.common.constants;

/**
 * 响应码<br />
 * <p>
 *
 * @author siguiyang
 */
public interface ResponseStatus {

    // 响应码
    interface Code {
        // 错误码
        int FAIL_CODE = 1000;
        // 严重错误码
        int ERROR_CODE = 2000;
        // 异常码
        int EXCEPTION_CODE = 3000;
        // 成功码
        int SUCCESS = 200;
    }

    String SUCCESS_MSG = "请求成功";

    String PARAMS_EXCEPTION = "网络出了点小问题";

    String REPEAT_SUBMIT = "请勿重复提交";

    String USER_PHONE_NOT_EXISTS = "用户不存在";

    String USER_PHONE_EXCEPTION = "用户账号异常，请联系客服！";

    String USER_ACCOUNT_PASSWORD_NOT_CORRECT = "账号或密码不正确";

    String USER_PHONE_REGISTERED = "此号码已注册";

    String SMS_CODE_NOT_EMPTY = "短信验证码不能为空";

    String SMS_CODE_EXPIRE = "短信验证码已过期";

    String SMS_CODE_ERROR = "短信验证码不正确";


}