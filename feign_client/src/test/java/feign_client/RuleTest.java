package feign_client;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.core.RulesEngineParameters;
import org.junit.Test;

public class RuleTest {
	
	@Test
	public void test01(){
		//create a rules engine
    	RulesEngineParameters parameters = new RulesEngineParameters().skipOnFirstAppliedRule(true);
    	RulesEngine fizzBuzzEngine = new DefaultRulesEngine(parameters);
    	
    	//create rules
    	Rules rules = new Rules();
    	rules.register(new EasyRule.FizzRule());
    	rules.register(new EasyRule.BuzzRule());
    	rules.register(new EasyRule.FizzBuzzRule(new EasyRule.FizzRule(),new EasyRule.BuzzRule()));
    	rules.register(new EasyRule.NonFizzBuzzRule());
    	
    	
    	//fire rules
    	Facts facts = new Facts();
    	for(int i = 1;i <= 50;i++){
    		System.out.println("+++++++++++++"+i);
    		facts.put("number", i);
    		fizzBuzzEngine.fire(rules, facts);
    		System.out.println();
    	}
    	
	}

}
