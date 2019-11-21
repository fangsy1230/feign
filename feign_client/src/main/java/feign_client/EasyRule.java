package feign_client;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.support.UnitRuleGroup;

/**
 * （1）如果一个数字可以被5整除，则输出“fizz”；
        （2）如果一个数字可以被7整除，则输出“buzz”；
        （3）如果一个数字可以同时被5和7整除，则输出“fizzbuzz”；
        （4）如果一个数字不满足以上三个条件，则输出这个数字本身。
 * 
 *
 */
public class EasyRule {
	
	@Rule(priority = 1)
	public static class FizzRule{
		
		@Condition
		public boolean isFizz(@Fact("number")Integer number){
			return number%5 == 0;
		}
		
		@Action
		public void printFizz(){
			System.out.println("fizz");
		}
	}
	
	@Rule(priority = 2)
    public static class BuzzRule {
        @Condition
        public boolean isBuzz(@Fact("number") Integer number) {
            return number % 7 == 0;
        }

        @Action
        public void printBuzz() {
            System.out.println("buzz");
        }
    }
	
	 public static class FizzBuzzRule extends UnitRuleGroup {

	        public FizzBuzzRule(Object... rules) {
	            for (Object rule : rules) {
	                addRule(rule);
	            }
	        }

	        @Override
	        public int getPriority() {
	            return 0;
	        }
	    }
	 
	 @Rule(priority = 3)
	 public static class NonFizzBuzzRule {

	        @Condition
	        public boolean isNotFizzNorBuzz(@Fact("number") Integer number) {
	            return number % 5 != 0 || number % 7 != 0;
	        }

	        @Action
	        public void printInput(@Fact("number") Integer number) {
	            System.out.println(number);
	        }
	   }
	 
	 
	

}
