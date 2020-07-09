package plus.knowing.common.exception;

public interface SysAssert extends Assert, IExceptionInstance {

    @Override
    default BaseException newException() {
        return new SysException(this);
    }

    @Override
    default BaseException newException(String message) {
        return new SysException(this, message);
    }

    @Override
    default BaseException newException(Throwable cause) {
        return new SysException(this, cause);
    }
}
