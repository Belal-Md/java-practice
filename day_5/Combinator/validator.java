package combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import combinator.validator.Result;

public interface validator extends Function<Customer, Result> {
	
	static validator emailValid() {
		return customer -> customer.getEmail().contains("@")?
				Result.Success:Result.Email_invalid;
	}
	static validator phoneValid() {
		return customer -> customer.getPhoneNo().startsWith("01")?
				Result.Success:Result.Phone_num_invalid;
	}
	
	static validator isAdult() {
		return customer ->Period.between(customer.getDob(), LocalDate.now()).getYears() >16?
				Result.Success : Result.Not_adult;
	}
	
	default validator and (validator other) {
        return customer -> {
            Result result = this.apply(customer);
            return result.equals(Result.Success) ? other.apply(customer) : result;
        };
	}
	
	enum Result{
		Success,
		Phone_num_invalid,
		Email_invalid,
		Not_adult;
	}

}
