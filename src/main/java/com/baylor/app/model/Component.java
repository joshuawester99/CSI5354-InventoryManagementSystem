package com.baylor.app.model;

import java.util.List;

public interface Component {
    // return list of items inside the calling location object
    public List<Item> get_items_by_location();
}

// TODO Add, remove, update, delete items, categories, locations, vendors etc.
// TODO See the current list of items.
// TODO See item details – e.g., description, quantity, category, expiration date, reorder threshold, vendor.
// TODO See categories of different item types.
//Optional:
// TODO In the main menu, have a list of “low” items that need restocking.
// TODO Logging
// TODO User Roles and Permissions