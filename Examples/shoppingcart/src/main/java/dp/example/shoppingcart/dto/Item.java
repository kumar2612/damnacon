package dp.example.shoppingcart.dto;

import java.math.BigDecimal;


public interface Item
{
	
	String getArticleNo();
	
	BigDecimal getPrice();
	
	BigDecimal getQuantity();

}
