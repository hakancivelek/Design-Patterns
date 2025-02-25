package com.hakancivelek.srp.existSolution.util;

import com.hakancivelek.srp.existSolution.ex.ValidationException;

public interface Validator {

	void validate(String string) throws ValidationException;

}
