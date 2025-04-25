package br.com.carpentarius.officeresource.schedule.domain.model.resourcetype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResourceTypeTest {

    @Test
    public void testThatResourceTypeIsRegistered() {
        ResourceType resourceType =
                ResourceType.registerWith("laptop");

        Assertions.assertEquals("laptop", resourceType.name());
    }

    @Test
    public void testThatResourceTypeIsRenamed() {

    }
}
