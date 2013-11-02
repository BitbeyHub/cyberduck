package ch.cyberduck.ui.cocoa;

import ch.cyberduck.core.AbstractTestCase;
import ch.cyberduck.core.DescriptiveUrl;
import ch.cyberduck.core.Local;

import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.assertEquals;

/**
 * @version $Id$
 */
public class HyperlinkAttributedStringFactoryTest extends AbstractTestCase {

    @Test
    public void testCreate() throws Exception {
        assertEquals("", HyperlinkAttributedStringFactory.create((DescriptiveUrl.EMPTY)).string());
        assertEquals("", HyperlinkAttributedStringFactory.create((String) null).string());
        assertEquals("ftp://localhost/d", HyperlinkAttributedStringFactory.create("ftp://localhost/d").string());
    }

    @Test
    public void testCreateNull() throws Exception {
        assertEquals("", HyperlinkAttributedStringFactory.create(new DescriptiveUrl(null)).string());
        assertEquals("", HyperlinkAttributedStringFactory.create((String) null).string());
        assertEquals("", HyperlinkAttributedStringFactory.create("", (Local) null).string());
    }
}
