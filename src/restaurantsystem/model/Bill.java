package restaurantsystem.model;

import restaurantsystem.model.Cart;
import restaurantsystem.model.CartItem;

public class Bill {
	Cart cart;

	public Bill(Cart cart) {
		super();
		this.cart = cart;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
}
