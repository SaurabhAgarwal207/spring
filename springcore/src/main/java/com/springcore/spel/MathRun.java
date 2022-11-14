package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class MathRun {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
	MathDemo temp = context.getBean("md",MathDemo.class);
	System.out.println(temp);
	SpelExpressionParser sp = new SpelExpressionParser();
	Expression ep = sp.parseExpression("55-35");
	System.out.println(ep.getValue());
}
}
