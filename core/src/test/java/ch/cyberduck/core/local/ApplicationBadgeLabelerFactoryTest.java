package ch.cyberduck.core.local;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ApplicationBadgeLabelerFactoryTest {

    @Test
    public void testGet() {
        assertNotNull(ApplicationBadgeLabelerFactory.get());
    }
}
