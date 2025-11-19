package com.baylor.app.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "location")
public class Location implements Component {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    private List<Component> children;

    @Override
    public List<Item> get_items_by_location() {
        List<Item> items = new ArrayList<>();
        for (Component component : children) {
            items.addAll(component.get_items_by_location());
        }
        return items;
    }
}
