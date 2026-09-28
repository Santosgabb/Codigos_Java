package util;

import java.util.function.Function;

import entities.ProductFuncction;

public class UpperCaseName implements Function<ProductFuncction, String> {

	@Override
	public String apply(ProductFuncction p) {
		// TODO Auto-generated method stub
		return p.getName().toUpperCase(); //retorna o nome em caixa alta
	}

}
