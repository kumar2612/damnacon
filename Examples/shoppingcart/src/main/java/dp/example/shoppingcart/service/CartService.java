package dp.example.shoppingcart.service;

import java.util.List;

import dp.example.shoppingcart.dto.Item;

/**
 * Cart service.
 * 
 * @author DPavlov
 */
public interface CartService {
	
	List<Item> getItemsInCart();
	
	void addToCart(String item);
	
	void removeFromCart(String item);

}
