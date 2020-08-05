package restaurantsystem.manipulation;

import restaurantsystem.model.Item;

public abstract class ManipulationItem extends Item{
	Item item;
	public ManipulationItem(Item item) {
		this.item = item;
	}
}
