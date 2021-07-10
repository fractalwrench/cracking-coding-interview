package co.uk.fractalwrench.cci.ch4;

import org.junit.Test;

import static co.uk.fractalwrench.cci.ch4.Chapter4Question1.*;
import static org.junit.Assert.*;

public class Chapter4Question1Test {

    @Test(expected = IllegalArgumentException.class)
    public void nullInput() {
        hasRoute(null, null);
    }

    @Test
    public void noRoute() {
        assertFalse(hasRoute(new Node(), new Node()));
    }

    @Test
    public void sameNode() {
        Node node = new Node();
        assertTrue(hasRoute(node, node));
    }

    @Test
    public void simpleRoute() {
        Node start = new Node();
        Node end = new Node();
        start.addRelationship(end);
        assertTrue(hasRoute(start, end));
    }

    @Test
    public void simpleRouteExtraNodes() {
        Node start = new Node();
        Node end = new Node();
        start.addRelationship(new Node());
        start.addRelationship(new Node());
        start.addRelationship(end);
        assertTrue(hasRoute(start, end));
    }

    @Test
    public void testDeepGraphWithRoute() {
        Node start = new Node();
        start.addRelationship(new Node());

        Node a = new Node();
        start.addRelationship(a);

        Node b = new Node();
        a.addRelationship(new Node());
        a.addRelationship(b);

        b.addRelationship(start);
        Node end = new Node();
        b.addRelationship(end);
        assertTrue(hasRoute(start, end));
    }

    @Test
    public void testDeepGraphWithoutRoute() {
        Node start = new Node();
        start.addRelationship(new Node());

        Node a = new Node();
        start.addRelationship(a);

        Node b = new Node();
        a.addRelationship(new Node());
        a.addRelationship(b);

        b.addRelationship(start);
        Node end = new Node();
        assertFalse(hasRoute(start, end));
    }
}
