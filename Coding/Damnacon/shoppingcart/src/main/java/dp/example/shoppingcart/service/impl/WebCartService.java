package dp.example.shoppingcart.service.impl;

import java.util.Arrays;
import java.util.List;

import dp.example.shoppingcart.dto.Cart;
import dp.example.shoppingcart.dto.Item;
import dp.example.shoppingcart.service.CartService;

/**
 * Web implementation of cart service
 * 
 * @author DPavlov
 */
public class WebCartService implements CartService
{

	private final Cart cart;

	public WebCartService(final Cart cart) {
		this.cart = cart;
	}

	public void addToCart(String item) {
		cart.addItem(item);
	}

	public List<Item> getItemsInCart() {
		return cart.getItems();
	}

	public void removeFromCart(String item) {
		cart.removeItem(item);
	}
	
	
	
}
