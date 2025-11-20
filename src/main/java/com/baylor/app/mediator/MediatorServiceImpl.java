package com.baylor.app.mediator;

import com.baylor.app.model.Item;
import com.baylor.app.model.Location;
import com.baylor.app.model.Vendor;
import com.baylor.app.service.ItemService;
import com.baylor.app.service.LocationService;
import com.baylor.app.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MediatorServiceImpl implements Mediator {

    private ItemService itemService;
    private VendorService vendorService;
    private LocationService locationService;

    @Autowired
    public MediatorServiceImpl(ItemService itemService, VendorService vendorService, LocationService locationService) {
        this.itemService = itemService;
        this.vendorService = vendorService;
        this.locationService = locationService;
    }

    @Override
    public void notify(Comp sender, String event){
        if(sender.getClass().isInstance(ItemService.class)){
            if(event.equals("getLocations")) {
                List<Location> locations = locationService.getAllLocations();
            }
        }
        if(sender.getClass().isInstance(VendorService.class)){
            if(event.equals("getStock")) {
                List<Item> items = itemService.getAllItems();
            }
        }
        if(sender.getClass().isInstance(LocationService.class)){
            if(event.equals("getVendors")) {
                List<Vendor> vendors = vendorService.getAllVendors();
            }
        }
    }
}
