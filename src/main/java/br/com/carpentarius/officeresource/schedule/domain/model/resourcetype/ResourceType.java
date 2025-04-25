package br.com.carpentarius.officeresource.schedule.domain.model.resourcetype;

import java.util.UUID;

public class ResourceType {

    private String id;
    private String name;

    public static ResourceType registerWith(String name) {
        return new ResourceType(name);
    }

    private ResourceType(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String name() {
        return name;
    }
}
