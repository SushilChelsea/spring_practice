package pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class DepositePointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method m, Class<?> c) {
		String className = c.getCanonicalName();
		if(className.equals("business.Bank")) {
			String methodName = m.getName();
			if(methodName.equals("deposite"))
				return true;
		}
		return false;
	}

}
